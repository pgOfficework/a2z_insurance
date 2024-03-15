package com.a2z.insurance.test;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{\"name\": \"John\", \"age\": 30, \"city\": \"New York\"}";

        try {
            JSONObject jsonObject = new JSONObject(new JSONTokener(jsonString));
            String prettyJsonString = jsonObject.toString(3); // 4 is the number of spaces for indentation
            System.out.println(prettyJsonString);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}