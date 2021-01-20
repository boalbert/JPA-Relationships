import dao.CustomerDao;
import dao.CustomerDaoImpl;
import dao.OrderDao;
import dao.OrderDaoImpl;
import model.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		OrderDao orderDao = new OrderDaoImpl();
		System.out.println(orderDao.findOrder(3));
	}
}
