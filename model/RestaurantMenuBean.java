package model_draft;

public class RestaurantMenuBean {
	
	
	private String item;
	private int price;
	private int id;
	
	public RestaurantMenuBean(String item, int price) {		
		this.item = item;
		this.price = price;
		this.id = DTO.getInstance().getMenuList().size();		
	}
	
	public String toString() {
		return "\nItem: " + this.item + " - Price: " + this.price;
	}


	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
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
	
	
	
	
	

}
