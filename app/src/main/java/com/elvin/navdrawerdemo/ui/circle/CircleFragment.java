package com.elvin.navdrawerdemo.ui.circle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.elvin.navdrawerdemo.Operation;
import com.elvin.navdrawerdemo.R;

public class CircleFragment extends Fragment implements View.OnClickListener {

    private EditText etRadius;
    private Button btnCalculateArea;

    public CircleFragment() {
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_circle, container, false);
        this.etRadius = view.findViewById(R.id.etRadius);
        this.btnCalculateArea = view.findViewById(R.id.btnCalculateArea);
        this.btnCalculateArea.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "Area of circle is: " + Operation.areaOfCircle(Float.parseFloat(this.etRadius.getText().toString())), Toast.LENGTH_SHORT).show();
    }
}