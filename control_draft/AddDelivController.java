package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantDAO;
import model_draft.RestaurauntModel;
import view_draft.RestaurantCreateView;

public class AddDelivController implements ActionListener{
	
	private DTO arrays;
	private RestaurantBean restoBean;
	private RestaurantDAO restoDAO;
	private RestaurantCreateView view;
	private RestaurauntModel model;
	
	public AddDelivController(RestaurauntModel model, RestaurantCreateView view) {
		this.model = model;
		this.view = view;
		
		view.getBtnAddDeliveryArea().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO: check out model and JList
		DefaultListModel<String> model = new DefaultListModel<>();

		if(view.getList().getModel().getSize() > 0) {
			for (int i = 0; i < view.getList().getModel().getSize(); i++) {
				String item = (String) view.getList().getModel().getElementAt(i);
				model.addElement(item);  
			}
			model.addElement(view.getTextField().getText());  			
		}else {			
			model.addElement(view.getTextField().getText());   
		}
		view.getList().setModel(model);
		view.getTextField().setText("");
		
	  

	   
	   
		    
		    
		    
		//DefaultListModel<String> model = new DefaultListModel<>();
        //model.addElement(view.getTextField().getText());   
        
		//view.getList().setModel(model);
		
		
		
	}

}
