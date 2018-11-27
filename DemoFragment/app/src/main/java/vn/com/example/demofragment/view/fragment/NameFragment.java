package vn.com.example.demofragment.view.fragment;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import vn.com.example.demofragment.R;
import vn.com.example.demofragment.view.activity.HomeActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class NameFragment extends Fragment implements View.OnClickListener {


    private EditText edtName;
    private Button btnNext;

    public NameFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_name, container, false);
        edtName = v.findViewById(R.id.txt_student_name);
        btnNext = v.findViewById(R.id.btn_next);
        btnNext.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        ((HomeActivity)getActivity()).gotoStudentFragment(edtName.getText().toString());
    }
}
