package main.java.myclass;

import java.util.List;

import main.java.myclass.CPU;
import main.java.myclass.RAM;
import main.java.myclass.HardDrive;
import main.java.myclass.Screen;

public class Laptop {
    private String maSanPham, tenSanPham, dongSanPham;
    double donGia;
    private CPU cpu;
    private RAM Ram;
    private HardDrive oCung;
    private Screen manHinh;

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return Ram;
    }

    public void setRam(RAM ram) {
        Ram = ram;
    }

    public HardDrive getoCung() {
        return oCung;
    }

    public void setoCung(HardDrive oCung) {
        this.oCung = oCung;
    }

    public String getDongSanPham() {
        return dongSanPham;
    }

    public void setDongSanPham(String dongSanPham) {
        this.dongSanPham = dongSanPham;
    }

    public Screen getManHinh() {
        return manHinh;
    }

    public void setManHinh(Screen manHinh) {
        this.manHinh = manHinh;
    }

    public Laptop(String maSanPham, String tenSanPham, String dongSanPham, CPU cpu, RAM ram, HardDrive oCung,
            Screen manHinh) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.dongSanPham = dongSanPham;
        this.donGia = cpu.getDonGia() + ram.getDonGia() + oCung.getDonGia() + manHinh.getDonGia();
        this.cpu = cpu;
        this.Ram = ram;
        this.oCung = oCung;
        this.manHinh = manHinh;
    }

}
