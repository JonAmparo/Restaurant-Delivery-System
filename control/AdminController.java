package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Admin;
import view.RestaurantCreateMenu;
import view.RestaurantDeleteMenu;
import view.RestaurantEditMenu;

public class AdminController {

	private Admin admin;
	private RestaurantCreateMenu restaurantCreateMenu;
	private RestaurantEditMenu restaurantEditMenu;
	private RestaurantDeleteMenu restaurantDeleteMenu;

	public AdminController() {
		admin = new Admin();

		admin.getBtnCreate_1().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				restaurantCreateMenu = new RestaurantCreateMenu();
				admin.setVisible(false);
			}
		});
		
		admin.getBtnEdit_1().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				restaurantEditMenu = new RestaurantEditMenu();
				admin.setVisible(false);
			}
		});
		
		admin.getBtnDelete_1().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				restaurantDeleteMenu = new RestaurantDeleteMenu();
				admin.setVisible(false);
			}
		});
		

	}

	public static void main(String[] args) {

		new AdminController();

	}

}
