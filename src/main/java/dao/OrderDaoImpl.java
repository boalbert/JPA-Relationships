package dao;

import model.Order;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPABookstore");

	@Override
	public List<Order> findAll() {
		List<Order> orders;

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		orders = em.createQuery("SELECT o FROM Order o", Order.class).getResultList();

		em.getTransaction().commit();

		return orders;
	}

	@Override
	public boolean findOrder(int id) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Order o = em.find(Order.class, id);

		if(o != null) {
			System.out.println("Found order: " + o);
			return true;
		}

		System.out.println("Order " + id + " not found.");
		em.close();
		return false;

	}
}
