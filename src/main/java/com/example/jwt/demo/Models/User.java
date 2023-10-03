package com.example.jwt.demo.Models;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
@ToString
@Builder
public class User {
	private String userId;
	private String name;
	private String email;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
