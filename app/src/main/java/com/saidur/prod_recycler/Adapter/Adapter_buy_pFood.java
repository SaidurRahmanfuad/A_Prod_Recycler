package com.saidur.prod_recycler.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.saidur.prod_recycler.Model.Data_buy;
import com.saidur.prod_recycler.R;

import java.util.List;

public class Adapter_buy_pFood extends RecyclerView.Adapter<Adapter_buy_pFood.ViewHolder> {
    private List<Data_buy> foodList;
    private Context context;

    public Adapter_buy_pFood(List<Data_buy> foodList, Context context) {
        this.foodList = foodList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_popular_buy_item,viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.foodname.setText(foodList.get(i).getFoodName());
        viewHolder.price.setText("Taka."+foodList.get(i).getPrice());

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView foodname,price;
        ImageView foodimage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodname    = itemView.findViewById(R.id.tvNameFood);
            price       = itemView.findViewById(R.id.tvPrice);
            foodimage = itemView.findViewById(R.id.img);
        }
    }
}
