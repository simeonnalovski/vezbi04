package fikt.oop.vezbi04;
public class MainClass1 {
    public static void main(String[] args){
        Covek Simeon=new Covek();
        Simeon.SetIme("Simeon");
        Simeon.SetPrezime("Nalovski");
        Simeon.SetEMBG("0909002410018");
        System.out.println("Ime: "+Simeon.GetIme());
        System.out.println("Prezime: "+Simeon.GetPrezime());
        System.out.println("EMBG: "+Simeon.GetEMBG());
    }
}
