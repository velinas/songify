package org.playlist.songify.service;

import org.modelmapper.ModelMapper;
import org.playlist.songify.domain.entities.Role;
import org.playlist.songify.domain.models.service.RoleServiceModel;
import org.playlist.songify.domain.models.service.UserServiceModel;
import org.playlist.songify.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService{

    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository, ModelMapper modelMapper) {
        this.roleRepository = roleRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void seedRolesInDb() {
        if(this.roleRepository.count() == 0){
            this.roleRepository.saveAndFlush(new Role("ROLE_USER"));
            this.roleRepository.saveAndFlush(new Role("ROLE_ADMIN"));
        }
    }

    @Override
    public Set<RoleServiceModel> findAllRoles() {
        return this.roleRepository
                .findAll()
                .stream()
                .map(r -> this.modelMapper.map(r, RoleServiceModel.class))
                .collect(Collectors.toSet());
    }

    @Override
    public RoleServiceModel findByAuthority(String authority) {
        return this.modelMapper.map(authority, RoleServiceModel.class);
    }

    /*@Override
    public void assignUserRoles(UserServiceModel userServiceModel, long numberOfUsers) {
        if(numberOfUsers == 0){
            userServiceModel
                    .setAuthorities(this.roleRepository
                    .findAll()
                    .stream()
                    .map(r -> this.modelMapper.map(r, RoleServiceModel.class))
                    .collect(Collectors.toSet()));
        }
    }*/
}
