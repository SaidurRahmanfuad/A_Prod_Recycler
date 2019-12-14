package com.saidur.prod_recycler.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.saidur.prod_recycler.Adapter.Adapter_buy_mFood;
import com.saidur.prod_recycler.Adapter.Adapter_buy_pFood;
import com.saidur.prod_recycler.Model.Data_buy;
import com.saidur.prod_recycler.R;

import java.util.ArrayList;

public class Buy_Fragment extends Fragment {

    RecyclerView rvPopularFood,rvMoreFood;
    Adapter_buy_pFood mAdapter;
    Adapter_buy_mFood mAdapter2;
    String foods[]={"food1","food1"};
    String price[]={"5000","10000"};

    public Buy_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_buy, container, false);

        rvPopularFood   = v.findViewById(R.id.rvPopularFood);
        rvMoreFood      = v.findViewById(R.id.rvMoreFood);

        rvPopularFood.setHasFixedSize(true);
        rvMoreFood.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        rvPopularFood.setLayoutManager(layoutManager);

        RecyclerView.LayoutManager layoutManager2 = new LinearLayoutManager(getActivity());
        rvMoreFood.setLayoutManager(layoutManager2);

        ArrayList<Data_buy> dataBuys = getData();

        mAdapter = new Adapter_buy_pFood(dataBuys,getActivity());
        rvPopularFood.setAdapter(mAdapter);

        mAdapter2 = new Adapter_buy_mFood(dataBuys,getActivity());
        rvMoreFood.setAdapter(mAdapter2);
        return v;
    }

    private ArrayList<Data_buy> getData() {
        ArrayList<Data_buy> foodArrayList = new ArrayList<>();
        for (int i = 0; i<foods.length;i++){
            Data_buy dataBuy = new Data_buy();
            dataBuy.setFoodName(foods[i]);
            dataBuy.setPrice(price[i]);
            foodArrayList.add(dataBuy);
        }
        return foodArrayList;
    }
}
