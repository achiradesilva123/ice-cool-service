package com.tetranyde.icecool.service.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.tetranyde.icecool.service.enums.FlavorsType.*;

public class  FillingType {

    public enum fillingType {
        Sprinkles,
        Toasted_Marshmallow,
        Toasted_Almond_Flakes,
        Dash_Of_Peanut_Butter,
        Oreo_Crumbles,
        Dried_Fruit;
    }
    public enum Sprinkles{

        Sprinkles (50.00);
        private List<String> availability = new ArrayList<>(Arrays.asList(Raspberry_Slushy.name(), Nutty_Fruit.name()));

        private double price;

        Sprinkles() {
        }

        Sprinkles(double v) {
            this.price = v;
        }

        public double getValue(){
            return price;
        }

        public List<String> getAvailability() {
            return availability;
        }
    }


    public enum Toasted_Marshmallow{

        Toasted_Marshmallow (100.00);
        final List<String> availability = new ArrayList<>(Arrays.asList(Raspberry_Slushy.name(), Nutty_Fruit.name(), Pistachio_Delight.name()));

        private double price;

        Toasted_Marshmallow() {
        }

        Toasted_Marshmallow(double v) {
            this.price = v;
        }

        public double getValue(){
            return price;
        }

        public List<String> getAvailability() {
            return availability;
        }
    }

    public enum Toasted_Almond_Flakes{

        Toasted_Almond_Flakes (150.00);
        final List<String> availability = new ArrayList<>(Arrays.asList(Nutty_Fruit.name(),Coco_Coffee.name(),Pistachio_Delight.name()));

        private double price;

        Toasted_Almond_Flakes() {
        }

        Toasted_Almond_Flakes(double v) {
            this.price = v;
        }

        public double getValue(){
            return price;
        }

        public List<String> getAvailability() {
            return availability;
        }
    }

    public enum Dash_Of_Peanut_Butter{

        Dash_Of_Peanut_Butter (50.00);
        final List<String> availability = new ArrayList<>(Arrays.asList(Raspberry_Slushy.name(), Nutty_Fruit.name(),Coco_Coffee.name(),Pistachio_Delight.name()));

        private double price;

        Dash_Of_Peanut_Butter() {
        }

        Dash_Of_Peanut_Butter(double v) {
            this.price = v;
        }

        public double getValue(){
            return price;
        }

        public List<String> getAvailability() {
            return availability;
        }
    }

    public enum Oreo_Crumbles{

        Oreo_Crumbles (60.00);
        final List<String> availability = new ArrayList<>(Arrays.asList(Raspberry_Slushy.name(), Nutty_Fruit.name(),Coco_Coffee.name(),Pistachio_Delight.name()));

        private double price;

        Oreo_Crumbles() {
        }

        Oreo_Crumbles(double v) {
            this.price = v;
        }

        public double getValue(){
            return price;
        }

        public List<String> getAvailability() {
            return availability;
        }
    }

    public enum Dried_Fruit{

        Dried_Apples (25.00),
        Dried_Mango (30.00),
        Dried_Apricot (40.00),
        Dried_Blueberry (45.00);


        final List<String> availability = new ArrayList<>(Arrays.asList(Raspberry_Slushy.name(), Nutty_Fruit.name()));

        private double price;

        Dried_Fruit() {
        }

        Dried_Fruit(double v) {
            this.price = v;
        }

        public double getValue(){
            return price;
        }

        public List<String> getAvailability() {
            return availability;
        }
    }

}
