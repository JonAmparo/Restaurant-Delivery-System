package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantMenuBean;
import model_draft.RestaurauntModel;
import view_draft.RestaurantCreateMenuView;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantEditMenuView;

public class EditEditMenuController implements ActionListener{

	private RestaurantEditMenuView view;
	private RestaurauntModel model;
	
	public EditEditMenuController(RestaurantEditMenuView view, RestaurauntModel model) {
		this.view = view;
		this.model = model;
		
		view.getBtnEditItem().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		boolean badString = false;
		for(int i = 0; i < view.getPriceTxt_field().getText().length(); i++) {
			if(view.getPriceTxt_field().getText().charAt(i) < 48 || view.getPriceTxt_field().getText().charAt(i) > 57) {
				badString = true;
				break;
			}
		}	
		
		//TODO: Add the check for numbers in the String. Use badString variable
		
		if(view.getMenuItems_list().getModel().getSize() > 0) {
			
			if(view.getMenuItems_list().getSelectedIndex() != -1) {
								
				DefaultListModel<RestaurantMenuBean> model = new DefaultListModel<RestaurantMenuBean>();
				
				for(int i = 0; i < view.getMenuItems_list().getModel().getSize(); i++) {
					if(i != view.getMenuItems_list().getSelectedIndex()) {
						RestaurantMenuBean rmb = (RestaurantMenuBean) view.getMenuItems_list().getModel().getElementAt(i);
						model.addElement(rmb);
					}else {
						RestaurantMenuBean rmb = (RestaurantMenuBean) view.getMenuItems_list().getModel().getElementAt(i);
						rmb.setItem(view.getItemTxt_field().getText());
						rmb.setPrice(Integer.parseInt(view.getPriceTxt_field().getText()));
						model.addElement(rmb);
					}
				}
				view.getMenuItems_list().setModel(model);		
				
				view.getItemTxt_field().setText("");
				view.getPriceTxt_field().setText("");
			}
		}
		
	}
	

}
