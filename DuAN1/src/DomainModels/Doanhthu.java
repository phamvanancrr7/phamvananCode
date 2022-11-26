
package DomainModels;


public class Doanhthu {
    private int idhoadon;
    private int idchitietsp;
    private int soluong;
    private float dongia ;
    private String trangthai ;

    public Doanhthu() {
    }

    public Doanhthu(int idhoadon, int idchitietsp, int soluong, float dongia, String trangthai) {
        this.idhoadon = idhoadon;
        this.idchitietsp = idchitietsp;
        this.soluong = soluong;
        this.dongia = dongia;
        this.trangthai = trangthai;
    }

    public int getIdhoadon() {
        return idhoadon;
    }

    public void setIdhoadon(int idhoadon) {
        this.idhoadon = idhoadon;
    }

    public int getIdchitietsp() {
        return idchitietsp;
    }

    public void setIdchitietsp(int idchitietsp) {
        this.idchitietsp = idchitietsp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    

  
    
    
    
    
}
