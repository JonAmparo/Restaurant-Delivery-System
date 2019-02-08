package model_draft;

import java.util.ArrayList;

public class HistoryDAO {
	
	public void createNewHistory(HistoryBean historyBean) {
		int id = DTO.getInstance().getHistoryList().size();
		historyBean.setId(id);
		DTO.getInstance().getHistoryList().add(historyBean);
	}
	
	public void editHistory (HistoryBean historyBean, int id) {
		DTO.getInstance().getHistoryList().set(id, historyBean);
	}
	
	public void deleteHistory (int id) {
		DTO.getInstance().getHistoryList().remove(id);
	}
	
	public ArrayList<HistoryBean> getAllHistory() {
		return DTO.getInstance().getHistoryList();
	}
	
	public HistoryBean getSingleHistory(int id) {
		return DTO.getInstance().getHistoryList().get(id);
	}

}
