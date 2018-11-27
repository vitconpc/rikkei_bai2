package vn.com.example.demolayout.view;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import vn.com.example.demolayout.R;

public class Screen1Activity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private TextView txtTitle;
    private RadioButton rbnRed;
    private int color;
    private RadioButton rbnGreen;
    private RadioButton rbnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);
        initView();
        initData();
        initEvent();
    }

    private void initEvent() {
        rbnRed.setOnCheckedChangeListener(this);
        rbnGreen.setOnCheckedChangeListener(this);
        rbnBlue.setOnCheckedChangeListener(this);
    }

    private void initData() {
        rbnRed.setChecked(true);
        color = 1;
    }

    private void initView() {
        txtTitle = findViewById(R.id.txt_title);
        rbnBlue = findViewById(R.id.rbn_blue);
        rbnGreen = findViewById(R.id.rbn_green);
        rbnRed = findViewById(R.id.rbn_red);
    }

    public void setColor(View view) {
        switch (color) {
            case 1: {
                txtTitle.setText(R.string.red);
                txtTitle.setTextColor(Color.RED);
            }
            break;
            case 2: {
                txtTitle.setText(R.string.green);
                txtTitle.setTextColor(Color.GREEN);
            }
            break;
            default: {
                txtTitle.setText(R.string.blue);
                txtTitle.setTextColor(Color.BLUE);
            }
            break;
        }
    }

    public void clear(View view) {
        txtTitle.setText(R.string.white);
        txtTitle.setTextColor(Color.WHITE);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.rbn_blue: {
                if (isChecked) {
                    color = 3;
                }
            }
            break;
            case R.id.rbn_red: {
                if (isChecked) {
                    color = 1;
                }
            }
            break;
            default: {
                if (isChecked) {
                    color = 2;
                }
            }
            break;
        }
    }

}
