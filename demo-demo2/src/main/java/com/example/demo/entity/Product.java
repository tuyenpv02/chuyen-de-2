package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ma")
	private Integer ma;
	
	private String name;
	
	private String image;
	
	private Double price;

	private Integer quantity;
	
	private String title;
	
	private String description;
	
	private Integer cateID;
	
	private Integer sell_ID;

	@OneToMany(mappedBy = "productMa")
	List<Cart> carts;
	

}
