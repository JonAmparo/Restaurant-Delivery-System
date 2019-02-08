package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantMenuBean;
import model_draft.RestaurauntModel;
import view_draft.AdminDash;
import view_draft.RestaurantDeleteMenuView;

public class DeleteMenuController implements ActionListener{
	

	public RestaurauntModel model;
	public RestaurantDeleteMenuView restoDeleteMenuView;
	
	public DeleteMenuController(RestaurauntModel model, RestaurantDeleteMenuView restoDeleteMenuView) {
		this.model = model;
		this.restoDeleteMenuView = restoDeleteMenuView;
		
		restoDeleteMenuView.getMenuDelete_button().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		int index = restoDeleteMenuView.getRestaurantSelect_list().getSelectedIndex();
		
		RestaurantBean rb = (RestaurantBean) restoDeleteMenuView.getRestaurantSelect_list().getSelectedValue();
		
		rb.setRestoMenuBean(null);
		
		if(DTO.getInstance().getRestaurauntList().size() > 0) {
			
			DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
			
			for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
				
				RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
				model.addElement(item);  				
			}
			restoDeleteMenuView.getRestaurantSelect_list().setModel(model);			
			
		}
		
		restoDeleteMenuView.getRestaurantSelect_list().setSelectedIndex(index);
	}
}