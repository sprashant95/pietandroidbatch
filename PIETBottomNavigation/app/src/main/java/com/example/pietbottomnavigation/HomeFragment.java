package com.example.pietbottomnavigation;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class HomeFragment extends Fragment {

    public HomeFragment() {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ListView listView;

        String[] moviename = {"Antman", "Antman and WASP", "Hulk", "Doctor Strange", "Captain America",
                "Black Widow", "Black Panther", "Avengers",
                "Antman", "Antman and WASP", "Hulk", "Doctor Strange", "Captain America",
                "Black Widow", "Black Panther", "Avengers",
                "Antman", "Antman and WASP", "Hulk", "Doctor Strange", "Captain America",
                "Black Widow", "Black Panther", "Avengers"};

        Integer[] movieimage = {R.drawable.antman,R.drawable.antman2,R.drawable.hulk,R.drawable.doctorstrange,
                R.drawable.captainamerica,R.drawable.blackwidow,R.drawable.blackpanther,R.drawable.avengers,
                R.drawable.antman,R.drawable.antman2,R.drawable.hulk,R.drawable.doctorstrange,
                R.drawable.captainamerica,R.drawable.blackwidow,R.drawable.blackpanther,R.drawable.avengers,
                R.drawable.antman,R.drawable.antman2,R.drawable.hulk,R.drawable.doctorstrange,
                R.drawable.captainamerica,R.drawable.blackwidow,R.drawable.blackpanther,R.drawable.avengers};

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        listView = view.findViewById(R.id.listview);

        MyHomeAdapter myHomeAdapter = new MyHomeAdapter(getActivity(),moviename,movieimage);
        listView.setAdapter(myHomeAdapter);

        return view;

    }
}