package com.practices.itendityservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "user_ptc")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
//    @GeneratedValue(generator = "userIdSequence")
//    @SequenceGenerator(name = "userIdSequence", sequenceName = "user_so_id_seq", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    protected Long id;

    // In user name we are saving email id
    @Column(name = "user_name")
    protected String username;

    @Column(name = "password")
    protected String password;

    @Column(name = "email")
    protected String email;

    @Column(name = "name")
    protected String name;
}
