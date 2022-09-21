package com.gigadev.firedetection;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public abstract class Subject {
	
	// subject contiene un'array list degli oggetti che devono comunicare l'informazione
	private final List<Observer> observers = new ArrayList<Observer>();
	
	public void alertObservers() {
		this.getObservers().forEach(ele -> ele.update(this));
	}
	
	public void addObserver(Observer observer) {
		this.getObservers().add(observer);
	}
	
	public boolean removeObserver(Observer observer) {
		return this.getObservers().remove(observer);		
	}
	
}
