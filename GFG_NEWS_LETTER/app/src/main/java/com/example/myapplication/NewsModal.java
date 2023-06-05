package com.example.myapplication;

import java.util.ArrayList;

public class NewsModal {
    private int totalresult ;
    private String status;
    private ArrayList<Articles> articles;

    public NewsModal(int totalresult, String status, ArrayList<Articles> articles) {
        this.totalresult = totalresult;
        this.status = status;
        this.articles = articles;
    }

    public int getTotalresult() {
        return totalresult;
    }

    public void setTotalresult(int totalresult) {
        this.totalresult = totalresult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Articles> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Articles> articles) {
        this.articles = articles;
    }
}
