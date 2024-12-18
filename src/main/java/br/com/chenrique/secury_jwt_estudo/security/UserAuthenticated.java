package br.com.chenrique.secury_jwt_estudo.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.chenrique.secury_jwt_estudo.entity.User;

public class UserAuthenticated implements UserDetails {

	private static final long serialVersionUID = 1L;

	private final User user;

	public UserAuthenticated(User user) {
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(() -> "read");
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

}
