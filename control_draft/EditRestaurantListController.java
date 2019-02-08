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
import view_draft.RestaurantEditView;

public class EditRestaurantListController implements ActionListener{

	public AdminDash dashboardView;
	public RestaurauntModel model;
	public RestaurantEditView restoEditView;
	
	public EditRestaurantListController(RestaurauntModel model, AdminDash dashboardView, RestaurantEditView restoEditView) {
		this.dashboardView = dashboardView;
		this.model = model;
		this.restoEditView = restoEditView;
		
		dashboardView.getBtnEdit().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		dashboardView.dispose(); //dashboardView.setVisible(false);
		restoEditView.setVisible(true);
		
		if(DTO.getInstance().getRestaurauntList().size() > 0) {
									
			DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
			
			for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
				
				RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
				model.addElement(item);  				
			}
			restoEditView.getRestoJList().setModel(model);			
			
		}
		
		restoEditView.getRestoJList().addListSelectionListener(new ListSelectionListener() {

	            @Override
	            public void valueChanged(ListSelectionEvent arg0) {
	                if (!arg0.getValueIsAdjusting()) {
	                	
	                	RestaurantBean rb = (RestaurantBean) restoEditView.getRestoJList().getSelectedValue();
	                	if(rb != null) {
	                		
	                		restoEditView.getTxtfield_name().setText(rb.getRestoName());
		                	restoEditView.getTxtfield_address().setText(rb.getRestoAddress());
		                	restoEditView.getTxtfield_telephone().setText(rb.getPhoneNum());
		                			
		                	restoEditView.getDeliveryJList().setModel(rb.getDeliveryArea());
		                	
		                	//TODO: Populate comboxes	                	
		                	restoEditView.getComboBox().setSelectedItem("" + rb.getSundayOpenHour());
		                	restoEditView.getComboBox_1().setSelectedItem("" + rb.getSundayOpenMinute());
		                	restoEditView.getComboBox_2().setSelectedItem("" + rb.getSundayCloseHour());
		                	restoEditView.getComboBox_3().setSelectedItem("" + rb.getSundayCloseMinute());
		                	
		                	restoEditView.getComboBox_4().setSelectedItem("" + rb.getMondayOpenHour());
		                	restoEditView.getComboBox_5().setSelectedItem("" + rb.getMondayOpenMinute());
		                	restoEditView.getComboBox_6().setSelectedItem("" + rb.getMondayCloseHour());
		                	restoEditView.getComboBox_7().setSelectedItem("" + rb.getMondayCloseMinute());
		                	
		                	restoEditView.getComboBox_8().setSelectedItem("" + rb.getTuesdayOpenHour());
		                	restoEditView.getComboBox_9().setSelectedItem("" + rb.getTuesdayOpenMinute());
		                	restoEditView.getComboBox_10().setSelectedItem("" + rb.getTuesdayCloseHour());
		                	restoEditView.getComboBox_11().setSelectedItem("" + rb.getTuesdayCloseMinute());
		                	
		                	restoEditView.getComboBox_12().setSelectedItem("" + rb.getWednesdayOpenHour());
		                	restoEditView.getComboBox_13().setSelectedItem("" + rb.getWednesdayOpenMinute());
		                	restoEditView.getComboBox_14().setSelectedItem("" + rb.getWednesdayCloseHour());
		                	restoEditView.getComboBox_15().setSelectedItem("" + rb.getWednesdayCloseMinute());
		                	
		                	restoEditView.getComboBox_16().setSelectedItem("" + rb.getThursdayOpenHour());
		                	restoEditView.getComboBox_17().setSelectedItem("" + rb.getThursdayOpenMinute());
		                	restoEditView.getComboBox_18().setSelectedItem("" + rb.getThursdayCloseHour());
		                	restoEditView.getComboBox_19().setSelectedItem("" + rb.getThursdayCloseMinute());
		                	
		                	restoEditView.getComboBox_20().setSelectedItem("" + rb.getFridayOpenHour());
		                	restoEditView.getComboBox_21().setSelectedItem("" + rb.getFridayOpenMinute());
		                	restoEditView.getComboBox_22().setSelectedItem("" + rb.getFridayCloseHour());
		                	restoEditView.getComboBox_23().setSelectedItem("" + rb.getFridayCloseMinute());
		                	
		                	restoEditView.getComboBox_24().setSelectedItem("" + rb.getSaturdayOpenHour());
		                	restoEditView.getComboBox_25().setSelectedItem("" + rb.getSaturdayOpenMinute());
		                	restoEditView.getComboBox_26().setSelectedItem("" + rb.getSaturdayCloseHour());
		                	restoEditView.getComboBox_27().setSelectedItem("" + rb.getSaturdayCloseMinute());
		                	
		                	
		                	
	                	}
	                	
	                }
	            }
	        });
		
		
		
		
	}

}
