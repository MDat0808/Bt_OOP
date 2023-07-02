package main.java.myclass;

public class CPU {
    private String maCPU;
    private String loaiCPU; // core i3, i5, i7
    private double donGia;

    public CPU(String maCPU, String loaiCPU) {
        this.maCPU = maCPU;
        this.loaiCPU = loaiCPU;
        this.donGia = tinhGiaTien(loaiCPU);
    }

    public String getMaCPU() {
        return maCPU;
    }

    public void setMaCPU(String maCPU) {
        this.maCPU = maCPU;
    }

    public String getLoaiCPU() {
        return loaiCPU;
    }

    public void setLoaiCPU(String loaiCPU) {
        this.loaiCPU = loaiCPU;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    private double tinhGiaTien(String loaiCPU) {
        double price;
        switch (loaiCPU) {
            case "core i3":
                price = 100;
                break;
            case "core i5":
                price = 200;
                break;
            case "core i7":
                price = 300;
                break;
            default:
                price = 0; // Giá tiền mặc định nếu không xác định được loại CPU
                break;
        }

        return price;
    }
}
