package com.gunadhya.diem.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainControllers {

	@RequestMapping("/one")
	public String one()
	{
		return "we are main controllers2";
	}
}
