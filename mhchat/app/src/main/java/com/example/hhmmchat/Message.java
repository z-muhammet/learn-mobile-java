package com.example.hhmmchat;


public class Message {

    String mesajText;
    String gonderici;
    String zaman;
    String star;

    public Message() {
    }

    public Message(String mesajText, String gonderici, String zaman,String star) {
        this.mesajText = mesajText;
        this.gonderici = gonderici;
        this.zaman = zaman;
        this.star = star;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getMesajText() {
        return mesajText;
    }

    public void setMesajText(String mesajText) {
        this.mesajText = mesajText;
    }

    public String getGonderici() {
        return gonderici;
    }

    public void setGonderici(String gonderici) {
        this.gonderici = gonderici;
    }

    public String getZaman() {
        return zaman;
    }

    public void setZaman(String zaman) {
        this.zaman = zaman;
    }
}

