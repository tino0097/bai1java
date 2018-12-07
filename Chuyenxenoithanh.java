
package Dulich;

public class Chuyenxenoithanh extends Chuyenxe {
    private int sotuyen;
    private int sokmdidc;

    
    public int getSotuyen() {
        return sotuyen;
    }

    public void setSotuyen(int sotuyen) {
        this.sotuyen = sotuyen;
    }

    public int getSokmdidc() {
        return sokmdidc;
    }

    public void setSokmdidc(int sokmdidc) {
        this.sokmdidc = sokmdidc;
    }
    public Chuyenxenoithanh() {
        super();
        this.sotuyen = 0;
        this.sokmdidc = 0;
    }
    public Chuyenxenoithanh(int sotuyen, int sokmdidc,String maso, String hoTen, int soxe, int doanhthu) {
        super(hoTen,maso,soxe,doanhthu);
        this.sotuyen = sotuyen;
        this.sokmdidc = sokmdidc;
    }
    
    
    @Override
    public String toString(){
        String st="";
        st+=super.toString()+"\t";
        st+=this.getSotuyen()+"\t";
        st+=this.getSokmdidc()+"\t";
        return st;
        
    }

    
}
