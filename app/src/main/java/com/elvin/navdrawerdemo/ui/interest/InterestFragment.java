package com.elvin.navdrawerdemo.ui.interest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.elvin.navdrawerdemo.R;

public class InterestFragment extends Fragment {

    private InterestViewModel interestViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        interestViewModel =
                ViewModelProviders.of(this).get(InterestViewModel.class);
        View root = inflater.inflate(R.layout.fragment_circle, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        interestViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}