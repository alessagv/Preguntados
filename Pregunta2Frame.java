import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class Pregunta2Frame extends JFrame {
	private JLabel label;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;

	public Pregunta2Frame() {
    	// Calls the parent constructor and adds a title
    	super("Pregunta2");
    	// This is the size of the window in pixels
    	setSize(500, 500);
    	// We don't want the size to change so we don't have
    	// to recalculate the board
    	setResizable(false);
    	// We cant for the window to be closed when you click on the x
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	// Create the Label
    	label = new JLabel("Texto de la pregunta", SwingConstants.CENTER);
    	// Create the Buttons
    	btn1 = new JButton("Respuesta 1");
    	btn2 = new JButton("Respuesta 2");
    	btn3 = new JButton("Respuesta 3");
    	btn4 = new JButton("Respuesta 4");
    	// Add the Action Listener
    	btn1.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
          	// LO QUE VA A HACER EL PROGRAMA CUANDO PRESIONEN EL BOTON 1
          	label.setText("Elegiste 1");

      	}
    	});
    	btn2.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
          	// LO QUE VA A HACER EL PROGRAMA CUANDO PRESIONEN EL BOTON 2
      	}
    	});
    	btn3.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
          	// LO QUE VA A HACER EL PROGRAMA CUANDO PRESIONEN EL BOTON 3
      	}
    	});
    	btn4.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
          	// LO QUE VA A HACER EL PROGRAMA CUANDO PRESIONEN EL BOTON 4
      	}
    	});
    	// Create a Panel for the Buttons
    	JPanel panel = new JPanel();
    	panel.add(btn1);
    	panel.add(btn2);
    	panel.add(btn3);
    	panel.add(btn4);
    	// Add it to the SOUTH of the Border Layout
    	add(panel, BorderLayout.SOUTH);
    	// Adds the label to the Frame
    	add(label, BorderLayout.CENTER);
    	// This is for showing the window
   	setVisible(true);
	}

	public static void main(String[] args) {
    	Pregunta2Frame frame = new Pregunta2Frame();
    	/* Esta parte duerme el programa por cierta cantidad de segundos
    	try {
          	TimeUnit.SECONDS.sleep(20);

         	}
         	catch(Exception ex) {
             	ex.printStackTrace();
         	}*/
	}
}
