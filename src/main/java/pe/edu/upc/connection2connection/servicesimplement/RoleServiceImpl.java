package pe.edu.upc.connection2connection.servicesimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.connection2connection.entities.Role;
import pe.edu.upc.connection2connection.repositories.IRoleRepository;
import pe.edu.upc.connection2connection.services.IRoleService;

import java.util.List;
@Service
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private IRoleRepository rR;

	@Override
	public void insert(Role role) {
		rR.save(role);
	}

	@Override
	public List<Role> list() {
		// TODO Auto-generated method stub
		return rR.findAll();
	}
}
