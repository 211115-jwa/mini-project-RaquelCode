package com.Raquel;

import java.util.Objects;

public class Collection {
	String MenuName;
    int MenuPrice;
	String address;
	String order;

	public Collection() {
		super();

	}

	public String getMenuName() {
		return MenuName;
	}

	public void setMenuName(String menuName) {
		MenuName = menuName;
	}

	public int getMenuPrice() {
		return MenuPrice;
	}

	public void setMenuPrice(int menuPrice) {
		MenuPrice = menuPrice;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	@Override
	public int hashCode() {
		return Objects.hash(MenuName, MenuPrice, address, order);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Collection other = (Collection) obj;
		return Objects.equals(MenuName, other.MenuName) && Objects.equals(MenuPrice, other.MenuPrice)
				&& Objects.equals(address, other.address) && Objects.equals(order, other.order);
	}

	@Override
	public String toString() {
		return "Collection [MenuName=" + MenuName + ", MenuPrice=" + MenuPrice + ", address=" + address + ", order="
				+ order + "]";
	}

	
}
