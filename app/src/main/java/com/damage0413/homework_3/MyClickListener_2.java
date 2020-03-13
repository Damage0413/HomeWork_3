package com.damage0413.homework_3;

import android.view.View;
import android.widget.TextView;

public class MyClickListener_2 implements View.OnClickListener {

    private TextView mTv;
    public MyClickListener_2(TextView mTv) {
        this.mTv = mTv;
    }
    @Override
    public void onClick(View source) {
        mTv.setText(R.string.TV_5);
    }
}
