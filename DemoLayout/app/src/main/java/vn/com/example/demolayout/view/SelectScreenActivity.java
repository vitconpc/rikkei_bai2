package vn.com.example.demolayout.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import vn.com.example.demolayout.R;

public class SelectScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_screen);
    }

    public void goToScreen1(View view) {
        Intent intent = new Intent(this, Screen1Activity.class);
        startActivity(intent);
    }

    public void goToScreen2(View view) {
        Intent intent = new Intent(this, Screen2Activity.class);
        startActivity(intent);
    }

    public void goToScreen3(View view) {
        Intent intent = new Intent(this, Screen3Activity.class);
        startActivity(intent);
    }
}
