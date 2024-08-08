package com.apps.photo_app_descovery.app.api.account_management.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accountManagement")
public class AccountManagementController {
	
	@GetMapping("/status/check")
	public String getAccount() {
		return "Working";
	}
}
