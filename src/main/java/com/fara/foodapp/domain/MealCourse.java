package com.fara.foodapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Table(name = "TB_MealCourse")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MealCourse {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "foodItem", nullable = false)
    private Long foodItem;

    @Column(name = "supplier", nullable = false)
    private Long supplier;


    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "validFromDate", nullable = false)
    private Date validFromDate;


    @Column(name = "validToDate", nullable = false)
    private Date validToDate;


}