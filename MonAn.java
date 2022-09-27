package com.example.bttaoapptonghop;

public class MonAn {
    public String tenmon;
    public String mota;
    public int hinh;
    public String gia;


    public MonAn(String tenmon, String mota, int hinh, String gia) {
        this.tenmon = tenmon;
        this.mota = mota;
        this.hinh = hinh;
        this.gia = gia;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
}
