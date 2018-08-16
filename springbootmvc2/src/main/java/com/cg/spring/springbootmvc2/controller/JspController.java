package com.cg.spring.springbootmvc2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JspController {




	@RequestMapping("/ManageMerchants")
	public String showProductByIdPage() {
		return "ManageMerchants";
	}
	@RequestMapping("/ThirdPartyMerchants2")
	public String ahowProductByIdPage() {
		return "ThirdPartyMerchants2";
	}
	@RequestMapping("/index")
	public String addMerchants (){
		return "index";
	}
	@RequestMapping("/Delete")
	public String deleteMerchant (){
		return "Delete";
	}
	}


