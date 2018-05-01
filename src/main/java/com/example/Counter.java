package com.example;

import org.springframework.stereotype.Component;

@Component
public class Counter {
	private String time;
	private int count;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(System.getProperty("line.separator"));
		sb.append("timestamp = " + time).append(System.lineSeparator());
		sb.append("Calls = " + count);
		return sb.toString();
	}
}
