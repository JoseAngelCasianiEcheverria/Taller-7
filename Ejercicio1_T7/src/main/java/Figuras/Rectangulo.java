
package Figuras;

public class Rectangulo extends Figura{
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura, double x, double y) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }
    

    @Override
    public double calcularArea() {
        double resultado = base * altura;
        return resultado;
    }

    @Override
    public void MostrarArea() {
        System.out.println("El area de el rectangulo es: " + calcularArea());
    }
    
}
