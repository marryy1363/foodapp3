package com.fara.foodapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name = "TB_FoodItem")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TB_FoodItem {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotBlank(message = "title  is required but not provided")
    @NotEmpty(message = "title is required but not provided")
    @NotNull(message = "title  is required but not provided")
    @Column(name = "title", nullable = false)
    private String title;


    @Column(name = "itemType", nullable = false)
    private Long itemType;


    @Column(name = "itemType")
    private String description;
}
