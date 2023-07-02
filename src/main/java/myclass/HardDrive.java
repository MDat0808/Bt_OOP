package main.java.myclass;

public class HardDrive {
    private String ma, loai;
    private int dungLuong, soVongQuay, tocDoDoc, tocDoGhi;
    private double donGia;

    public HardDrive(String ma, String loai, int dungLuong) {
        this.ma = ma;
        this.loai = loai;
        this.dungLuong = dungLuong;
        this.donGia = tinhGiaTien(loai);
    }

    public int getSoVongQuay() {
        return soVongQuay;
    }

    public void setSoVongQuay(int soVongQuay) {
        this.soVongQuay = soVongQuay;
    }

    public int getTocDoDoc() {
        return tocDoDoc;
    }

    public void setTocDoDoc(int tocDoDoc) {
        this.tocDoDoc = tocDoDoc;
    }

    public int getTocDoGhi() {
        return tocDoGhi;
    }

    public void setTocDoGhi(int tocDoGhi) {
        this.tocDoGhi = tocDoGhi;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getString() {
        String result = (loai.startsWith("HDD") ? "So vong quay " + soVongQuay
                : " Toc do doc: " + tocDoDoc + " \n Toc do ghi  " + tocDoGhi);
        return result;
    }

    private double tinhGiaTien(String loai) {
        double price;
        switch (loai) {
            case "HDD":

                price = this.dungLuong * 100;
                break;
            case "SSD":
                price = this.dungLuong * 200;
                break;
            default:
                price = 0; // Giá tiền mặc định nếu không xác định được loại CPU
                break;
        }

        return price;
    }

}
