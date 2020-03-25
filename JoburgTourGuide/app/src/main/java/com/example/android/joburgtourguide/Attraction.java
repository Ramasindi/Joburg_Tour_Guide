package com.example.android.joburgtourguide;

public class Attraction {

    private String mAttractionName;
    private String mWebsite;
    private int mImageResourceId;

    /**
     * @param attractionName it the name of an attraction
     * @param website it is the website that the user can find more about the attraction
     * @param imageResourceId it is the resource id for an image of the attraction
     * */

    public Attraction(String attractionName,String website,int imageResourceId){
        mAttractionName = attractionName;
        mWebsite = website;
        mImageResourceId = imageResourceId;
    }

    /**
     *Returns the attraction name
     */
    public String getmAttractionName(){
        return mAttractionName;
    }
    /**
     * Returns the attraction website
     * */
    public String getmWebsite(){
        return mWebsite;
    }
    /**
     * Returns the resource id for the attraction image
     * */
    public int getmImageResourceId(){
        return mImageResourceId;
    }

}
