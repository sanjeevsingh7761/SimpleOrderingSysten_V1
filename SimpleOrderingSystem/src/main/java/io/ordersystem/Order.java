package io.ordersystem;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	private String id;
	private String name;
	private String descriptions;
	private int quantity;
	private boolean isComplete;
	
	
	public boolean isComplete() {
		return isComplete;
	}
	public void setComplete(boolean isComplete) {
		this.isComplete = isComplete;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Order(String id, String name, String descriptions, int quantity, boolean isComplete) {
		super();
		this.id = id;
		this.name = name;
		this.descriptions = descriptions;
		this.quantity = quantity;
		this.isComplete = isComplete;
	}
	public void markComplete() {
		setComplete(true);
	}
	
	public void markIncomplete() {
		setComplete(false);
	}
	public Order() {
		
	}
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
