package com.example.aritra.azci.controllers;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aritra.azci.model.ECFInfo;

@RestController
public class ECFController {

	@GetMapping("/ecfInfo")
	public ResponseEntity<ECFInfo> getEcfIno() {

		ECFInfo info = new ECFInfo("Elevation Cultural Forum New", new Date());

		return ResponseEntity.ok(info);
	}

}
