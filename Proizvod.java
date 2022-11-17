package fikt.oop.vezbi04;
public class Proizvod {
    private String ime;
    private String proizvoditel;
    private double tezhina;
    private double cena;
    public Proizvod(){
        this.ime="Mlecno cokolado";
        this.proizvoditel="Milka";
        this.tezhina=100.00;
        this.cena=60.00;
    }
    public void SetIme( String ime){
        this.ime=ime;
    }
    public void SetProizvoditel(String proizvoditel){
        this.proizvoditel=proizvoditel;
    }
    public void SetTezhina(double tezhina){
        this.tezhina=tezhina;
    }
   public void SetCena(double cena){
    this.cena=cena;
   } 
   public String GetIme(){
    return ime;
   }
   public String GetProizvoditel(){
    return proizvoditel;
   }
   public double GetCena(){
    return cena;
   }
   public double GetTezhina(){
    return tezhina;
   }

}
