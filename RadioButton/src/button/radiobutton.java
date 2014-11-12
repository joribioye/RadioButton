package button;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ButtonGroup;
import java.awt.Font;


// Done by John Oribioye

public class radiobutton {

	private JFrame buttonframe;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					radiobutton window = new radiobutton();
					window.buttonframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public radiobutton() {
		initialize();
	}

	private void initialize() {
		buttonframe = new JFrame();
		buttonframe.setBounds(100, 100, 450, 300);
		buttonframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buttonframe.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 30, 178, 146);
		buttonframe.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton SmallButton = new JRadioButton("Small");
		SmallButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		buttonGroup.add(SmallButton);
		SmallButton.setBounds(0, 0, 93, 23);
		panel.add(SmallButton);
		SmallButton.setSelected(true);
		
		JRadioButton LargeButton = new JRadioButton("Large");
		LargeButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		buttonGroup.add(LargeButton);
		LargeButton.setBounds(0, 52, 93, 23);
		panel.add(LargeButton);
		
		JRadioButton MediumButton = new JRadioButton("Medium");
		MediumButton.setFont(new Font("Times New Roman", Font.BOLD, 12));
		buttonGroup.add(MediumButton);
		MediumButton.setBounds(0, 26, 93, 23);
		panel.add(MediumButton);
	}
}