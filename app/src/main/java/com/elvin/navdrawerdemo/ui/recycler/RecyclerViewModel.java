package com.elvin.navdrawerdemo.ui.recycler;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RecyclerViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public RecyclerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Recycler View fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}