package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "`Order`")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", insertable = false, updatable = false)
	private int id;
	@Column(name = "KundId")
	private int customerId;
	@Column(name = "ButikId")
	private int storeId;
	@Column(name = "OrderDate")
	private String orderDate;
//
	@OneToOne
	@JoinColumn(name = "ID")
	private Customer customer;

//	@OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY) FUNKAR
	@OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	@JoinColumn(name = "OrderId")
	private List<OrderDetails> orderDetailsList;


	public List<OrderDetails> getOrderDetailsList() {
		return orderDetailsList;
	}

	public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
		this.orderDetailsList = orderDetailsList;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "\nOrder{" +
				"customer=" + customer +
				", orderDate='" + orderDate + '\'' +
				", orderDetails='" + orderDetailsList + '\'' +
				"}\n";
	}

	public Order() {
	}

	public Order(int id, int customerId, int storeId, String orderDate) {
		this.id = id;
		this.customerId = customerId;
		this.storeId = storeId;
		this.orderDate = orderDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
}
