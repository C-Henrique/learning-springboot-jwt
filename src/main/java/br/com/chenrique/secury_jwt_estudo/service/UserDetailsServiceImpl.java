package br.com.chenrique.secury_jwt_estudo.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.chenrique.secury_jwt_estudo.repository.UserRepository;
import br.com.chenrique.secury_jwt_estudo.security.UserAuthenticated;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private final UserRepository userRepository;

	public UserDetailsServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userRepository.findByUsername(username).map(UserAuthenticated::new)
				.orElseThrow(() -> new UsernameNotFoundException("Usuário não encotrado!"));
	}

}
