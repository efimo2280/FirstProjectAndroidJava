package com.obuchalka.obuchalka.ui.exercizes;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.obuchalka.obuchalka.R;


public class KachalkaExercizeFragment3 extends Fragment {


    public KachalkaExercizeFragment3() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.third_exercize_kachalka, container, false);


    }


}