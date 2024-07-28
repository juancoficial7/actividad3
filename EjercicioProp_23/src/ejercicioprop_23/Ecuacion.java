
package ejercicioprop_23;


public class Ecuacion implements interfazEjercicio23 {
   public double A;
   public double B;
   public double C;

    public Ecuacion(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

   
   @Override
   public double D(double A, double B, double C){
    return (Math.pow(B, 2) - 4*A*C);
   }

    
}
