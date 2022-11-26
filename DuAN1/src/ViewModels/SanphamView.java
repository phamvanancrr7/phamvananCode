/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

public class SanphamView {
    private String masp;
    private String ten ;
    private int soluong;
    private  int soluongdaban;
    private int slTon;

    public SanphamView() {
    }

    public SanphamView(String masp, String ten, int soluong,int soluongdaban,int slTon) {
        this.masp = masp;
        this.ten = ten;
        this.soluong = soluong;
        this.soluongdaban = soluongdaban;
        this.slTon = slTon;
    }

    public int getSlTon() {
        return slTon;
    }

    public void setSlTon(int slTon) {
        this.slTon = slTon;
    }

    public int getSoluongdaban() {
        return soluongdaban;
    }

    public void setSoluongdaban(int soluongdaban) {
        this.soluongdaban = soluongdaban;
    }
    
    

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
}
