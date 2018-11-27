package vn.com.example.demofragment.view.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import vn.com.example.demofragment.R;
import vn.com.example.demofragment.view.activity.HomeActivity;
import vn.com.example.demofragment.view.common.Constants;
import vn.com.example.demofragment.view.model.Student;

/**
 * A simple {@link Fragment} subclass.
 */
public class StudentDetailFragment extends Fragment{

    private TextView txtName;
    private TextView txtCountry;
    private TextView txtBirthday;
    private TextView txtGender;
    private TextView txtClass;
    private TextView txtCource;

    public StudentDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_student_detail, container, false);
        txtBirthday = view.findViewById(R.id.txt_birthday);
        txtClass = view.findViewById(R.id.txt_class);
        txtCountry = view.findViewById(R.id.txt_country);
        txtCource = view.findViewById(R.id.txt_cource);
        txtGender = view.findViewById(R.id.txt_gender);
        txtName = view.findViewById(R.id.txt_student_name);

        Bundle bundle = getArguments();

        if (bundle != null) {
            Student student = bundle.getParcelable(Constants.STUDENT);

            txtName.setText(student.getName());
            txtGender.setText(student.getGender());
            txtCource.setText(student.getCource());
            txtCountry.setText(student.getCountry());
            txtClass.setText(student.getClassroom());
            txtBirthday.setText(student.getBirthday());
        }
        return view;
    }

}
