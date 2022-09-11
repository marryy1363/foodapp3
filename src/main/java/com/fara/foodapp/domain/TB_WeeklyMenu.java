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

@Table(name = "TB_WeeklyMenu")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TB_WeeklyMenu {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotBlank(message = "title  is required but not provided")
    @NotEmpty(message = "title is required but not provided")
    @NotNull(message = "title  is required but not provided")
    @Column(name = "title", nullable = false)
    private String title;


    @Column(name = "createDate", nullable = false)
    private Timestamp createDate;


    @Column(name = "createdBy", nullable = false)
    private Long createdBy;

    @Column(name = "createdBy")
    private Date startDate;


    @Column(name = "toDate")
    private Date toDate;

    @Column(name = "planState")
    private Long planState;

    @Column(name = "executionState")
    private Long executionState;
}
