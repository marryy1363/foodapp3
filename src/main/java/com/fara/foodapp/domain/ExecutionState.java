package com.fara.foodapp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Table(name = "BT_ExecutionState")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExecutionState {

    @Id
    @Column(name = "code", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long code;


    @NotBlank(message = "title  is required but not provided")
    @NotEmpty(message = "title is required but not provided")
    @NotNull(message = "title  is required but not provided")
    @Column(name = "title", nullable = false)
    private String title;

}
