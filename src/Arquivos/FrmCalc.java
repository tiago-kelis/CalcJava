package Arquivos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JTextField;

public class FrmCalc {

	private JFrame FrmCalc;
	private JTextField txtBaixoResult;
	private JTextField txtCimaEtapas;
	
	Double numero1, numero2;
	String tipoOperacao = "nada";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCalc window = new FrmCalc();
					window.FrmCalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrmCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FrmCalc = new JFrame();
		FrmCalc.getContentPane().setBackground(SystemColor.inactiveCaption);
		FrmCalc.setBounds(100, 100, 410, 443);
		FrmCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FrmCalc.getContentPane().setLayout(null);
		
	
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(220, 220, 220));
		panel.setBounds(32, 173, 329, 208);
		FrmCalc.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limparCampos();
			}
		});
		btnC.setFont(new Font("Ebrima", Font.PLAIN, 23));
		btnC.setBackground(new Color(220, 20, 60));
		btnC.setBounds(116, 160, 89, 37);
		panel.add(btnC);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + "6");
				
			}
		});
		btn6.setBounds(10, 10, 43, 37);
		btn6.setFont(new Font("Ebrima", Font.PLAIN, 14));
		btn6.setBackground(new Color(119, 136, 153));
		panel.add(btn6);
		
		
		
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + "7");
				
			}
		});
		btn7.setBounds(58, 10, 43, 37);
		btn7.setFont(new Font("Ebrima", Font.PLAIN, 14));
		btn7.setBackground(new Color(119, 136, 153));
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + "8");
				
			}
		});
		btn8.setBounds(106, 10, 43, 37);
		btn8.setFont(new Font("Ebrima", Font.PLAIN, 14));
		btn8.setBackground(new Color(119, 136, 153));
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + "9");
				
			}
		});
		btn9.setBounds(154, 10, 43, 37);
		btn9.setFont(new Font("Ebrima", Font.PLAIN, 14));
		btn9.setBackground(new Color(119, 136, 153));
		panel.add(btn9);
		
		JButton btnPonto = new JButton(".");
		btnPonto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + ".");
				
			}
		});
		btnPonto.setBounds(154, 106, 43, 37);
		btnPonto.setFont(new Font("Ebrima", Font.PLAIN, 20));
		btnPonto.setBackground(new Color(119, 136, 153));
		panel.add(btnPonto);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + "1");
				
			}
		});
		btn1.setBounds(10, 106, 43, 37);
		btn1.setFont(new Font("Ebrima", Font.PLAIN, 14));
		btn1.setBackground(new Color(119, 136, 153));
		panel.add(btn1);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + "3");
				
			}
		});
		btn3.setBounds(58, 58, 43, 37);
		btn3.setFont(new Font("Ebrima", Font.PLAIN, 14));
		btn3.setBackground(new Color(119, 136, 153));
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + "4" );
				
			}
		});
		btn4.setBounds(106, 58, 43, 37);
		btn4.setFont(new Font("Ebrima", Font.PLAIN, 14));
		btn4.setBackground(new Color(119, 136, 153));
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + "5");
				
			}
		});
		btn5.setBounds(154, 58, 43, 37);
		btn5.setFont(new Font("Ebrima", Font.PLAIN, 14));
		btn5.setBackground(new Color(119, 136, 153));
		panel.add(btn5);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + ",");
				
			}
		});
		btnVirgula.setBounds(106, 106, 43, 37);
		btnVirgula.setFont(new Font("Ebrima", Font.PLAIN, 20));
		btnVirgula.setBackground(new Color(119, 136, 153));
		panel.add(btnVirgula);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + "0");
				
			}
		});
		btn0.setBounds(58, 106, 43, 37);
		btn0.setFont(new Font("Ebrima", Font.PLAIN, 14));
		btn0.setBackground(new Color(119, 136, 153));
		panel.add(btn0);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText(txtBaixoResult.getText() + "2");
				
			}
		});
		btn2.setBounds(10, 58, 43, 37);
		panel.add(btn2);
		btn2.setFont(new Font("Ebrima", Font.PLAIN, 14));
		btn2.setBackground(new Color(119, 136, 153));
		
		JButton btnSoma = new JButton("+");
		btnSoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(tipoOperacao.equals("nada")) {
					
					txtCimaEtapas.setText(txtCimaEtapas.getText() + txtBaixoResult.getText());
										
				}else {
					
				}
				
				txtCimaEtapas.setText(txtCimaEtapas.getText() + "+");
				
				numero1 = Double.parseDouble(txtBaixoResult.getText());
				txtBaixoResult.setText("");
				
				tipoOperacao = "Adicao";
			}
		});
		
		btnSoma.setForeground(new Color(255, 255, 0));
		btnSoma.setFont(new Font("Ebrima", Font.PLAIN, 20));
		btnSoma.setBackground(SystemColor.windowBorder);
		btnSoma.setBounds(207, 10, 53, 37);
		panel.add(btnSoma);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.setForeground(new Color(255, 255, 0));
		btnSubtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	if(tipoOperacao.equals("nada")) {
					
					txtCimaEtapas.setText(txtCimaEtapas.getText() + txtBaixoResult.getText());
										
				}else {
					
				}
				
				txtCimaEtapas.setText(txtCimaEtapas.getText() + "-");
				
				numero1 = Double.parseDouble(txtBaixoResult.getText());
				txtBaixoResult.setText("");
				
				tipoOperacao = "Subtracao";
				
			}
		});
		
		btnSubtrair.setFont(new Font("Ebrima", Font.PLAIN, 20));
		btnSubtrair.setBackground(SystemColor.windowBorder);
		btnSubtrair.setBounds(263, 10, 56, 37);
		panel.add(btnSubtrair);
		
		JButton btnDivir = new JButton("/");
		btnDivir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	if(tipoOperacao.equals("nada")) {
					
					txtCimaEtapas.setText(txtCimaEtapas.getText() + txtBaixoResult.getText());
										
				}else {
					
				}
				
				txtCimaEtapas.setText(txtCimaEtapas.getText() + "/");
				
				numero1 = Double.parseDouble(txtBaixoResult.getText());
				txtBaixoResult.setText("");
				
				tipoOperacao = "Divisao";
				
			}
		});
		btnDivir.setForeground(new Color(255, 255, 0));
		btnDivir.setFont(new Font("Ebrima", Font.PLAIN, 20));
		btnDivir.setBackground(SystemColor.windowBorder);
		btnDivir.setBounds(263, 58, 56, 37);
		panel.add(btnDivir);
		
		JButton btnMultiplicar = new JButton("*");
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
	if(tipoOperacao.equals("nada")) {
					
					txtCimaEtapas.setText(txtCimaEtapas.getText() + txtBaixoResult.getText());
										
				}else {
					
				}
				
				txtCimaEtapas.setText(txtCimaEtapas.getText() + "*");
				
				numero1 = Double.parseDouble(txtBaixoResult.getText());
				txtBaixoResult.setText("");
				
				tipoOperacao = "Multiplicacao";
				
			}
		});
		btnMultiplicar.setForeground(new Color(255, 255, 0));
		btnMultiplicar.setFont(new Font("Ebrima", Font.PLAIN, 20));
		btnMultiplicar.setBackground(SystemColor.windowBorder);
		btnMultiplicar.setBounds(207, 58, 49, 37);
		panel.add(btnMultiplicar);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCimaEtapas.setText(txtCimaEtapas.getText() + txtBaixoResult.getText());

				
				numero2 = Double.parseDouble(txtBaixoResult.getText());
				txtBaixoResult.setText("");
				
				
				switch(tipoOperacao) {
				
				case "Adicao":
					
					
					break;
					
				case "Subtracao":
					
					txtBaixoResult.setText(String.valueOf(numero1 - numero2));
					break;
					
				case "Multiplicacao":
					
					txtBaixoResult.setText(String.valueOf(numero1 * numero2));
					break;
					
				case "Divisao":
					
					txtBaixoResult.setText(String.valueOf(numero1 / numero2));
					break;
					
					default:
						
						JOptionPane.showMessageDialog(null, "Operação Invalida:");	
						
						break;					
				
				}
			
				
				
			}
		});
		btnIgual.setFont(new Font("Ebrima", Font.PLAIN, 30));
		btnIgual.setBackground(new Color(240, 248, 255));
		btnIgual.setBounds(217, 106, 89, 37);
		panel.add(btnIgual);
		

	
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtBaixoResult.setText("");
				
			}
		});
		btnCe.setFont(new Font("Ebrima", Font.PLAIN, 23));
		btnCe.setBackground(new Color(220, 20, 60));
		btnCe.setBounds(217, 160, 89, 37);
		panel.add(btnCe);
		
		txtBaixoResult = new JTextField();
		txtBaixoResult.setEditable(false);
		txtBaixoResult.setBounds(43, 87, 306, 53);
		FrmCalc.getContentPane().add(txtBaixoResult);
		txtBaixoResult.setColumns(10);
		
		txtCimaEtapas = new JTextField();
		txtCimaEtapas.setEditable(false);
		txtCimaEtapas.setColumns(10);
		txtCimaEtapas.setBounds(43, 37, 306, 53);
		FrmCalc.getContentPane().add(txtCimaEtapas);
	}
	
	public void limparCampos() {
		txtBaixoResult.setText("");
		txtCimaEtapas.setText("");
	}
}
