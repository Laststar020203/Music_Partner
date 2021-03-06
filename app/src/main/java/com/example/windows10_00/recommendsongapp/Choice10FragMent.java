package com.example.windows10_00.recommendsongapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Choice10FragMent extends Fragment implements View.OnClickListener {

    String[] text;
    Button choice1, choice2, choice3, choice4;
    View rootView;
    boolean donTouch;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        text = Text.text[Text.number[6]];

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

         rootView = inflater.inflate(R.layout.choice1 , container , false);
         setUp(rootView);




        return rootView;


    }

    @Override
    public void onClick(View v) {
        if(donTouch) return;
        switch (v.getId()){
            case R.id.choice1_btn1:
                IntentAction(new Intent(getActivity().getApplicationContext() , MyService.class) , "1");
                getActivity().stopService(new Intent(getActivity() , MyService.class));
                donTouch = true;

                break;
            case R.id.choice1_btn2:
                IntentAction(new Intent(getActivity().getApplicationContext() , MyService.class) , "2");
                getActivity().stopService(new Intent(getActivity() , MyService.class));
                donTouch = true;
                break;
            case R.id.choice1_btn3:
                IntentAction(new Intent(getActivity().getApplicationContext() , MyService.class) , "3");
                getActivity().stopService(new Intent(getActivity() , MyService.class));
                donTouch = true;
                break;
            case R.id.choice1_btn4:
                IntentAction(new Intent(getActivity().getApplicationContext() , MyService.class) , "4");
                getActivity().stopService(new Intent(getActivity() , MyService.class));
                donTouch = true;
                break;
        }

    }

    void IntentAction(Intent intent , String number){
        intent.putExtra("CODE" , number);
        getActivity().startService(intent);


    }


    void setUp(View rootView){
        //find
        choice1 = rootView.findViewById(R.id.choice1_btn1);
        choice2 = rootView.findViewById(R.id.choice1_btn2);
        choice3 = rootView.findViewById(R.id.choice1_btn3);
        choice4 = rootView.findViewById(R.id.choice1_btn4);

        TextView text1 = rootView.findViewById(R.id.textMain);
        //input
        text1.setText(text[0]);
        choice1.setText(text[1]);
        choice2.setText(text[2]);
        choice3.setText(text[3]);
        choice4.setText(text[4]);


        //listner
        choice1.setOnClickListener(this);
        choice2.setOnClickListener(this);
        choice3.setOnClickListener(this);
        choice4.setOnClickListener(this);
    }


}
