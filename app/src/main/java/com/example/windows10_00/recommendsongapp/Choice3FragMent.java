package com.example.windows10_00.recommendsongapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Choice3FragMent extends Fragment implements View.OnClickListener {


    Button choice1, choice2, choice3, choice4;
    View rootView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.choice3 , container , false);
        setUp(rootView);




        return rootView;


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.choice1_btn1:
                IntentAction(new Intent(getActivity().getApplicationContext() , MyService.class) , "1");
                changeFragment();
                break;
            case R.id.choice1_btn2:
                IntentAction(new Intent(getActivity().getApplicationContext() , MyService.class) , "2");
                changeFragment();
                break;
            case R.id.choice1_btn3:
                IntentAction(new Intent(getActivity().getApplicationContext() , MyService.class) , "3");
                changeFragment();
                break;
            case R.id.choice1_btn4:
                IntentAction(new Intent(getActivity().getApplicationContext() , MyService.class) , "4");
                changeFragment();
                break;
        }

    }

    void IntentAction(Intent intent , String number){
        intent.putExtra("CODE" , number);
        getActivity().startService(intent);


    }
    void changeFragment(){
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentLayout , new Choice4FragMent());
        fragmentTransaction.commit();
    }


    void setUp(View rootView){
        //find
        choice1 = rootView.findViewById(R.id.choice1_btn1);
        choice2 = rootView.findViewById(R.id.choice1_btn2);
        choice3 = rootView.findViewById(R.id.choice1_btn3);
        choice4 = rootView.findViewById(R.id.choice1_btn4);




        //listner
        choice1.setOnClickListener(this);
        choice2.setOnClickListener(this);
        choice3.setOnClickListener(this);
        choice4.setOnClickListener(this);
    }
}
