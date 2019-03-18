package com.lti.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finanace.component.LoginException;
import com.lti.finance.dao.EmiCardDao;
import com.lti.finance.dao.RegisterDao;
import com.lti.finance.dto.EmiCard;
import com.lti.finance.dto.RegisterDTO;
import com.lti.finance.entity.EmiCardEntity;
import com.lti.finance.entity.Register;

@Service
public class EmiCardService {

	@Autowired
	private EmiCardDao emiDao;
	private RegisterDao registerdao;

	@Transactional

	public void emicardDetail(EmiCard emidto, RegisterDTO registerdto) {

		EmiCardEntity emicard = new EmiCardEntity();
		Register register = new Register();

		emicard.setMin_limit(emidto.getMin_limit());
		System.out.println(emidto.getMin_limit());

		emicard.setCvv(emidto.getCvv());
		System.out.println(emidto.getCvv());
		emicard.setCard_id(emidto.getCard_id());
		emicard.setRegister(emidto.getRegister());
		register.setName(registerdto.getName());
		register.setCardtype(register.getCardtype());

		emiDao.merge(emicard);
		registerdao.add(register);
	}

	public EmiCardEntity getUserDetails(EmiCard emidto, Register register) {
		try {
			EmiCardEntity card = emiDao.fetchUserDetails(emidto);
			return card;
		} catch (LoginException e) {
			return null;

		}

	}

}
