package com.myownfb.likes.entities;

import com.myownfb.likes.enums.ReactionType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="reactions")
@Getter
@Setter
public class Reaction {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    @Enumerated
    @Column(columnDefinition = "smallint")
    private ReactionType reactionType;

}
