package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantDAO;
import model_draft.RestaurauntModel;
import view_draft.RestaurantCreateView;

public class DelDelivRestaurant implements ActionListener{
	
	private DTO arrays;
	private RestaurantBean restoBean;
	private RestaurantDAO restoDAO;
	private RestaurantCreateView view;
	private RestaurauntModel model;
	
	public DelDelivRestaurant(RestaurauntModel model, RestaurantCreateView view) {
		this.model = model;
		this.view = view;
		
		view.getBtnDeleteDeliveryArea().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		
		DefaultListModel<String> model = new DefaultListModel<>();	
		
		for (int i = 0; i < view.getList().getModel().getSize(); i++) {
			if(i != view.getList().getSelectedIndex()) {
				String item = (String) view.getList().getModel().getElementAt(i);
				model.addElement(item);  
			}
		}
		view.getList().setModel(model);
		
		
		

	}
	
	

}
