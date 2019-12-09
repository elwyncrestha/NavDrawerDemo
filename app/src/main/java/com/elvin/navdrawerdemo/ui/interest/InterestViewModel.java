package com.elvin.navdrawerdemo.ui.interest;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InterestViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InterestViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Simple Interest fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}