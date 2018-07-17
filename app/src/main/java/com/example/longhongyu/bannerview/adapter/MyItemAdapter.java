package com.example.longhongyu.bannerview.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.longhongyu.bannerview.R;

import java.net.URI;
import java.util.List;

public class MyItemAdapter extends ArrayAdapter<Item> {

	public MyItemAdapter(Context context, int resource, List<Item> objects) {
		super(context, resource, objects);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Item item = getItem(position);
		View itemView = null;
		ViewHolder vh = null;
		if (convertView != null) {
			itemView = convertView;
			vh = (ViewHolder) itemView.getTag();
		} else {
			itemView = LayoutInflater.from(getContext()).inflate(
					R.layout.flyer_item, parent, false);
			ImageView imgFlyerThumbnailView = (ImageView) itemView.findViewById(R.id.flyerThumbnailView);
			TextView txtShopNameTextView = (TextView) itemView.findViewById(R.id.shopNameTextView);
			TextView txtFlyerNameTextView = (TextView) itemView.findViewById(R.id.flyerNameTextView);
			TextView txtReceiveNumTextView = (TextView) itemView.findViewById(R.id.receiveNumTextView);
			TextView txtRemainNumTextView = (TextView) itemView.findViewById(R.id.remainNumTextView);

			vh = new ViewHolder();
			vh.imgFlyerThumbnailView = imgFlyerThumbnailView;
			vh.txtShopNameTextView = txtShopNameTextView;
			vh.txtFlyerNameTextView = txtFlyerNameTextView;
			vh.txtReceiveNumTextView = txtReceiveNumTextView;
			vh.txtRemainNumTextView = txtRemainNumTextView;
			itemView.setTag(vh);
		}
		vh.imgFlyerThumbnailView.setImageURI(Uri.parse(item.getItemFlyerThumbnailView()));
		vh.txtShopNameTextView.setText(item.getItemShopNameTextView());
		vh.txtFlyerNameTextView.setText(item.getItemFlyerNameTextView());
		vh.txtReceiveNumTextView.setText(item.getItemReceiveNumTextView());
		vh.txtRemainNumTextView.setText(item.getItemRemainNumTextView());
		return itemView;
	}

	class ViewHolder {
		public ImageView imgFlyerThumbnailView;
		public TextView txtShopNameTextView;
		public TextView txtFlyerNameTextView;
		public TextView txtReceiveNumTextView;
		public TextView txtRemainNumTextView;
	}
}
