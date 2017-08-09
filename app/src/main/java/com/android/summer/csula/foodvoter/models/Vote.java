package com.android.summer.csula.foodvoter.models;

/**
 * Created by Haiyan on 8/5/17.
 */

public class Vote {
    private String userId;
    private String businessName;

    public Vote() {}

    public Vote(String id, String businessName) {
        this.userId = id;
        this.businessName = businessName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }
}
