package com.example.szidonialaszlo.statusproject;

/**
 * Created by szidonia.laszlo on 2017. 10. 30..
 */

public class Status {

    private String statusName;
    private int statusId;

    public Status(String n,int id){
        this.statusName=n;
        this.statusId= id;
    }

    public String getStatusName(){
        return this.statusName;
    }

    public int getStatusId(){
        return this.statusId;
    }
}
