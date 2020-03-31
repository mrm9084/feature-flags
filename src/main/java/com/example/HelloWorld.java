package com.example;

import java.io.IOException;
import java.util.HashMap;

import com.example.feature.filters.PercentageFilter;

public class HelloWorld {

    public static void main(String[] args) throws IOException {
        String connectionString = "yourConnectionString";
        HashMap<String, FeatureFilter> featureFilters = new HashMap<String, FeatureFilter>();
        featureFilters.put("percentageFilter", new PercentageFilter());
        FeatureManager featureManager = new FeatureManager(connectionString, featureFilters);
        
        if (featureManager.isEnabledAsync("Beta").block()) {
            System.out.println("Hello World");
        } else {
            System.out.println("Bye World");
        }
    }

}
