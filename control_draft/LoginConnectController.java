package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model_draft.DTO;
import model_draft.UserBean;
import model_draft.UserModel;
import view_draft.AdminDash;
import view_draft.ChefView;
import view_draft.ClientDashView;
import view_draft.DeliveryDashView;
import view_draft.LoginView;
import view_draft.ManagerView;

public class LoginConnectController implements ActionListener {

	private LoginView loginView;
	private UserModel loginModel;
	private AdminDash adminDash;
	private ManagerView managerDash;
	private ChefView chefView;	
	private DeliveryDashView delivDash;	
	private ClientDashView clientDashView;
	
	public LoginConnectController(UserModel loginModel, LoginView loginView, AdminDash adminDash, ManagerView managerDash, ChefView chefView, DeliveryDashView delivDash, ClientDashView clientDashView) {
		this.loginView = loginView;
		this.loginModel = loginModel;
		this.adminDash = adminDash;
		this.managerDash = managerDash;
		this.chefView = chefView;
		this.delivDash = delivDash;
		this.clientDashView = clientDashView;
		
		loginView.getBtnConnect().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(loginView.getText_field1().getText().equals("") && loginView.getText_field2().getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Both fields empty");
		}else if(loginView.getText_field1().getText().equals("")) {
			JOptionPane.showMessageDialog(null, "username empty");
		}else if(loginView.getText_field2().getText().equals("")) {
			JOptionPane.showMessageDialog(null, "password empty");
		}
		
		boolean usernameExist = false;
		boolean passwordExist = false;
		
		for(int i = 0; i < DTO.getInstance().getUserList().size(); i++) {
			if(loginView.getText_field1().getText().equalsIgnoreCase(DTO.getInstance().getUserList().get(i).getUserName())) {
				usernameExist = true;
				if(loginView.getText_field2().getText().equalsIgnoreCase(DTO.getInstance().getUserList().get(i).getPassWord())) {
					passwordExist = true;
					loginView.dispose();
					
					if(DTO.getInstance().getUserList().get(i).getRoleName().equals("Admin")) {
						adminDash.setVisible(true);
						DTO.getInstance().setSessionUserRole("Admin");
					}else if(DTO.getInstance().getUserList().get(i).getRoleName().equals("Manager")) {
						managerDash.setVisible(true);
						DTO.getInstance().setSessionUserRole("Manager");
					}else if(DTO.getInstance().getUserList().get(i).getRoleName().equals("Chef")) {
						chefView.setVisible(true);
						DTO.getInstance().setSessionUserRole("Chef");
					}else if(DTO.getInstance().getUserList().get(i).getRoleName().equals("Delivery Driver")) {
						delivDash.setVisible(true);
						DTO.getInstance().setSessionUserRole("Delivery Driver");
					}else if(DTO.getInstance().getUserList().get(i).getRoleName().equals("Client")) {
						clientDashView.setVisible(true);
						DTO.getInstance().setSessionUserRole("Client");
					}	
					
					DTO.getInstance().setSessionUsername(loginView.getText_field1().getText());
					
					
				}
			}
		}
		
		if(!usernameExist) {
			JOptionPane.showMessageDialog(null, "username does not exist");
		}else {
			if(!passwordExist) {
				JOptionPane.showMessageDialog(null, "password does not match for your username");
			}
		}
		
		
		
		/*
		// admin check
		if (loginView.getText_field1().getText().equalsIgnoreCase("Bill") && loginView.getText_field2().getText().equals("111")) {
			System.out.println("Login successful");// send to Admin to Admin dashboard
			
		} else {
			System.err.println("invalid entry");
			
		}
		// manager check
		if (loginView.getText_field1().getText().equalsIgnoreCase("Bob") && loginView.getText_field2().getText().equals("222")) {
			System.out.println("Login successful");//send to Manager dashboard
		} else {
			System.err.println("invalid entry");
		}
		
		// manager check
		if (loginView.getText_field1().getText().equalsIgnoreCase("Amanda") && loginView.getText_field2().getText().equals("333")) {
			System.out.println("Login successful");//send to Chefs dashboard
		} else {
			System.err.println("invalid entry");
		}
				
		// manager check
		if (loginView.getText_field1().getText().equalsIgnoreCase("Jeffrey") && loginView.getText_field2().getText().equals("444")) {
			System.out.println("Login successful");//send to DeliveryDriver dashboard
		} else {
			System.err.println("invalid entry");
		}*/
	}

}
