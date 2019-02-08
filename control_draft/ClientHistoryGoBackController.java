package control_draft;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model_draft.ClientBean;
import model_draft.ClientModel;
import model_draft.HistoryModel;
import model_draft.RestaurauntModel;
import view_draft.ClientDashView;
import view_draft.ClientOrderHistoryView;

public class ClientHistoryGoBackController implements ActionListener {

	private ClientModel clientModel;
	private ClientDashView clientDashView;
	private ClientBean clientBean;
	private ClientOrderHistoryView clientOrderHistoryView;
	private RestaurauntModel model;
	private HistoryModel historyModel;


	public ClientHistoryGoBackController(RestaurauntModel model, ClientModel clientModel, ClientDashView clientDashView,
			ClientOrderHistoryView clientOrderHistoryView, HistoryModel historyModel) {
		this.model = model;
		this.clientModel = clientModel;
		this.clientDashView = clientDashView;
		this.clientOrderHistoryView = clientOrderHistoryView;
		this.historyModel = historyModel;

		clientOrderHistoryView.getBtnBack().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		System.out.println("Order History #1");
		clientOrderHistoryView.setVisible(false);
		clientDashView.setVisible(true);
		

		

	}

}