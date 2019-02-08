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

public class EditDeleteItemMenuController implements ActionListener{

	private RestaurantEditMenuView view;
	private RestaurauntModel model;
	
	public EditDeleteItemMenuController(RestaurantEditMenuView view, RestaurauntModel model) {
		this.view = view;
		this.model = model;
		
		view.getBtnDeleteItem().addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(view.getMenuItems_list().getModel().getSize() > 0) {
						
			if(view.getMenuItems_list().getSelectedIndex() != -1) {
								
				DefaultListModel<RestaurantMenuBean> model = new DefaultListModel<RestaurantMenuBean>();
				
				for(int i = 0; i < view.getMenuItems_list().getModel().getSize(); i++) {
					if(i != view.getMenuItems_list().getSelectedIndex()) {
						RestaurantMenuBean rmb = (RestaurantMenuBean) view.getMenuItems_list().getModel().getElementAt(i);
						model.addElement(rmb);
					}
				}
				view.getMenuItems_list().setModel(model);				
			}
		}		
		
	}
	

}
