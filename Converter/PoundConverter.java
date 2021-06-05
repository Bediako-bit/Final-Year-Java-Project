import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class PoundConverter {
	
	double Ghanaian_Cedi= 8.22;
	double USA_Dollar= 1.42;
	double Kenyan_Shilling= 152.41;
	double Brazilian_Real= 7.55;
	double Canadian_Dollar= 1.71;
	double Indian_Rupee= 103.01;
	double Philippino_Peso= 68.17;
	double Indonesian_Rupiah= 20322.17;

	private JFrame frame;
	private JTextField jtxtConvert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PoundConverter window = new PoundConverter();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PoundConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pound Converter");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 30));
		lblNewLabel.setBounds(72, 11, 298, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox jcmbCurrency = new JComboBox();
		jcmbCurrency.setFont(new Font("Verdana", Font.PLAIN, 15));
		jcmbCurrency.setModel(new DefaultComboBoxModel(new String[] {"Choose One ...", "USA", "Ghana", "Brazil", "Canada", "Kenya", "Indonesia", "India", "Philippines"}));
		jcmbCurrency.setBounds(137, 69, 169, 34);
		frame.getContentPane().add(jcmbCurrency);
		
		JLabel jlblConvert = new JLabel("");
		jlblConvert.setForeground(new Color(0, 0, 0));
		jlblConvert.setHorizontalAlignment(SwingConstants.CENTER);
		jlblConvert.setFont(new Font("Verdana", Font.BOLD, 15));
		jlblConvert.setBackground(SystemColor.windowBorder);
		jlblConvert.setBounds(137, 160, 169, 34);
		frame.getContentPane().add(jlblConvert);
		
		jtxtConvert = new JTextField();
		jtxtConvert.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtConvert.setFont(new Font("Verdana", Font.BOLD, 15));
		jtxtConvert.setBackground(SystemColor.text);
		jtxtConvert.setBounds(137, 112, 169, 34);
		frame.getContentPane().add(jtxtConvert);
		jtxtConvert.setColumns(10);
		
		JButton jbtnConvert = new JButton("Convert");
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Convert button
double British_Pound = Double.parseDouble(jtxtConvert.getText());
				
				if (jcmbCurrency.getSelectedItem().equals("Ghana")) 
				{
					String cConvert1 = String.format("C %.2f", British_Pound*Ghanaian_Cedi);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("USA")) 
				{
					String cConvert1 = String.format("$ %.2f", British_Pound*USA_Dollar);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("Canada")) 
				{
					String cConvert1 = String.format("C$ %.2f", British_Pound*Canadian_Dollar);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("Indonesia")) 
				{
					String cConvert1 = String.format("IDr %.2f", British_Pound*Indonesian_Rupiah);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("Philippines")) 
				{
					String cConvert1 = String.format("PhP %.2f", British_Pound*Philippino_Peso);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("India")) 
				{
					String cConvert1 = String.format("INr %.2f", British_Pound*Indian_Rupee);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("Brazil")) 
				{
					String cConvert1 = String.format("Bra %.2f", British_Pound*Brazilian_Real);
					jlblConvert.setText(cConvert1);
				}
				
				if (jcmbCurrency.getSelectedItem().equals("Kenya")) 
				{
					String cConvert1 = String.format("KS %.2f", British_Pound*Kenyan_Shilling);
					jlblConvert.setText(cConvert1);
				}
			}
		});
		jbtnConvert.setForeground(new Color(0, 100, 0));
		jbtnConvert.setFont(new Font("Verdana", Font.BOLD, 15));
		jbtnConvert.setBounds(10, 216, 105, 34);
		frame.getContentPane().add(jbtnConvert);
		
		JButton jbtnReset = new JButton("Reset");
		jbtnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Reset button
				jtxtConvert.setText(null);
				jlblConvert.setText(null);
				jcmbCurrency.setSelectedIndex(0);
				
				
			}
		});
		jbtnReset.setFont(new Font("Verdana", Font.BOLD, 15));
		jbtnReset.setBounds(174, 216, 89, 34);
		frame.getContentPane().add(jbtnReset);
		
		JButton jbtnExit = new JButton("Exit");
		jbtnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Exit sign
				System.exit(0);
			}
		});
		jbtnExit.setForeground(new Color(255, 0, 0));
		jbtnExit.setFont(new Font("Verdana", Font.BOLD, 15));
		jbtnExit.setBounds(335, 216, 89, 34);
		frame.getContentPane().add(jbtnExit);
		
		JLabel lblNewLabel_1 = new JLabel("Country :");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_1.setBounds(25, 74, 89, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Value :");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 118, 117, 28);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
