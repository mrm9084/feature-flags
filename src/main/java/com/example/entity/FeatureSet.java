/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.example.entity;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureSet {

    @JsonProperty("FeatureManagement")
    private HashMap<String, Object> featureManagement;

    /**
     * @return the featureManagement
     */
    public HashMap<String, Object> getFeatureManagement() {
        return featureManagement;
    }
    
    public void addFeature(String key, Object feature) {
        if (featureManagement == null) {
            featureManagement = new HashMap<String, Object>();
        }
        if (feature != null) {
            featureManagement.put(key, feature);
        }
    }
}
