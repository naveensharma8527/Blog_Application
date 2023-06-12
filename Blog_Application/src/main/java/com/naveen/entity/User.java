package com.naveen.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Entity
@Table(name="users" )
@NoArgsConstructor
@Data
@Getter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column( name = "user_name",nullable = false,length = 100 )
	private String name;
	
	private String email;
	private String password;
	private String about;
	
	
}
