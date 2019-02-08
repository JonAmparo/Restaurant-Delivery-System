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
import view_draft.RestaurantCreateMenuView;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantEditMenuView;

public class EditRestoMenuDash implements ActionListener{
	

	public AdminDash dashboardView;
	public RestaurauntModel model;
	public RestaurantEditMenuView restoEditMenuView;
	
	public EditRestoMenuDash(RestaurauntModel model, AdminDash dashboardView, RestaurantEditMenuView restoCreateMenuView) {
		this.dashboardView = dashboardView;
		this.model = model;
		this.restoEditMenuView = restoCreateMenuView;
		
		dashboardView.getBtnEdit_1().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		dashboardView.dispose(); 
		restoEditMenuView.setVisible(true);
		
		restoEditMenuView.getMnRestaurant().setVisible(true);
		
		if(DTO.getInstance().getRestaurauntList().size() > 0) {
			
			DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
			
			for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
				
				RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
				model.addElement(item);  				
			}
			restoEditMenuView.getRestaurantSelect_list().setModel(model);	
			
			restoEditMenuView.getRestaurantSelect_list().setSelectedIndex(0);
		}
		
		
		restoEditMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                	
                	RestaurantBean rb = (RestaurantBean) restoEditMenuView.getRestaurantSelect_list().getSelectedValue();
                	
                	ArrayList<RestaurantMenuBean> rmb = null;
                	
                	if(rb != null) {
                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
                	}	
                	
                	if(rmb != null) {
                		
                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
                		
                		for(int i = 0; i < rmb.size(); i++) {
                			listModel.addElement(rmb.get(i));
                		}
                		
                		restoEditMenuView.getMenuItems_list().setModel(listModel);
                		
                	}else {
                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
                		restoEditMenuView.getMenuItems_list().setModel(listModel);
                	}
                	
                }
            }
		});
		

 }
}