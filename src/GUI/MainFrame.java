package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Boots- & Segelverleih");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel StandortPanel = new JPanel();
		contentPane.add(StandortPanel, "name_285477213159744");
		StandortPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		JPanel Hauptmenue = new JPanel();
		JPanel GeraeteModellverwaltung = new JPanel();
		JPanel Sportgeraete = new JPanel();
		JPanel Geraetaendern = new JPanel();
		JPanel Geraethinzufuegen = new JPanel();
		JPanel Typaendern = new JPanel();
		JPanel Typhinzufuegen = new JPanel();
		JPanel Modellhinzufuegen = new JPanel();
		JPanel Modellaendern = new JPanel();
		JPanel WVerwaltung = new WVerwaltung();
		
		JLabel label = new JLabel("Bitte Standort w\u00E4hlen:");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 48));
		
		JButton button = new JButton("\u00DCberspringen");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				StandortPanel.setVisible(false);
				Hauptmenue.setVisible(true);
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton button_1 = new JButton("Weiter");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JComboBox comboBox = new JComboBox();
		GroupLayout gl_StandortPanel = new GroupLayout(StandortPanel);
		gl_StandortPanel.setHorizontalGroup(
			gl_StandortPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 984, Short.MAX_VALUE)
				.addGroup(gl_StandortPanel.createSequentialGroup()
					.addGroup(gl_StandortPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(label, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
						.addGroup(gl_StandortPanel.createSequentialGroup()
							.addGap(210)
							.addGroup(gl_StandortPanel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_StandortPanel.createSequentialGroup()
									.addComponent(button, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE))
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 548, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap())
		);
		gl_StandortPanel.setVerticalGroup(
			gl_StandortPanel.createParallelGroup(Alignment.LEADING)
				.addGap(0, 561, Short.MAX_VALUE)
				.addGroup(gl_StandortPanel.createSequentialGroup()
					.addGap(77)
					.addComponent(label)
					.addGap(18)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addGap(58)
					.addGroup(gl_StandortPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(221, Short.MAX_VALUE))
		);
		StandortPanel.setLayout(gl_StandortPanel);
		
		JPanel GeraeteTypVerwaltung = new JPanel();
		GeraeteTypVerwaltung.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(GeraeteTypVerwaltung, "name_285813215298337");
		
		JScrollPane scrollPane = new JScrollPane();
		
		JButton button_2 = new JButton("Zur\u00FCck");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeraeteTypVerwaltung.setVisible(false);
				Hauptmenue.setVisible(true);
				
			}
		});
		
		JComboBox comboBox_1 = new JComboBox();
		
		textField = new JTextField();
		textField.setText("Artikel suchen...");
		
		JButton button_3 = new JButton("Ger\u00E4tetyp hinzuf\u00FCgen");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GeraeteTypVerwaltung.setVisible(false);
				Typhinzufuegen.setVisible(true);
				
			}
		});
		
		JButton button_4 = new JButton("Ger\u00E4tetyp \u00E4ndern");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GeraeteTypVerwaltung.setVisible(false);
				Typaendern.setVisible(true);
				
			}
		});
		
		JButton btnAuswhlen = new JButton("Ausw\u00E4hlen");
		btnAuswhlen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Tableitem holen und mit if/else abgleichen ob ausgewählt werden kann
				
				
				
				//danach Panelwechsel
				GeraeteTypVerwaltung.setVisible(false);
				GeraeteModellverwaltung.setVisible(true);
				
			}
		});
		GroupLayout gl_GeraeteTypVerwaltung = new GroupLayout(GeraeteTypVerwaltung);
		gl_GeraeteTypVerwaltung.setHorizontalGroup(
			gl_GeraeteTypVerwaltung.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_GeraeteTypVerwaltung.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_GeraeteTypVerwaltung.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
						.addGroup(gl_GeraeteTypVerwaltung.createSequentialGroup()
							.addComponent(button_2)
							.addPreferredGap(ComponentPlacement.RELATED, 542, Short.MAX_VALUE)
							.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_GeraeteTypVerwaltung.createSequentialGroup()
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE)
							.addGap(36)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 407, GroupLayout.PREFERRED_SIZE)))
					.addGap(1)
					.addComponent(btnAuswhlen)
					.addContainerGap())
		);
		gl_GeraeteTypVerwaltung.setVerticalGroup(
			gl_GeraeteTypVerwaltung.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_GeraeteTypVerwaltung.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_GeraeteTypVerwaltung.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_2)
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAuswhlen))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_GeraeteTypVerwaltung.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		GeraeteTypVerwaltung.setLayout(gl_GeraeteTypVerwaltung);
		
		
		GeraeteModellverwaltung.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(GeraeteModellverwaltung, "name_286348415132347");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JButton button_5 = new JButton("Zur\u00FCck");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GeraeteModellverwaltung.setVisible(false);
				GeraeteTypVerwaltung.setVisible(true);
				
			}
		});
		
		JComboBox comboBox_2 = new JComboBox();
		
		textField_1 = new JTextField();
		textField_1.setText("Artikel suchen...");
		
		JButton btnModellHinzufgen = new JButton("Modell hinzuf\u00FCgen");
		btnModellHinzufgen.setFont(new Font("Dialog", Font.PLAIN, 18));
		btnModellHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				GeraeteModellverwaltung.setVisible(false);
				Modellhinzufuegen.setVisible(true);
				
			}
		});
		
		JButton btnModellndern = new JButton("Modell \u00E4ndern");
		btnModellndern.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GeraeteModellverwaltung.setVisible(false);
				Modellaendern.setVisible(true);
				
			}
		});
		btnModellndern.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		JButton btnModellDeaktivieren = new JButton("Modell deaktivieren");
		btnModellDeaktivieren.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		JButton button_22 = new JButton("Ausw\u00E4hlen");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Tableitem holen und mit if/else abgleichen ob ausgewählt worden ist
				
				
				
				//danach Panelwechsel
				GeraeteModellverwaltung.setVisible(false);
				Sportgeraete.setVisible(true);
				
			}
		});
		GroupLayout gl_GeraeteModellverwaltung = new GroupLayout(GeraeteModellverwaltung);
		gl_GeraeteModellverwaltung.setHorizontalGroup(
			gl_GeraeteModellverwaltung.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_GeraeteModellverwaltung.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_GeraeteModellverwaltung.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
						.addGroup(gl_GeraeteModellverwaltung.createSequentialGroup()
							.addGroup(gl_GeraeteModellverwaltung.createParallelGroup(Alignment.LEADING)
								.addComponent(button_5)
								.addComponent(btnModellHinzufgen, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
							.addGap(47)
							.addComponent(btnModellndern, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
							.addGroup(gl_GeraeteModellverwaltung.createParallelGroup(Alignment.LEADING)
								.addComponent(btnModellDeaktivieren, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_GeraeteModellverwaltung.createSequentialGroup()
									.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_22, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
					.addGap(24))
		);
		gl_GeraeteModellverwaltung.setVerticalGroup(
			gl_GeraeteModellverwaltung.createParallelGroup(Alignment.LEADING)
				.addGap(0, 551, Short.MAX_VALUE)
				.addGroup(gl_GeraeteModellverwaltung.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_GeraeteModellverwaltung.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5)
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_22))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_GeraeteModellverwaltung.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_GeraeteModellverwaltung.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnModellHinzufgen, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnModellndern, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnModellDeaktivieren, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		GeraeteModellverwaltung.setLayout(gl_GeraeteModellverwaltung);
		
		
		Sportgeraete.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(Sportgeraete, "name_287159872816511");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		
		JButton button_6 = new JButton("Zur\u00FCck");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Sportgeraete.setVisible(false);
				GeraeteModellverwaltung.setVisible(true);
				
			}
		});
		
		JComboBox comboBox_3 = new JComboBox();
		
		textField_2 = new JTextField();
		textField_2.setText("Artikel suchen...");
		
		JButton btnGertHinzufgen = new JButton("Ger\u00E4t hinzuf\u00FCgen");
		btnGertHinzufgen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Geraethinzufuegen.setVisible(false);
				Sportgeraete.setVisible(true);
				
			}
		});
		btnGertHinzufgen.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		JButton btnGertndern = new JButton("Ger\u00E4t \u00E4ndern");
		btnGertndern.setFont(new Font("Dialog", Font.PLAIN, 18));
		
		JButton btnGertDeaktivieren = new JButton("Ger\u00E4t deaktivieren");
		btnGertDeaktivieren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int action = JOptionPane.showConfirmDialog(null, "Wirklich deaktivieren?","deaktivieren",JOptionPane.YES_NO_OPTION);
				try {
					//query einfuegen
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
		});
		btnGertDeaktivieren.setFont(new Font("Dialog", Font.PLAIN, 18));
		GroupLayout gl_Sportgeraete = new GroupLayout(Sportgeraete);
		gl_Sportgeraete.setHorizontalGroup(
			gl_Sportgeraete.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 974, Short.MAX_VALUE)
				.addGap(0, 974, Short.MAX_VALUE)
				.addGap(0, 984, Short.MAX_VALUE)
				.addGroup(gl_Sportgeraete.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Sportgeraete.createParallelGroup(Alignment.TRAILING)
						.addComponent(scrollPane_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
						.addGroup(gl_Sportgeraete.createSequentialGroup()
							.addGroup(gl_Sportgeraete.createParallelGroup(Alignment.LEADING)
								.addComponent(button_6)
								.addComponent(btnGertHinzufgen, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
							.addGap(47)
							.addComponent(btnGertndern, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
							.addGroup(gl_Sportgeraete.createParallelGroup(Alignment.LEADING)
								.addComponent(btnGertDeaktivieren, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Sportgeraete.createSequentialGroup()
									.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)))))
					.addGap(114))
		);
		gl_Sportgeraete.setVerticalGroup(
			gl_Sportgeraete.createParallelGroup(Alignment.LEADING)
				.addGap(0, 551, Short.MAX_VALUE)
				.addGap(0, 551, Short.MAX_VALUE)
				.addGap(0, 561, Short.MAX_VALUE)
				.addGroup(gl_Sportgeraete.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Sportgeraete.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_6)
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Sportgeraete.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Sportgeraete.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnGertHinzufgen, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnGertndern, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnGertDeaktivieren, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane_2, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		Sportgeraete.setLayout(gl_Sportgeraete);
		
		
		Geraethinzufuegen.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(Geraethinzufuegen, "name_287367330709041");
		
		JLabel label_1 = new JLabel("Modell:");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_2 = new JLabel("Artikelnummer:");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_3 = new JLabel("Anschaffungspreis:");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_4 = new JLabel("Verkaufspreis:");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_5 = new JLabel("Farbe:");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_6 = new JLabel("Baujahr:");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_7 = new JLabel("Makel:");
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JButton button_8 = new JButton("abbrechen");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Geraethinzufuegen.setVisible(false);
				GeraeteTypVerwaltung.setVisible(true);
				
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel label_8 = new JLabel("\u20AC");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel label_9 = new JLabel("\u20AC");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		JButton button_9 = new JButton("best\u00E4tigen");
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		GroupLayout gl_Geraethinzufuegen = new GroupLayout(Geraethinzufuegen);
		gl_Geraethinzufuegen.setHorizontalGroup(
			gl_Geraethinzufuegen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Geraethinzufuegen.createSequentialGroup()
					.addContainerGap(175, Short.MAX_VALUE)
					.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_Geraethinzufuegen.createSequentialGroup()
							.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1)
								.addComponent(label_2)
								.addComponent(label_3)
								.addComponent(label_4)
								.addComponent(label_5)
								.addComponent(label_6)
								.addComponent(label_7))
							.addGap(37))
						.addGroup(gl_Geraethinzufuegen.createSequentialGroup()
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_Geraethinzufuegen.createSequentialGroup()
								.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(label_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGroup(gl_Geraethinzufuegen.createSequentialGroup()
								.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(label_9))
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.TRAILING)
							.addGroup(gl_Geraethinzufuegen.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
							.addComponent(textField_9, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(395, Short.MAX_VALUE))
		);
		gl_Geraethinzufuegen.setVerticalGroup(
			gl_Geraethinzufuegen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Geraethinzufuegen.createSequentialGroup()
					.addGap(91)
					.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_1)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_3)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_9))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_4)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_8))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_5)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_6)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_7)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_Geraethinzufuegen.createParallelGroup(Alignment.LEADING)
						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(147, Short.MAX_VALUE))
		);
		Geraethinzufuegen.setLayout(gl_Geraethinzufuegen);
		
		
		Geraetaendern.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(Geraetaendern, "name_287716135853296");
		
		JButton button_10 = new JButton("Zur\u00FCck");
		
		JLabel label_10 = new JLabel("Modell:");
		label_10.setHorizontalAlignment(SwingConstants.LEFT);
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_11 = new JLabel("Artikelnummer:");
		label_11.setHorizontalAlignment(SwingConstants.LEFT);
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_12 = new JLabel("Anschaffungspreis:");
		label_12.setHorizontalAlignment(SwingConstants.LEFT);
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_13 = new JLabel("Verkaufspreis:");
		label_13.setHorizontalAlignment(SwingConstants.LEFT);
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_14 = new JLabel("Farbe:");
		label_14.setHorizontalAlignment(SwingConstants.LEFT);
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_15 = new JLabel("Baujahr:");
		label_15.setHorizontalAlignment(SwingConstants.LEFT);
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel label_16 = new JLabel("Makel:");
		label_16.setHorizontalAlignment(SwingConstants.LEFT);
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JButton button_11 = new JButton("abbrechen");
		button_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		JLabel label_17 = new JLabel("\u20AC");
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		JLabel label_18 = new JLabel("\u20AC");
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		
		JButton button_12 = new JButton("best\u00E4tigen");
		button_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		
		JLabel lblStandort = new JLabel("Standort:");
		lblStandort.setHorizontalAlignment(SwingConstants.LEFT);
		lblStandort.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		GroupLayout gl_Geraetaendern = new GroupLayout(Geraetaendern);
		gl_Geraetaendern.setHorizontalGroup(
			gl_Geraetaendern.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Geraetaendern.createSequentialGroup()
					.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Geraetaendern.createSequentialGroup()
							.addContainerGap()
							.addComponent(button_10))
						.addGroup(gl_Geraetaendern.createSequentialGroup()
							.addContainerGap(99, Short.MAX_VALUE)
							.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_Geraetaendern.createSequentialGroup()
									.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.LEADING)
										.addComponent(label_10)
										.addComponent(label_11)
										.addComponent(label_12)
										.addComponent(label_13)
										.addComponent(label_14)
										.addComponent(label_15)
										.addComponent(label_16)
										.addComponent(lblStandort, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
									.addGap(188))
								.addGroup(Alignment.TRAILING, gl_Geraetaendern.createSequentialGroup()
									.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.LEADING, false)
									.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_Geraetaendern.createSequentialGroup()
										.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(label_17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGroup(gl_Geraetaendern.createSequentialGroup()
										.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(label_18))
									.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.TRAILING)
									.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(320, Short.MAX_VALUE))
		);
		gl_Geraetaendern.setVerticalGroup(
			gl_Geraetaendern.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Geraetaendern.createSequentialGroup()
					.addContainerGap()
					.addComponent(button_10)
					.addGap(57)
					.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_10)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_11)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_12)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_18))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_13)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_17))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_14)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_15)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_16)
						.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblStandort, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Geraetaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(118, Short.MAX_VALUE))
		);
		Geraetaendern.setLayout(gl_Geraetaendern);
		
		
		Hauptmenue.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(Hauptmenue, "name_290454344421698");
		
		JButton button_13 = new JButton("Kundenverwaltung");
		button_13.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JButton button_14 = new JButton("Ger\u00E4teverwaltung");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Hauptmenue.setVisible(false);
				GeraeteTypVerwaltung.setVisible(true);
				
			}
		});
		button_14.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JButton button_15 = new JButton("Buchungsverwaltung");
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JButton button_16 = new JButton("W-Verwaltung");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane.add(WVerwaltung);
				WVerwaltung.setVisible(true);
				Hauptmenue.setVisible(false);
				
			}
		});
		button_16.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JButton button_17 = new JButton("Rechnungsverwaltung");
		button_17.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JLabel label_19 = new JLabel("Hauptmen\u00FC");
		label_19.setHorizontalAlignment(SwingConstants.CENTER);
		label_19.setFont(new Font("Tahoma", Font.BOLD, 48));
		GroupLayout gl_Hauptmenue = new GroupLayout(Hauptmenue);
		gl_Hauptmenue.setHorizontalGroup(
			gl_Hauptmenue.createParallelGroup(Alignment.LEADING)
				.addGap(0, 984, Short.MAX_VALUE)
				.addGroup(gl_Hauptmenue.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_Hauptmenue.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_Hauptmenue.createSequentialGroup()
							.addComponent(button_13, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_14, GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_Hauptmenue.createSequentialGroup()
							.addComponent(button_15, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_17, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
							.addGap(2)))
					.addGap(8))
				.addGroup(gl_Hauptmenue.createSequentialGroup()
					.addComponent(label_19, GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_Hauptmenue.setVerticalGroup(
			gl_Hauptmenue.createParallelGroup(Alignment.LEADING)
				.addGap(0, 561, Short.MAX_VALUE)
				.addGroup(gl_Hauptmenue.createSequentialGroup()
					.addComponent(label_19, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Hauptmenue.createParallelGroup(Alignment.LEADING)
						.addComponent(button_14, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
						.addComponent(button_13, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_Hauptmenue.createParallelGroup(Alignment.LEADING)
						.addComponent(button_16, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
						.addComponent(button_15, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
						.addComponent(button_17, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
					.addGap(8))
		);
		Hauptmenue.setLayout(gl_Hauptmenue);
		
		
		contentPane.add(Typhinzufuegen, "name_292786206689607");
		
		JLabel lblTyp = new JLabel("Typ:");
		lblTyp.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JLabel lblNummer = new JLabel("Nummer:");
		lblNummer.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		
		JButton btnNewButton = new JButton("best\u00E4tigen");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnAbbrechen = new JButton("abbrechen");
		btnAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Typhinzufuegen.setVisible(false);
				GeraeteTypVerwaltung.setVisible(true);
				
			}
		});
		btnAbbrechen.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GroupLayout gl_Typhinzufuegen = new GroupLayout(Typhinzufuegen);
		gl_Typhinzufuegen.setHorizontalGroup(
			gl_Typhinzufuegen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Typhinzufuegen.createSequentialGroup()
					.addGap(162)
					.addGroup(gl_Typhinzufuegen.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTyp)
						.addComponent(lblNummer))
					.addGap(84)
					.addGroup(gl_Typhinzufuegen.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_Typhinzufuegen.createSequentialGroup()
							.addComponent(btnAbbrechen, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Typhinzufuegen.createParallelGroup(Alignment.LEADING)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(350, Short.MAX_VALUE))
		);
		gl_Typhinzufuegen.setVerticalGroup(
			gl_Typhinzufuegen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Typhinzufuegen.createSequentialGroup()
					.addGap(176)
					.addGroup(gl_Typhinzufuegen.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTyp)
						.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_Typhinzufuegen.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNummer, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(49)
					.addGroup(gl_Typhinzufuegen.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnAbbrechen, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(178, Short.MAX_VALUE))
		);
		Typhinzufuegen.setLayout(gl_Typhinzufuegen);
		
		
		contentPane.add(Typaendern, "name_293868108560657");
		
		JLabel label_20 = new JLabel("Typ:");
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JLabel label_21 = new JLabel("Nummer:");
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		
		JButton button_7 = new JButton("best\u00E4tigen");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton button_18 = new JButton("abbrechen");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Typaendern.setVisible(false);
				GeraeteTypVerwaltung.setVisible(true);
				
			}
		});
		button_18.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GroupLayout gl_Typaendern = new GroupLayout(Typaendern);
		gl_Typaendern.setHorizontalGroup(
			gl_Typaendern.createParallelGroup(Alignment.LEADING)
				.addGap(0, 974, Short.MAX_VALUE)
				.addGroup(gl_Typaendern.createSequentialGroup()
					.addGap(162)
					.addGroup(gl_Typaendern.createParallelGroup(Alignment.LEADING)
						.addComponent(label_20)
						.addComponent(label_21))
					.addGap(84)
					.addGroup(gl_Typaendern.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_Typaendern.createSequentialGroup()
							.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_Typaendern.createParallelGroup(Alignment.LEADING)
							.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(350, Short.MAX_VALUE))
		);
		gl_Typaendern.setVerticalGroup(
			gl_Typaendern.createParallelGroup(Alignment.LEADING)
				.addGap(0, 551, Short.MAX_VALUE)
				.addGroup(gl_Typaendern.createSequentialGroup()
					.addGap(176)
					.addGroup(gl_Typaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_20)
						.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_Typaendern.createParallelGroup(Alignment.LEADING)
						.addComponent(label_21, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addGap(49)
					.addGroup(gl_Typaendern.createParallelGroup(Alignment.LEADING)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_18, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(178, Short.MAX_VALUE))
		);
		Typaendern.setLayout(gl_Typaendern);
		
		
		contentPane.add(Modellhinzufuegen, "name_293912672560803");
		
		JLabel lblGertetyp = new JLabel("Ger\u00E4tetyp:");
		lblGertetyp.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JLabel lblGertetypnummer = new JLabel("Ger\u00E4tetypnummer:");
		lblGertetypnummer.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JLabel lblModellbezeichnung = new JLabel("Modellbezeichnung:");
		lblModellbezeichnung.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JLabel lblFhrerscheine = new JLabel("F\u00FChrerscheine:");
		lblFhrerscheine.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		
		JButton button_19 = new JButton("abbrechen");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Modellhinzufuegen.setVisible(false);
				GeraeteModellverwaltung.setVisible(true);
				
			}
		});
		button_19.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton btnBesttigen = new JButton("best\u00E4tigen");
		btnBesttigen.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GroupLayout gl_Modellhinzufuegen = new GroupLayout(Modellhinzufuegen);
		gl_Modellhinzufuegen.setHorizontalGroup(
			gl_Modellhinzufuegen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Modellhinzufuegen.createSequentialGroup()
					.addGap(96)
					.addGroup(gl_Modellhinzufuegen.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblGertetyp)
						.addComponent(lblGertetypnummer)
						.addComponent(lblModellbezeichnung)
						.addComponent(lblFhrerscheine))
					.addGap(109)
					.addGroup(gl_Modellhinzufuegen.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_Modellhinzufuegen.createSequentialGroup()
							.addComponent(button_19, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnBesttigen, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(265, Short.MAX_VALUE))
		);
		gl_Modellhinzufuegen.setVerticalGroup(
			gl_Modellhinzufuegen.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_Modellhinzufuegen.createSequentialGroup()
					.addGap(130)
					.addGroup(gl_Modellhinzufuegen.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGertetyp))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Modellhinzufuegen.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGertetypnummer, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_Modellhinzufuegen.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblModellbezeichnung, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Modellhinzufuegen.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFhrerscheine, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_Modellhinzufuegen.createParallelGroup(Alignment.LEADING)
						.addComponent(button_19, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBesttigen, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(143, Short.MAX_VALUE))
		);
		Modellhinzufuegen.setLayout(gl_Modellhinzufuegen);
		
		
		contentPane.add(Modellaendern, "name_294199358324018");
		
		JButton button_20 = new JButton("abbrechen");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Modellaendern.setVisible(false);
				GeraeteModellverwaltung.setVisible(true);
				
			}
		});
		button_20.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JButton button_21 = new JButton("best\u00E4tigen");
		button_21.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JLabel label_22 = new JLabel("Ger\u00E4tetyp:");
		label_22.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JLabel label_23 = new JLabel("F\u00FChrerscheine:");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JLabel label_24 = new JLabel("Modellbezeichnung:");
		label_24.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		JLabel label_25 = new JLabel("Ger\u00E4tetypnummer:");
		label_25.setFont(new Font("Tahoma", Font.PLAIN, 28));
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		GroupLayout gl_Modellaendern = new GroupLayout(Modellaendern);
		gl_Modellaendern.setHorizontalGroup(
			gl_Modellaendern.createParallelGroup(Alignment.LEADING)
				.addGap(0, 974, Short.MAX_VALUE)
				.addGroup(gl_Modellaendern.createSequentialGroup()
					.addGap(96)
					.addGroup(gl_Modellaendern.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_22)
						.addComponent(label_25)
						.addComponent(label_24)
						.addComponent(label_23))
					.addGap(109)
					.addGroup(gl_Modellaendern.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_Modellaendern.createSequentialGroup()
							.addComponent(button_20, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(button_21, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 260, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(265, Short.MAX_VALUE))
		);
		gl_Modellaendern.setVerticalGroup(
			gl_Modellaendern.createParallelGroup(Alignment.LEADING)
				.addGap(0, 551, Short.MAX_VALUE)
				.addGroup(gl_Modellaendern.createSequentialGroup()
					.addGap(130)
					.addGroup(gl_Modellaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_22))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Modellaendern.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_25, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(13)
					.addGroup(gl_Modellaendern.createParallelGroup(Alignment.TRAILING)
						.addComponent(label_24, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_Modellaendern.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_23, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_Modellaendern.createParallelGroup(Alignment.LEADING)
						.addComponent(button_20, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_21, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(143, Short.MAX_VALUE))
		);
		Modellaendern.setLayout(gl_Modellaendern);
	}
}
