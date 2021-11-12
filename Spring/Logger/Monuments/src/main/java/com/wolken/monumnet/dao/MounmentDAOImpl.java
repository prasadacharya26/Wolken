package com.wolken.monumnet.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.monumnet.entity.MonumentEntity;

@Component
public class MounmentDAOImpl implements MonumentDAO {
	@Autowired
	SessionFactory factory;
	Logger logger=Logger.getLogger(MounmentDAOImpl.class);
	public void save(MonumentEntity entity) {
		Session session=null;
		try {
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
		}finally {
			session.close();
		}	
	}
	public List getAll() {
		Session session=null;
		List<MonumentEntity> list=null;
		try {
			session=factory.openSession();
			Query<MonumentEntity> query=session.createNamedQuery("getAll");
			list=query.list();
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}finally {
			session.close();
		}	
		return list;
	}
}
