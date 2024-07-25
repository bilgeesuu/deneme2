package deneme2.deneme2.service;


import deneme2.deneme2.model.Role;
import deneme2.deneme2.repository.RoleRepository;
import org.springframework.stereotype.Service;
import deneme2.deneme2.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Role getRoleById(Long id) {
        return roleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Role not found"));
    }

    public Role saveRole(Role role) {
        return roleRepository.save(role);}
}
