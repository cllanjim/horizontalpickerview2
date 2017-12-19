package com.hyb.horizontalpickerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.Toast;

/***
 * @author 侯银博
 * @email cllanjim@gmail.com
 */
public class MainActivity extends AppCompatActivity {

    LinearLayout body;
    HorizontalPickerViewFromLayout horizontalPickerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        body = findViewById(R.id.body);
        LinearLayout.LayoutParams LP_FW = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        horizontalPickerView = new HorizontalPickerViewFromLayout(MainActivity.this);
        body.addView(horizontalPickerView, LP_FW);
        String[] strings = {"7天", "21天", "44天", "60天", "70天"};
        horizontalPickerView.setData(strings);
        horizontalPickerView.setSelectListener(new HorizontalPickerViewFromLayout.SelectListener() {
            @Override
            public void currentItem(String currentObject) {
                String select = currentObject;
                Toast.makeText(MainActivity.this, select, Toast.LENGTH_LONG).show();
            }
        });
    }

}
