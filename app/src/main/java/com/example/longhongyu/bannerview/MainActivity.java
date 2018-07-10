package com.example.longhongyu.bannerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.youth.banner.Banner;

public class MainActivity extends AppCompatActivity {
    private Banner banner;
    //设置图片资源:url或本地资源
    String[] images= new String[]{
            "https://gss3.bdstatic.com/7Po3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike180%2C5%2C5%2C180%2C60/sign=67f3f8a0b73eb13550cabfe9c777c3b6/8694a4c27d1ed21be90dfaada66eddc450da3fb6.jpg",
            "http://img.zcool.cn/community/0166c756e1427432f875520f7cc838.jpg",
            "https://gss3.bdstatic.com/-Po3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike180%2C5%2C5%2C180%2C60/sign=c023b59f3dd12f2eda08a6322eabbe07/9358d109b3de9c826a972dc76781800a18d8438c.jpg",
            "https://gss1.bdstatic.com/9vo3dSag_xI4khGkpoWK1HF6hhy/baike/c0%3Dbaike272%2C5%2C5%2C272%2C90/sign=b3ec2d8415178a82da3177f2976a18e8/e824b899a9014c085fccffed017b02087af4f487.jpg"
    };

    //设置图片标题：自动对应
    String[] titles=new String[]{"玛丽","与","魔女","之花"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        banner = (Banner) findViewById(R.id.banner);

        banner.setBannerStyle(Banner.CIRCLE_INDICATOR_TITLE); //显示圆形指示器和标题
        banner.setIndicatorGravity(Banner.CENTER); //指示器居中
        banner.setBannerTitle(titles);//设置轮播要显示的标题和图片对应（如果不传默认不显示标题）
        banner.isAutoPlay(true);//设置是否自动轮播（不设置则默认自动）
        banner.setDelayTime(5000); // 不设置时默认2000

        // 设置图片资源：可选图片网址/资源文件

        //自定义图片加载框架
        banner.setImages(images, new Banner.OnLoadImageListener() {
            @Override
            public void OnLoadImage(ImageView view, Object url) {
                System.out.println("加载中");
                Glide.with(getApplicationContext()).load(url).into(view);
                System.out.println("加载完");
            }
        });
        //设置点击事件，下标从1开始
        banner.setOnBannerClickListener(new Banner.OnBannerClickListener() {
            @Override
            public void OnBannerClick(View view, int position) {
                Toast.makeText(getApplicationContext(),"你点击了："+position,Toast.LENGTH_LONG).show();
            }
        });

    }
}
