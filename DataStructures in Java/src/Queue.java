import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 394);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStackDataStructure = new JLabel("QUEUE DATA STRUCTURE");
		lblStackDataStructure.setForeground(new Color(0, 0, 255));
		lblStackDataStructure.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblStackDataStructure.setBounds(212, 10, 226, 19);
		contentPane.add(lblStackDataStructure);
		
		JLabel lblEnterStackSize = new JLabel("ENTER QUEUE SIZE");
		lblEnterStackSize.setForeground(new Color(51, 51, 102));
		lblEnterStackSize.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblEnterStackSize.setBounds(118, 59, 161, 17);
		contentPane.add(lblEnterStackSize);
		
		JButton CreateStack = new JButton("CREATE QUEUE");
		CreateStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create of stack
				int n=Integer.valueOf(sizefield.getText());
				q=new int[n];
				size=q.length;
				String message="Queue of size "+n+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		CreateStack.setForeground(new Color(204, 0, 0));
		CreateStack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		CreateStack.setBackground(new Color(238, 130, 238));
		CreateStack.setBounds(213, 107, 159, 25);
		contentPane.add(CreateStack);
		
		JLabel lblEnterElement = new JLabel("ENTER ELEMENT");
		lblEnterElement.setForeground(new Color(51, 51, 102));
		lblEnterElement.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblEnterElement.setBounds(118, 162, 161, 17);
		contentPane.add(lblEnterElement);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for push
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Insertion not possible");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane,"Insertion Succesful");
					element.setText("");
				}
				
			}
		});
		insert.setForeground(new Color(204, 0, 0));
		insert.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		insert.setBackground(new Color(238, 130, 238));
		insert.setBounds(429, 159, 96, 25);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pop
				if(f>r||r==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible");
				}
				else
				{
					
					JOptionPane.showMessageDialog(contentPane,"Element deleted is "+q[f]);
					f++;
				}
				
			}
		});
		delete.setForeground(new Color(204, 0, 0));
		delete.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		delete.setBackground(new Color(238, 130, 238));
		delete.setBounds(251, 202, 91, 25);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				if(r==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else
				{
					String msg="";
					for(int i=f;i<=r;i++)
					{
						msg=msg+" "+q[i];
					}
					displaybox.setText(msg);
					
				}
				
			}
		});
		display.setForeground(new Color(204, 0, 0));
		display.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		display.setBackground(new Color(238, 130, 238));
		display.setBounds(251, 252, 104, 25);
		contentPane.add(display);
		
		sizefield = new JTextField();
		sizefield.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		sizefield.setColumns(10);
		sizefield.setBounds(304, 60, 96, 19);
		contentPane.add(sizefield);
		
		element = new JTextField();
		element.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		element.setColumns(10);
		element.setBounds(289, 163, 96, 19);
		contentPane.add(element);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(102, 0, 153));
		displaybox.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		displaybox.setColumns(10);
		displaybox.setBackground(new Color(255, 255, 0));
		displaybox.setBounds(82, 299, 468, 31);
		contentPane.add(displaybox);
	}
}
