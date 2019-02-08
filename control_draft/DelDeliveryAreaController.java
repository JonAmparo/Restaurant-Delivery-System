package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantDAO;
import model_draft.RestaurauntModel;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantEditView;

public class DelDeliveryAreaController implements ActionListener{
	
	private DTO arrays;
	private RestaurantBean restoBean;
	private RestaurantDAO restoDAO;
	private RestaurantEditView view;
	private RestaurauntModel model;
	
	public DelDeliveryAreaController(RestaurauntModel model, RestaurantEditView view) {
		this.model = model;
		this.view = view;
		
		view.getBtnDeleteDeliveryArea().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		
		DefaultListModel<String> model = new DefaultListModel<>();	
		
		for (int i = 0; i < view.getDeliveryJList().getModel().getSize(); i++) {
			if(i != view.getDeliveryJList().getSelectedIndex()) {
				String item = (String) view.getDeliveryJList().getModel().getElementAt(i);
				model.addElement(item);  
			}
		}
		view.getDeliveryJList().setModel(model);
		

	}
	
}
