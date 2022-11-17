package fikt.oop.vezbi04;
public class MainClass2 {
    public static void main(String[] args){
        Restoran Milenium = new Restoran();
        Milenium.SetIme("Milenium");
        Milenium.SetLokacija("Bitola");
        Milenium.SetTelefon("047 241 001");
        Milenium.SetBrSedista(200);
        System.out.println("Restoran "+Milenium.GetIme()+ " vo "+Milenium.GetLokacija() +" raspolaga so "+Milenium.GetBrSedista()+" sedista");
        System.out.println("Idealno mesto vasite semelni proslavi");
        System.out.println("Telefonski broj  za rezervacii "+Milenium.GetTelefon());
    }
}
