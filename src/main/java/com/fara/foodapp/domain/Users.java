package com.fara.foodapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;

@Table(name = "TB_Users")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotBlank(message = "userId  is required but not provided")
    @NotEmpty(message = "userId is required but not provided")
    @NotNull(message = "userId  is required but not provided")
    @Column(name = "userid", nullable = false)
    private String userId;


    @NotBlank(message = "pwd  is required but not provided")
    @NotEmpty(message = "pwd is required but not provided")
    @NotNull(message = "pwd  is required but not provided")
    @Column(name = "pwd", nullable = false)
    private String pwd;


    @NotBlank(message = "firstName  is required but not provided")
    @NotEmpty(message = "firstName is required but not provided")
    @NotNull(message = "firstName  is required but not provided")
    @Column(name = "firstname", nullable = false)
    private String firstName;


    @NotBlank(message = "lastName  is required but not provided")
    @NotEmpty(message = "lastName is required but not provided")
    @NotNull(message = "lastName  is required but not provided")
    @Column(name = "lastname", nullable = false)
    private String lastName;

    @NotNull(message = "status must be not null")
    @ManyToOne()
    @JoinColumn(name = "status",nullable = false)
    private UserStatus status;

    @Column(name = "createdate")
    private Timestamp createDate;

    @Column(name = "modifydate")
    private Timestamp modifyDate;
}