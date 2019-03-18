package com.lti.finance.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.omg.CORBA.UserException;
import org.springframework.stereotype.Repository;

import com.lti.finance.dto.EmiCard;
import com.lti.finance.entity.EmiCardEntity;
import com.lti.finance.entity.Register;

@Repository
public class EmiCardDao {

	@PersistenceContext
	private EntityManager em;

	public void merge(EmiCardEntity emientity) {
		em.persist(emientity);
	}
	
	public EmiCardEntity fetchUserDetails( EmiCard emidto) {
		System.out.println( emidto.getRegister().userId);
		Query q =  em.createQuery("select  r from EmiCardEntity as r where r.register.userId=:userId");
		q.setParameter("userId", emidto.getRegister().userId);
		EmiCardEntity e = (EmiCardEntity) q.getSingleResult();
		return e;
	}



}
