package io.eronalves1996.spring.springormexercise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("dao")
public class PassengerDAOImpl implements PassengerDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Passenger passenger) {
		return (int) hibernateTemplate.save(passenger);
	}

	@Override
	@Transactional
	public Passenger readOne(int id) {
		return hibernateTemplate.get(Passenger.class, id);
	}

	@Override
	@Transactional
	public List<Passenger> readAll() {
		return hibernateTemplate.loadAll(Passenger.class);
	}

	@Override
	@Transactional
	public void update(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}

	@Override
	@Transactional
	public void delete(Passenger passenger) {
		hibernateTemplate.delete(passenger);
	}

}
