package com.example.bradleycockrell.callbacksworkshop;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class CallbackFragment extends Fragment {

    private CallbackClass callback;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

//        Uses layout created to associate it with this particular fragment
        View view = inflater.inflate(R.layout.fragment_callback, container, false);
//        This tells Butterknife library to bind the variables in THIS class to the specified view from above
        ButterKnife.bind(this, view);

//        This takes the view object we created and associates it with this fragment
        return view;
    }

//    Required to be able to instantiate the fragment for use.
    public static CallbackFragment newInstance() {

        Bundle args = new Bundle();

        CallbackFragment fragment = new CallbackFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @OnClick(R.id.run_toast_method_from_activity_button)
    protected void createToast() {

    }

    @OnClick(R.id.callback_message_textview)
    protected void chanageTextview() {

    }

    @OnClick(R.id.change_activity_background_color_button)
    protected void changeActivityBackground() {

    }

    public void attachParent(CallbackClass callback) {
        this.callback = callback;

    }

    @OnClick(R.id.remove_fragment_callback_button)
    protected void removeFragment() {
        callback.removeFragment();

    }

    public interface CallbackClass {

        void showToast();
        void changeTextview();
        void changeBackgroundColor();
        void removeFragment();

    }

}
