package com.example.communicationframgment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_layout, container, false);

//        TextView tvHienThi = getActivity().findViewById(R.id.tvActivity);
//        tvHienThi.setText("Hello");

        EditText editText = view.findViewById(R.id.etHoTen);
        // lay du lieu tu bundle Activity
        Bundle bundle = getArguments();
        editText.setText(bundle.getString("Hello").toString());


        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}
