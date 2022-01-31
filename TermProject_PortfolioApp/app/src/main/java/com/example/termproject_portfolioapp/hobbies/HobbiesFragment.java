package com.example.termproject_portfolioapp.hobbies;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.termproject_portfolioapp.R;
import com.example.termproject_portfolioapp.R.drawable;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HobbiesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HobbiesFragment extends Fragment implements HobbiesCallBack {

    List<HobbiesItem> mdata;
    RecyclerView rv_hobbies;
    HobbiesAdapter hobbiesAdapter;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HobbiesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HobbiesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static HobbiesFragment newInstance(String param1, String param2) {
        HobbiesFragment fragment = new HobbiesFragment();
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
        return inflater.inflate(R.layout.fragment_hobbies, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv_hobbies = view.findViewById(R.id.rv_hobbies);

        mdata = new ArrayList<>();

        mdata.add(new HobbiesItem(drawable.hobbies0));
        mdata.add(new HobbiesItem(drawable.hobbies9));
        mdata.add(new HobbiesItem(drawable.hobbies2));
        mdata.add(new HobbiesItem(drawable.hobbies3));
        mdata.add(new HobbiesItem(drawable.hobbies4));
        mdata.add(new HobbiesItem(drawable.hobbies5));
        mdata.add(new HobbiesItem(drawable.hobbies6));
        mdata.add(new HobbiesItem(drawable.hobbies7));
        mdata.add(new HobbiesItem(drawable.hobbies8));

        hobbiesAdapter = new HobbiesAdapter(mdata, this);

        rv_hobbies.setLayoutManager(new GridLayoutManager(getActivity(),3));
        rv_hobbies.setAdapter(hobbiesAdapter);

    }

    @Override
    public void onHobbiesItemClick(int pos) {

        HobbiesFragmentDetails hobbiesFragmentDetails = new HobbiesFragmentDetails();

        Bundle bundle =  new Bundle();
        bundle.putSerializable("object", mdata.get(pos));

        hobbiesFragmentDetails.setArguments(bundle);

        hobbiesFragmentDetails.show(getActivity().getSupportFragmentManager(),"tagname");




    }
}