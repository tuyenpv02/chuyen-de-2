package com.example.demo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Account")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uID")
	private Integer uID;
	
	@Column(name="username")
	private String username; 

	@Column(name="pass")
	private String pass;

	private Integer isSell;
	
	private Integer isAdmin;


}

