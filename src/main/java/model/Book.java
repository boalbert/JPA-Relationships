package model;

import javax.persistence.*;

@Entity
@Table(name = "Böcker")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ISBN13")
	private int id;

	@Column(name = "Titel")
	private String title;

	@Column(name ="Språk")
	private String language;

	@Column(name = "Pris")
	private float price;

	@Column(name ="Utgivningsdatum")
	private String datePublished;

	@Column(name ="Sidor")
	private int pages;

	public Book() {
	}

	@Override
	public String toString() {
		return "Book{" +
				"title='" + title + '\'' +
				'}';
	}

	public int getId() {
		return id;
	}

	public void setId(int ISBN13) {
		this.id = ISBN13;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDatePublished() {
		return datePublished;
	}

	public void setDatePublished(String datePublished) {
		this.datePublished = datePublished;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
}
