package fikt.oop.vezbi04;
public class Covek{
    private String ime;
    private String prezime;
    private String EMBG;

    
    public void SetIme(String ime){
        this.ime=ime;
    }
    public void SetPrezime(String prezime){
        this.prezime=prezime;
    }
    public void SetEMBG(String EMBG){
        this.EMBG=EMBG;
    }
    public String GetIme(){
        return ime;
    }
    public String GetPrezime(){
        return prezime;
    }
    public String GetEMBG(){
        return EMBG;
    }
}