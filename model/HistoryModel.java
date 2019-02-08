package model_draft;

import java.util.ArrayList;

import javax.swing.DefaultListModel;

public class HistoryModel {

	private HistoryBean historyBean;
	private HistoryDAO historyDAO;
	private OrderBean orderBean;

	public HistoryModel() {
		historyDAO = new HistoryDAO();

		ArrayList<OrderBean> ArrOrderList1 = new ArrayList<OrderBean>();

		OrderBean orderFood1 = new OrderBean("Spicy Chicken", 10, 2);
		OrderBean orderFood2 = new OrderBean("Pepperoni Pizza", 5, 3);
		OrderBean orderFood3 = new OrderBean("Cheesy bread", 5, 3);
		ArrOrderList1.add(orderFood1);
		ArrOrderList1.add(orderFood2);
		ArrOrderList1.add(orderFood3);

		this.createNewHistory(
				new HistoryBean(ArrOrderList1, "2019/02/05", "12:00", "H3C 0N5", "name1", "1234 Sunshine Road", 1));

		ArrayList<OrderBean> ArrOrderList2 = new ArrayList<OrderBean>();

		OrderBean orderFood4 = new OrderBean("Fries", 5, 1);
		OrderBean orderFood5 = new OrderBean("Big Mac", 7, 1);
		OrderBean orderFood6 = new OrderBean("Drink", 1, 1);
		ArrOrderList2.add(orderFood4);
		ArrOrderList2.add(orderFood5);
		ArrOrderList2.add(orderFood6);

		this.createNewHistory(
				new HistoryBean(ArrOrderList2, "2019/02/06", "now!", "N9T 9P3", "name2", "1500 McGill College", 2));

	}

	public void createNewHistory(HistoryBean historyBean) {
		int id = historyDAO.getAllHistory().size();
		historyBean.setId(id);
		historyDAO.createNewHistory(historyBean);
	}

	public void deleteHistory(int id) {
		historyDAO.deleteHistory(id);
	}

	public ArrayList<HistoryBean> getAllHistory() {
		return historyDAO.getAllHistory();

	}

	public HistoryBean getSingleHistory(int id) {
		return historyDAO.getSingleHistory(id);
	}

}
