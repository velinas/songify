package org.playlist.songify.service;

import org.playlist.songify.domain.models.service.RoleServiceModel;
import org.playlist.songify.domain.models.service.UserServiceModel;

import java.util.Set;

public interface RoleService {

    void seedRolesInDb();

    //void assignUserRoles(UserServiceModel userServiceModel, long numberOfUsers);
    Set<RoleServiceModel> findAllRoles();

    RoleServiceModel findByAuthority(String authority);

}
