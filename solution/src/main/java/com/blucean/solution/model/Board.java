package com.blucean.solution.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) /*시퀀스를 따로 생성하고 않고 auto increment 사용가능*/
    private long id;
    private String title;
    private String content;

}
