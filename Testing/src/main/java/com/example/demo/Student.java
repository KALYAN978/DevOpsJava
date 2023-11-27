package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Student {
	
	private long id;
	private String firstName;
	private String lastName;
	

}
