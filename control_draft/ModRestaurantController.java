package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantDAO;
import model_draft.RestaurauntModel;
import view_draft.RestaurantCreateView;

public class ModRestaurantController implements ActionListener{
	
	
	private DTO arrays;
	private RestaurantBean restoBean;
	private RestaurantDAO restoDAO;
	private RestaurantCreateView view;
	private RestaurauntModel model;
	
	public ModRestaurantController(RestaurauntModel model, RestaurantCreateView view) {
		this.model = model;
		this.view = view;
		
		view.getBtnModify().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//opening hours and minutes
		view.getComboBox_4().setSelectedItem(view.getComboBox().getSelectedItem());
		view.getComboBox_5().setSelectedItem(view.getComboBox_1().getSelectedItem());
		
		view.getComboBox_8().setSelectedItem(view.getComboBox().getSelectedItem());
		view.getComboBox_9().setSelectedItem(view.getComboBox_1().getSelectedItem());
		
		view.getComboBox_12().setSelectedItem(view.getComboBox().getSelectedItem());
		view.getComboBox_13().setSelectedItem(view.getComboBox_1().getSelectedItem());
		
		view.getComboBox_16().setSelectedItem(view.getComboBox().getSelectedItem());
		view.getComboBox_17().setSelectedItem(view.getComboBox_1().getSelectedItem());
		
		view.getComboBox_20().setSelectedItem(view.getComboBox().getSelectedItem());
		view.getComboBox_21().setSelectedItem(view.getComboBox_1().getSelectedItem());
		
		view.getComboBox_24().setSelectedItem(view.getComboBox().getSelectedItem());
		view.getComboBox_25().setSelectedItem(view.getComboBox_1().getSelectedItem());
		
		//closing hours and minutes
		view.getComboBox_6().setSelectedItem(view.getClosingH_comboBox().getSelectedItem());
		view.getComboBox_7().setSelectedItem(view.getComboBox_3().getSelectedItem());
		
		view.getComboBox_10().setSelectedItem(view.getClosingH_comboBox().getSelectedItem());
		view.getComboBox_11().setSelectedItem(view.getComboBox_3().getSelectedItem());
		
		view.getComboBox_14().setSelectedItem(view.getClosingH_comboBox().getSelectedItem());
		view.getComboBox_15().setSelectedItem(view.getComboBox_3().getSelectedItem());
		
		view.getComboBox_18().setSelectedItem(view.getClosingH_comboBox().getSelectedItem());
		view.getComboBox_19().setSelectedItem(view.getComboBox_3().getSelectedItem());
		
		view.getComboBox_22().setSelectedItem(view.getClosingH_comboBox().getSelectedItem());
		view.getComboBox_23().setSelectedItem(view.getComboBox_3().getSelectedItem());
		
		view.getComboBox_26().setSelectedItem(view.getClosingH_comboBox().getSelectedItem());
		view.getComboBox_27().setSelectedItem(view.getComboBox_3().getSelectedItem());
	}

}
