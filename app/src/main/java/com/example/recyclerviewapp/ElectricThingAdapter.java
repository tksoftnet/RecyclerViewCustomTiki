package com.example.recyclerviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ElectricThingAdapter
        extends RecyclerView.Adapter<ElectricThingAdapter.ThingViewHolder> {

    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<ElectricThing> electricThings;

    public ElectricThingAdapter(Context context,
                                ArrayList<ElectricThing> electricThings) {
        layoutInflater = LayoutInflater.from(context);
        this.electricThings = electricThings;
    }

    @NonNull
    @Override
    public ElectricThingAdapter.ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = layoutInflater
                .inflate(R.layout.item_recylerview, parent, false);
        return new ThingViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(
            @NonNull ElectricThingAdapter.ThingViewHolder holder,
                                 int position) {
        ElectricThing electricThing = electricThings.get(position);
        holder.tvName.setText(electricThing.getName());
        holder.tvNewPrice.setText(String.valueOf(electricThing.getNewPrice()));
        holder.tvPeopleRate.setText(String.valueOf(electricThing.getPeopleRate()));
        holder.tvReducePercent.setText(String.valueOf(electricThing.getReducePercent()));

        holder.imgThing.setImageResource(electricThing.getImageThing());
        holder.rtBar.setRating(electricThing.getRate());
        }

    @Override
    public int getItemCount() {
        return electricThings.size();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder{

        TextView tvName, tvNewPrice, tvReducePercent, tvPeopleRate;
        ImageView imgThing;
        RatingBar rtBar;

        ElectricThingAdapter electricThingAdapter;

        public ThingViewHolder(@NonNull View itemView,
                               ElectricThingAdapter adapter) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvNewPrice = itemView.findViewById(R.id.tvnewPrice);
            tvReducePercent = itemView.findViewById(R.id.tvreducePercent);
            tvPeopleRate = itemView.findViewById(R.id.tvrpeopleRate);
            imgThing = itemView.findViewById(R.id.imgThing);
            rtBar = itemView.findViewById(R.id.rtBar);

            this.electricThingAdapter = adapter;

        }
    }
}
