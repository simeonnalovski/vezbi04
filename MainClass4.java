package fikt.oop.vezbi04;
public class MainClass4 {
    public static void main(String[] args){
        Avtomobil Seat=new Avtomobil("Seat", "Leon", "bela", 170000);
        System.out.println("Marka: "+Seat.GetMarka());
        System.out.println("Model "+Seat.GetModel());
        System.out.println("Boja: "+Seat.GetBoja());
        System.out.println("Prvicno pominati kilometiri: "+Seat.GetPominatiKm());
        System.out.println("Novi pominati kilometri: "+ Seat.pomnoziKM(3));
    }
}
