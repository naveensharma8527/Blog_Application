package com.naveen.payloads;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
	
    private Integer id;
	
	
	private String name;
	
	private String email;
	private String password;
	private String about;
	
	

}
