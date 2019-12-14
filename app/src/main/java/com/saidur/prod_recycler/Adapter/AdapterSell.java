package com.saidur.prod_recycler.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.saidur.prod_recycler.Model.Data_sell;
import com.saidur.prod_recycler.R;

import java.util.ArrayList;

public class AdapterSell extends RecyclerView.Adapter<AdapterSell.ViewHolder> {
    ArrayList<Data_sell> sellList;
    Context context;

    public AdapterSell(ArrayList<Data_sell> sellList, Context context) {
        this.sellList = sellList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sell_items,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.foodname.setText(sellList.get(i).getsellName());
        viewHolder.price.setText("Taka."+sellList.get(i).getPrice());
        viewHolder.img.setImageResource(sellList.get(i).getImg());
    }

    @Override
    public int getItemCount() {
        return sellList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView foodname,price;
        public ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodname    = itemView.findViewById(R.id.tvNameFood);
            price       = itemView.findViewById(R.id.tvPrice);
            img         = itemView.findViewById(R.id.img);
        }
    }


}
