package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurantDAO;
import model_draft.RestaurauntModel;
import view_draft.AdminDash;
import view_draft.LoginView;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantEditView;

public class EditRestaurantController implements ActionListener {

	private DTO arrays;
	private RestaurantBean restoBean;
	private RestaurantDAO restoDAO;
	private RestaurantEditView view;
	private RestaurauntModel model; // use a different model????

	public EditRestaurantController(RestaurauntModel model, RestaurantEditView view) {
		this.model = model;
		this.view = view;

		view.getBtnFinish().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (view.getTxtfield_name().getText().equals("") || view.getTxtfield_address().getText().equals("")
				|| view.getTxtfield_telephone().getText().equals("")) {
			JOptionPane.showMessageDialog(null, "one or more fields were empty.", "Oops",
					JOptionPane.INFORMATION_MESSAGE);
		} else {

			// Hardcoded for now
			DefaultListModel<String> listModel = new DefaultListModel<String>();
			listModel.addElement("aaa");
			listModel.addElement("bbb");

			RestaurantBean newRB = new RestaurantBean(view.getTxtfield_name().getText(),
					view.getTxtfield_address().getText(), view.getDeliveryJList().getModel(),
					view.getTxtfield_telephone().getText());

			newRB.setSundayOpenHour(Integer.parseInt((String) view.getComboBox().getSelectedItem()));
			newRB.setSundayOpenMinute(Integer.parseInt((String) view.getComboBox_1().getSelectedItem()));
			newRB.setSundayCloseHour(Integer.parseInt((String) view.getComboBox_2().getSelectedItem()));
			newRB.setSundayCloseMinute(Integer.parseInt((String) view.getComboBox_3().getSelectedItem()));

			newRB.setMondayOpenHour(Integer.parseInt((String) view.getComboBox_4().getSelectedItem()));
			newRB.setMondayOpenMinute(Integer.parseInt((String) view.getComboBox_5().getSelectedItem()));
			newRB.setMondayCloseHour(Integer.parseInt((String) view.getComboBox_6().getSelectedItem()));
			newRB.setMondayCloseMinute(Integer.parseInt((String) view.getComboBox_7().getSelectedItem()));

			newRB.setTuesdayOpenHour(Integer.parseInt((String) view.getComboBox_8().getSelectedItem()));
			newRB.setTuesdayOpenMinute(Integer.parseInt((String) view.getComboBox_9().getSelectedItem()));
			newRB.setTuesdayCloseHour(Integer.parseInt((String) view.getComboBox_10().getSelectedItem()));
			newRB.setTuesdayCloseMinute(Integer.parseInt((String) view.getComboBox_11().getSelectedItem()));

			newRB.setWednesdayOpenHour(Integer.parseInt((String) view.getComboBox_12().getSelectedItem()));
			newRB.setWednesdayOpenMinute(Integer.parseInt((String) view.getComboBox_13().getSelectedItem()));
			newRB.setWednesdayCloseHour(Integer.parseInt((String) view.getComboBox_14().getSelectedItem()));
			newRB.setWednesdayCloseMinute(Integer.parseInt((String) view.getComboBox_15().getSelectedItem()));

			newRB.setThursdayOpenHour(Integer.parseInt((String) view.getComboBox_16().getSelectedItem()));
			newRB.setThursdayOpenMinute(Integer.parseInt((String) view.getComboBox_17().getSelectedItem()));
			newRB.setThursdayCloseHour(Integer.parseInt((String) view.getComboBox_18().getSelectedItem()));
			newRB.setThursdayCloseMinute(Integer.parseInt((String) view.getComboBox_19().getSelectedItem()));

			newRB.setFridayOpenHour(Integer.parseInt((String) view.getComboBox_20().getSelectedItem()));
			newRB.setFridayOpenMinute(Integer.parseInt((String) view.getComboBox_21().getSelectedItem()));
			newRB.setFridayCloseHour(Integer.parseInt((String) view.getComboBox_22().getSelectedItem()));
			newRB.setFridayCloseMinute(Integer.parseInt((String) view.getComboBox_23().getSelectedItem()));

			newRB.setSaturdayOpenHour(Integer.parseInt((String) view.getComboBox_24().getSelectedItem()));
			newRB.setSaturdayOpenMinute(Integer.parseInt((String) view.getComboBox_25().getSelectedItem()));
			newRB.setSaturdayCloseHour(Integer.parseInt((String) view.getComboBox_26().getSelectedItem()));
			newRB.setSaturdayCloseMinute(Integer.parseInt((String) view.getComboBox_27().getSelectedItem()));

			RestaurantBean oldRB = (RestaurantBean) view.getRestoJList().getSelectedValue();

			for (int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
				if (DTO.getInstance().getRestaurauntList().get(i).getId() == oldRB.getId()) {
					DTO.getInstance().getRestaurauntList().remove(i);
					break;
				}
			}

			DTO.getInstance().getRestaurauntList().add(newRB);

			// jlist being updated
			DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
			for (int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {

				RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
				model.addElement(item);
			}
			view.getRestoJList().setModel(model);
			
			int temp;
			temp = JOptionPane.showConfirmDialog(null, "Are you sure you would like to edit this restaurant?");

			if (temp == 0) {
				JOptionPane.showMessageDialog(null, "Restaurant has been successfully edited.");

			}
		}
		

	}

}
