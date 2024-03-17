package com.example.matala2.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.matala2.R;
import com.example.matala2.activity.ProductAdapter;
import com.example.matala2.activity.ProductData;

import java.util.List;


public class ProductFragment extends Fragment {

    private RecyclerView recyclerView;
    private ProductAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_product, container, false);

        // איתור רכיבים
        recyclerView = view.findViewById(R.id.res);

        // יצירת רשימת מוצרים
        List<ProductData.Product> products = ProductData.PRODUCTS;

        // יצירת מתאם
        adapter = new ProductAdapter(products);

        // הגדרת מתאם ל-RecyclerView
        recyclerView.setAdapter(adapter);

        return view;
    }
}
