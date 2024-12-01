package br.com.chenrique.secury_jwt_estudo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.chenrique.secury_jwt_estudo.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	Optional<User> findByUsername(String username);
}
