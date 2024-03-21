import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame{
    private JPanel panel;
    private JTextField textField1;
    private JRadioButton numerosParesRadioButton;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JButton mostrarButton;
    private JTextArea textArea1;
    private int numero;


    public Controller(){
        super ("Calculos matematicos");
        setContentPane(panel);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contains=textField1.getText();
                textArea1.append(String.valueOf(numero));
                if (numerosParesRadioButton.getAutoscrolls()){
                    for (int i=0;i<;i++){
                        
                    }
                } else if () {
                    
                }
            }
        });
        
    }
}
