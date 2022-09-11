package com.fara.foodapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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

    @NotNull(message = "foodItem must be not null")
    @ManyToOne()
    @JoinColumn(name = "foodItem-id",nullable = false)
    private FoodItem foodItem;

    @NotNull(message = "supplier must be not null")
    @ManyToOne()
    @JoinColumn(name = "supplier-id",nullable = false)
    private Supplier supplier;


    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "validFromDate", nullable = false)
    private Date validFromDate;


    @Column(name = "validToDate", nullable = false)
    private Date validToDate;


}
