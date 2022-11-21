/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repostiory;

import Model.Ban;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class BanRepostiory {

    public ArrayList<Ban> all() {
        ArrayList<Ban> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql = "select * from NhanVien";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String gioitinh = rs.getString("GioiTinh");
                String ngaysinh = rs.getString("NgaySinh");
                Ban b = new Ban(ma, ten, gioitinh, ngaysinh);
                list.add(b);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return list;
    }

    public void insert(Ban b) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "insert into NhanVien(Ma , Ten , GioiTinh , NgaySinh)" + "values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getMa());
            ps.setString(2, b.getTen());
            ps.setString(3, b.getGioitinh());
            ps.setString(4, b.getNgaysinh());
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void update(String ma, Ban b) {
        try {
            Connection conn = DBContext.getConnection();
            String sql = "update NhanVien set Ten=?, GioiTinh=?, NgaySinh=? where Ma=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getTen());
            ps.setString(2, b.getGioitinh());
            ps.setString(3, b.getNgaysinh());
            ps.setString(4, ma);
            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public ArrayList<Ban> srech(String ma){
        ArrayList<Ban> list = new ArrayList<>();
        try {
            Connection conn = DBContext.getConnection();
            String sql ="select * from NhanVien where Ma=?";
            PreparedStatement ps =conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs =ps.executeQuery();
            while (rs.next()) {                
                String ma1 = rs.getString("Ma");
                 String ten = rs.getString("Ten");
                String gioitinh = rs.getString("GioiTinh");
                String ngaysinh = rs.getString("NgaySinh");
                Ban b = new Ban(ma, ten, gioitinh, ngaysinh);
                list.add(b);
            }
                    
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        return list;
    }
    

}
