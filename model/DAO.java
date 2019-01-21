package model;

public class DAO {

	private DAO() {
		this.createNewClient(new ClientBean("Murdaro", "123", "123", "Amparo", "Jonathan", "3600 Avenue Du Parc",
				"JonathanAmparo2@live.com", "301-999-6666"));
	}

	public void createNewClient(ClientBean client) {
		int id = DTO.clientList.size(); // Gets size and increments id #
		client.setId(id + "");
		DTO.clientList.add(client);
	}
}
