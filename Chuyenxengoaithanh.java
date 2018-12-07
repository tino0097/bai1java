
package Dulich;

import javax.swing.JTextField;

public class Chuyenxengoaithanh extends Chuyenxe {
    private  String noiden;
    private int songaydidc;

    public Chuyenxengoaithanh(String noiden, int songaydidc,String maso, String hoTen, int soxe, int doanhthu) {
        super(hoTen,maso,soxe,doanhthu);
        this.noiden = noiden;
        this.songaydidc = songaydidc;
    }
    public Chuyenxengoaithanh() {
        super();
        this.noiden = "";
        this.songaydidc = 0;
    }

    public String getNoiden() {
        return noiden;
    }

    public void setNoiden(String noiden) {
        this.noiden = noiden;
    }

    public int getSongaydidc() {
        return songaydidc;
    }

    public void setSongaydidc(int songaydidc) {
        this.songaydidc = songaydidc;
    }
    
     @Override
    public String toString(){
        String st="";
        
        st+=super.toString();
        st+=this.getNoiden()+"\t";
        st+=this.getSongaydidc()+"\t";
        return st;
        
    }   
}
