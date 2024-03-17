package com.example.matala2.activity;


import com.example.matala2.R;

import java.util.Arrays;
import java.util.List;

public class ProductData {

    public static final List<Product> PRODUCTS = Arrays.asList(
            new Product("gfx100", "2650$", R.drawable.gfx100, 0),
            new Product("gfx100ii", "3000$", R.drawable.gfx100ii, 1),
            new Product("gfx100s", "1540$", R.drawable.gfx100s, 2),
            new Product("gfx50r", "4670$", R.drawable.gfx50r, 3),
            new Product("gfx_50s", "6500$", R.drawable.gfx_50s, 4)
    );

    public static List<Product> getProducts() {
        return PRODUCTS;
    }

    public static class Product {
        private String name;
        private String price;
        private int image;
        private int id;

        public Product(String name, String price, int image, int id) {
            this.name = name;
            this.price = price;
            this.image = image;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public String getPrice() {
            return price;
        }

        public int getImage() {
            return image;
        }

        public int getId() {
            return id;
        }
    }
}
