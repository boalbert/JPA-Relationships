package dao;

import model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPABookstore");

	@Override
	public List<Customer> findAll() {
		List<Customer> customers;

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		customers = em.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();

		em.getTransaction().commit();

		return customers;
	}
}
