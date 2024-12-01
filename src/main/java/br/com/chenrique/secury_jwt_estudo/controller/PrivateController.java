package br.com.chenrique.secury_jwt_estudo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrivateController {

	@GetMapping("private")
	public String getMsgPrivate() {
		return "Heello mundo";
	}
}
