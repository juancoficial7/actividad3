
package ejerciciores_7;


public class Comparador implements InterfazEjercicio7{
    double A;
    double B;

    public Comparador(double A, double B) {
        this.A = A;
        this.B = B;
    }

    public String Comparar() {
        if (A > B) {
            return "A es mayor que B";
        } else if (A == B) {
            return "A es igual a B";
        } else {
            return "A es menor que B";
        }
    }

    @Override
    public double Comparar(double A, double B) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
