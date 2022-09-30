package com.example.pocket.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.pocket.class_.cctv.CctvAdapter;
import com.example.pocket.class_.cctv.CctvVO;
import com.example.pocket.R;

import java.util.ArrayList;


public class Fra_cctv_T extends Fragment {


    ArrayList<CctvVO> data = new ArrayList<>();
    ListView lv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(com.example.pocket.R.layout.fragment_cctv, container, false);
        lv = view.findViewById(R.id.lv);
        data.add(new CctvVO("교실 1","폭행","1"));
        data.add(new CctvVO("교실 2","갈취","2"));
        data.add(new CctvVO("운동장","살해","3"));
        data.add(new CctvVO("체육관 뒤","사기","4"));
        CctvAdapter adapter = new CctvAdapter(
                getContext().getApplicationContext(),
                R.layout.cctv_list,
                data);


        // 5 ListView에 Adapter적용 시키기
        lv.setAdapter(adapter);
        return view;
    }
}