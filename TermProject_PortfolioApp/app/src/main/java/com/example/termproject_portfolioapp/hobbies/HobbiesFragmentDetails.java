package com.example.termproject_portfolioapp.hobbies;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.termproject_portfolioapp.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class HobbiesFragmentDetails extends BottomSheetDialogFragment {

    private ImageView imgHobbies;
    private TextView title,description;




    public HobbiesFragmentDetails() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hobbies_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imgHobbies = view.findViewById(R.id.hobbies_detail_img);
        title = view.findViewById(R.id.hobbies_details_title);
        description = view.findViewById(R.id.hobbies_details_desc);



        Bundle bundle = getArguments();
        HobbiesItem item = (HobbiesItem) bundle.getSerializable("object");

        loadHobbiesData(item);
    }

    void loadHobbiesData(HobbiesItem item){
        Glide.with(getContext()).load(item.getImage()).into(imgHobbies);


    }
}