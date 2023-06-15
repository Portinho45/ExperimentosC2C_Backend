package pe.edu.upc.connection2connection.services;
import pe.edu.upc.connection2connection.entities.Role;

import java.util.List;


public interface IRoleService {
	public void insert(Role role);

	List<Role> list();


}
