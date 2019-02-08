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

public class AddDelivEditController implements ActionListener{
	
	private DTO arrays;
	private RestaurantBean restoBean;
	private RestaurantDAO restoDAO;
	private RestaurantEditView view;
	private RestaurauntModel model;
	
	public AddDelivEditController(RestaurauntModel model, RestaurantEditView view) {
		this.model = model;
		this.view = view;
		
		view.getBtnAddDeliveryArea().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO: check out model and JList
		DefaultListModel<String> model = new DefaultListModel<>();

		if(view.getDeliveryJList().getModel().getSize() > 0) {
			for (int i = 0; i < view.getDeliveryJList().getModel().getSize(); i++) {
				String item = (String) view.getDeliveryJList().getModel().getElementAt(i);
				model.addElement(item);  
			}
			model.addElement(view.getTextField().getText());  			
		}else {			
			model.addElement(view.getTextField().getText());   
		}
		view.getDeliveryJList().setModel(model);
		view.getTextField().setText("");
		
		
		
	}

}
