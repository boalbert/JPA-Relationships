package model;

import javax.persistence.*;

@Entity
@Table(name = "Order_detaljer")
public class OrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OrderId")
	private int orderId;
	@Column(name = "BokId")
	private String bookId;
	@Column(name = "`Pris per styck`")
	private float price;
	@Column(name = "Antal")
	private int qty;

//	@ManyToOne
//	@JoinColumn(name = "ISBN13")
//	private Book book;
//
//	public Book getBook() {
//		return book;
//	}
//
//	public void setBook(Book book) {
//		this.book = book;
//	}

	public OrderDetails() {
	}

	public OrderDetails(int orderId, String bookId, float price, int qty) {
		this.orderId = orderId;
		this.bookId = bookId;
		this.price = price;
		this.qty = qty;
	}

	public int getOrderId() {
		return orderId;
	}

	@Override
	public String toString() {
		return "OrderDetails{" +
				"orderId=" + orderId +
//				", book='" + book + '\'' +
				", price=" + price +
				", qty=" + qty +
				'}';
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}
