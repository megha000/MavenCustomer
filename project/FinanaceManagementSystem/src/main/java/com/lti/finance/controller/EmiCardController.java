package com.lti.finance.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.finance.dto.EmiCard;
import com.lti.finance.entity.EmiCardEntity;
import com.lti.finance.entity.Register;
import com.lti.finance.service.EmiCardService;

@Controller

@SessionAttributes({ "user" })
public class EmiCardController {
	@Autowired
	private EmiCardService emiservice;

	@RequestMapping(path = "/emicard", method = RequestMethod.GET)
	public String getUserDetails(EmiCard emidto, Map<String, Object> model, HttpSession session) {
		Register register = (Register) session.getAttribute("user");
		EmiCardEntity cardEntity = emiservice.getUserDetails(emidto, register);
		model.put("emicard",cardEntity);
		System.out.println("done");
		return "/cardtype.jsp";

	}

}
