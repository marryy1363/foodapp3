package com.fara.foodapp.service.api;

import com.fara.foodapp.domain.Users;
import com.fara.foodapp.repo.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersImpl implements UsersApi, UserDetailsService {
    final UsersRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
        Users user = usersRepository.findByUserId(userId);
        if (user == null) {
            throw new UsernameNotFoundException("This usernamee is not available");
        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
//            authorities.add(new SimpleGrantedAuthority( "USER"));
        return new org.springframework.security.core.userdetails.User(user.getUserId(), user.getPwd(), authorities);
    }
    @Override
    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users findById(Long id) throws Exception {
        Optional<Users> byId = usersRepository.findById(id);
        if (byId.isPresent())
            return byId.get();
        else
            throw new Exception("user not found.");

    }

    @Override
    public Users save(Users users) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(10);
        String encPass = bCryptPasswordEncoder.encode(users.getPwd());
        users.setPwd(encPass);

        return usersRepository.save(users);
    }

    @Override
    public Users edit(Users users) throws Exception {
        if (usersRepository.findById(users.getId()).isPresent())
            return usersRepository.save(users);
        else
            throw new Exception("id not found");

    }

    @Override
    public void delete(Long id) throws Exception {
        Optional<Users> byId = usersRepository.findById(id);
        if (byId.isPresent())
            usersRepository.delete(byId.get());
        else
            throw new Exception("id not found");
    }
}
