package com.example.uts_akb_10120777_muhammadabirafdipratama_if9;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeF#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeF extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeF() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Home.
     */
    // TODO: Rename and change types and number of parameters
    public static HomeF newInstance(String param1, String param2) {
        HomeF fragment = new HomeF();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        DataCard[] arraykartu = {
                new DataCard(R.drawable.h, "hilmiy_10", "Bandung", "Duh hujan2 gini enaknya makan mie sambil netflix and chill"),
                new DataCard(R.drawable.t, "taufiqraw", "Tuban", "Saya suka pisang goreng"),
                new DataCard(R.drawable.f, "faalaakkk", "Bandung", "P takbiran ya balapan !!!"),
                new DataCard(R.drawable.kosong, "mhmmddbintang_", "Kendari", "Pengen ke bandung ketemu ayang disana <3333"),
                new DataCard(R.drawable.c, "calfirizki", "Bandung", "Kalo udh jadi pro player pubg gamau main sama anak IF-9 lagi")
        };



        LinearLayout container = view.findViewById(R.id.card_cont);
        Arrays.stream(arraykartu).forEach(value->{
            View cardh = getLayoutInflater().inflate(R.layout.card_home,null);
            ImageView image = cardh.findViewById(R.id.gambar);
            image.setImageResource(value.gambar);

            TextView judul = cardh.findViewById(R.id.judul);
            judul.setText(value.judul);

            TextView kota = cardh.findViewById(R.id.kota);
            kota.setText(value.kota);

            TextView desc = cardh.findViewById(R.id.desc);
            desc.setText(value.desc);

            container.addView(cardh);
        });

    }

}