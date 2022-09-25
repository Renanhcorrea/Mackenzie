package AulaCinco;

public class Retangulo {
    
    private double altura;
    private double largura;

    // SET
    public void setAltura (double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    // Método;

    public double perimetro (){
        return (2*(altura*largura));
    }

    public double area (){
        return (altura*largura);
    }
}
