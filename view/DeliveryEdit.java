package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.BoxLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JList;

public class DeliveryEdit {

	private JFrame frame;
	private JTextField Nametf;
	private JTextField Phonetf;
	private JTextField Phonetf2;
	private JTextField Phonetf3;
	private JTextField Addtf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeliveryEdit window = new DeliveryEdit();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public DeliveryEdit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("File");
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem("Disconnect");
		menu.add(menuItem);
		
		JMenuItem menuItem_1 = new JMenuItem("Close");
		menu.add(menuItem_1);
		
		JMenu menu_1 = new JMenu("Restaurant");
		menuBar.add(menu_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Create");
		menu_1.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("Edit");
		menu_1.add(menuItem_3);
		
		JMenuItem menuItem_4 = new JMenuItem("Delete");
		menu_1.add(menuItem_4);
		
		JMenu menu_2 = new JMenu("Menu");
		menuBar.add(menu_2);
		
		JMenuItem menuItem_5 = new JMenuItem("Create");
		menu_2.add(menuItem_5);
		
		JMenuItem menuItem_6 = new JMenuItem("Edit");
		menu_2.add(menuItem_6);
		
		JMenuItem menuItem_7 = new JMenuItem("Delete");
		menu_2.add(menuItem_7);
		
		JMenu menu_3 = new JMenu("Delivery Guy");
		menuBar.add(menu_3);
		
		JMenuItem menuItem_8 = new JMenuItem("Create");
		menu_3.add(menuItem_8);
		
		JMenuItem menuItem_9 = new JMenuItem("Edit");
		menu_3.add(menuItem_9);
		
		JMenuItem menuItem_10 = new JMenuItem("Delete");
		menu_3.add(menuItem_10);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel CenterPan = new JPanel();
		frame.getContentPane().add(CenterPan, BorderLayout.CENTER);
				CenterPan.setLayout(new BorderLayout(0, 0));
				
				JPanel TopCenter = new JPanel();
				CenterPan.add(TopCenter, BorderLayout.NORTH);
				TopCenter.setLayout(new BorderLayout(0, 0));
				
				JPanel LabelPan = new JPanel();
				TopCenter.add(LabelPan, BorderLayout.NORTH);
				LabelPan.setLayout(new BorderLayout(0, 0));
				
				JLabel DeliveryGuylbl = new JLabel("Edit Delivery Man");
				DeliveryGuylbl.setHorizontalAlignment(SwingConstants.CENTER);
				LabelPan.add(DeliveryGuylbl);
				DeliveryGuylbl.setFont(new Font("Arial", Font.BOLD, 20));
				//		frame.getContentPane().setLayout(new BorderLayout(0, 0));
						
						JPanel Title = new JPanel();
						TopCenter.add(Title, BorderLayout.CENTER);
						Title.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 5));
						
						JLabel Namelbl = new JLabel("Name: ");
						Namelbl.setHorizontalAlignment(SwingConstants.LEFT);
						Title.add(Namelbl);
						
						Nametf = new JTextField();
						Nametf.setHorizontalAlignment(SwingConstants.RIGHT);
						Title.add(Nametf);
						Nametf.setColumns(17);
						
						JPanel TelephonePan = new JPanel();
						TopCenter.add(TelephonePan, BorderLayout.SOUTH);
						FlowLayout flowLayout = (FlowLayout) TelephonePan.getLayout();
						TelephonePan.setSize(10, 50);
						
						
						JLabel Telephonelbl = new JLabel("Telephone: ");
						TelephonePan.add(Telephonelbl);
						
						JLabel Telephonelbl2 = new JLabel("(");
						TelephonePan.add(Telephonelbl2);
						
						Phonetf = new JTextField();
						TelephonePan.add(Phonetf);
						Phonetf.setText("514");
						Phonetf.setColumns(3);
						
						JLabel Telephonelvl3 = new JLabel(")");
						TelephonePan.add(Telephonelvl3);
						
						Phonetf2 = new JTextField();
						TelephonePan.add(Phonetf2);
						Phonetf2.setColumns(5);
						
						JLabel Telephonelbl4 = new JLabel("-");
						TelephonePan.add(Telephonelbl4);
						
						Phonetf3 = new JTextField();
						TelephonePan.add(Phonetf3);
						Phonetf3.setColumns(5);
				
				JPanel MiddlePan = new JPanel();
				CenterPan.add(MiddlePan, BorderLayout.CENTER);
				MiddlePan.setLayout(new BorderLayout(0, 0));
				
				JPanel DeliveryAreaPan1 = new JPanel();
				MiddlePan.add(DeliveryAreaPan1, BorderLayout.NORTH);
				
				JPanel DeliveryAreaPan = new JPanel();
				DeliveryAreaPan1.add(DeliveryAreaPan);
				DeliveryAreaPan.setLayout(new BorderLayout(0, 0));
				
				JLabel DeliveryArealbl = new JLabel("Delivery Area");
				DeliveryArealbl.setHorizontalAlignment(SwingConstants.CENTER);
				DeliveryArealbl.setFont(new Font("Arial", Font.BOLD, 20));
				DeliveryAreaPan.add(DeliveryArealbl, BorderLayout.NORTH);
				
				JTextArea DeliveryAreaTA = new JTextArea();
				DeliveryAreaPan.add(DeliveryAreaTA);
				DeliveryAreaTA.setPreferredSize(new Dimension(200, 130));
				
				JPanel CenterPan1 = new JPanel();
				MiddlePan.add(CenterPan1, BorderLayout.CENTER);
				
				JPanel AddDeleteSubmitPan = new JPanel();
				CenterPan1.add(AddDeleteSubmitPan);
				AddDeleteSubmitPan.setLayout(new BorderLayout(0, 0));
				
	
				JPanel DeliveryAreaTAPan = new JPanel();
				AddDeleteSubmitPan.add(DeliveryAreaTAPan);
				DeliveryAreaTAPan.setLayout(new GridLayout(0, 1, 0, 0));
				
				JPanel AddDeliveryArea = new JPanel();
				DeliveryAreaTAPan.add(AddDeliveryArea);
				
				JLabel lblNewLabel = new JLabel("Delivery Area :");
				AddDeliveryArea.add(lblNewLabel);
				
				Addtf = new JTextField();
				AddDeliveryArea.add(Addtf);
				Addtf.setColumns(4);
				
				JButton Addbtn = new JButton("Add Delivery Area");
				AddDeliveryArea.add(Addbtn);
				
				JPanel DeleteArea = new JPanel();
				DeliveryAreaTAPan.add(DeleteArea);
				FlowLayout flowLayout_1 = (FlowLayout) DeleteArea.getLayout();
				
				JButton Deletebtn = new JButton("Delete Delivery Area");
				DeleteArea.add(Deletebtn);
				
				JPanel SubmitPan = new JPanel();
				DeliveryAreaTAPan.add(SubmitPan);
				
				JButton Submitbtn = new JButton("Submit");
				Submitbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				SubmitPan.add(Submitbtn);
				
				JPanel RightPan = new JPanel();
				frame.getContentPane().add(RightPan, BorderLayout.EAST);
				RightPan.setLayout(new BorderLayout(0, 0));
				
				JPanel TitlePan = new JPanel();
				RightPan.add(TitlePan, BorderLayout.NORTH);
				TitlePan.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
				
				JLabel DeliveryManlbl = new JLabel("Delivery Man");
				TitlePan.add(DeliveryManlbl);
				DeliveryManlbl.setFont(new Font("Arial", Font.BOLD, 14));
				
				JPanel SelectPan = new JPanel();
				FlowLayout fl_SelectPan = (FlowLayout) SelectPan.getLayout();
				RightPan.add(SelectPan, BorderLayout.SOUTH);
				
				JButton Selectbtn = new JButton("Select");
				SelectPan.add(Selectbtn);
				
				JPanel ListPan = new JPanel();
				RightPan.add(ListPan, BorderLayout.WEST);
				
				JList list = new JList();
				list.setVisibleRowCount(20);
				list.setPreferredSize(new Dimension(225, 350));
				ListPan.add(list);
		
	}
}
