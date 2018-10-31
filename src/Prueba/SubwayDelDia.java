package Prueba;

import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class SubwayDelDia {

    void presenta(){
        JOptionPane.showMessageDialog(null,
                "Message",
                "Subway.com.mx",
                JOptionPane.PLAIN_MESSAGE,
                new ImageIcon("/home/lap/Downloads/Mapamental.png"));
    }
    
    void capturar(){
        Calendar c = Calendar.getInstance();
        
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        String r;
        String[] pan = {"Centeno", "Integral", "Blanco", "Oregano"};
        r = (String) JOptionPane.showInputDialog(null,
                "Captura algo",
                "Tip, pornlee el tipo de pan",
                -1,
                new ImageIcon("pan.png"),
                pan,
                "Blanco");
        
        if(r != null)
            System.out.println(r);
        else
            System.out.println(r);
    }
    
    void correr(){
        presenta();
        capturar();
    }
    
    public static void main(String[] args) {
        SubwayDelDia inst = new SubwayDelDia();
        inst.correr();
    }
    
}
