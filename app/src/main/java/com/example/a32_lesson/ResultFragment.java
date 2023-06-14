package com.example.a32_lesson;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ResultFragment extends Fragment {

    private TextView textView;
    private Button btnPlus1, btnMinus1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_result, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = requireActivity().findViewById(R.id.tv_result);
        btnPlus1 = requireActivity().findViewById(R.id.btn_plus1);
        btnMinus1 = requireActivity().findViewById(R.id.btn_minus1);
        btnPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double currentValue = Double.parseDouble(textView.getText().toString());
                currentValue = currentValue + 1;
                textView.setText(String.valueOf(currentValue));
            }
        });
        btnMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double currentValue = Double.parseDouble(textView.getText().toString());
                currentValue = currentValue - 1;
                textView.setText(String.valueOf(currentValue));
            }
        });
    }
}

