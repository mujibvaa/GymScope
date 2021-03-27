package com.techiesatelier.gymscope;

public class model {

    String Details,Name,Rate,purl;

    public model() {
    }

    public model(String details, String name, String rate, String purl) {
        Details = details;
        Name = name;
        Rate = rate;
        this.purl = purl;
    }


    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRate() {
        return Rate;
    }

    public void setRate(String rate) {
        Rate = rate;
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl;
    }
}
