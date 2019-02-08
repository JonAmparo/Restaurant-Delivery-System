package model_draft;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;

public class RestaurantBean {
	
	// restaurant create characteristics
	private int id;
	private String restoName;
	private String restoAddress;
	private ListModel<String> deliveryArea;
	private String phoneNum;
	private ArrayList<RestaurantMenuBean> restoMenuBean;
	private ArrayList<OrderBean> orderBean;
	
	// weekdays
	private int mondayOpenHour;
	private int tuesdayOpenHour;
	private int wednesdayOpenHour;
	private int thursdayOpenHour;
	private int fridayOpenHour;
	private int saturdayOpenHour;
	private int sundayOpenHour;
	
	private int mondayCloseHour;
	private int tuesdayCloseHour;
	private int wednesdayCloseHour;
	private int thursdayCloseHour;
	private int fridayCloseHour;
	private int saturdayCloseHour;
	private int sundayCloseHour;
	
	private int mondayOpenMinute;
	private int tuesdayOpenMinute;
	private int wednesdayOpenMinute;
	private int thursdayOpenMinute;
	private int fridayOpenMinute;
	private int saturdayOpenMinute;
	private int sundayOpenMinute;
	
	private int mondayCloseMinute;
	private int tuesdayCloseMinute;
	private int wednesdayCloseMinute;
	private int thursdayCloseMinute;
	private int fridayCloseMinute;
	private int saturdayCloseMinute;
	private int sundayCloseMinute;
	
	
	public RestaurantBean(String restoName,String restoAddress,ListModel<String> listModel, String phoneNum) {
		this.deliveryArea = new DefaultListModel<>();
		this.restoName = restoName;
		this.restoAddress = restoAddress;
		this.deliveryArea = listModel;
		this.phoneNum = phoneNum;
		this.id = DTO.getInstance().getRestaurauntList().size();			
	}
	
	// display information to console 
	public String toString() {
		String result = //"\nClass: " + this.getClass().getSimpleName() +
				//"\nRestaurant ID: " + this.id +
				"\nRestaurant Name: " + this.restoName +
				"\nRestaurant Adress: " + this.restoAddress +
				"\nNumber: " + this.phoneNum + 
				"\n\n           Opening hours "	+
				"\nMonday       : " + this.mondayOpenHour + "h" + this.mondayOpenMinute + " - " + this.mondayCloseHour + "h" + this.mondayCloseMinute +  
				"\nTuesday      : " + this.tuesdayOpenHour + "h" + this.tuesdayOpenMinute + " - " + this.tuesdayCloseHour + "h" + this.tuesdayCloseMinute +  
				"\nWednesday    : " + this.wednesdayOpenHour + "h" + this.wednesdayOpenMinute + " - " + this.wednesdayCloseHour + "h" + this.wednesdayCloseMinute +  
				"\nThursday     : " + this.thursdayOpenHour + "h" + this.thursdayOpenMinute + " - " + this.thursdayCloseHour + "h" + this.thursdayCloseMinute +  
				"\nFriday       : " + this.fridayOpenHour + "h" + this.fridayOpenMinute + " - " + this.fridayCloseHour + "h" + this.fridayCloseMinute +  
				"\nSaturday     : " + this.saturdayOpenHour + "h" + this.saturdayOpenMinute + " - " + this.saturdayCloseHour + "h" + this.saturdayCloseMinute +  
				"\nSunday       : " + this.sundayOpenHour + "h" + this.sundayOpenMinute + " - " + this.sundayCloseHour + "h" + this.sundayCloseMinute + "\n\nDelivery Areas: \n" ;
		
		for(int i = 0; i < this.deliveryArea.getSize(); i++) {
			result = result + this.deliveryArea.getElementAt(i) + "\n";
		}		
		return result;
	}
	
	


	/**
	 * @return the orderBean
	 */
	public ArrayList<OrderBean> getOrderBean() {
		return orderBean;
	}

	/**
	 * @param orderBean the orderBean to set
	 */
	public void setOrderBean(ArrayList<OrderBean> orderBean) {
		this.orderBean = orderBean;
	}

	/**
	 * @return the restoMenuBean
	 */
	public ArrayList<RestaurantMenuBean> getRestoMenuBean() {
		return restoMenuBean;
	}

	/**
	 * @param restoMenuBean the restoMenuBean to set
	 */
	public void setRestoMenuBean(ArrayList<RestaurantMenuBean> restoMenuBean) {
		this.restoMenuBean = restoMenuBean;
	}

