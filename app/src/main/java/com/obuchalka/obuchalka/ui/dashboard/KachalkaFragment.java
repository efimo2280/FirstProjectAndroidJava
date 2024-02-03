package com.obuchalka.obuchalka.ui.dashboard;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.obuchalka.obuchalka.R;
import com.obuchalka.obuchalka.databinding.FragmentKachalkaBinding;
import com.obuchalka.obuchalka.ui.exercizes.KachalkaExercizeFragment1;


public class KachalkaFragment extends Fragment {

    private FragmentKachalkaBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        KachalkaViewModel dashboardViewModel =
                new ViewModelProvider(this).get(KachalkaViewModel.class);

        binding = FragmentKachalkaBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button kachalkaButton1 = binding.buttonKachalka1;
        kachalkaButton1.setText("Тяга верхнего блока к груди");
        Button kachalkaButton2 = binding.buttonKachalka2;
        kachalkaButton2.setText("Французский жим с гантелью сидя");
        Button kachalkaButton3 = binding.buttonKachalka3;
        kachalkaButton3.setText("Жим штанги лежа широким хватом");
        Button kachalkaButton4 = binding.buttonKachalka4;
        kachalkaButton4.setText("Подьем гантелей на бицепс с супинацией");
        Button kachalkaButton5 = binding.buttonKachalka5;
        kachalkaButton5.setText("Приседания с гантелями");



        kachalkaButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_kachalka_to_firstExercizeKachalka);
            }
        });

        kachalkaButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_kachalka_to_secondExercizeKachalka);
            }
        });

        kachalkaButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_kachalka_to_thirdExercizeKachalka);
            }
        });

        kachalkaButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_kachalka_to_fourthExercizeKachalka);
            }
        });

        kachalkaButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_kachalka_to_fifthExercizeKachalka);
            }
        });

        return root;



    }





    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    }

