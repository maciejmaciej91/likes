package com.myownfb.likes.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;

    private String surname;

    private String email;

    @OneToMany
    @JoinColumn(name="USER_ID", referencedColumnName = "ID")
    private List<Comment> comments;
}
