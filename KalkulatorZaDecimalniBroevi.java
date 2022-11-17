package fikt.oop.vezbi04;
public class KalkulatorZaDecimalniBroevi implements IMatematickioperaciiSoDecimalniBroevi {
    public double x;
    public double y;

   
    public double odzemanje(double x, double y) {
       
        return x-y;
    }

   
    public double sobiranje(double x, double y) {
        
        return x+y;
    }

    
    public double mnozenje(double x, double y) {
        
        return x*y;
    }

    
    public double delenje(double x, double y) {
        
        return x/y;
    }

    
    public double ostatok(double x, double y) {
        
        return x%y;
    }

   
    public double stepenuvanje(double x, double y) {
        
        return Math.pow(x,y);
    }
    
}
