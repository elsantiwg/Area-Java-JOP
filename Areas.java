

import javax.swing.JOptionPane;

public class Areas {

    double base;
    double altura;
    double radio;
    double areaCuadrado;
    double areaCirculo;
    double pi = 3.1416;

    public void recibe() {
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base"));
        radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el radio"));
        altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la altura "));
    }

    public void calcula() {
        areaCuadrado = base * altura;
        areaCirculo = pi * (radio * radio);
    }

    public void resultado() {
        System.out.println("Area del circulo " + areaCirculo);
        System.out.println("Area del cuadrado" + areaCuadrado);
    }

}
