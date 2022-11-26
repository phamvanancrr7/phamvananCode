package Repositories;

import DomainModels.Doanhthu;
import Service.IFDoanhThuService;
import Utilities.DBcontext;
import ViewModels.thongkeview;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class doanhthuRep implements IFDoanhThuService {

    public List<thongkeview> getall() {
        List<thongkeview> dt = new ArrayList<>();
        String sql = "select hoadon.ma ,hoadon.ngaythanhtoan, sum(a.soluong * a.dongia )as'đơn giá' from hoadon join hoadonchitiet a on hoadon.id =a.id_HoaDon\n"
                + "                \n"
                + "                group by hoadon.ma ,hoadon.ngaythanhtoan";
        try {
            Connection conn = DBcontext.GET_CONNECTION();
            PreparedStatement ps = conn.prepareStatement(sql);
           

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dt.add(new thongkeview(rs.getString(1), rs.getDate(2), rs.getLong(3)));

            }
            return dt;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<thongkeview> sreach(String ma) {
        List<thongkeview> tk = new ArrayList<>();
        String sql = "select hoadon.ma ,a.soluong * a.dongia as'Tongtien',hoadon.ngaythanhtoan from hoadon join hoadonchitiet a on hoadon.id =a.id_HoaDon\n"
                + "where hoadon.ma=?";
        try {
            Connection conn = DBcontext.GET_CONNECTION();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ma1 = rs.getString("ma");
                Date ngay = rs.getDate("ngaythanhtoan");
                Long dongia = rs.getLong("Tongtien");
                tk.add(new thongkeview(ma1, ngay, dongia));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }

}
