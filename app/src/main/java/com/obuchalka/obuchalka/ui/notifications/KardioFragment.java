package com.obuchalka.obuchalka.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.obuchalka.obuchalka.R;
import com.obuchalka.obuchalka.databinding.FragmentKardioBinding;

public class KardioFragment extends Fragment {

    private FragmentKardioBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        KardioViewModel notificationsViewModel =
                new ViewModelProvider(this).get(KardioViewModel.class);

        binding = FragmentKardioBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button kardioButton1 = binding.button1;
        kardioButton1.setText("Переменная волна с канатами");
        Button kardioButton2 = binding.button2;
        kardioButton2.setText("Зашагивания на тумбу");
        Button kardioButton3 = binding.button3;
        kardioButton3.setText("Джампинг Джек");
        Button kardioButton4 = binding.button4;
        kardioButton4.setText("Берпи");
        Button kardioButton5 = binding.button5;
        kardioButton5.setText("Бег на месте");

        kardioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_kardio_to_firstExercizeKardio);
            }
        });

        kardioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_kardio_to_secondExercizeKardio);
            }
        });

        kardioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_kardio_to_thirdExercizeKardio);
            }
        });

        kardioButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_kardio_to_fourthExercizeKardio);
            }
        });

        kardioButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_kardio_to_fifthExercizeKardio);
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