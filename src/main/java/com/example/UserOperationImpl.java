package com.example;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserOperationImpl implements UserOperation {

	@Autowired
	Counter counter;
	
	int count = 0;
	
	@Override
	public Counter getCount() {
		count++;
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		counter.setCount(count);
		counter.setTime(timestamp.toString());
		return counter;
	}
}
