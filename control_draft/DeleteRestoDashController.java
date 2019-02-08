package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurauntModel;
import view_draft.AdminDash;
import view_draft.RestaurantDeleteView;
import view_draft.RestaurantEditView;

public class DeleteRestoDashController implements ActionListener{
	
	public AdminDash dashboardView;
	public RestaurauntModel model;
	public RestaurantDeleteView restoDelView;
	
	public DeleteRestoDashController(RestaurauntModel model, AdminDash dashboardView, RestaurantDeleteView restoDelView) {
		this.restoDelView = restoDelView;
		this.model = model;
		this.dashboardView = dashboardView;
		
		dashboardView.getBtnDelete().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		dashboardView.dispose(); //dashboardView.setVisible(false);
		restoDelView.setVisible(true);
		
		if(DTO.getInstance().getRestaurauntList().size() > 0) {
									
			DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
			
			for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
				
				RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
				model.addElement(item);  				
			}
			restoDelView.getList().setModel(model);			
			
		}
		
		//adding list listener
		restoDelView.getList().addListSelectionListener(new ListSelectionListener() {

	            @Override
	            public void valueChanged(ListSelectionEvent arg0) {
	                if (!arg0.getValueIsAdjusting()) {
	                	
	                	RestaurantBean rb = (RestaurantBean) restoDelView.getList().getSelectedValue();
	                	if(rb != null) {
	                		
	                		restoDelView.getTxtfield_name().setText(rb.getRestoName());
	                		restoDelView.getTxtfield_address().setText(rb.getRestoAddress());
	                		restoDelView.getTxtfield_telephone().setText(rb.getPhoneNum());
		                	
	                		restoDelView.getList_1().setModel(rb.getDeliveryArea());
	                		
		                	//TODO: Populate comboxes	                	
	                		restoDelView.getComboBox().setSelectedItem("" + rb.getSundayOpenHour());
	                		restoDelView.getComboBox_1().setSelectedItem("" + rb.getSundayOpenMinute());
	                		restoDelView.getComboBox_2().setSelectedItem("" + rb.getSundayCloseHour());
	                		restoDelView.getComboBox_3().setSelectedItem("" + rb.getSundayCloseMinute());
	                		
	                		restoDelView.getComboBox_4().setSelectedItem("" + rb.getMondayOpenHour());
	                		restoDelView.getComboBox_5().setSelectedItem("" + rb.getMondayOpenMinute());
	                		restoDelView.getComboBox_6().setSelectedItem("" + rb.getMondayCloseHour());
	                		restoDelView.getComboBox_7().setSelectedItem("" + rb.getMondayCloseMinute());
	                		
	                		restoDelView.getComboBox_8().setSelectedItem("" + rb.getTuesdayOpenHour());
	                		restoDelView.getComboBox_9().setSelectedItem("" + rb.getTuesdayOpenMinute());
	                		restoDelView.getComboBox_10().setSelectedItem("" + rb.getTuesdayCloseHour());
	                		restoDelView.getComboBox_11().setSelectedItem("" + rb.getTuesdayCloseMinute());
	                		
	                		restoDelView.getComboBox_12().setSelectedItem("" + rb.getWednesdayOpenHour());
	                		restoDelView.getComboBox_13().setSelectedItem("" + rb.getWednesdayOpenMinute());
	                		restoDelView.getComboBox_14().setSelectedItem("" + rb.getWednesdayCloseHour());
	                		restoDelView.getComboBox_15().setSelectedItem("" + rb.getWednesdayCloseMinute());
	                		
	                		restoDelView.getComboBox_16().setSelectedItem("" + rb.getThursdayOpenHour());
	                		restoDelView.getComboBox_17().setSelectedItem("" + rb.getThursdayOpenMinute());
	                		restoDelView.getComboBox_18().setSelectedItem("" + rb.getThursdayCloseHour());
	                		restoDelView.getComboBox_19().setSelectedItem("" + rb.getThursdayCloseMinute());
	                		
	                		restoDelView.getComboBox_20().setSelectedItem("" + rb.getFridayOpenHour());
	                		restoDelView.getComboBox_21().setSelectedItem("" + rb.getFridayOpenMinute());
	                		restoDelView.getComboBox_22().setSelectedItem("" + rb.getFridayCloseHour());
	                		restoDelView.getComboBox_23().setSelectedItem("" + rb.getFridayCloseMinute());
	                		
	                		restoDelView.getComboBox_24().setSelectedItem("" + rb.getSaturdayOpenHour());
	                		restoDelView.getComboBox_25().setSelectedItem("" + rb.getSaturdayOpenMinute());
	                		restoDelView.getComboBox_26().setSelectedItem("" + rb.getSaturdayCloseHour());
	                		restoDelView.getComboBox_27().setSelectedItem("" + rb.getSaturdayCloseMinute());
	                		
	                		
		                	
	                	}
	                	
	                	
	                	
	                }
	            }
	        });
		
		
	}

}
