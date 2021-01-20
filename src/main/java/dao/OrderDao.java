package dao;

import model.Order;

import java.util.List;

public interface OrderDao {
	List<Order> findAll();

	boolean findOrder(int id);
}
