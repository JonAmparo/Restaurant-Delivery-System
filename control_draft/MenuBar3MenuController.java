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
import view_draft.AdminDash;
import view_draft.RestaurantCreateMenuView;
import view_draft.RestaurantDeleteMenuView;
import view_draft.RestaurantEditMenuView;

public class MenuBar3MenuController {
	
	public RestaurantCreateMenuView restoCreateView;
	public RestaurantEditMenuView editView;
	public RestaurantDeleteMenuView deleteView;
	
	
	public MenuBar3MenuController(RestaurantCreateMenuView restoCreateView, RestaurantEditMenuView editView, RestaurantDeleteMenuView deleteView) {
		this.restoCreateView = restoCreateView;
		this.editView = editView;
		this.deleteView = deleteView;
		
		// create section //------------------------------------------------------------
		restoCreateView.getMnMenu().getItem(0).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				restoCreateView.dispose(); 
				restoCreateView.setVisible(true);
				
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {					
					restoCreateView.getMnRestaurant().setVisible(false);
				}else {
					restoCreateView.getMnRestaurant().setVisible(true);
				}
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					restoCreateView.getRestaurantSelect_list().setModel(model);	
					
					restoCreateView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				restoCreateView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) restoCreateView.getRestaurantSelect_list().getSelectedValue();
		                	

		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		restoCreateView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		restoCreateView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		restoCreateView.getMnMenu().getItem(1).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				restoCreateView.dispose(); 
				editView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {					
					editView.getMnRestaurant().setVisible(false);
				}else {
					editView.getMnRestaurant().setVisible(true);
				}
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					editView.getRestaurantSelect_list().setModel(model);	
					
					editView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				editView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editView.getRestaurantSelect_list().getSelectedValue();
		                	

		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		editView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		editView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		
		restoCreateView.getMnMenu().getItem(2).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				restoCreateView.dispose(); 
				deleteView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {					
					deleteView.getMnRestaurant().setVisible(false);
				}else {
					deleteView.getMnRestaurant().setVisible(true);
				}
				
				deleteView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) deleteView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = rb.getRestoMenuBean();
		                	}                	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		deleteView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		deleteView.getMenuItems_list().setModel(listModel);
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
					deleteView.getRestaurantSelect_list().setModel(model);	
					
					deleteView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
			}
		});
		
		// edit section //------------------------------------------------------------
		editView.getMnMenu().getItem(0).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				editView.dispose(); 
				restoCreateView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {					
					restoCreateView.getMnRestaurant().setVisible(false);
				}else {
					restoCreateView.getMnRestaurant().setVisible(true);
				}
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					restoCreateView.getRestaurantSelect_list().setModel(model);	
					
					restoCreateView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				restoCreateView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) restoCreateView.getRestaurantSelect_list().getSelectedValue();
		                	

		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		restoCreateView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		restoCreateView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		editView.getMnMenu().getItem(1).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				editView.dispose(); 
				editView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {					
					editView.getMnRestaurant().setVisible(false);
				}else {
					editView.getMnRestaurant().setVisible(true);
				}
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					editView.getRestaurantSelect_list().setModel(model);	
					
					editView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				editView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editView.getRestaurantSelect_list().getSelectedValue();
		                	

		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		editView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		editView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		
		editView.getMnMenu().getItem(2).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				editView.dispose(); 
				deleteView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {					
					deleteView.getMnRestaurant().setVisible(false);
				}else {
					deleteView.getMnRestaurant().setVisible(true);
				}
				
				deleteView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) deleteView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = rb.getRestoMenuBean();
		                	}                	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		deleteView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		deleteView.getMenuItems_list().setModel(listModel);
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
					deleteView.getRestaurantSelect_list().setModel(model);	
					
					deleteView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
			}
		});
		
		// Delete section //------------------------------------------------------------
		deleteView.getMnMenu().getItem(0).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteView.dispose(); 
				restoCreateView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {					
					restoCreateView.getMnRestaurant().setVisible(false);
				}else {
					restoCreateView.getMnRestaurant().setVisible(true);
				}
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					restoCreateView.getRestaurantSelect_list().setModel(model);	
					
					restoCreateView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				restoCreateView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) restoCreateView.getRestaurantSelect_list().getSelectedValue();
		                	

		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		restoCreateView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		restoCreateView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		deleteView.getMnMenu().getItem(1).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteView.dispose(); 
				editView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {					
					editView.getMnRestaurant().setVisible(false);
				}else {
					editView.getMnRestaurant().setVisible(true);
				}
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					editView.getRestaurantSelect_list().setModel(model);	
					
					editView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				editView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editView.getRestaurantSelect_list().getSelectedValue();
		                	

		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		editView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		editView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		
		deleteView.getMnMenu().getItem(2).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				deleteView.dispose(); 
				deleteView.setVisible(true);
				
				if(DTO.getInstance().getSessionUserRole() == "Manager") {					
					deleteView.getMnRestaurant().setVisible(false);
				}else {
					deleteView.getMnRestaurant().setVisible(true);
				}
				
				deleteView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) deleteView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = rb.getRestoMenuBean();
		                	}                	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		deleteView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		deleteView.getMenuItems_list().setModel(listModel);
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
					deleteView.getRestaurantSelect_list().setModel(model);	
					
					deleteView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
			}
		});
		
	}


	}
