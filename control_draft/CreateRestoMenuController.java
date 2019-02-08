package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model_draft.RestaurantBean;
import model_draft.RestaurantMenuBean;
import model_draft.RestaurauntModel;
import view_draft.RestaurantCreateMenuView;

public class CreateRestoMenuController implements ActionListener{

	public RestaurauntModel model;
	public RestaurantCreateMenuView restoCreateMenuView;
	
	public CreateRestoMenuController(RestaurauntModel model, RestaurantCreateMenuView restoCreateMenuView) {		
		this.model = model;
		this.restoCreateMenuView = restoCreateMenuView;
		
		restoCreateMenuView.getBtnNewButton().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
		int temp = 0;		
		temp =	JOptionPane.showConfirmDialog(null, "are you sure you want to create this menu?");
		if(temp == 0) {
			JOptionPane.showMessageDialog(null, "Menu has been added", "Menu Create", JOptionPane.DEFAULT_OPTION);
		
		
		DefaultListModel<RestaurantMenuBean> listModel = (DefaultListModel<RestaurantMenuBean>) restoCreateMenuView.getMenuItems_list().getModel();
		
		ArrayList<RestaurantMenuBean> newRmb = new ArrayList<RestaurantMenuBean>(); //(ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		
		for(int i = 0; i < listModel.getSize(); i++) {
			newRmb.add(listModel.get(i));
			
		}
		
		RestaurantBean rb = (RestaurantBean) restoCreateMenuView.getRestaurantSelect_list().getSelectedValue();
		
		rb.setRestoMenuBean(newRmb);
		}else {
			
		}
	}
	
	
	
	
		
}
