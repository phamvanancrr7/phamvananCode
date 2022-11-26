/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class thongkeview {
    private String mahd ;
    private Date ngay ;
    private Long dongia;

    public thongkeview() {
    }

    public thongkeview(String mahd, Date  ngay, Long dongia) {
        this.mahd = mahd;
        this.ngay = ngay;
        this.dongia = dongia;
    }

   
    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public Date  getNgay() {
        return ngay;
    }

    public void setNgay(Date  ngay) {
        this.ngay = ngay;
    }

    public Long getDongia() {
        return dongia;
    }

    public void setDongia(Long dongia) {
        this.dongia = dongia;
    }

    @Override
    public String toString() {
        return "NewClass{" + "mahd=" + mahd + ", ngay=" + ngay + ", dongia=" + dongia + '}';
    }
    
}
