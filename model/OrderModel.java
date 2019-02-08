package model_draft;

import java.util.ArrayList;

public class OrderModel {

	private OrderBean orderBean;
	private OrderDAO orderDAO;

	public OrderModel() {
		orderDAO = new OrderDAO();

		this.createNewOrder(new OrderBean("Spaghetti", 5, 2));
		this.createNewOrder(new OrderBean("Big Mac", 7, 1));
		this.createNewOrder(new OrderBean("McChicken", 6, 2));
		this.createNewOrder(new OrderBean("Strawberries", 4, 1));

	}

	public void createNewOrder(OrderBean orderBean) {
		int id = orderDAO.getAllOrders().size();
		orderBean.setId(id);
		orderDAO.createNewOrder(orderBean);
	}

	public void deleteOrder(int id) {
		orderDAO.deleteOrder(id);
	}

	public ArrayList<OrderBean> getAllOrders() {
		return orderDAO.getAllOrders();
	}

	public OrderBean getSingleOrder(int id) {
		return orderDAO.getSingleOrder(id);
	}
	
	
	
//	public ArrayList<OrderBean> getDeliveryOrder(String userName, String roleName, String orderStatus,
//			String restaurantName, String orderNum) {
//		ArrayList<OrderBean> orderList = new ArrayList<>();
//		for (int i = 0; i < orderDAO.getAllOrders().size(); i++) {
//			OrderBean o = orderDAO.getSingleOrder(i);
//
//			switch (roleName) {
//			case Role.Admin:
//				break;
//			case Role.Manager:
//				if (o.getRestaurantName().equals(restaurantName) && o.getOrderNumber().equals(orderNum)) {
//					o.setItemName(o.getItemName() + ", Qty :" + o.getQuantity() + ", Price :" + o.getPrice());
//					orderList.add(o);
//				}
//				break;
//			case Role.Chef:
//
//				if (o.getOrderStatus().equals(orderStatus) && o.getRestaurantName().equals(restaurantName)
//						&& o.getOrderNumber().equals(orderNum)) {
//					o.setItemName(o.getItemName() + ", Qty :" + o.getQuantity() + ", Price :" + o.getPrice());
//					orderList.add(o);
//				}
//				break;
//			}
//		}
//		return orderList;
//	}

}
