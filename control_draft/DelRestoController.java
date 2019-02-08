package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import model_draft.DTO;
import model_draft.RestaurantBean;
import model_draft.RestaurauntModel;
import view_draft.AdminDash;
import view_draft.RestaurantCreateView;
import view_draft.RestaurantDeleteView;

public class DelRestoController implements ActionListener {

	public RestaurantBean restoBean;
	public RestaurauntModel model;
	public RestaurantDeleteView restoDelView;

	public DelRestoController(RestaurauntModel model, RestaurantDeleteView restoDelView) {
		this.restoDelView = restoDelView;
		this.model = model;

		restoDelView.getBtnDeleteRestaurant().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		int temp;
		temp = JOptionPane.showConfirmDialog(null,
				"Are you sure you would like to delete this restaurant?\nChnages made cannot be undone.");

		// Clear the fields after adding information
		if (temp == 0) {
			JOptionPane.showMessageDialog(null, "Restaurant has been deleted.");
			restoDelView.getTxtfield_name().setText("");
			restoDelView.getTxtfield_address().setText("");
			restoDelView.getTxtfield_telephone().setText("");
			restoDelView.getTextField().setText("");
			restoDelView.comboResetHour();
			restoDelView.comboResetMinute();

			RestaurantBean oldRB = (RestaurantBean) restoDelView.getList().getSelectedValue();

			for (int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
				if (DTO.getInstance().getRestaurauntList().get(i).getId() == oldRB.getId()) {
					DTO.getInstance().getRestaurauntList().remove(i);
					break;
				}
			}

			// JList being updated
			DefaultListModel<RestaurantBean> model = new DefaultListModel<>();
			for (int i = 0; i < DTO.getInstance().getRestaurauntList().size(); i++) {
				RestaurantBean item = DTO.getInstance().getRestaurauntList().get(i);
				model.addElement(item);
			}
			restoDelView.getList().setModel(model);

			// TODO: Clear all the fields and the comboboxes
			restoDelView.getTxtfield_name().setText("");
			restoDelView.getTxtfield_address().setText("");
			restoDelView.getTxtfield_telephone().setText("");

			restoDelView.comboResetHour();
			restoDelView.comboResetMinute();

		}

	}

}
