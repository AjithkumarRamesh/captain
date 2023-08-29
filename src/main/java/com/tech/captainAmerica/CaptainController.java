package com.tech.captainAmerica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaptainController {
@GetMapping("/theNameis")
public String theNameis() {
	return "CAPTAIN AMERICA";
}
}
