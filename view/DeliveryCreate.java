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

public class DeliveryCreate {

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
					DeliveryCreate window = new DeliveryCreate();
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
	public DeliveryCreate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainPanel = new JPanel();
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
//		
		JMenu FileMenu = new JMenu("File");
		menuBar.add(FileMenu);
//		
		JMenuItem DisconnectMI = new JMenuItem("Disconnect");
		FileMenu.add(DisconnectMI);
		
		JMenuItem CloseMI = new JMenuItem("Close");
		FileMenu.add(CloseMI);
//		
		JMenu mnNewMenu_1 = new JMenu("Restaurant");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem CreateResMI = new JMenuItem("Create");
		mnNewMenu_1.add(CreateResMI);
		
		JMenuItem EditResMI = new JMenuItem("Edit");
		mnNewMenu_1.add(EditResMI);
		
		JMenuItem DeleteResMI = new JMenuItem("Delete");
		mnNewMenu_1.add(DeleteResMI);
		
		JMenu ResMenMenu = new JMenu("Menu");
		menuBar.add(ResMenMenu);
		
		JMenuItem CreateMenuMI = new JMenuItem("Create");
		ResMenMenu.add(CreateMenuMI);
		
		JMenuItem EditMenuMI = new JMenuItem("Edit");
		ResMenMenu.add(EditMenuMI);
		
		JMenuItem DeleteMenuMI = new JMenuItem("Delete");
		ResMenMenu.add(DeleteMenuMI);
//		
		JMenu DeliveryGuyMenu = new JMenu("Delivery Guy");
		menuBar.add(DeliveryGuyMenu);
		
		JMenuItem CreateDeliveryGuyMI = new JMenuItem("Create");
		DeliveryGuyMenu.add(CreateDeliveryGuyMI);
		
		JMenuItem EditDeliveryGuyMI = new JMenuItem("Edit");
		DeliveryGuyMenu.add(EditDeliveryGuyMI);
		
		JMenuItem DeleteDeliveryGuyMI = new JMenuItem("Delete");
		DeliveryGuyMenu.add(DeleteDeliveryGuyMI);
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
				
				JLabel AddDeliverylbl = new JLabel("Add new Delivery Guy");
				AddDeliverylbl.setHorizontalAlignment(SwingConstants.CENTER);
				LabelPan.add(AddDeliverylbl);
				AddDeliverylbl.setFont(new Font("Arial", Font.BOLD, 20));
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
						Phonetf.setText("");
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
				
				JButton Savebtn = new JButton("Save");
				Savebtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					}
				});
				SubmitPan.add(Savebtn);
		
	}
}
