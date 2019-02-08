package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model_draft.DTO;
import model_draft.RestaurantBean;
import view_draft.ManagerView;
import view_draft.RestaurantCreateMenuView;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantDeleteMenuView;
import view_draft.RestaurantDeleteView;
import view_draft.RestaurantEditMenuView;
import view_draft.RestaurantEditView;

public class MenuBar2ManagerController {

	public ManagerView managerView;
	public RestaurantEditMenuView menuEditView;
	public RestaurantEditView editView;

	public MenuBar2ManagerController(RestaurantEditMenuView menuEditView,  ManagerView managerView, RestaurantEditView editView) {

		this.menuEditView = menuEditView;
		this.managerView = managerView;
		this.editView = editView;
				
		
		
		
		managerView.getMenuItemEditRestaurant().addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				editView.getTxtfield_name().setText("");
				editView.getTxtfield_address().setText("");
				editView.getTxtfield_telephone().setText("");
				editView.getTextField().setText("");
				editView.comboResetHour();
				editView.comboResetMinute();
				DefaultListModel<String> model = new DefaultListModel<>();
				editView.getDeliveryJList().setModel(model);	
				
				managerView.setVisible(false);
				editView.setVisible(true);
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> modelResto = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						modelResto.addElement(item);  				
					}
					editView.getRestoJList().setModel(modelResto);			
					
				}	
				
				editView.getRestoJList().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editView.getRestoJList().getSelectedValue();
		                	if(rb != null) {
		                		
		                		editView.getTxtfield_name().setText(rb.getRestoName());
		                		editView.getTxtfield_address().setText(rb.getRestoAddress());
			                	editView.getTxtfield_telephone().setText(rb.getPhoneNum());
			                			
			                	editView.getDeliveryJList().setModel(rb.getDeliveryArea());
			                	
			                	//TODO: Populate comboxes	                	
			                	editView.getComboBox().setSelectedItem("" + rb.getSundayOpenHour());
			                	editView.getComboBox_1().setSelectedItem("" + rb.getSundayOpenMinute());
			                	editView.getComboBox_2().setSelectedItem("" + rb.getSundayCloseHour());
			                	editView.getComboBox_3().setSelectedItem("" + rb.getSundayCloseMinute());
			                	
			                	editView.getComboBox_4().setSelectedItem("" + rb.getMondayOpenHour());
			                	editView.getComboBox_5().setSelectedItem("" + rb.getMondayOpenMinute());
			                	editView.getComboBox_6().setSelectedItem("" + rb.getMondayCloseHour());
			                	editView.getComboBox_7().setSelectedItem("" + rb.getMondayCloseMinute());
			                	
			                	editView.getComboBox_8().setSelectedItem("" + rb.getTuesdayOpenHour());
			                	editView.getComboBox_9().setSelectedItem("" + rb.getTuesdayOpenMinute());
			                	editView.getComboBox_10().setSelectedItem("" + rb.getTuesdayCloseHour());
			                	editView.getComboBox_11().setSelectedItem("" + rb.getTuesdayCloseMinute());
			                	
			                	editView.getComboBox_12().setSelectedItem("" + rb.getWednesdayOpenHour());
			                	editView.getComboBox_13().setSelectedItem("" + rb.getWednesdayOpenMinute());
			                	editView.getComboBox_14().setSelectedItem("" + rb.getWednesdayCloseHour());
			                	editView.getComboBox_15().setSelectedItem("" + rb.getWednesdayCloseMinute());
			                	
			                	editView.getComboBox_16().setSelectedItem("" + rb.getThursdayOpenHour());
			                	editView.getComboBox_17().setSelectedItem("" + rb.getThursdayOpenMinute());
			                	editView.getComboBox_18().setSelectedItem("" + rb.getThursdayCloseHour());
			                	editView.getComboBox_19().setSelectedItem("" + rb.getThursdayCloseMinute());
			                	
			                	editView.getComboBox_20().setSelectedItem("" + rb.getFridayOpenHour());
			                	editView.getComboBox_21().setSelectedItem("" + rb.getFridayOpenMinute());
			                	editView.getComboBox_22().setSelectedItem("" + rb.getFridayCloseHour());
			                	editView.getComboBox_23().setSelectedItem("" + rb.getFridayCloseMinute());
			                	
			                	editView.getComboBox_24().setSelectedItem("" + rb.getSaturdayOpenHour());
			                	editView.getComboBox_25().setSelectedItem("" + rb.getSaturdayOpenMinute());
			                	editView.getComboBox_26().setSelectedItem("" + rb.getSaturdayCloseHour());
			                	editView.getComboBox_27().setSelectedItem("" + rb.getSaturdayCloseMinute());
			                	
			                	
			                	
		                	}
		                	
		                }
		            }
		        });
			}
		});
		
	}
}

