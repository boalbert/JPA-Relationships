package dao;

import java.util.List;

public interface CustomerDao {
	List<model.Customer> findAll();
}
