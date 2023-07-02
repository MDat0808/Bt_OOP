package main.java.myclass;

public class Screen {
    private String maManHinh, loaiManHinh, doPhanGiai, hangSanXuat;
    private int tieuChuan;
    private double donGia;

    public Screen(String maManHinh, String loaiManHinh, String hangSanXuat, String doPhanGiai, int tieuChuan) {
        this.maManHinh = maManHinh;
        this.loaiManHinh = loaiManHinh;
        this.hangSanXuat = hangSanXuat;
        this.doPhanGiai = doPhanGiai;
        this.tieuChuan = tieuChuan;
        this.donGia = tinhGiaTien(loaiManHinh);
    }

    public String getMaManHinh() {
        return maManHinh;
    }

    public void setMaManHinh(String maManHinh) {
        this.maManHinh = maManHinh;
    }

    public String getLoaiManHinh() {
        return loaiManHinh;
    }

    public void setLoaiManHinh(String loaiManHinh) {
        this.loaiManHinh = loaiManHinh;
    }

    public String getDoPhanGiai() {
        return doPhanGiai;
    }

    public void setDoPhanGiai(String doPhanGiai) {
        this.doPhanGiai = doPhanGiai;
    }

    public int getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(int tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double tinhGiaTien(String loai) {
        double price = 0;

        switch (loai) {
            case "guong":
                price = 1000;
                break;
            case "chong loa":
                switch (this.tieuChuan) {
                    case 1:
                        price = 2000;
                        break;
                    case 2:
                        price = 3000;
                        break;
                    case 3:
                        price = 4000;
                        break;
                    default:
                        break;
                }

                break;
            default:
                break;
        }
        return price;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

}
