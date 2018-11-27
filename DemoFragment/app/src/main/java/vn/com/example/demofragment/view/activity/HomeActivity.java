package vn.com.example.demofragment.view.activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import vn.com.example.demofragment.R;
import vn.com.example.demofragment.view.common.Constants;
import vn.com.example.demofragment.view.fragment.NameFragment;
import vn.com.example.demofragment.view.fragment.StudentDetailFragment;
import vn.com.example.demofragment.view.fragment.StudentFragment;
import vn.com.example.demofragment.view.model.Student;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

    private void init() {
        replaceFragment(new NameFragment());
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager manager = this.getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_content, fragment).commit();
    }

    public void gotoStudentFragment(String name) {
        StudentFragment studentFragment = new StudentFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.NAME, name);
        studentFragment.setArguments(bundle);
        replaceFragment(studentFragment);
    }

    public void gotoStudentDetailFragment(Student student) {
        StudentDetailFragment detailFragment = new StudentDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(Constants.STUDENT, student);
        detailFragment.setArguments(bundle);
        replaceFragment(detailFragment);
    }
}
