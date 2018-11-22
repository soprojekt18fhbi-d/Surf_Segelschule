package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

public class Hauptmenue extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hauptmenue frame = new Hauptmenue();
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
	public Hauptmenue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblHauptmen = new JLabel("Hauptmen\u00FC");
		lblHauptmen.setHorizontalAlignment(SwingConstants.CENTER);
		lblHauptmen.setFont(new Font("Tahoma", Font.BOLD, 48));
		
		JButton btnNewButton = new JButton("Kundenverwaltung");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							KundenverwaltungGUI frame = new KundenverwaltungGUI();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			// Hier muss noch das alter Fenster geschlossen werden.
			}
		});
		
		JButton btnNewButton_1 = new JButton("Ger\u00E4teverwaltung");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JButton btnBuchungsverwaltung = new JButton("Buchungsverwaltung");
		btnBuchungsverwaltung.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JButton btnRechnungsverwaltung = new JButton("Rechnungsverwaltung");
		btnRechnungsverwaltung.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		JButton btnWirtschaftlichkeitsverwaltung = new JButton("W-Verwaltung");
		btnWirtschaftlichkeitsverwaltung.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnBuchungsverwaltung, GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnWirtschaftlichkeitsverwaltung, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnRechnungsverwaltung, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
							.addGap(2)))
					.addGap(8))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblHauptmen, GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblHauptmen, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnWirtschaftlichkeitsverwaltung, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
						.addComponent(btnBuchungsverwaltung, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
						.addComponent(btnRechnungsverwaltung, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
					.addGap(8))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
