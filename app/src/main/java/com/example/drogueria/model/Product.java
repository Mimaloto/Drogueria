package com.example.drogueria.model;


    public class Product {
        private String name;
        private String price;
        private int imageResourceId;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        private String id;

        public Product(String name, String price, int imageResourceId) {
            this.name = name;
            this.price = price;
            this.imageResourceId = imageResourceId;
        }

        public String getName() {
            return name;
        }

        public String getPrice() {
            return price;
        }

        public int getImageResourceId() {
            return imageResourceId;
        }
    }
