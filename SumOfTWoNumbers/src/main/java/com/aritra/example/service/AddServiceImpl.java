package com.aritra.example.service;

import org.springframework.stereotype.Service;

@Service
public class AddServiceImpl implements AddService {

	@Override
	public int addNumbers(int number1, int number2) {
		
		return number1 + number2;
	}

}
