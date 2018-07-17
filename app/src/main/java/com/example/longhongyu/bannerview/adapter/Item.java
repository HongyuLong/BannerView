package com.example.longhongyu.bannerview.adapter;

import com.example.longhongyu.bannerview.R;

public class Item {
	private String itemId;

	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemShopNameTextView() {
		return itemShopNameTextView;
	}
	public void setItemShopNameTextView(String itemTitle) {
		this.itemShopNameTextView = itemTitle;
	}

	public String getItemFlyerNameTextView() {
		return itemFlyerNameTextView;
	}
	public void setItemFlyerNameTextView(String itemContent) { this.itemFlyerNameTextView = itemContent; }

	public String getItemReceiveNumTextView() {
		return itemReceiveNumTextView;
	}
	public void setItemReceiveNumTextView(String itemDate) {
		this.itemReceiveNumTextView = itemDate;
	}

	public String getItemRemainNumTextView() { return itemRemainNumTextView; }
	public void setItemRemainNumTextView(String itemRemainNumTextView) { this.itemRemainNumTextView = itemRemainNumTextView; }

	public String getItemFlyerThumbnailView() { return itemFlyerThumbnailView; }
	public void setItemFlyerThumbnailView(String itemFlyerThumbnailView) { this.itemFlyerThumbnailView = itemFlyerThumbnailView; }

	private String itemFlyerThumbnailView;
	private String itemShopNameTextView;
	private String itemFlyerNameTextView;
	private String itemReceiveNumTextView;
	private String itemRemainNumTextView;





}
