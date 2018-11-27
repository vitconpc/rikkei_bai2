package vn.com.example.demolayout.view;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import vn.com.example.demolayout.R;

public class Screen2Activity extends AppCompatActivity {

    private TextView txtTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        initView();
    }

    private void initView() {
        txtTitle = findViewById(R.id.txt_title);
    }

    public void setColorRed(View view) {
        txtTitle.setBackgroundColor(Color.RED);
    }

    public void setColorBlue(View view) {
        txtTitle.setBackgroundColor(Color.BLUE);
    }

    public void setColorGreen(View view) {
        txtTitle.setBackgroundColor(Color.GREEN);
    }

    public void clear(View view) {
        txtTitle.setBackgroundColor(Color.TRANSPARENT);
    }
}
