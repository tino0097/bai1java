
package Dulich;

public class Chuyenxe {
    private String maso;
    private String hoTen;
    private int soxe;
    private int doanhthu;

    public Chuyenxe(String maso, String hoTen, int soxe, int doanhthu) {
        this.maso = maso;
        this.hoTen = hoTen;
        this.soxe = soxe;
        this.doanhthu = doanhthu;
    }

    public Chuyenxe(){
        
    }
    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoxe() {
        return soxe;
    }

    public void setSoxe(int soxe) {
        this.soxe = soxe;
    }

    public int getDoanhthu() {
        return doanhthu;
    }

    public void setDoanhthu(int doanhthu) {
        this.doanhthu = doanhthu;
    }
    
    
 @Override
    public String toString(){
        String st="";
        st+=this.maso+"\t";
        st+=this.hoTen+"\t";
        st+=this.soxe+"\t";
        st+=this.doanhthu+"\t";
        return st;
        
    }
}
