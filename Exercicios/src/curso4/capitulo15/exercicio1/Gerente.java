package curso4.capitulo15.exercicio1;

public class Gerente extends Funcionario {
    
    private String area;
    
    public void setArea(String area) {
        this.area = area;
    }
    
    public String getArea() {
        return this.area;
    }
    
    public String toString() {
        return "Area: " + area + " " + super.toString();
    }
}
