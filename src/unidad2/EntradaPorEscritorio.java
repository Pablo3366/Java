package unidad2;
import javax.swing.JOptionPane;

public class EntradaPorEscritorio {

    public static void main(String[] args) {
        String texto;
        texto = JOptionPane.showInputDialog(null,
                                            "Edad",
                                            "Recursos Humanos",
                                            JOptionPane.PLAIN_MESSAGE);
        int edad = Integer.parseInt(texto);
        System.out.println("Ud, ingresó " + edad);
    }
    
}
