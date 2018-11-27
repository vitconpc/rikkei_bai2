package vn.com.example.demofragment.view.fragment;


import android.os.Bundle;
import android.app.Fragment;
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
public class StudentFragment extends Fragment implements View.OnClickListener {

    private TextView txtName;
    private EditText edtCountry;
    private EditText edtBirthday;
    private EditText edtGender;
    private EditText edtClass;
    private EditText edtCource;
    private Button btnRegister;

    public StudentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_student, container, false);
        txtName = view.findViewById(R.id.txt_student_name);
        edtBirthday = view.findViewById(R.id.edt_birthday);
        edtClass = view.findViewById(R.id.edt_class);
        edtCountry = view.findViewById(R.id.edt_country);
        edtCource = view.findViewById(R.id.edt_cource);
        edtGender = view.findViewById(R.id.edt_gender);
        btnRegister = view.findViewById(R.id.btn_register);
        btnRegister.setOnClickListener(this);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String name = bundle.getString(Constants.NAME, "");
            txtName.setText(name);
        }
        return view;
    }

    @Override
    public void onClick(View v) {
        Student student = new Student();
        student.setBirthday(edtBirthday.getText().toString().trim());
        student.setClassroom(edtClass.getText().toString().trim());
        student.setCountry(edtCountry.getText().toString().trim());
        student.setCource(edtCource.getText().toString().trim());
        student.setGender(edtGender.getText().toString().trim());
        student.setName(txtName.getText().toString().trim());

        ((HomeActivity) getActivity()).gotoStudentDetailFragment(student);
    }
}
