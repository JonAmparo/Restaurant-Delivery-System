package model;

import java.util.Date;

public class OrderBean {
	private int id;
	private Date deliveryDate;
	private int deliveryHour;
	private int deliveryMinute;
	private String deliveryArea;
	private String restaurantName;
	private String itemName;
	private double price;
	private int quantity;
	private String deliveryAddress;
	private String userName;
	private String orderNumber;
	private String orderStatus;

	public OrderBean( Date deliveryDate, int deliveryHour, int deliveryMinute, String deliveryArea,
			String restaurantName, String itemName, double price, int quantity, String deliveryAddress, String userName,
			String orderNumber, String orderStatus) {		
		this.deliveryDate = deliveryDate;
		this.deliveryHour = deliveryHour;
		this.deliveryMinute = deliveryMinute;
		this.deliveryArea = deliveryArea;
		this.restaurantName = restaurantName;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.deliveryAddress = deliveryAddress;
		this.userName = userName;
		this.orderNumber = orderNumber;
		this.orderStatus = orderStatus;

	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the deliveryDate
	 */
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * @return the deliveryHour
	 */
	public int getDeliveryHour() {
		return deliveryHour;
	}

	/**
	 * @return the deliveryMinute
	 */
	public int getDeliveryMinute() {
		return deliveryMinute;
	}

	/**
	 * @return the deliveryArea
	 */
	public String getDeliveryArea() {
		return deliveryArea;
	}

	/**
	 * @return the restaurantName
	 */
	public String getRestaurantName() {
		return restaurantName;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @return the deliveryAddress
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param deliveryDate the deliveryDate to set
	 */
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	/**
	 * @param deliveryHour the deliveryHour to set
	 */
	public void setDeliveryHour(int deliveryHour) {
		this.deliveryHour = deliveryHour;
	}

	/**
	 * @param deliveryMinute the deliveryMinute to set
	 */
	public void setDeliveryMinute(int deliveryMinute) {
		this.deliveryMinute = deliveryMinute;
	}

	/**
	 * @param deliveryArea the deliveryArea to set
	 */
	public void setDeliveryArea(String deliveryArea) {
		this.deliveryArea = deliveryArea;
	}

	/**
	 * @param restaurantName the restaurantName to set
	 */
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @param deliveryAddress the deliveryAddress to set
	 */
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	

}
