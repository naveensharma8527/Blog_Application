package com.naveen.payloads;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
	
    private Integer id;
	
	
	@NotBlank
	@NotEmpty
	@Size(min = 4, message = "Username must be min of 4 chararter")
	private String name;
	
	@Email(message = "Email is not valid")
	private String email;
	
	@NotEmpty
	private String password;
	
	@NotNull
	private String about;
	
	

}
