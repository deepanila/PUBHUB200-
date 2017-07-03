package com.bookshopping.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.servlet.http.HttpSession;

@Entity
@Table(name="order_items")
public class OrderItem {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	
/*	private float price;
	
	//@ManyToOne
	@JoinColumn(name = "title")
	private String title;
	
	*/
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@Column(name = "quantity")
	private Integer quantity;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "book_id")
	//@Column(name="book_id")
	private Book book;



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public HttpSession getBook() {
		return null;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	/*@Override
	public String toString() {
		return "OrderItem [id=" + id + ", order=" + order + ", quantity=" + quantity + ", book=" + book + "]";
	}*/
	

	

	


	

}
