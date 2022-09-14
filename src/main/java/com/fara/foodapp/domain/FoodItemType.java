package com.fara.foodapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "BT_Fooditemtype")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FoodItemType {


    @Id
    @Column(name = "code", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code;


    @Column(name = "title")
    private String title;
}
