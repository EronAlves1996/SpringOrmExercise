package io.eronalves1996.spring.springormexercise;

import java.util.List;

public interface PassengerDAO {
	
	int create(Passenger passenger);
	Passenger readOne(int id);
	List<Passenger> readAll();
	void update(Passenger passenger);
	void delete(Passenger passenger);
}
