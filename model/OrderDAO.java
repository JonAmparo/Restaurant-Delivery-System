package model_draft;

import java.util.ArrayList;

public class OrderDAO {

	public void createNewOrder(OrderBean orderBean) {
		int id = DTO.getInstance().getHistoryList().size();
		orderBean.setId(id);
		DTO.getInstance().getOrderList().add(orderBean);
	}

	public void deleteOrder(int id) {
		DTO.getInstance().getOrderList().remove(id);
	}

	public ArrayList<OrderBean> getAllOrders() {
		return DTO.getInstance().getOrderList();
	}

	public OrderBean getSingleOrder(int id) {
		return DTO.getInstance().getOrderList().get(id);
	}

}
