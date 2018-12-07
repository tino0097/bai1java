
package Dulich;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanly1 {
        
    ArrayList<Chuyenxenoithanh> noit =new ArrayList();
    ArrayList<Chuyenxengoaithanh> ngt =new ArrayList();
    Scanner sc=new Scanner(System.in);
    public Chuyenxenoithanh xenoithanh(){
       
    String maso=sc.nextLine();
    String hoten=sc.nextLine();
    int soxe=sc.nextInt();
    int sotuyen=sc.nextInt();
    int sokmdidc=sc.nextInt();
    int doanhthu=sc.nextInt();
    Chuyenxenoithanh nt1=new Chuyenxenoithanh(sotuyen, sokmdidc, maso, hoten, soxe, doanhthu);
   // noit.add(nt1);
    return nt1;
    }
    public void nhapdsnoithanh(){
        String traloi;
        do{
            this.noit.add(this.xenoithanh());
            System.out.println("BAN MUON NHAP TIEP");
            traloi=sc.next();  
        }while(traloi.equals("c"));
        
    }
    public void xuatxenoithanh(){
        System.out.println("MASOCHUYEN\t\tHOTEN\t\tSOXE\t\tSOTUYEN\t\tSOKMDIDC\t\tDOANHTHU");
        for(int i=0;i<noit.size();i++){
            System.out.println(noit.get(i).toString());
        }
    }
    public void doanhthu1noithanh(){
        int a=0;
        for(int i=0;i<noit.size();i++)
            {a=a+noit.get(i).getDoanhthu();}
            System.out.println("TONGDOANHTHU: "+a);
        
    }
    public Chuyenxengoaithanh xengoaihanh(){
       
    String maso=sc.nextLine();
    String hoten=sc.nextLine();;
    int soxe=sc.nextInt();
    sc.nextLine();
    String noiden=sc.nextLine();
    int songaydidc=sc.nextInt();
    int doanhthu=sc.nextInt();
    Chuyenxengoaithanh nt2=new Chuyenxengoaithanh( noiden, songaydidc,maso,  hoten, soxe, doanhthu);
   // noit.add(nt1);
    return nt2;
    }
    public void nhapxengoaithanh(){
        String traloi;
        
        do{
            this.ngt.add(this.xengoaihanh());
            System.out.println("BAN MUON NHAP TIEP");
            traloi=sc.next();
            
        }while(traloi.equals("c"));
    }
     public void xuatxengoaithanh(){
        System.out.println("MASOCHUYEN\t\tHOTEN\t\tSOXE\t\tNOIDEN\t\tSONGAYDIDC\t\tDOANHTHU");
        for(int i=0;i<ngt.size();i++){
            System.out.println(ngt.get(i).toString());
        }
    }
   
       public void doanhthungoaihanh(){
        int a=0;
        for(int i=0;i<ngt.size();i++)
            {a=a+ngt.get(i).getDoanhthu();}
            System.out.println("TONGDOANHTHU: "+a);
        
    }

    
}
