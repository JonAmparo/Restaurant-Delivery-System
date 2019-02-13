package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view_draft.ChefAcceptView;
import view_draft.ChefReadyView;
import view_draft.ChefView;
import view_draft.LoginView;

public class ChefMenuBar2 {
	private LoginView loginView;
	private ChefReadyView chefReadyView;
	private ChefAcceptView chefAcceptView;
	private ChefView chefView;

	public ChefMenuBar2(LoginView loginView, ChefView chefView, ChefReadyView chefReadyView,
			ChefAcceptView chefAcceptView) {
		this.loginView = loginView;
		this.chefView = chefView;
		this.chefReadyView = chefReadyView;
		this.chefAcceptView = chefAcceptView;

		// ==========================DISCONNECTS==========================//
		chefView.getMenuItemAcceptMarkOrders().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				chefView.setVisible(false);
				chefAcceptView.setVisible(true);

			}
		});
		chefReadyView.getMenuItemAcceptMarkOrders().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				chefReadyView.setVisible(false);
				chefAcceptView.setVisible(true);

			}
		});
		chefAcceptView.getMenuItemAcceptMarkOrders().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				chefAcceptView.setVisible(false);
				chefAcceptView.setVisible(true);

			}
		});
		
		
		

	}
}
