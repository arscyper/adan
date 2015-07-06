package com.app.cons.v1;

import com.app.util.MathUtil;

/**
 * Created by AR001AF on 11/26/2014.
 */
public class Prayer {

    private double time;
    private String name;
    private String arName;

    public double getTime() {
        return time;
    }

    public String getTimeString24(){
        return MathUtil.getTime24(time);
    }

    public String getTimeString12(){
        return MathUtil.getTime12(time);
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArName() {
        return arName;
    }

    public void setArName(String arName) {
        this.arName = arName;
    }

    @Override
    public String toString() {
        return "Prayer{" +
                "time=" + time +
                ", name='" + name + '\'' +
                ", arName='" + arName + '\'' +
                ", timeString='" + getTimeString12() + '\'' +
                '}';
    }
}
