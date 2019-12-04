package com.example.text1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class PriceActivity extends AppCompatActivity {

    private TextView mTvPrice;
    private RecyclerView mRecy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);
        initView();
    }

    private void initView() {
        mTvPrice = (TextView) findViewById(R.id.tv_price);
        mRecy = (RecyclerView) findViewById(R.id.recy);
        Intent intent = getIntent();
        String price = intent.getStringExtra("price");
        mTvPrice.setText("账户余额为："+price);
    }
}
