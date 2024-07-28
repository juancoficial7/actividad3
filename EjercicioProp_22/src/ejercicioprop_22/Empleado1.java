
package ejercicioprop_22;


class Empleado1 {
    String NOMBRE;
    double SAL_HORA;
    double HORA_TRAB;

    public Empleado1(String NOMBRE, double SAL_HORA, double HORA_TRAB) {
        this.NOMBRE = NOMBRE;
        this.SAL_HORA = SAL_HORA;
        this.HORA_TRAB = HORA_TRAB;
    }
    
    public double calcularSalarioMensual() {
        double SALARIO_MEN = SAL_HORA * HORA_TRAB;
        return SALARIO_MEN;
    }
}
