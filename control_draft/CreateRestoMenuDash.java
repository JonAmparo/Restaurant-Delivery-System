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

public class CreateRestoMenuDash implements ActionListener{
	

	public AdminDash dashboardView;
	public RestaurauntModel model;
	public RestaurantCreateMenuView restoCreateMenuView;
	
	public CreateRestoMenuDash(RestaurauntModel model, AdminDash dashboardView, RestaurantCreateMenuView restoCreateMenuView) {
		this.dashboardView = dashboardView;
		this.model = model;
		this.restoCreateMenuView = restoCreateMenuView;
		
		dashboardView.getBtnCreate_1().addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
				
		dashboardView.dispose(); //dashboardView.setVisible(false);
		restoCreateMenuView.setVisible(true);
		
		restoCreateMenuView.getMnRestaurant().setVisible(true);
		
		if(DTO.getInstance().getRestaurauntList().size() > 0) {
			
			DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
			
			for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
				
				RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
				model.addElement(item);  				
			}
			restoCreateMenuView.getRestaurantSelect_list().setModel(model);	
			
			restoCreateMenuView.getRestaurantSelect_list().setSelectedIndex(0);
		}
		
		
		restoCreateMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                	
                	RestaurantBean rb = (RestaurantBean) restoCreateMenuView.getRestaurantSelect_list().getSelectedValue();
                	
                	ArrayList<RestaurantMenuBean> rmb = null;
                	
                	if(rb != null) {
                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
                	}	
                	
                	if(rmb != null) {
                		
                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
                		
                		for(int i = 0; i < rmb.size(); i++) {
                			listModel.addElement(rmb.get(i));
                		}
                		
                		restoCreateMenuView.getMenuItems_list().setModel(listModel);
                		
                	}else {
                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
                		restoCreateMenuView.getMenuItems_list().setModel(listModel);
                	}
                	
                }
            }
		});
		

 }
}