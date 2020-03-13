package com.damage0413.homework_3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTv;
    private Button mBtnes1;
    private Button mBtnes2;
    private Button mBtnes4;
    private Button mBtnes5;
    private Button mBtnes7;
    private Button mBtnes8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mTv = (TextView) findViewById(R.id.TextView_1);
        mBtnes1 = (Button) findViewById(R.id.EventSource_1);
        mBtnes2 = (Button) findViewById(R.id.EventSource_2);
        mBtnes4 = (Button) findViewById(R.id.EventSource_4);
        mBtnes5 = (Button) findViewById(R.id.EventSource_5);
        mBtnes1.setOnClickListener(MainActivity.this);
        mBtnes2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTv.setText(R.string.TV_2);
            }
        });
        mBtnes4.setOnClickListener(new MyClickListener() {
        });
        mBtnes5.setOnClickListener(new MyClickListener_2(mTv) {
        });
        mBtnes7 = (Button) findViewById(R.id.EventSource_7);
        mBtnes7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_1 = new Intent(MainActivity.this,ConfigurationTest.class);
                startActivity(intent_1);
            }
        });
        mBtnes8 = (Button) findViewById(R.id.EventSource_8);
        mBtnes8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_2 = new Intent(MainActivity.this,ProgressDialogTest.class);
                startActivity(intent_2);
            }
        });
    }

    @Override
    public void onClick(View v) {
        mTv.setText(R.string.TV_1);
    }

    public void clickHandler(View source) {
        mTv.setText(R.string.TV_3);
    }

    class MyClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            mTv.setText(R.string.TV_4);
        }
    }
    @OnClick(R.id.EventSource_6)
    public void click(View view){
        mTv.setText(R.string.TV_6);
    }
}