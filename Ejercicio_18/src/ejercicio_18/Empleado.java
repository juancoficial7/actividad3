
package ejercicio_18;

/**
 *
 * @author juanc
 */
public class Empleado{
    int codigo;
    String nombres;
    double horasTrabajadas;
    double valorHora;
    double retencion;

    public Empleado(int codigo, String nombres, double horasTrabajadas, double valorHora, double retencion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.retencion = retencion;
    }

    
    
    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    
    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        return salarioBruto * (1 - retencion / 100);
    }

    
}

