package fikt.oop.vezbi04;
public class KalkulatorZaCeliBroevi implements IMatematickioperaciiSoCeliBroevi{
    public int x;
    public int y;

   
    public int odzemanje(int x, int y){
        return x-y;
    }
    public long sobiranje(int x,int y){
        return x+y;
    }
    public long mnozenje(int x, int y){
        return x*y;
    }
    public int ostatok(int x,int y){
        return x%y;
    }
    public long stepenuvanje(int x, int y){
        return (long) Math.pow(x, y);
    }
   
    public long delenje(int x, int y) {
        
        return x/y;
    }
   
    
}
