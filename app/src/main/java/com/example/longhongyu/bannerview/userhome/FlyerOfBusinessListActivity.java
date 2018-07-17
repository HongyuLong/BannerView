package com.example.longhongyu.bannerview.userhome;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.longhongyu.bannerview.R;
import com.example.longhongyu.bannerview.adapter.Item;
import com.example.longhongyu.bannerview.adapter.MyItemAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 列某一特定商家的传单列表
 * 由一列Item组成
 */
public class FlyerOfBusinessListActivity extends Activity{

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop_flyer_list);
        listView = (ListView) this.findViewById(R.id.myListView);
        this.MyItemTemplateView();
    }

    private void MyItemTemplateView() {
        List<Item> list = new ArrayList<Item>();
        for (int i = 0; i < 100; i++) {
            Item item = new Item();
            item.setItemFlyerThumbnailView("http:// .....");
            item.setItemShopNameTextView("WaHaha");
            item.setItemFlyerNameTextView("decond");
            item.setItemReceiveNumTextView("567" + "张");
            item.setItemRemainNumTextView("789" + "张");
            list.add(item);
        }
        MyItemAdapter adpt = new MyItemAdapter(this, R.layout.flyer_item, list);
        listView.setAdapter(adpt);
    }

//    // 当客户点击MENU按钮的时候，调用该方法 
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

//    // 当客户点击菜单当中的某一个选项时，会调用该方法 
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
