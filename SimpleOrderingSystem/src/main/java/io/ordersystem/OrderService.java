package io.ordersystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	private  List<Order> orders= new ArrayList<>(Arrays.asList(
				new Order("order1","Order One ","Order One description",10, false),
				new Order("order2","Order Two","Order two description", 20, false),
				new Order("order3","Order Three","Order Three description", 30, false),
				new Order("order4","Order Four","Order Four", 40, false)
				));
	
	public List<Order> getAllOrders(){
		return orders;
		/*List<Order> orders = new ArrayList<>();
		orderRepository.findAll().
		forEach(orders::add);
		return orders;*/
	}
	
public Order getOrder(String id) {
	
	return orders.stream().filter( t -> t.getId().equals(id)).findFirst().get();
	//return orderRepository.findOne(id);
		
	}

	public void addOrder(Order order) {
		///orderRepository.save(order);
		orders.add(order);
			
		}


public void updateOrder(String id, Order order) {
	
	for(int i=0; i<orders.size();i++) {
	Order t = orders.get(i);
	if(t.getId().equals(id)) {
		orders.set(i, order);
		return;
	}
}

	//orderRepository.save(order);
	
}

public void deleteOrder(String id) {
	orders.removeIf(t -> t.getId().equals(id));
	//orderRepository.delete(id);
}
				
	}


