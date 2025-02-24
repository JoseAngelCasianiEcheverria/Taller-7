
package Figuras;


public abstract class Figura {
    
    protected double x;
    protected double y;

    public Figura() {
    }

    protected Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public abstract double calcularArea();
    
    public abstract void MostrarArea();
}
