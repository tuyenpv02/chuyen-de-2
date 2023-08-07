package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Cart")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cart{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="AccountID")
	private Integer accountID;
	
//	mặc định join(lấy ra product) còn lazy thì k join
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ProductMa")
	private Product productMa;
	
	@Column(name="Amount")
	private Integer amount;


}
