package com.example.duan_kh_n6_cp17303.Adapter_N6_CP17303.Fragment_N6_CP17303;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


import com.example.duan_kh_n6_cp17303.R;


public class FragmentThanhToan extends Fragment {
    String a = "aa";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_thanh_toan, container, false);
    }
}