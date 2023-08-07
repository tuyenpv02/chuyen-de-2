package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Category {
	
	@Id
	@Column(name = "cid")
	private Integer cid;
	
	@Column(name = "cname")
	private String cname;


}
