package main.java.myclass;

import java.util.ArrayList;
import java.util.List;

public class RAM {
    private String loaiRam;
    private List<String> maRamList = new ArrayList<>();
    private int dungLuong, soThanhRam;
    private double donGia;

    public int getSoThanhRam() {
        return soThanhRam;
    }

    public void setSoThanhRam(int soThanhRam) {
        this.soThanhRam = soThanhRam;
    }

    public RAM(List<String> maRam, String loaiRam, int dungLuong, int soThanhRam) {
        this.maRamList = maRam;
        this.loaiRam = loaiRam;
        this.dungLuong = dungLuong;
        this.soThanhRam = soThanhRam;
        this.donGia = tinhGiaTien(loaiRam);
    }

    public List<String> getMaRam() {
        return maRamList;
    }

    public void setMaRam(List<String> maRam) {
        this.maRamList = maRam;
    }

    public String getLoaiRam() {
        return loaiRam;
    }

    public void setLoaiRam(String loaiRam) {
        this.loaiRam = loaiRam;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    private double tinhGiaTien(String loaiRam) {
        double price;
        switch (loaiRam) {
            case "DDR3":
                price = this.soThanhRam * this.dungLuong * 100;
                break;
            case "DDR4":
                price = this.soThanhRam * this.dungLuong * 200;
                break;
            default:
                price = 0; // Giá tiền mặc định nếu không xác định được loại CPU
                break;
        }

        return price;
    }

    public List<String> getMaRamList() {
        return maRamList;
    }

    public void setMaRamList(List<String> maRamList) {
        this.maRamList = maRamList;
    }

}
