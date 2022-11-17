package fikt.oop.vezbi04;
public class Avtomobil {
    private String marka;
    private String model;
    private String boja;
    private double pominatiKM;

    public Avtomobil(String marka,String model,String boja,double pominatiKM){
        this.marka=marka;
        this.model=model;
        this.boja=boja;
        this.pominatiKM=pominatiKM;
    }
    public double pomnoziKM (int mnozitel){
        return this.pominatiKM*mnozitel;
    }
    public void SetMarka(String marka){
        this.marka=marka;
    }
    public void SetModel(String model){
        this.model=model;
    }
    public void SetBoja(String boja){
        this.boja=boja;
    }
    public void SetPominatiKm(double pominatiKM){
        this.pominatiKM=pominatiKM;
    }
    public String GetMarka(){
        return marka;
    }
    public String GetModel(){
        return model;
    }
    public String GetBoja(){
        return boja;
    }
    public double GetPominatiKm(){
        return pominatiKM;
    }

}
