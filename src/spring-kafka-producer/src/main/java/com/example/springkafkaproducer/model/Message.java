package com.example.springkafkaproducer.model;


public class Message {
    private String baslik;

    private String isim;

    private String yas;

    private String mesaj;

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public String toString() {
        return "Message{" +
                "baslik='" + baslik + '\'' +
                ", isim='" + isim + '\'' +
                ", yas='" + yas + '\'' +
                ", mesaj='" + mesaj + '\'' +
                '}';
    }
}