package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import main.java.myclass.CPU;
import main.java.myclass.HardDrive;
import main.java.myclass.Laptop;
import main.java.myclass.RAM;
import main.java.myclass.Screen;

public class mainBT {
    static Scanner sc = new Scanner(System.in);

    public static void inputLaptop(ArrayList<Laptop> list) {
        int n, dongSanPham, soThanhRam, loaiThanhRam, loaiOCung, tieuChuan;
        String maSanPham, tenSanPham;
        String maCPU, ram1, ram2;
        String maManHinh, loaiManHinh, hangSanXuat, doPhanGiai;
        String maOCung;
        int dungLuongOCung, dungLuongRam, tocDoGhi = 0, tocDoDoc = 0, soVongQuay = 0;
        List<String> maRamList = new ArrayList<>();

        System.out.printf("Nhap so luong laptop:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Nhap thong so laptop thu %d: ", i);
            System.out.printf("Dong laptop hien co: 1 - Butterfly, 2 - Fly, 3 - Bee: ");
            dongSanPham = sc.nextInt();
            System.out.printf("Ban vua chon dong laptop %d \n", dongSanPham);
            System.out.printf("Ma laptop : ");
            maSanPham = sc.next();
            System.out.printf("Ten laptop: ");
            tenSanPham = sc.next();
            System.out.println("Dong ma \n");
            System.out.printf("CPU: \n Nhap ma CPU: ");
            maCPU = sc.next();
            System.out.printf("RAM: \n So thanh RAM (1- 1 thanh, 2- 2 thanh) : ");
            soThanhRam = sc.nextInt();
            System.out.printf(" Loai RAM (1 - DDR3, 2 - DDR4) : ");
            loaiThanhRam = sc.nextInt();
            if (soThanhRam == 1) {
                System.out.printf(" Ma RAM; ");
                ram1 = sc.next();
                maRamList.add(ram1);
            } else {
                System.out.printf(" Ma RAM1: ");
                ram1 = sc.next();
                System.out.printf(" Ma RAM2: ");
                ram2 = sc.next();
                maRamList.add(ram1);
                maRamList.add(ram2);
            }
            System.out.printf(" Dung luong Ram: ");
            dungLuongRam = sc.nextInt();
            System.out.printf("Man hinh: \n Ma man hinh:  ");
            maManHinh = sc.next();
            System.out.printf(" Hang san xuat: ");
            hangSanXuat = sc.next();
            System.out.printf(" Loai man hinh: ");
            loaiManHinh = sc.next();
            System.out.printf(" Do phan giai: ");
            doPhanGiai = sc.next();
            System.out.printf(" Tieu chuan va cham (1 - t.chuan 1, 2 - t.chuan 2, 3 - t.chuan 3 : )");
            tieuChuan = sc.nextInt();
            System.out.printf("O Cung: \n Loai o cung ( 1 - HHD, 2 - SSD) : ");
            loaiOCung = sc.nextInt();
            System.out.printf(" Ma o cung: ");
            maOCung = sc.next();
            System.out.printf(" Dung luong: ");
            dungLuongOCung = sc.nextInt();
            if (dongSanPham == 1 || loaiOCung == 2) {
                System.out.printf("Toc do doc: ");
                tocDoDoc = sc.nextInt();
                System.out.printf("Toc do ghi: ");
                tocDoGhi = sc.nextInt();
            } else {
                System.out.printf("So vong quay: ");
                soVongQuay = sc.nextInt();
            }

            // Kiem ra dong laptop
            if (dongSanPham == 1) {
                CPU cpu = new CPU(maCPU, "core i7");
                Screen screen = new Screen(maManHinh, "chong loa", hangSanXuat, loaiManHinh, tieuChuan);
                HardDrive oCung = new HardDrive(maOCung, "SSD", dungLuongOCung);
                oCung.setSoVongQuay(soVongQuay);
                oCung.setTocDoDoc(tocDoDoc);
                oCung.setTocDoGhi(tocDoGhi);
                RAM ram = new RAM(maRamList, (loaiThanhRam == 1) ? "DDR3" : "DDR4", dungLuongRam, soThanhRam);
                Laptop laptop = new Laptop(maSanPham, tenSanPham, "Butterfly", cpu, ram, oCung, screen);
                list.add(laptop);
            } else if (dongSanPham == 2) {
                CPU cpu = new CPU(maCPU, "core i5");
                Screen screen = new Screen(maManHinh, "guong", hangSanXuat, loaiManHinh, tieuChuan);
                HardDrive oCung = new HardDrive(maOCung, (loaiOCung == 1) ? "HDD" : "SSD", dungLuongOCung);
                oCung.setSoVongQuay(soVongQuay);
                oCung.setTocDoDoc(tocDoDoc);
                oCung.setTocDoGhi(tocDoGhi);
                RAM ram = new RAM(maRamList, (loaiThanhRam == 1) ? "DDR3" : "DDR4", dungLuongRam, soThanhRam);
                Laptop laptop = new Laptop(maSanPham, tenSanPham, "Fly", cpu, ram, oCung, screen);
                list.add(laptop);
            } else {
                CPU cpu = new CPU(maCPU, "core i3");
                Screen screen = new Screen(maManHinh, "guong", hangSanXuat, loaiManHinh, tieuChuan);
                HardDrive oCung = new HardDrive(maOCung, (loaiOCung == 1) ? "HDD" : "SSD", dungLuongOCung);
                oCung.setSoVongQuay(soVongQuay);
                oCung.setTocDoDoc(tocDoDoc);
                oCung.setTocDoGhi(tocDoGhi);
                RAM ram = new RAM(maRamList, (loaiThanhRam == 1) ? "DDR3" : "DDR4", dungLuongRam, soThanhRam);
                Laptop laptop = new Laptop(maSanPham, tenSanPham, "Bee", cpu, ram, oCung, screen);
                list.add(laptop);
            }
        }
    }

    public static void outputListLaptop(ArrayList<Laptop> listLaptop) {

        for (Laptop laptop : listLaptop) {
            System.out.println(
                    "Laptop: <Ma laptop>:" + laptop.getMaSanPham() + " <Dong laptop>:" + laptop.getDongSanPham()
                            + " <Gia ban>" + laptop.getDonGia());

            System.out.println(
                    "CPU :<Ma CPU>:" + laptop.getCpu().getMaCPU() + " <Loai CPU>:" + laptop.getCpu().getLoaiCPU()
                            + " <Don gia>:" + laptop.getCpu().getDonGia());
            System.out.println(
                    "RAM :<Ma RAM>:" + laptop.getRam().getMaRam() + " <Loai ram>:" + laptop.getRam().getLoaiRam()
                            + " <Dung luong>:" + laptop.getRam().getDungLuong() + "G" + " <So thanh ram>:"
                            + laptop.getRam().getSoThanhRam() + " <Don gia>: "
                            + laptop.getRam().getDonGia());
            if (laptop.getoCung().getLoai().startsWith("SSD")) {
                System.out.println(
                        "O Cung:<Ma o cung>:" + laptop.getoCung().getMa() + " <Loai o cung>:"
                                + laptop.getoCung().getLoai()
                                + " <Dung luong>:" + laptop.getoCung().getDungLuong() + "GB" + " <Toc do doc>:"
                                + laptop.getoCung().getTocDoDoc() + "MB/s"
                                + " <Toc do ghi>:" + laptop.getoCung().getTocDoGhi() + "MB/s" + " <Don gia>:"
                                + laptop.getoCung().getDonGia());

            } else {
                System.out.println(
                        "O Cung:<Ma o cung>:" + laptop.getoCung().getMa() + " <Loai o cung>:"
                                + laptop.getoCung().getLoai()
                                + " <Dung luong>:" + laptop.getoCung().getDungLuong() + "GB" + " <Toc do doc>:"
                                + laptop.getoCung().getSoVongQuay() + "rpm - vong"
                                + " <Don gia>:"
                                + laptop.getoCung().getDonGia());

            }
            if (laptop.getDongSanPham().startsWith("Butterfly")) {
                System.out.println("Man hinh: <Ma man hinh>:" + laptop.getManHinh().getMaManHinh()
                        + " <Hang san xuat>:" + laptop.getManHinh().getHangSanXuat()
                        + " <do phan giai>:" + laptop.getManHinh().getDoPhanGiai() + " <Don gia>:"
                        + laptop.getManHinh().getDonGia() + " <Chong loa>");
            } else {
                System.out.println("Man hinh: <Ma man hinh>:" + laptop.getManHinh().getMaManHinh()
                        + " <Hang san xuat>:" + laptop.getManHinh().getHangSanXuat()
                        + " <do phan giai>:" + laptop.getManHinh().getDoPhanGiai() + " <Don gia>:"
                        + laptop.getManHinh().getDonGia());
            }

        }

    }

    public static void main(String[] args) {
        ArrayList<Laptop> listLaptop = new ArrayList<Laptop>();
        int check = 0, k;

        do {
            System.out.println("Phan mem quan ly hoa don cua cong ty lap rap va kinh doanh laptop!");
            System.out.println("1. Nhap danh sach laptop voi thong tin day du.");
            System.out.println("2. Xuat thong tin tat ca laptop.");
            System.out.println("3. Luu xuong file thong tin laptop duoi dang .txt.");
            System.out.println("0. Thoat");
            System.out.println("Vui long nhap lua chon cua ban.");
            k = sc.nextInt();

            switch (k) {
                case 1:
                    inputLaptop(listLaptop);
                    break;
                case 2:
                    outputListLaptop(listLaptop);
                    break;
                case 3:
                    System.out.printf("Ban co chac muon luu file khong, 1-Yes, 2 - No :");
                    check = sc.nextInt();
                    if (check == 1) {
                        // Kiem tra file truoc khi luu file
                        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ds_laptop.txt", true))) {
                            File file = new File("ds_laptop.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }

                            writer.write("Hoa don:\n");
                            for (Laptop laptop : listLaptop) {
                                writer.write(
                                        "Laptop: <Ma laptop>:" + laptop.getMaSanPham() + " <Dong laptop>:"
                                                + laptop.getDongSanPham()
                                                + " <Gia ban>" + laptop.getDonGia() + "\n");

                                writer.write("CPU :<Ma CPU>:" + laptop.getCpu().getMaCPU() + " <Loai CPU>:"
                                        + laptop.getCpu().getLoaiCPU() + " <Don gia>:" + laptop.getCpu().getDonGia()
                                        + "\n");

                                writer.write("RAM :<Ma RAM>:" + laptop.getRam().getMaRam() + " <Loai ram>:"
                                        + laptop.getRam().getLoaiRam() + " <Dung luong>:"
                                        + laptop.getRam().getDungLuong() + "G"
                                        + " <So thanh ram>:" + laptop.getRam().getSoThanhRam() + " <Don gia>: "
                                        + laptop.getRam().getDonGia() + "\n");

                                if (laptop.getoCung().getLoai().startsWith("SSD")) {
                                    writer.write("O Cung:<Ma o cung>:" + laptop.getoCung().getMa() + " <Loai o cung>:"
                                            + laptop.getoCung().getLoai() + " <Dung luong>:"
                                            + laptop.getoCung().getDungLuong()
                                            + "GB"
                                            + " <Toc do doc>:" + laptop.getoCung().getTocDoDoc() + "MB/s"
                                            + " <Toc do ghi>:"
                                            + laptop.getoCung().getTocDoGhi() + "MB/s" + " <Don gia>:"
                                            + laptop.getoCung().getDonGia()
                                            + "\n");
                                } else {
                                    writer.write("O Cung:<Ma o cung>:" + laptop.getoCung().getMa() + " <Loai o cung>:"
                                            + laptop.getoCung().getLoai() + " <Dung luong>:"
                                            + laptop.getoCung().getDungLuong()
                                            + "GB"
                                            + " <Toc do doc>:" + laptop.getoCung().getSoVongQuay() + "rpm - vong"
                                            + " <Don gia>:" + laptop.getoCung().getDonGia() + "\n");
                                }

                                if (laptop.getDongSanPham().startsWith("Butterfly")) {
                                    writer.write("Man hinh: <Ma man hinh>:" + laptop.getManHinh().getMaManHinh()
                                            + " <Hang san xuat>:" + laptop.getManHinh().getHangSanXuat()
                                            + " <do phan giai>:" + laptop.getManHinh().getDoPhanGiai() + " <Don gia>:"
                                            + laptop.getManHinh().getDonGia() + "<Chong loa>\n");
                                } else {
                                    writer.write("Man hinh: <Ma man hinh>:" + laptop.getManHinh().getMaManHinh()
                                            + " <Hang san xuat>:" + laptop.getManHinh().getHangSanXuat()
                                            + " <do phan giai>:" + laptop.getManHinh().getDoPhanGiai() + " <Don gia>:"
                                            + laptop.getManHinh().getDonGia() + "\n");
                                }
                                writer.write("\n");
                            }
                            System.out.println("Da luu thong tin vao file ds_laptop.txt");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("Ban vua chon khong luu file!");
                    }
                    break;
                default:
                    break;
            }

        } while (k > 0);

    }
}