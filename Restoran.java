package fikt.oop.vezbi04;
public class Restoran {
    private String ime;
    private String lokacija;
    private String telefon;
    private int BrSedista;

    public Restoran(){}
    
    public void  SetIme(String ime){
        this.ime=ime;
    }
    public void SetLokacija(String lokacija){
        this.lokacija=lokacija;
    }
    public void SetTelefon(String telefon){
        this.telefon=telefon;
    }
    public void SetBrSedista(int BrSedista){
        this.BrSedista=BrSedista;
    }
    public String GetIme(){
        return ime;
    }
    public String GetLokacija(){
        return lokacija;
    }
    public String GetTelefon(){
        return telefon;
    }
    public int GetBrSedista(){
        return BrSedista;
    }
}
