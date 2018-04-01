package com.example.android.musicboxproject;

public class Song {

    private String mName;
    private String mBandName;
    private int mImageResourceId= 0;
    private String mPublishedDate;
    private String mLength;

    public Song(String mName, String mBandName, String mPublishedDate, String length) {
        this.mName = mName;
        this.mBandName = mBandName;
        this.mPublishedDate = mPublishedDate;
        this.mLength = length;
    }

    public String getmName() {
        return mName;
    }

    public String getmBandName() {
        return mBandName;
    }


    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getLength() {
        return mLength;

    }

    public String getmPublishedDate() {
        return mPublishedDate;
    }

}


