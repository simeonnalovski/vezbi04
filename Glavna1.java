package fikt.oop.vezbi04;
public class Glavna1 {
    public static void main(String[] args){
        KalkulatorZaCeliBroevi k= new KalkulatorZaCeliBroevi();
        k.x=10;
        k.y=2;
        System.out.println("Zbir na broevite "+ k.sobiranje(k.x, k.y));
        System.out.println("Razlika na broevite "+k.odzemanje(k.x,k.y));
        System.out.println("Proizvod na broevite "+k.mnozenje(k.x, k.y));
        System.out.println("Kolicnik na broevite "+k.delenje(k.x, k.y));
        System.out.println("Ostakok pri celobrojno delenje "+ k.ostatok(k.x, k.y));
        System.out.println("Rezultat od stepenuvanje (x^y) "+ k.stepenuvanje(k.x, k.y));
    }
}
