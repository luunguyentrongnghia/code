package com.example.baitaplistviewtrongnghia;

public class Item {
    private String mName,information;
    private int mImage;

    public Item(String mName,String information, int mImage) {
        this.mName = mName;
        this.information=information;
        this.mImage = mImage;

    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }


}