	/**Getters and setters below
	 * @return the restoName
	 */
	public String getRestoName() {
		return restoName;
	}

	/**
	 * @param restoName the restoName to set
	 */
	public void setRestoName(String restoName) {
		this.restoName = restoName;
	}

	/**
	 * @return the restoAddress
	 */
	public String getRestoAddress() {
		return restoAddress;
	}

	/**
	 * @param restoAddress the restoAddress to set
	 */
	public void setRestoAddress(String restoAddress) {
		this.restoAddress = restoAddress;
	}

	

	

	/**
	 * @return the deliveryArea
	 */
	public ListModel<String> getDeliveryArea() {
		return deliveryArea;
	}

	/**
	 * @param deliveryArea the deliveryArea to set
	 */
	public void setDeliveryArea(ListModel<String> deliveryArea) {
		this.deliveryArea = deliveryArea;
	}

	/**
	 * @return the phoneNum
	 */
	public String getPhoneNum() {
		return phoneNum;
	}

	/**
	 * @param phoneNum the phoneNum to set
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	

	/**
	 * @return the mondayOpenHour
	 */
	public int getMondayOpenHour() {
		return mondayOpenHour;
	}

	/**
	 * @param mondayOpenHour the mondayOpenHour to set
	 */
	public void setMondayOpenHour(int mondayOpenHour) {
		this.mondayOpenHour = mondayOpenHour;
	}

	/**
	 * @return the tuesdayOpenHour
	 */
	public int getTuesdayOpenHour() {
		return tuesdayOpenHour;
	}

	/**
	 * @param tuesdayOpenHour the tuesdayOpenHour to set
	 */
	public void setTuesdayOpenHour(int tuesdayOpenHour) {
		this.tuesdayOpenHour = tuesdayOpenHour;
	}

	/**
	 * @return the wedsndayOpenHour
	 */
	public int getWedsndayOpenHour() {
		return wednesdayOpenHour;
	}

	/**
	 * @param wedsndayOpenHour the wedsndayOpenHour to set
	 */
	public void setWedsndayOpenHour(int wedsndayOpenHour) {
		this.wednesdayOpenHour = wedsndayOpenHour;
	}

	/**
	 * @return the thursdayOpenHour
	 */
	public int getThursdayOpenHour() {
		return thursdayOpenHour;
	}

	/**
	 * @param thursdayOpenHour the thursdayOpenHour to set
	 */
	public void setThursdayOpenHour(int thursdayOpenHour) {
		this.thursdayOpenHour = thursdayOpenHour;
	}

	/**
	 * @return the fridayOpenHour
	 */
	public int getFridayOpenHour() {
		return fridayOpenHour;
	}

	/**
	 * @param fridayOpenHour the fridayOpenHour to set
	 */
	public void setFridayOpenHour(int fridayOpenHour) {
		this.fridayOpenHour = fridayOpenHour;
	}

	/**
	 * @return the saturdayOpenHour
	 */
	public int getSaturdayOpenHour() {
		return saturdayOpenHour;
	}

	/**
	 * @param saturdayOpenHour the saturdayOpenHour to set
	 */
	public void setSaturdayOpenHour(int saturdayOpenHour) {
		this.saturdayOpenHour = saturdayOpenHour;
	}

	/**
	 * @return the sundayOpenHour
	 */
	public int getSundayOpenHour() {
		return sundayOpenHour;
	}

	/**
	 * @param sundayOpenHour the sundayOpenHour to set
	 */
	public void setSundayOpenHour(int sundayOpenHour) {
		this.sundayOpenHour = sundayOpenHour;
	}

	/**
	 * @return the mondayCloseHour
	 */
	public int getMondayCloseHour() {
		return mondayCloseHour;
	}

	/**
	 * @param mondayCloseHour the mondayCloseHour to set
	 */
	public void setMondayCloseHour(int mondayCloseHour) {
		this.mondayCloseHour = mondayCloseHour;
	}

	/**
	 * @return the tuesdayCloseHour
	 */
	public int getTuesdayCloseHour() {
		return tuesdayCloseHour;
	}

	/**
	 * @param tuesdayCloseHour the tuesdayCloseHour to set
	 */
	public void setTuesdayCloseHour(int tuesdayCloseHour) {
		this.tuesdayCloseHour = tuesdayCloseHour;
	}

