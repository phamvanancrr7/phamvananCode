
package Service;

import ViewModels.thongkeview;
import java.util.List;


public interface IFDoanhThuService {
    List<thongkeview> getall();
    List<thongkeview> sreach (String ma);
}
