package com.example.pocket.fragment;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

import com.example.pocket.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment33#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment33 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment33() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment33 newInstance(String param1, String param2) {
        Fragment33 fragment = new Fragment33();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    SharedPreferences pref ;
    SharedPreferences.Editor editor;
    EditText pw,tel,sc;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2_2, container, false);




        pw = view.findViewById(R.id.pw1);

        tel = view.findViewById(R.id.tel);

        sc = view.findViewById(R.id.scCode);

        pref = getActivity().getSharedPreferences("pref", Activity.MODE_PRIVATE);
        editor = pref.edit();




        pw.setText("PW : "+String.valueOf(pref.getString("pw","0")));

        tel.setText("TEL : "+String.valueOf(pref.getString("tel","0")));

        sc.setText("ScCode : "+String.valueOf(pref.getString("scCode","0")));


        // Inflate the layout for this fragment
        return view;
    }
}