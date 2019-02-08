package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;

import model_draft.RestaurantBean;
import model_draft.RestaurantMenuBean;
import model_draft.RestaurauntModel;
import view_draft.RestaurantCreateMenuView;
import view_draft.RestaurantEditMenuView;

public class EditRestoMenuController implements ActionListener{

	public RestaurauntModel model;
	public RestaurantEditMenuView restoEditMenuView;
	
	public EditRestoMenuController(RestaurauntModel model, RestaurantEditMenuView restoEditMenuView) {		
		this.model = model;
		this.restoEditMenuView = restoEditMenuView;
		
		restoEditMenuView.getBtnNewButton().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		DefaultListModel<RestaurantMenuBean> listModel = (DefaultListModel<RestaurantMenuBean>) restoEditMenuView.getMenuItems_list().getModel();
		
		ArrayList<RestaurantMenuBean> newRmb = new ArrayList<RestaurantMenuBean>(); 
		
		for(int i = 0; i < listModel.getSize(); i++) {
			newRmb.add(listModel.get(i));			
		}
		
		RestaurantBean rb = (RestaurantBean) restoEditMenuView.getRestaurantSelect_list().getSelectedValue();
		
		rb.setRestoMenuBean(newRmb);
		
	}
	
	
	
	
		
}
