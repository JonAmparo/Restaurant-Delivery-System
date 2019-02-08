package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view_draft.LoginView;

public class LoginQuitController implements ActionListener{
	
	
	public LoginView loginView;
	
	
	public LoginQuitController(LoginView loginView) {
		this.loginView = loginView;
		
		loginView.getBtnQuit().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hello guys");
		
		int temp = 0;
		temp = JOptionPane.showConfirmDialog(loginView, "Are you sure you want to quit?");
		
		if(temp == 0) {
			loginView.dispose();
		}else if(temp == 1) {
			loginView.getText_field1().setText("");
			loginView.getText_field2().setText("");
		}
	}

}
