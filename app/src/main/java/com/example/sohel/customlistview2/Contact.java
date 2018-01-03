package com.example.sohel.customlistview2;

/**
 * Created by sohel on 2/7/2017.
 */

public class Contact {

    int mImage;
    String mName;
    String mCell;
    String mEmail;
    String mAddress;

    public Contact(){

    }

    public Contact(int mImage, String mName, String mCell, String mEmail, String mAddress) {
        this.mImage = mImage;
        this.mName = mName;
        this.mCell = mCell;
        this.mEmail = mEmail;
        this.mAddress = mAddress;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmCell() {
        return mCell;
    }

    public void setmCell(String mCell) {
        this.mCell = mCell;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }
}



