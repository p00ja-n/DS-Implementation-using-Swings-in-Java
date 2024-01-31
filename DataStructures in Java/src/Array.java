import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField deletepos;
	private JTextField elempos;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 754, 404);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(102, 0, 0));
		contentPane.setBackground(new Color(204, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(153, 0, 0));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblNewLabel.setBounds(272, 10, 217, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterArrayLength = new JLabel("ENTER ARRAY LENGTH");
		lblEnterArrayLength.setForeground(new Color(51, 51, 102));
		lblEnterArrayLength.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblEnterArrayLength.setBounds(202, 64, 199, 17);
		contentPane.add(lblEnterArrayLength);
		
		length = new JTextField();
		length.setBounds(411, 65, 96, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE ARRAY");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {// code for creating array
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of length "+len+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		create.setBackground(new Color(255, 255, 51));
		create.setForeground(new Color(0, 102, 0));
		create.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		create.setBounds(277, 110, 159, 25);
		contentPane.add(create);
		
		JLabel lblNewLabel_1 = new JLabel("INSERT AN INTEGER ELEMENT");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(26, 165, 223, 17);
		contentPane.add(lblNewLabel_1);
		
		element = new JTextField();
		element.setBounds(259, 166, 96, 19);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//code for insertion
				int ele=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(elempos.getText());
				arr[pos]=ele;
				String message="element "+ele+" is inserted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				element.setText("");
				elempos.setText("");
				
				
			}
		});
		insert.setForeground(new Color(0, 102, 0));
		insert.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		insert.setBackground(new Color(255, 255, 51));
		insert.setBounds(596, 161, 96, 25);
		contentPane.add(insert);
		
		JLabel lblNewLabel_1_1 = new JLabel("DELETE POSITION");
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(98, 215, 132, 17);
		contentPane.add(lblNewLabel_1_1);
		
		deletepos = new JTextField();
		deletepos.setBounds(259, 216, 96, 19);
		contentPane.add(deletepos);
		deletepos.setColumns(10);
		
		JButton deletebtn = new JButton("DELETE");
		deletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//code for deletion
				int pos=Integer.valueOf(deletepos.getText());
				arr[pos]=0;
				String message="element is delted @ position "+pos;
				JOptionPane.showMessageDialog(contentPane, message);
				deletepos.setText("");
				
			}
		});
		deletebtn.setForeground(new Color(0, 102, 0));
		deletebtn.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		deletebtn.setBackground(new Color(255, 255, 51));
		deletebtn.setBounds(378, 211, 102, 25);
		contentPane.add(deletebtn);
		
		elempos = new JTextField();
		elempos.setBounds(455, 166, 96, 19);
		contentPane.add(elempos);
		elempos.setColumns(10);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//code for display
				String msg="";
				for(int i=0;i<arr.length;i++)
				{
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(0, 102, 0));
		display.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		display.setBackground(new Color(255, 255, 51));
		display.setBounds(318, 259, 118, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(204, 0, 0));
		displaybox.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		displaybox.setBackground(new Color(204, 204, 153));
		displaybox.setBounds(56, 316, 611, 30);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("POSITION");
		lblNewLabel_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(378, 165, 78, 17);
		contentPane.add(lblNewLabel_1_1_1);
	}
}
