package com.obuchalka.obuchalka.ui;

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
import com.obuchalka.obuchalka.databinding.FragmentStudentBinding;



public class StudentFragment extends Fragment {

    private FragmentStudentBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        StudentViewModel dashboardViewModel =
                new ViewModelProvider(this).get(StudentViewModel.class);

        binding = FragmentStudentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button studentButton1 = binding.button1;
        studentButton1.setText("Отжимания с локтями у корпуса");
        Button studentButton2 = binding.button2;
        studentButton2.setText("Лодочка");
        Button studentButton3 = binding.button3;
        studentButton3.setText("Выпады на месте");
        Button studentButton4 = binding.button4;
        studentButton4.setText("Подьем ног лежа");
        Button studentButton5 = binding.button5;
        studentButton5.setText("Подьем корпуса лежа");

        studentButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_student_to_firstExercizeStudent);
            }
        });
        studentButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_student_to_secondExercizeStudent);
            }
        });
        studentButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_student_to_thirdExercizeStudent);
            }
        });
        studentButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_student_to_fourthExercizeStudent);
            }
        });
        studentButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_navigation_student_to_fifthExercizeStudent);
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