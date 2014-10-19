package com.cheehong.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cheehong.domain.User;

/**
 * @author Chee-Hong Hsia
 * Concrete implementation class of the UserDAO interface.
 *
 */
@Component
@Transactional
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void createUser(User user) { 
		this.sessionFactory.getCurrentSession().persist(user);
	}

	public User getUserBy(String BSN) {
		Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("BSN", BSN));
		return (User) criteria.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		return this.sessionFactory.getCurrentSession().createCriteria(User.class).list();
	}

	public void delete(String userID) {
		String hql = "delete from User where id= :userID";
		this.sessionFactory.getCurrentSession().createQuery(hql).setString("userID", userID).executeUpdate();
	}
}
