package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class SportGer�teGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SportGer�teGUI frame = new SportGer�teGUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SportGer�teGUI() {
		setTitle("Sportger�t ausw�hlen");
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
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnVerkaufen = new JButton("Verkaufen");
		btnVerkaufen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerkaufen.setPreferredSize(new Dimension(81, 100));
		GridBagConstraints gbc_btnVerkaufen = new GridBagConstraints();
		gbc_btnVerkaufen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVerkaufen.insets = new Insets(0, 0, 5, 5);
		gbc_btnVerkaufen.gridx = 0;
		gbc_btnVerkaufen.gridy = 0;
		panel_1.add(btnVerkaufen, gbc_btnVerkaufen);
		
		JButton btnVerleihen = new JButton("Verleihen");
		btnVerleihen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnVerleihen.setPreferredSize(new Dimension(77, 100));
		GridBagConstraints gbc_btnVerleihen = new GridBagConstraints();
		gbc_btnVerleihen.insets = new Insets(0, 0, 5, 0);
		gbc_btnVerleihen.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnVerleihen.gridx = 1;
		gbc_btnVerleihen.gridy = 0;
		panel_1.add(btnVerleihen, gbc_btnVerleihen);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridwidth = 2;
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		
		
		//Funktionen der Button
		btnZurck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ger�teModelleGUI frame = new Ger�teModelleGUI();
				dispose();
			}
		});
		
		btnVerkaufen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnVerleihen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VerleihenGUI frame = new VerleihenGUI();
				setVisible(false);
			}
		});
		
		
		setVisible(true);
	}

}
