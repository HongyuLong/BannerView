package com.example.longhongyu.bannerview.userhome;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.longhongyu.bannerview.R;

public class FlyerDetailActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView returnView;
    private ImageView shareView;
    private Dialog dialog;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_flyer_detail);

        returnToHome();

        shareView = (ImageView) findViewById(R.id.shareView);
        shareView.setOnClickListener(this);
    }

    // "返回"按钮：返回首页HomeActivity并销毁FlyerDetailActivity
    private void returnToHome(){
        returnView = (ImageView) findViewById(R.id.returnView);
        returnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FlyerDetailActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.shareView:
                //显示对话框
                showDialog();
                break;
            //客户对内容做出选择后，对话框消失
            case R.id.login_by_qq:
                Toast.makeText(this,"分享到手机QQ",Toast.LENGTH_SHORT).show();
                dismiss();
                break;
            //客户对内容做出选择后，对话框消失
            case R.id.login_by_qzone:
                Toast.makeText(this, "分享到QQ空间", Toast.LENGTH_SHORT).show();
                dismiss();
                break;
            //设置点击对话框布局外，对话框消失
            case R.id.dialog_layout:
                dismiss();
                break;
            //点击取消按钮，对话框消失
            case R.id.share_cancel:
                dismiss();
                break;
            default:
                break;
        }
    }

    /**
     * 显示对话框
     */
    public void showDialog() {
        if (dialog == null) {
            dialog = new Dialog(FlyerDetailActivity.this, R.style.custom_dialog);
            dialog.setCanceledOnTouchOutside(true);
            //获取对话框的窗口，并设置窗口参数
            Window win = dialog.getWindow();
            LayoutParams params = new LayoutParams();
            // 不能写成这样,否则Dialog显示不出来
            //LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT,LayoutParams.WRAP_CONTENT);
            //对话框窗口的宽和高
            params.width = LayoutParams.MATCH_PARENT;
            params.height = LayoutParams.WRAP_CONTENT;
            //对话框窗口显示的位置
            params.x = 120;
            params.y = 100;
            win.setAttributes(params);
            //设置对话框布局
            dialog.setContentView(R.layout.custome_dialog);
            //获取对话框布局中的控件，并设置事件监听
            dialog.findViewById(R.id.login_by_qq).setOnClickListener(this);
            dialog.findViewById(R.id.login_by_qzone).setOnClickListener(this);
            dialog.findViewById(R.id.dialog_layout).setOnClickListener(this);
            dialog.findViewById(R.id.white_layout).setOnClickListener(this);
            dialog.findViewById(R.id.share_cancel).setOnClickListener(this);
        }
        dialog.show();
    }


    /**
     * 隐藏对话框
     */
    public void dismiss() {
        //隐藏对话框之前先判断对话框是否存在，以及是否正在显示
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

}
