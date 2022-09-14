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

@Table(name = "TB_Weeklymenu")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeeklyMenu {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotBlank(message = "title  is required but not provided")
    @NotEmpty(message = "title is required but not provided")
    @NotNull(message = "title  is required but not provided")
    @Column(name = "title", nullable = false)
    private String title;


    @Column(name = "createdate", nullable = false)
    private Timestamp createDate;


    @NotNull(message = "createdBy must be not null")
    @ManyToOne()
    @JoinColumn(name = "createdby",nullable = false)
    private Users createdBy;

    @Column(name = "startdate")
    private Date startDate;


    @Column(name = "todate")
    private Date toDate;


    @NotNull(message = "planState must be not null")
    @ManyToOne()
    @JoinColumn(name = "planstate",nullable = false)
    private PlanState planState;

    @NotNull(message = "executionState must be not null")
    @ManyToOne()
    @JoinColumn(name = "executionstate",nullable = false)
    private ExecutionState executionState;



}
