package edu.infosys.lostAndFoundApplication.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class FoundItem {

    @Id
    private String foundItemId;
    private String username;
    private String userEmail;
    private String itemName;
    private String category;
    private String color;
    private String brand;
    private String location;
    private String foundDate;
    private boolean status;

    public FoundItem() {
        super();
    }

    

	public FoundItem(String foundItemId, String username, String userEmail, String itemName, String category,
			String color, String brand, String location, String foundDate, boolean status) {
		super();
		this.foundItemId = foundItemId;
		this.username = username;
		this.userEmail = userEmail;
		this.itemName = itemName;
		this.category = category;
		this.color = color;
		this.brand = brand;
		this.location = location;
		this.foundDate = foundDate;
		this.status = status;
	}



	public String getFoundItemId() {
		return foundItemId;
	}

	public void setFoundItemId(String foundItemId) {
		this.foundItemId = foundItemId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFoundDate() {
		return foundDate;
	}

	public void setFoundDate(String foundDate) {
		this.foundDate = foundDate;
	}
	
	

	public boolean isStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "FoundItem [foundItemId=" + foundItemId + ", username=" + username + ", userEmail=" + userEmail
				+ ", itemName=" + itemName + ", category=" + category + ", color=" + color + ", brand=" + brand
				+ ", location=" + location + ", foundDate=" + foundDate + "]";
	}
    
    
}