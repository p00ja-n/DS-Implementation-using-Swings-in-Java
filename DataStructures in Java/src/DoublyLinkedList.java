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


public class DoublyLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField frontelem;
	private JTextField rearelem;
	private JTextField displaybox;
	private class Node{
		Node prelink;
		int data;
		Node nextlink;
	}
	private Node first;
	private Node temp;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 756, 494);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST DATASTRUCTURE");
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setBounds(224, 10, 324, 19);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterTheElement_1 = new JLabel("ENTER THE ELEMENT");
		lblEnterTheElement_1.setForeground(new Color(51, 0, 204));
		lblEnterTheElement_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblEnterTheElement_1.setBounds(133, 64, 220, 19);
		contentPane.add(lblEnterTheElement_1);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT");
		lblEnterTheElement.setForeground(new Color(51, 0, 255));
		lblEnterTheElement.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		lblEnterTheElement.setBounds(133, 117, 220, 19);
		contentPane.add(lblEnterTheElement);
		
		frontelem = new JTextField();
		frontelem.setBounds(363, 66, 126, 19);
		contentPane.add(frontelem);
		frontelem.setColumns(10);
		
		rearelem = new JTextField();
		rearelem.setColumns(10);
		rearelem.setBounds(363, 119, 126, 19);
		contentPane.add(rearelem);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert front
				int elem=Integer.valueOf(frontelem.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				JOptionPane.showMessageDialog(contentPane,"Element Inserted at front is "+elem);
				frontelem.setText("");
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
			}
		});
		insertfront.setBackground(new Color(204, 255, 255));
		insertfront.setForeground(new Color(255, 0, 0));
		insertfront.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		insertfront.setBounds(538, 65, 154, 25);
		contentPane.add(insertfront);
		
		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//insert rear
				int elem=Integer.valueOf(rearelem.getText());
				Node newnode=new Node();
				newnode.data=elem;
				newnode.prelink=null;
				newnode.nextlink=null;
				JOptionPane.showMessageDialog(contentPane,"Element Inserted at rear is "+elem);
				rearelem.setText("");
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
		
				}
			}
		});
		insertrear.setForeground(Color.RED);
		insertrear.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		insertrear.setBackground(new Color(204, 255, 255));
		insertrear.setBounds(538, 111, 154, 25);
		contentPane.add(insertrear);
		
		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete rear
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible");
				}
				if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deleted element is "+first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					JOptionPane.showMessageDialog(contentPane,"Deleted element is "+temp.nextlink.data);
					temp.nextlink=null;
				}
				
			}
		});
		deleterear.setForeground(Color.RED);
		deleterear.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		deleterear.setBackground(new Color(204, 255, 255));
		deleterear.setBounds(335, 175, 154, 25);
		contentPane.add(deleterear);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//delete front
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deletion not possible");
				}
				if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Deleted element is "+first.data);
					first=null;
					
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane,"Deleted element is "+first.data);
					first=first.nextlink;
					first.prelink=null;
				}
			}
		});
		deletefront.setForeground(Color.RED);
		deletefront.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		deletefront.setBackground(new Color(204, 255, 255));
		deletefront.setBounds(335, 233, 154, 25);
		contentPane.add(deletefront);
		
		displaybox = new JTextField();
		displaybox.setForeground(new Color(102, 0, 102));
		displaybox.setBackground(new Color(204, 204, 255));
		displaybox.setBounds(77, 396, 596, 31);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton displayreverse = new JButton("DISPLAY REVERSE");
		displayreverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY REVERSE METHOD
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				if(first.nextlink==null)
				{
					displaybox.setText(String.valueOf(first.data));
					
				}
				else
				{
					String message="";
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						message=message+temp.data+" ";
						temp=temp.prelink;
					}
					displaybox.setText(message);
				}
				
			}
		});
		displayreverse.setForeground(Color.RED);
		displayreverse.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		displayreverse.setBackground(new Color(204, 255, 255));
		displayreverse.setBounds(415, 307, 167, 25);
		contentPane.add(displayreverse);
		
		JButton displayforward = new JButton("DISPLAY FORWARD");
		displayforward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLAY FORWARD
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane,"Display not possible");
				}
				if(first.nextlink==null)
				{
					displaybox.setText(String.valueOf(first.data));
					
				}
				else
				{
					temp=first;
					String message="";
					while(temp!=null)
					{
						message=message+temp.data+" ";
						temp=temp.nextlink;
					}
					displaybox.setText(message);
				}
				
			}
		});
		displayforward.setForeground(Color.RED);
		displayforward.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		displayforward.setBackground(new Color(204, 255, 255));
		displayforward.setBounds(158, 307, 180, 25);
		contentPane.add(displayforward);
	}
}
