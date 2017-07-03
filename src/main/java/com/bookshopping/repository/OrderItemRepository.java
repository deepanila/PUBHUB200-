package com.bookshopping.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bookshopping.model.OrderItem;
@Repository
public interface OrderItemRepository  extends JpaRepository<OrderItem,Integer>{
	/*@Query(name = "SELECT SUM(a.qp) total_price FROM(SELECT quantity*price qp FROM order_items JOIN book ON book.id=order_items.book_id WHERE order_id=?1) a", nativeQuery = true)
	public Float findByOrder(int orderId);
	*/
	
	/*@Query(name = "SELECT quantity*price qp FROM order_items JOIN book ON book.id=order_items.book_id WHERE order_id=?1", nativeQuery = true)
	public List<Integer> findByPrice(int orderId);
*/
}
