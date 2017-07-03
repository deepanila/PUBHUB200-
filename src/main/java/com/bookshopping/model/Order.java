package com.bookshopping.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="orders")

public class Order {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	//@Formula("fn_get_order_amount(id)")
	@Column(name = "total_price")
	private float totalPrice;

	@Column(name = "status")
	private String status;
	
	@OneToMany(mappedBy = "order", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<OrderItem> orderItems = new ArrayList<>();
	
	@Column (name="ordered_date")	
	private LocalDateTime orderedDate;
	
	@Column (name="cancelled_date")
	private LocalDate cancelledDate;
	@Column (name="delivered_date")
	private LocalDate deliveredDate;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public LocalDateTime getOrderedDate() {
		return orderedDate;
	}

	public void setOrderedDate(LocalDateTime now) {
		//this.orderedDate = orderedDate;
	}

	public LocalDate getCancelledDate() {
		return cancelledDate;
	}

	public void setCancelledDate(LocalDate now) {
		//this.cancelledDate = cancelledDate;
	}

	public LocalDate getDeliveredDate() {
		return deliveredDate;
	}

	public void setDeliveredDate(LocalDate now) {
		//this.deliveredDate = deliveredDate;
	}
/*
	@Override
	public String toString() {
		return "Order [id=" + id + ", user=" + user + ", totalPrice=" + totalPrice + ", status=" + status
				+ ", orderItems=" + orderItems + ", orderedDate=" + orderedDate + ", cancelledDate=" + cancelledDate
				+ ", deliveredDate=" + deliveredDate + "]";
	}
*/
	




}
