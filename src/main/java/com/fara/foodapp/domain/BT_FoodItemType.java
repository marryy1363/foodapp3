package com.fara.foodapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name = "BT_FoodItemType")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BT_FoodItemType {


    @Id
    @Column(name = "code", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code;


    @Column(name = "title")
    private String title;
}
