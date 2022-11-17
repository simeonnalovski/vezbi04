package fikt.oop.vezbi04;
public class MainClass3 {
    public static void main(String[] args){
        Proizvod Milka= new Proizvod();
        System.out.println("Proizvod: "+ Milka.GetIme());
        System.out.println("Proizvoditel: "+Milka.GetProizvoditel());
        System.out.println("Cena: "+ Milka.GetCena());
        System.out.println("Tezhina: "+Milka.GetTezhina());;
    }
}
