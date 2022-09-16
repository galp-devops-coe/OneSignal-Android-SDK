package com.onesignal;

import org.json.JSONArray;
import org.json.JSONObject;

public class OSNotificationIntentExtras {

    public JSONArray dataArray;
    public JSONObject jsonData;

    OSNotificationIntentExtras(JSONArray dataArray, JSONObject jsonData) {
        this.dataArray = dataArray;
        this.jsonData = jsonData;
    }

}
