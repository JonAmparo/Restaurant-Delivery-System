package model_draft;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class RestaurauntModel {

	private RestaurantDAO restaurantCreateDAO = new RestaurantDAO();

	public RestaurauntModel() {

		// constuctor for testing
		DefaultListModel<String> listModel1 = new DefaultListModel<String>();
		listModel1.addElement("aaa");
		listModel1.addElement("bbb");

		DefaultListModel<String> listModel2 = new DefaultListModel<String>();
		listModel2.addElement("ccc");
		listModel2.addElement("ddd");

		DefaultListModel<String> listModel3 = new DefaultListModel<String>();
		listModel3.addElement("eee");
		listModel3.addElement("fff");

		this.createNewRestaurant(new RestaurantBean("name1", "address1", listModel1, "number1"));
		this.createNewRestaurant(new RestaurantBean("name2", "address2", listModel2, "number2"));
		this.createNewRestaurant(new RestaurantBean("name3", "address3", listModel3, "number3"));
		
		// hard coded value to test
		/*
		 * DTO.getInstance().getRestaurauntList().get(0).setSundayOpenHour(5);
		 * DTO.getInstance().getRestaurauntList().get(0).setSundayOpenMinute(30);
		 * DTO.getInstance().getRestaurauntList().get(0).setSundayCloseMinute(45);
		 * DTO.getInstance().getRestaurauntList().get(0).setSundayCloseHour(7);
		 * 
		 * DTO.getInstance().getRestaurauntList().get(1).setSundayOpenHour(6);
		 * DTO.getInstance().getRestaurauntList().get(1).setSundayOpenMinute(15);
		 * DTO.getInstance().getRestaurauntList().get(1).setSundayCloseHour(22);
		 * DTO.getInstance().getRestaurauntList().get(1).setSundayCloseMinute(40);
		 */

		// TODO: Set default values for all your comboboxes

		/*
		 * if(character >= '1' && character <= '9') { //number }else { //letter or other
		 * special charccters
		 * 
		 * }
		 */
		// restaurant hard coded (0)
		DTO.getInstance().getRestaurauntList().get(0).setSundayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setSundayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(0).setSundayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setSundayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(0).setMondayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setMondayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(0).setMondayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setMondayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(0).setTuesdayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setTuesdayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(0).setTuesdayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setTuesdayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(0).setWednesdayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setWednesdayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(0).setWednesdayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setWednesdayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(0).setFridayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setFridayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(0).setFridayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setFridayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(0).setSaturdayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setSaturdayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(0).setSaturdayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(0).setSaturdayCloseMinute(1);

		// restaurant hard coded (1)
		DTO.getInstance().getRestaurauntList().get(1).setSundayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setSundayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(1).setSundayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setSundayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(1).setMondayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setMondayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(1).setMondayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setMondayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(1).setTuesdayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setTuesdayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(1).setTuesdayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setTuesdayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(1).setWednesdayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setWednesdayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(1).setWednesdayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setWednesdayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(1).setFridayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setFridayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(1).setFridayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setFridayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(1).setSaturdayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setSaturdayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(1).setSaturdayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(1).setSaturdayCloseMinute(1);

		// restaurant hard coded (2)
		DTO.getInstance().getRestaurauntList().get(2).setSundayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setSundayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(2).setSundayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setSundayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(2).setMondayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setMondayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(2).setMondayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setMondayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(2).setTuesdayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setTuesdayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(2).setTuesdayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setTuesdayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(2).setWednesdayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setWednesdayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(2).setWednesdayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setWednesdayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(2).setFridayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setFridayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(2).setFridayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setFridayCloseMinute(1);

		DTO.getInstance().getRestaurauntList().get(2).setSaturdayOpenHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setSaturdayOpenMinute(1);
		DTO.getInstance().getRestaurauntList().get(2).setSaturdayCloseHour(1);
		DTO.getInstance().getRestaurauntList().get(2).setSaturdayCloseMinute(1);
	}

	public RestaurauntModel(String restoName, String restoAddress, ListModel<String> deliveryArea, String phoneNum) {
		this.createNewRestaurant(new RestaurantBean(restoName, restoAddress, deliveryArea, phoneNum));
	}

	public void createNewRestaurant(RestaurantBean resto) {
		restaurantCreateDAO.createNewRestaurant(resto);

	}

}
