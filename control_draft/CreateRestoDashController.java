package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.RestaurauntModel;
import view_draft.AdminDash;
import view_draft.RestaurantCreateView;

public class CreateRestoDashController implements ActionListener{
	

	public AdminDash dashboardView;
	public RestaurauntModel model;
	public RestaurantCreateView restoCreateView;
	
	public CreateRestoDashController(RestaurauntModel model, AdminDash dashboardView, RestaurantCreateView restoCreateView) {
		this.dashboardView = dashboardView;
		this.model = model;
		this.restoCreateView = restoCreateView;
		
		dashboardView.getBtnCreate().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		dashboardView.dispose(); //dashboardView.setVisible(false);
		restoCreateView.setVisible(true);
		
		
		
		

 }
}