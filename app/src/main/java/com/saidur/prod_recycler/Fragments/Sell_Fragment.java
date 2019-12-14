package com.saidur.prod_recycler.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saidur.prod_recycler.Adapter.AdapterSell;
import com.saidur.prod_recycler.Model.Data_sell;
import com.saidur.prod_recycler.R;

import java.util.ArrayList;

public class Sell_Fragment extends Fragment {
    RecyclerView rvDrink;
    AdapterSell mAdapter;
    String sell_food[]={"food1","food2","food3"};
    String price[]={"500","1000","300"};
    int img[]={R.drawable.product_icon_5,R.drawable.product_icon_3,R.drawable.product_icon_2};
    public Sell_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_sell, container, false);
        rvDrink = v.findViewById(R.id.rvDrink);
        rvDrink.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvDrink.setLayoutManager(layoutManager);

        ArrayList<Data_sell> datasell_food = getData();

        mAdapter = new AdapterSell(datasell_food,getActivity());
        rvDrink.setAdapter(mAdapter);

        return v;
    }

    private ArrayList<Data_sell> getData() {
        ArrayList<Data_sell> dataSells = new ArrayList<>();
        for (int i = 0; i<sell_food.length;i++){
            Data_sell sells = new Data_sell();
            sells.setsellName(sell_food[i]);
            sells.setPrice(price[i]);
            sells.setImg(img[i]);
            dataSells.add(sells);
        }
        return dataSells;
    }

}
