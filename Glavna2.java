package fikt.oop.vezbi04;
public class Glavna2 {
    public static void main(String[] args){
        KalkulatorZaDecimalniBroevi ka= new KalkulatorZaDecimalniBroevi(20.0, 10.0);
        System.out.println("Zbir na broevite "+ ka.sobiranje(ka.x, ka.y));
        System.out.println("Razlika na broevite "+ka.odzemanje(ka.x, ka.y));
        System.out.println("Proizvod na broevite "+ka.mnozenje(ka.x, ka.y));
        System.out.println("Kolicnik na broevite "+ka.delenje(ka.x, ka.y));
        System.out.println("Ostatok pri celobrojno delenje "+ka.ostatok(ka.x, ka.y));
        System.out.println("Rezultat od stepenuvanje (x^y)  "+ka.stepenuvanje(ka.x, ka.y));
    }
}
