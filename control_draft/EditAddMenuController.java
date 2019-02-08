package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantMenuBean;
import model_draft.RestaurauntModel;
import view_draft.RestaurantCreateMenuView;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantEditMenuView;

public class EditAddMenuController implements ActionListener{

	private RestaurantEditMenuView view;
	private RestaurauntModel model;
	
	public EditAddMenuController(RestaurantEditMenuView view, RestaurauntModel model) {
		this.view = view;
		this.model = model;
		
		view.getBtnAdd().addActionListener(this);
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
		
		if(view.getItemTxt_field().getText().equals("") || view.getPriceTxt_field().getText().equals("")) {
			JOptionPane.showMessageDialog(null, "one or more fields were empty.", "Oops", JOptionPane.ERROR_MESSAGE);
		} else if(badString){
			JOptionPane.showMessageDialog(null, "This field can only take numbers.");
			view.getPriceTxt_field().setText("");
		} else {
		
			if(view.getMenuItems_list().getModel().getSize() > 0) {
						
			RestaurantMenuBean restoMenuBean = new RestaurantMenuBean(view.getItemTxt_field().getText(), Integer.parseInt(view.getPriceTxt_field().getText()));
			
			DefaultListModel<RestaurantMenuBean> model = (DefaultListModel<RestaurantMenuBean>) view.getMenuItems_list().getModel();
						
			model.addElement(restoMenuBean);  				
			
			view.getMenuItems_list().setModel(model);	
						
			
		}else {
			
			RestaurantMenuBean restoMenuBean = new RestaurantMenuBean(view.getItemTxt_field().getText(), Integer.parseInt(view.getPriceTxt_field().getText()));
			
			DefaultListModel<RestaurantMenuBean> model = new DefaultListModel<>();
						
			model.addElement(restoMenuBean);  				
			
			view.getMenuItems_list().setModel(model);			
			
		}		
		
		view.getItemTxt_field().setText("");
		view.getPriceTxt_field().setText("");
		}
	}
	

}