	/**
	 * @return the wedsndayCloseHour
	 */
	public int getWedsndayCloseHour() {
		return wednesdayCloseHour;
	}

	/**
	 * @param wedsndayCloseHour the wedsndayCloseHour to set
	 */
	public void setWedsndayCloseHour(int wedsndayCloseHour) {
		this.wednesdayCloseHour = wedsndayCloseHour;
	}

	/**
	 * @return the thursdayCloseHour
	 */
	public int getThursdayCloseHour() {
		return thursdayCloseHour;
	}

	/**
	 * @param thursdayCloseHour the thursdayCloseHour to set
	 */
	public void setThursdayCloseHour(int thursdayCloseHour) {
		this.thursdayCloseHour = thursdayCloseHour;
	}

	/**
	 * @return the fridayCloseHour
	 */
	public int getFridayCloseHour() {
		return fridayCloseHour;
	}

	/**
	 * @param fridayCloseHour the fridayCloseHour to set
	 */
	public void setFridayCloseHour(int fridayCloseHour) {
		this.fridayCloseHour = fridayCloseHour;
	}

	/**
	 * @return the saturdayCloseHour
	 */
	public int getSaturdayCloseHour() {
		return saturdayCloseHour;
	}

	/**
	 * @param saturdayCloseHour the saturdayCloseHour to set
	 */
	public void setSaturdayCloseHour(int saturdayCloseHour) {
		this.saturdayCloseHour = saturdayCloseHour;
	}

	/**
	 * @return the sundayCloseHour
	 */
	public int getSundayCloseHour() {
		return sundayCloseHour;
	}

	/**
	 * @param sundayCloseHour the sundayCloseHour to set
	 */
	public void setSundayCloseHour(int sundayCloseHour) {
		this.sundayCloseHour = sundayCloseHour;
	}

	/**
	 * @return the mondayOpenMinute
	 */
	public int getMondayOpenMinute() {
		return mondayOpenMinute;
	}

	/**
	 * @param mondayOpenMinute the mondayOpenMinute to set
	 */
	public void setMondayOpenMinute(int mondayOpenMinute) {
		this.mondayOpenMinute = mondayOpenMinute;
	}

	/**
	 * @return the tuesdayOpenMinute
	 */
	public int getTuesdayOpenMinute() {
		return tuesdayOpenMinute;
	}

	/**
	 * @param tuesdayOpenMinute the tuesdayOpenMinute to set
	 */
	public void setTuesdayOpenMinute(int tuesdayOpenMinute) {
		this.tuesdayOpenMinute = tuesdayOpenMinute;
	}

	/**
	 * @return the wedsndayOpenMinute
	 */
	public int getWedsndayOpenMinute() {
		return wednesdayOpenMinute;
	}

	/**
	 * @param wedsndayOpenMinute the wedsndayOpenMinute to set
	 */
	public void setWedsndayOpenMinute(int wedsndayOpenMinute) {
		this.wednesdayOpenMinute = wedsndayOpenMinute;
	}

	/**
	 * @return the thursdayOpenMinute
	 */
	public int getThursdayOpenMinute() {
		return thursdayOpenMinute;
	}

	/**
	 * @param thursdayOpenMinute the thursdayOpenMinute to set
	 */
	public void setThursdayOpenMinute(int thursdayOpenMinute) {
		this.thursdayOpenMinute = thursdayOpenMinute;
	}

	/**
	 * @return the fridayOpenMinute
	 */
	public int getFridayOpenMinute() {
		return fridayOpenMinute;
	}

	/**
	 * @param fridayOpenMinute the fridayOpenMinute to set
	 */
	public void setFridayOpenMinute(int fridayOpenMinute) {
		this.fridayOpenMinute = fridayOpenMinute;
	}

	/**
	 * @return the saturdayOpenMinute
	 */
	public int getSaturdayOpenMinute() {
		return saturdayOpenMinute;
	}

	/**
	 * @param saturdayOpenMinute the saturdayOpenMinute to set
	 */
	public void setSaturdayOpenMinute(int saturdayOpenMinute) {
		this.saturdayOpenMinute = saturdayOpenMinute;
	}

	/**
	 * @return the sundayOpenMinute
	 */
	public int getSundayOpenMinute() {
		return sundayOpenMinute;
	}

