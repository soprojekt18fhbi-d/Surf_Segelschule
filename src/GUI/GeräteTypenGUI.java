package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Font;

public class GeräteTypenGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GeräteTypenGUI frame = new GeräteTypenGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GeräteTypenGUI() {
		setTitle("Gerätetyp auswählen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnZurck = new JButton("Zur\u00FCck");
		btnZurck.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnZurck, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(824, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(6)
					.addComponent(btnZurck, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnSurfboards = new JButton("10 - Surfboards");
		btnSurfboards.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnSurfboards = new GridBagConstraints();
		gbc_btnSurfboards.fill = GridBagConstraints.BOTH;
		gbc_btnSurfboards.insets = new Insets(0, 0, 5, 0);
		gbc_btnSurfboards.gridx = 1;
		gbc_btnSurfboards.gridy = 0;
		panel_1.add(btnSurfboards, gbc_btnSurfboards);
		
		JButton btnSegelboote = new JButton("20 - Segelboote");
		btnSegelboote.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnSegelboote = new GridBagConstraints();
		gbc_btnSegelboote.fill = GridBagConstraints.BOTH;
		gbc_btnSegelboote.insets = new Insets(0, 0, 5, 0);
		gbc_btnSegelboote.gridx = 1;
		gbc_btnSegelboote.gridy = 1;
		panel_1.add(btnSegelboote, gbc_btnSegelboote);
		
		JButton btnKajaks = new JButton("30 - Kajaks");
		btnKajaks.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnKajaks = new GridBagConstraints();
		gbc_btnKajaks.fill = GridBagConstraints.BOTH;
		gbc_btnKajaks.insets = new Insets(0, 0, 5, 0);
		gbc_btnKajaks.gridx = 1;
		gbc_btnKajaks.gridy = 2;
		panel_1.add(btnKajaks, gbc_btnKajaks);
		
		JButton btnJetskis = new JButton("40 - Jetskis");
		btnJetskis.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnJetskis = new GridBagConstraints();
		gbc_btnJetskis.fill = GridBagConstraints.BOTH;
		gbc_btnJetskis.insets = new Insets(0, 0, 5, 0);
		gbc_btnJetskis.gridx = 1;
		gbc_btnJetskis.gridy = 3;
		panel_1.add(btnJetskis, gbc_btnJetskis);
		
		JButton btnMotorboote = new JButton("50 - Motorboote");
		btnMotorboote.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_btnMotorboote = new GridBagConstraints();
		gbc_btnMotorboote.fill = GridBagConstraints.BOTH;
		gbc_btnMotorboote.gridx = 1;
		gbc_btnMotorboote.gridy = 4;
		panel_1.add(btnMotorboote, gbc_btnMotorboote);
		
		
		//Funktionen der Button
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KundeWaehlenGUI frame = new KundeWaehlenGUI();
				dispose();
			}
		});
		
		btnSurfboards.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeräteModelleGUI frame = new GeräteModelleGUI();
				dispose();
			}
		});
		
		btnSegelboote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeräteModelleGUI frame = new GeräteModelleGUI();
				dispose();
			}
		});
		
		btnKajaks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeräteModelleGUI frame = new GeräteModelleGUI();
				dispose();
			}
		});
		
		btnJetskis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeräteModelleGUI frame = new GeräteModelleGUI();
				dispose();
			}
		});
		
		btnMotorboote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GeräteModelleGUI frame = new GeräteModelleGUI();
				dispose();
			}
		});
		
		setVisible(true);
	}

}
