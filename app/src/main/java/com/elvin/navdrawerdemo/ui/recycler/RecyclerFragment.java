package com.elvin.navdrawerdemo.ui.recycler;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.elvin.navdrawerdemo.R;
import com.elvin.navdrawerdemo.adapter.ContactAdapter;
import com.elvin.navdrawerdemo.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class RecyclerFragment extends Fragment {

    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);
        this.recyclerView = view.findViewById(R.id.recyclerView);

        List<Contact> contacts = new ArrayList<Contact>() {
            {
                add(new Contact("Image 1", "Phone Number 1", R.drawable.one));
                add(new Contact("Image 2", "Phone Number 2", R.drawable.two));
                add(new Contact("Image 3", "Phone Number 3", R.drawable.three));
            }
        };

        ContactAdapter contactAdapter = new ContactAdapter(getContext(), contacts);
        recyclerView.setAdapter(contactAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}