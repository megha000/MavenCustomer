package com.lti.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.finanace.component.LoginException;
import com.lti.finance.dao.EmiCardDao;
import com.lti.finance.dto.EmiCard;
import com.lti.finance.entity.EmiCardEntity;
import com.lti.finance.entity.Register;

@Service
public class EmiCardService {

	@Autowired
	private EmiCardDao emiDao;

	@Transactional
	public void emicard(EmiCard emidto) {

		EmiCardEntity emicard = new EmiCardEntity();
		emicard.setMin_limit(emidto.getMin_limit());

		emicard.setValid_upto(emidto.getValid_upto());
		// emicard.setType(emidto.getType());
		//
		// if(emicard.getType()=="gold") {
		// emicard.setMin_limit(60000);
		//
		// }
		// else {
		// emicard.setMin_limit(120000);
		//
		// }

		emiDao.add(emicard);

	}

	public EmiCardEntity getUserDetails(EmiCard emidto, Register register) {
		try {
			register.getCardtype();
			EmiCardEntity card = emiDao.fetchUserDetails(emidto);
			return card;
		} catch (LoginException e) {
			return null;

		}
	}

}