	/**
	 * @param sundayOpenMinute the sundayOpenMinute to set
	 */
	public void setSundayOpenMinute(int sundayOpenMinute) {
		this.sundayOpenMinute = sundayOpenMinute;
	}

	/**
	 * @return the mondayCloseMinute
	 */
	public int getMondayCloseMinute() {
		return mondayCloseMinute;
	}

	/**
	 * @param mondayCloseMinute the mondayCloseMinute to set
	 */
	public void setMondayCloseMinute(int mondayCloseMinute) {
		this.mondayCloseMinute = mondayCloseMinute;
	}

	/**
	 * @return the tuesdayCloseMinute
	 */
	public int getTuesdayCloseMinute() {
		return tuesdayCloseMinute;
	}

	/**
	 * @param tuesdayCloseMinute the tuesdayCloseMinute to set
	 */
	public void setTuesdayCloseMinute(int tuesdayCloseMinute) {
		this.tuesdayCloseMinute = tuesdayCloseMinute;
	}

	/**
	 * @return the wedsndayCloseMinute
	 */
	public int getWedsndayCloseMinute() {
		return wednesdayCloseMinute;
	}

	/**
	 * @param wedsndayCloseMinute the wedsndayCloseMinute to set
	 */
	public void setWedsndayCloseMinute(int wedsndayCloseMinute) {
		this.wednesdayCloseMinute = wedsndayCloseMinute;
	}

	/**
	 * @return the thursdayCloseMinute
	 */
	public int getThursdayCloseMinute() {
		return thursdayCloseMinute;
	}

	/**
	 * @param thursdayCloseMinute the thursdayCloseMinute to set
	 */
	public void setThursdayCloseMinute(int thursdayCloseMinute) {
		this.thursdayCloseMinute = thursdayCloseMinute;
	}

	/**
	 * @return the fridayCloseMinute
	 */
	public int getFridayCloseMinute() {
		return fridayCloseMinute;
	}

	/**
	 * @param fridayCloseMinute the fridayCloseMinute to set
	 */
	public void setFridayCloseMinute(int fridayCloseMinute) {
		this.fridayCloseMinute = fridayCloseMinute;
	}

	/**
	 * @return the saturdayCloseMinute
	 */
	public int getSaturdayCloseMinute() {
		return saturdayCloseMinute;
	}

	/**
	 * @param saturdayCloseMinute the saturdayCloseMinute to set
	 */
	public void setSaturdayCloseMinute(int saturdayCloseMinute) {
		this.saturdayCloseMinute = saturdayCloseMinute;
	}

	/**
	 * @return the sundayCloseMinute
	 */
	public int getSundayCloseMinute() {
		return sundayCloseMinute;
	}

	/**
	 * @param sundayCloseMinute the sundayCloseMinute to set
	 */
	public void setSundayCloseMinute(int sundayCloseMinute) {
		this.sundayCloseMinute = sundayCloseMinute;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the wednesdayOpenHour
	 */
	public int getWednesdayOpenHour() {
		return wednesdayOpenHour;
	}

	/**
	 * @param wednesdayOpenHour the wednesdayOpenHour to set
	 */
	public void setWednesdayOpenHour(int wednesdayOpenHour) {
		this.wednesdayOpenHour = wednesdayOpenHour;
	}

	/**
	 * @return the wednesdayCloseHour
	 */
	public int getWednesdayCloseHour() {
		return wednesdayCloseHour;
	}

	/**
	 * @param wednesdayCloseHour the wednesdayCloseHour to set
	 */
	public void setWednesdayCloseHour(int wednesdayCloseHour) {
		this.wednesdayCloseHour = wednesdayCloseHour;
	}

	/**
	 * @return the wednesdayOpenMinute
	 */
	public int getWednesdayOpenMinute() {
		return wednesdayOpenMinute;
	}

	/**
	 * @param wednesdayOpenMinute the wednesdayOpenMinute to set
	 */
	public void setWednesdayOpenMinute(int wednesdayOpenMinute) {
		this.wednesdayOpenMinute = wednesdayOpenMinute;
	}

	/**
	 * @return the wednesdayCloseMinute
	 */
	public int getWednesdayCloseMinute() {
		return wednesdayCloseMinute;
	}

	/**
	 * @param wednesdayCloseMinute the wednesdayCloseMinute to set
	 */
	public void setWednesdayCloseMinute(int wednesdayCloseMinute) {
		this.wednesdayCloseMinute = wednesdayCloseMinute;
	}

	

	
	
	
	
}
