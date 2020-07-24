package com.aloranking.house13.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "house_member")
public class HouseMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_id;

    @NotNull
    @Column(name = "first_name")
    private String first_name;

    @NotNull
    @Column(name = "last_name")
    private String last_name;


}
