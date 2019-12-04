package com.example.text1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 请输入你的余额
     */
    private EditText mEdText;
    private Button mBtn;

    /**
     * Button
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mEdText = (EditText) findViewById(R.id.ed_text);
        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn:
                load();
                break;
        }
    }

    private void load() {
        String s = mEdText.getText().toString();
        Intent intent = new Intent(MainActivity.this, PriceActivity.class);
        intent.putExtra("price",s);
        startActivity(intent);
    }
}
