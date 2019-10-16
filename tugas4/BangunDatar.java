package tugas4;

/**
 *
 * @author lenovo
 */
public class BangunDatar {
 protected String jenis;
 
 public void view(){
     System.out.print("Nama bangun datar = ");
 }
}
class Persegi extends BangunDatar{
    protected double sisi;
    
    public Persegi(double s){
        this.sisi = s;
    }
    public double Luas(){
        double l = Math.pow(sisi,2);
        double L = Math.round(l*Math.pow(10,2))/Math.pow(10,2);
        return L;
    }
    public double Keliling(){
        double k = 4*sisi;
        double K = Math.round(k*Math.pow(10,2))/Math.pow(10,2);
        return K;
    }
    public void view(){
        super.view();
        System.out.println("Persegi");
        System.out.println("Luasnya = " + Luas());
        System.out.println("Kelilingnya = "+Keliling());
    }
}
class Segitiga extends BangunDatar{
    protected double alas, tinggi;
    
    public Segitiga(double a){
        this.alas = a;
    }
    public Segitiga(double a, double t){
        this.alas = a;
        this.tinggi = t;
    }
    public void view(){
        super.view();
        System.out.println("Segitiga");
    }
}
class Siku2 extends Segitiga{

    public Siku2(double a, double t) {
        super(a, t);
    }
    public double sisiMiring(){
        return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
    }
    public double Luas(){
        return 0.5*alas*tinggi;
    }
    public double Keliling(){
        double k = alas+tinggi+sisiMiring();
        double K = Math.round(k*Math.pow(10,2))/Math.pow(10,2);
        return K;
    }
    public void view(){
        super.view();
        System.out.println("Jenis segitiga = Segitiga Siku-Siku"+
                "\nLuasnya = "+Luas()+"\nKelilingnya = "+Keliling());
    }
}
class samaSisi extends Segitiga{
    public samaSisi(double a) {
        super(a);
    }
    public double Luas(){
        double l = 0.25*Math.pow(alas,2)*Math.sqrt(3);
        double L = Math.round(l*Math.pow(10,2))/Math.pow(10,2);
        return L;
    }
    public double Keliling(){
        return 3*alas;
    }
    public void view(){
        super.view();
        System.out.println("Jenis segitiga = Segitiga Sama Sisi"+
                "\nLuasnya = "+Luas()+"\nKelilingnya = "+ Keliling());
    }
}
class Lingkaran extends BangunDatar{
    protected double r;
    
    public Lingkaran(double r){
        this.r = r;
    }
    public double Luas(){
        double l = Math.PI*Math.pow(r,2);
        double L = Math.round(l*Math.pow(10,2))/Math.pow(10,2);
        return L;
    }
    public double Keliling(){
        double k = 2*Math.PI*r;
        double K = Math.round(k*Math.pow(10,2))/Math.pow(10,2);
        return K;
    }
    public void view(){
        super.view();
        System.out.println("Lingkaran");
        System.out.println("Luasnya = "+ Luas());
        System.out.println("Kelilingnya = "+ Keliling());
    }
}