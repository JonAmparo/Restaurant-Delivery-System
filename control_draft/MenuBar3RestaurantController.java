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
import view_draft.LoginView;
import view_draft.RestaurantCreateMenuView;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantDeleteMenuView;
import view_draft.RestaurantDeleteView;
import view_draft.RestaurantEditMenuView;
import view_draft.RestaurantEditView;

public class MenuBar3RestaurantController {
	
	private LoginView loginView;
	
	private RestaurantCreateView restoCreateView;
	private RestaurantEditView restoEditView;
	private RestaurantDeleteView restoDeleteView;

	private RestaurantCreateMenuView restoMenuView;
	private RestaurantEditMenuView editMenuView;
	private RestaurantDeleteMenuView deleteMenuView;
	
	//TODO: add all the views that contains all the menus
	
	//TODO: pass every view to this constructor
	public MenuBar3RestaurantController( LoginView loginView, RestaurantCreateView restoCreateView,RestaurantEditView restoEditView,RestaurantDeleteView restoDeleteView, RestaurantCreateMenuView restoMenuView, RestaurantEditMenuView editMenuView, RestaurantDeleteMenuView deleteMenuView, AdminDash view) {
		this.loginView = loginView;
		this.restoCreateView = restoCreateView;
		this.restoEditView = restoEditView;
		this.restoDeleteView = restoDeleteView;
		
		this.restoMenuView = restoMenuView;
		this.editMenuView = editMenuView;
		this.deleteMenuView = deleteMenuView;
		
		// menu - create menu
		restoCreateView.getMnMenu().getItem(0).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				restoCreateView.setVisible(false);
				restoMenuView.setVisible(true);
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					restoMenuView.getRestaurantSelect_list().setModel(model);	
					restoMenuView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				restoMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) restoMenuView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		restoMenuView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		restoMenuView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		restoCreateView.getMnMenu().getItem(1).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				restoCreateView.dispose();;
				editMenuView.setVisible(true);
				
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					editMenuView.getRestaurantSelect_list().setModel(model);	
					
					editMenuView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				editMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editMenuView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		editMenuView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		editMenuView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		
		restoCreateView.getMnMenu().getItem(2).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				restoCreateView.setVisible(false);
				deleteMenuView.setVisible(true);
				
				deleteMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) deleteMenuView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = rb.getRestoMenuBean();
		                	}                	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		deleteMenuView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		deleteMenuView.getMenuItems_list().setModel(listModel);
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
					deleteMenuView.getRestaurantSelect_list().setModel(model);	
					
					deleteMenuView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
			}
		});
		
		
		
		
		// menu - edit menu //
		restoEditView.getMnMenu().getItem(0).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				restoEditView.setVisible(false);
				editMenuView.setVisible(true);
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					restoMenuView.getRestaurantSelect_list().setModel(model);	
					
					restoMenuView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				restoMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) restoMenuView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		restoMenuView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		restoMenuView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		restoEditView.getMnMenu().getItem(1).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				restoEditView.setVisible(false);
				editMenuView.setVisible(true);
				
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					editMenuView.getRestaurantSelect_list().setModel(model);	
					
					editMenuView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				editMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editMenuView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		editMenuView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		editMenuView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		
		restoEditView.getMnMenu().getItem(2).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				restoDeleteView.dispose(); 
				deleteMenuView.setVisible(true);
				
				deleteMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) deleteMenuView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = rb.getRestoMenuBean();
		                	}                	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		deleteMenuView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		deleteMenuView.getMenuItems_list().setModel(listModel);
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
					deleteMenuView.getRestaurantSelect_list().setModel(model);	
					
					deleteMenuView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
			}
		});
		
		// restaurant delete page //
		restoDeleteView.getMnMenu().getItem(0).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				restoDeleteView.setVisible(false);
				restoMenuView.setVisible(true);
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					restoMenuView.getRestaurantSelect_list().setModel(model);	
					restoMenuView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				restoMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) restoMenuView.getRestaurantSelect_list().getSelectedValue();
		                	

		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		restoMenuView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		restoMenuView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		restoDeleteView.getMnMenu().getItem(1).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				restoDeleteView.setVisible(false);
				editMenuView.setVisible(true);
				
				
				if(DTO.getInstance().getRestaurauntList().size() > 0) {
					
					DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
					
					for(int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
						
						RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
						model.addElement(item);  				
					}
					editMenuView.getRestaurantSelect_list().setModel(model);	
					
					editMenuView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
				editMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) editMenuView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = (ArrayList<RestaurantMenuBean>) rb.getRestoMenuBean();
		                	}		                	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		editMenuView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		editMenuView.getMenuItems_list().setModel(listModel);
		                	}
		                	
		                }
		            }
				});
			}
		});
		
		
		restoDeleteView.getMnMenu().getItem(2).addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				restoDeleteView.setVisible(false);
				deleteMenuView.setVisible(true);
				
				deleteMenuView.getRestaurantSelect_list().addListSelectionListener(new ListSelectionListener() {

		            @Override
		            public void valueChanged(ListSelectionEvent arg0) {
		                if (!arg0.getValueIsAdjusting()) {
		                	
		                	RestaurantBean rb = (RestaurantBean) deleteMenuView.getRestaurantSelect_list().getSelectedValue();
		                	
		                	ArrayList<RestaurantMenuBean> rmb = null;
		                	
		                	if(rb != null) {
		                		rmb = rb.getRestoMenuBean();
		                	}                	
		                	
		                	if(rmb != null) {
		                		
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();                		
		                		
		                		for(int i = 0; i < rmb.size(); i++) {
		                			listModel.addElement(rmb.get(i));
		                		}
		                		
		                		deleteMenuView.getMenuItems_list().setModel(listModel);
		                		
		                	}else {
		                		DefaultListModel<RestaurantMenuBean> listModel = new DefaultListModel<RestaurantMenuBean>();            
		                		deleteMenuView.getMenuItems_list().setModel(listModel);
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
					deleteMenuView.getRestaurantSelect_list().setModel(model);	
					
					deleteMenuView.getRestaurantSelect_list().setSelectedIndex(0);
				}
				
				
			}
		});
	}


}
