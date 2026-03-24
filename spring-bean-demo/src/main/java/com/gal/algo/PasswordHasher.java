package com.gal.algo;
import org.springframework.stereotype.Component;
@Component
public class PasswordHasher {
	public String hashPassword(String password) {
		return new StringBuilder(password).reverse().toString();
	}
	public PasswordHasher() {
		System.out.println("password hashed");
	}

}
