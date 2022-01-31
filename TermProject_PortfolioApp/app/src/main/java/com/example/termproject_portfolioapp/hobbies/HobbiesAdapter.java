package com.example.termproject_portfolioapp.hobbies;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.termproject_portfolioapp.R;

import java.util.List;

public class HobbiesAdapter extends RecyclerView.Adapter<HobbiesAdapter.HobbiesViewHolder> {

    List<HobbiesItem> mdata;
    HobbiesCallBack listener;

    public HobbiesAdapter(List<HobbiesItem> mdata, HobbiesCallBack listener ) {

        this.mdata = mdata;
        this.listener = listener;
    }


    @NonNull
    @Override
    public HobbiesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hobbies,parent,false);

        return new HobbiesViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull HobbiesViewHolder holder, int position) {

        Glide.with(holder.itemView.getContext()).load(mdata.get(position).getImage()).into(holder.imgport);


    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class HobbiesViewHolder extends RecyclerView.ViewHolder {

        ImageView imgport;


        public HobbiesViewHolder(@NonNull View itemView) {
            super(itemView);

            imgport = itemView.findViewById(R.id.item_hobbie_img);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onHobbiesItemClick(getAdapterPosition());
                }
            });
        }
    }
}
