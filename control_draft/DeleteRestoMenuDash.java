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
import view_draft.RestaurantDeleteMenuView;
import view_draft.RestaurantEditMenuView;

public class DeleteRestoMenuDash implements ActionListener{
	

	public AdminDash dashboardView;
	public RestaurauntModel model;
	public RestaurantDeleteMenuView restoDeleteMenuView;
	
	public DeleteRestoMenuDash(RestaurauntModel model, AdminDash dashboardView, RestaurantDeleteMenuView restoDeleteMenuView) {
		this.dashboardView = dashboardView;
		this.model = model;
		this.restoDeleteMenuView = restoDeleteMenuView;
		
		dashboardView.getBtnDelete_1().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		dashboardView.dispose(); 
		restoDeleteMenuView.setVisible(true);
		
		restoDeleteMenuView.getMnRestaurant().setVisible(true);
		
		restoDeleteMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                if (!arg0.getValueIsAdjusting()) {
                	
                	RestaurantBean rb = (RestaurantBean) restoDeleteMenuView.getRestaurantSelect_list().getSelectedValue();
                	
                	ArrayList<RestaurantMenuBean> rmb = null;
                	
                	if(rb != null) {
                		rmb = rb.getRestoMenuBean();
                	}                	
                	
                	if(rmb != null) {
                		
                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
                		
                		for(int i = 0; i < rmb.size(); i++) {
                			listModel.addElement(rmb.get(i));
                		}
                		
                		restoDeleteMenuView.getMenuItems_list().setModel(listModel);
                		
                	}else {
                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
                		restoDeleteMenuView.getMenuItems_list().setModel(listModel);
                	}
                	
                }
            }
		});
		
		if(DTO.getInstance().getRestaurauntList().size() > 0) {
			
			DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
			
			for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
				
				RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
				model.addElement(item);  				
			}
			restoDeleteMenuView.getRestaurantSelect_list().setModel(model);	
			
			restoDeleteMenuView.getRestaurantSelect_list().setSelectedIndex(0);
		}
		
		
		
		

 }
}