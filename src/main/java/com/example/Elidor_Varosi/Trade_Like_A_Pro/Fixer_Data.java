package com.example.Elidor_Varosi.Trade_Like_A_Pro;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Fixer_Data {
    private String base;
    private String date;
    private Long timestamp;
    private boolean success;
    public Object rates;//The problem is that I am not finding any way top use this object data's to make the conversion of currencies

    public Object getRates() {
        return rates;
    }

    public void setRates(Object rates) {
        this.rates = rates;
    }


    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    @Override
    public String toString() {
        return "Connected to the server:  "+isSuccess()+"\n"
                +"These are the latest LIVE convertion rates:  "+"\n"+"for today"+getDate()+"\n"+rates+"";


    }

}
