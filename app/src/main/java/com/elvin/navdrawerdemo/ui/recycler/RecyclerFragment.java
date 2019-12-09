package com.elvin.navdrawerdemo.ui.recycler;

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

public class RecyclerFragment extends Fragment {

    private RecyclerViewModel recyclerViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        recyclerViewModel =
                ViewModelProviders.of(this).get(RecyclerViewModel.class);
        View root = inflater.inflate(R.layout.fragment_recycler, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        recyclerViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}