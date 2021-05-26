package com.springboot.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "BOOK_TBL")
public class Book {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String author;
	private double price;
	
	
}
