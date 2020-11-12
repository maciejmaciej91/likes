package com.myownfb.likes.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String text;
}
