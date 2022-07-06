package Atividades.src.com.sharkdays;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TesteInterface extends JFrame{

    public TesteInterface() {

        getContentPane().setBackground(Color.RED);
        setTitle("Input Dialog in Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(400, 300);
        getContentPane().setLayout(null);

    }

    private void closeIt(){

        this.getContentPane().setVisible(false);
        this.dispose();

    }

    public static void main(String[] args){

        TesteInterface frame = new TesteInterface();
        String m = JOptionPane.showInputDialog(frame, "Digite seu nome:");
        if(m.isEmpty()){
            frame.closeIt();
        }
        System.out.println(m);

    }

}
