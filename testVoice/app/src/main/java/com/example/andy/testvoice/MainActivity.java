package com.example.andy.testvoice;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.andy.testvoice.basic.IatBasicActivity;

public class MainActivity extends IatBasicActivity implements View.OnClickListener{

    private EditText mContent;
    private Button mBtnVoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//5763509a
        initView();
    }

    /**
     * 初始化视图
     */
    private void initView(){
        mContent = (EditText)findViewById(R.id.et_content);
        mBtnVoice =(Button)findViewById(R.id.btn_voice);
        mBtnVoice.setOnClickListener(this);
        //调用父类方法
        initIatData(mContent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
           case R.id.btn_voice:
               //调用父类方法
               clickMethod();
            break;
        }
    }
}
