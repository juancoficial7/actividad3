
package ejercicio_19;


public class CalculadoraTrianguloEquilatero implements TrianguloEquilatero {
     
    
    @Override
    public double calcularPerimetro(double lado) {
        return lado * 3; // El perímetro de un triángulo equilátero es igual al lado multiplicado por 3
    }

    @Override
    public double calcularAltura(double lado) {
        return (Math.sqrt(3) / 2) * lado; // La altura de un triángulo equilátero es igual a la raíz cuadrada de 3 dividida por 2, multiplicada por el lado
    }

    @Override
    public double calcularArea(double lado) {
        return (Math.sqrt(3) / 4) * lado * lado; // El área de un triángulo equilátero es igual a la raíz cuadrada de 3 dividida por 4, multiplicada por el lado al cuadrado
    }
}
