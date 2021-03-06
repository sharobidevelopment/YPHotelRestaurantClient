/**
 * 
 */
package com.sharobi.webpos.adm.model;

import java.io.Serializable;

/**
 * @author habib
 *
 */
public class MenuItemNotes implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int storeId;
	private int foodItemIds;
	private MenuItems menuItem;
	private String deleteFlag;
	private String createdBy;
	private String createdDate;
	private String updatedBy;
	private String updatedDate;
	private MenuItems item;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public int getFoodItemIds() {
		return foodItemIds;
	}
	public void setFoodItemIds(int foodItemIds) {
		this.foodItemIds = foodItemIds;
	}
	public MenuItems getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(MenuItems menuItem) {
		this.menuItem = menuItem;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public MenuItems getItem() {
		return item;
	}
	public void setItem(MenuItems item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "MenuItemNotes [id=" + id + ", storeId=" + storeId
				+ ", foodItemIds=" + foodItemIds + ", menuItem=" + menuItem
				+ ", deleteFlag=" + deleteFlag + ", createdBy=" + createdBy
				+ ", createdDate=" + createdDate + ", updatedBy=" + updatedBy
				+ ", updatedDate=" + updatedDate + ", item=" + item + "]";
	}
	
	
}
