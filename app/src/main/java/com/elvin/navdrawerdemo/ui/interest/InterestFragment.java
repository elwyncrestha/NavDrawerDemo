package com.elvin.navdrawerdemo.ui.interest;

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

public class InterestFragment extends Fragment implements View.OnClickListener {

    EditText etPrincipal;
    EditText etTime;
    EditText etRate;
    Button btnCalculateSI;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_interest, container, false);
        this.etPrincipal = view.findViewById(R.id.etPrincipal);
        this.etTime = view.findViewById(R.id.etTime);
        this.etRate = view.findViewById(R.id.etRate);
        this.btnCalculateSI = view.findViewById(R.id.btnCalculateSI);
        this.btnCalculateSI.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float principal = Float.parseFloat(etPrincipal.getText().toString());
        float time = Float.parseFloat(etTime.getText().toString());
        float rate = Float.parseFloat(etRate.getText().toString());
        Toast.makeText(getActivity(), "Simple Interest is: " + Operation.calculateSI(principal, time, rate), Toast.LENGTH_SHORT).show();
    }
}