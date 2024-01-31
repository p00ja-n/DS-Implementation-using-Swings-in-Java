import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 365);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(233, 233, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("CHOOSE A DATA STRUCTURE");
		l1.setForeground(new Color(0, 0, 51));
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		l1.setBounds(203, 10, 293, 20);
		contentPane.add(l1);
		
		JButton array = new JButton("ARRAY");
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//place array window
				new Array().setVisible(true);
			}
		});
		array.setForeground(new Color(153, 0, 0));
		array.setBackground(new Color(153, 255, 255));
		array.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		array.setBounds(250, 51, 97, 27);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//for array
				new Stack().setVisible(true);
				
			}
		});
		stack.setBackground(new Color(255, 204, 153));
		stack.setForeground(new Color(102, 0, 153));
		stack.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		stack.setBounds(100, 108, 115, 27);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(0, 0, 204));
		queue.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		queue.setBackground(new Color(255, 153, 102));
		queue.setBounds(399, 108, 97, 27);
		contentPane.add(queue);
		
		JButton circularqueue = new JButton("CIRCULAR QUEUE");
		circularqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CircularQueue().setVisible(true);
			}
		});
		circularqueue.setForeground(new Color(51, 102, 51));
		circularqueue.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		circularqueue.setBackground(new Color(255, 204, 102));
		circularqueue.setBounds(57, 163, 181, 27);
		contentPane.add(circularqueue);
		
		JButton sll = new JButton("SINGLY LINKED LIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(new Color(255, 0, 0));
		sll.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		sll.setBackground(new Color(153, 255, 102));
		sll.setBounds(327, 163, 225, 27);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLY LINKED LIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setForeground(new Color(153, 0, 0));
		dll.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		dll.setBackground(new Color(153, 255, 255));
		dll.setBounds(187, 240, 225, 27);
		contentPane.add(dll);
	}
}
