package com.example.matala2.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.matala2.R;

import java.util.List;


    public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>
    {

        private List<ProductData.Product> productList;

        public ProductAdapter(List<ProductData.Product> productList)
        {
            this.productList = productList;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_product, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position)
        {
            ProductData.Product product = productList.get(position);

            holder.productNameTextView.setText(product.getName());
            holder.productPriceTextView.setText(product.getPrice());
            holder.imageView.setImageResource(product.getImage());

        }

        @Override
        public int getItemCount()
        {
            return productList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder
        {

            private TextView productNameTextView;
            private TextView productPriceTextView;
            private ImageView imageView;

            public ViewHolder(View itemView)
            {
                super(itemView);

                productNameTextView = itemView.findViewById(R.id.textView2);
                productPriceTextView = itemView.findViewById(R.id.textView3);
                imageView = itemView.findViewById(R.id.imageView);
            }
        }
    }