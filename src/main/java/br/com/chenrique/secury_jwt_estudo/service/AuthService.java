package br.com.chenrique.secury_jwt_estudo.service;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
	private JwtService jwtService;

	public AuthService(JwtService jwtService) {
		this.jwtService = jwtService;
	}
	
	public String authenticate(Authentication authentication) {
		return jwtService.generaToken(authentication);
	}
}
