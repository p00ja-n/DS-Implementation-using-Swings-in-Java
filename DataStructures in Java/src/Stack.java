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

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int s[];
	private int size;
	private int top=-1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 394);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStackDataStructure = new JLabel("STACK DATA STRUCTURE");
		lblStackDataStructure.setForeground(new Color(0, 0, 255));
		lblStackDataStructure.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		lblStackDataStructure.setBounds(212, 10, 226, 19);
		contentPane.add(lblStackDataStructure);
		
		JLabel lblEnterStackSize = new JLabel("ENTER STACK SIZE");
		lblEnterStackSize.setForeground(new Color(51, 51, 102));
		lblEnterStackSize.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblEnterStackSize.setBounds(118, 59, 161, 17);
		contentPane.add(lblEnterStackSize);
		
		sizefield = new JTextField();
		sizefield.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		sizefield.setBounds(325, 60, 96, 19);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton btnCreateStack = new JButton("CREATE STACK");
		btnCreateStack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//create of QUEUE
				int n=Integer.valueOf(sizefield.getText());
				s=new int[n];
				size=s.length;
				String message="Stack of size "+n+" is created";
				JOptionPane.showMessageDialog(contentPane, message);
				
			}
		});
		btnCreateStack.setForeground(new Color(204, 0, 0));
		btnCreateStack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		btnCreateStack.setBackground(new Color(204, 255, 204));
		btnCreateStack.setBounds(213, 107, 159, 25);
		contentPane.add(btnCreateStack);
		
		JLabel lblEnterElement = new JLabel("ENTER ELEMENT");
		lblEnterElement.setForeground(new Color(51, 51, 102));
		lblEnterElement.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		lblEnterElement.setBounds(118, 162, 161, 17);
		contentPane.add(lblEnterElement);
		
		element = new JTextField();
		element.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		element.setColumns(10);
		element.setBounds(289, 163, 96, 19);
		contentPane.add(element);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for push
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Push not possible");
				}
				else
				{
					elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane,"Push Succesful");
					element.setText("");
				}
				
			}
		});
		push.setForeground(new Color(204, 0, 0));
		push.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		push.setBackground(new Color(204, 255, 204));
		push.setBounds(441, 159, 84, 25);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for pop
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Pop not possible");
				}
				else
				{
					
					JOptionPane.showMessageDialog(contentPane,"Element popped is "+s[top]);
					top--;
				}
				
			}
		});
		pop.setForeground(new Color(204, 0, 0));
		pop.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		pop.setBackground(new Color(204, 255, 204));
		pop.setBounds(297, 205, 75, 25);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				else
				{
					String msg="";
					for(int i=top;i>=0;i--)
					{
						msg=msg+" "+s[i];
					}
					displaybox.setText(msg);
					
				}
				
			}
		});
		display.setForeground(new Color(204, 0, 0));
		display.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		display.setBackground(new Color(204, 255, 204));
		display.setBounds(281, 254, 104, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(204, 255, 255));
		displaybox.setForeground(new Color(102, 0, 153));
		displaybox.setFont(new Font("Bahnschrift", Font.PLAIN, 14));
		displaybox.setColumns(10);
		displaybox.setBounds(69, 301, 468, 31);
		contentPane.add(displaybox);
	}
}
