package com.example.termproject_portfolioapp.education;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.termproject_portfolioapp.R;
import com.example.termproject_portfolioapp.cv.CVItem;

import java.util.List;

public class EducationAdapter extends RecyclerView.Adapter<EducationAdapter.EducationViewHolder> {
    List<CVItem> mdata;

    public EducationAdapter(List<CVItem> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public EducationAdapter.EducationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_education,parent,false);
        return new EducationAdapter.EducationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EducationAdapter.EducationViewHolder holder, int position) {

        holder.tvTitle.setText(mdata.get(position).getTitle());
        holder.tvDescription.setText(mdata.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class EducationViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle,tvDescription;
        public EducationViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.item_education_title);
            tvDescription = itemView.findViewById(R.id.item_education_desc);
        }
    }
}
