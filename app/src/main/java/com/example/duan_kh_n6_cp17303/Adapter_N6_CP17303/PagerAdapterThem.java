package com.example.duan_kh_n6_cp17303.Adapter_N6_CP17303;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.duan_kh_n6_cp17303.Adapter_N6_CP17303.Fragment_N6_CP17303.FragmentDanhGia;
import com.example.duan_kh_n6_cp17303.Adapter_N6_CP17303.Fragment_N6_CP17303.FragmentLienHe;


public class PagerAdapterThem extends FragmentStateAdapter {

    int soluongPage = 2;
    public PagerAdapterThem(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return  new FragmentDanhGia();
            case 1:
                return new FragmentLienHe();
            default:
                return new FragmentDanhGia();
        }

    }

    @Override
    public int getItemCount() {
        return soluongPage;
    }
}
