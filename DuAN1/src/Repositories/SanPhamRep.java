package Repositories;

import Utilities.DBcontext;
import ViewModels.SanphamView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SanPhamRep {

    public List<SanphamView> getall() {
        List<SanphamView> dt = new ArrayList<>();
        String sql = "select sanpham.ma_sp, sanpham.ten_sp, a.so_luong,a.soluongdaban, (a.so_luong - a.soluongdaban) as soluongton \n"
                + "from sanphamchitiet a join sanpham on a.id_sp = sanpham.id";
        try {
            Connection conn = DBcontext.GET_CONNECTION();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                dt.add(new SanphamView(rs.getString(1), rs.getString(2), rs.getInt(3),rs.getInt(4),rs.getInt(5)));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dt;
    }

}
