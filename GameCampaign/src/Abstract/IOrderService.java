package Abstract;

import Entities.Order;

public interface IOrderService {
	void add(Order order);
	void update(Order order);
	void delete(int orderId);
	void printAllItems();
}
