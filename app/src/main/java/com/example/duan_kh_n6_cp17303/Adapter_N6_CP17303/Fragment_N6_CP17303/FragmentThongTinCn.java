package com.example.duan_kh_n6_cp17303.Adapter_N6_CP17303.Fragment_N6_CP17303;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


import com.example.duan_kh_n6_cp17303.R;

public class FragmentThongTinCn extends Fragment {

    public static FragmentThongTinCn newInstance() {
        FragmentThongTinCn fragment = new FragmentThongTinCn();

        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_thong_tin_cn, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

}