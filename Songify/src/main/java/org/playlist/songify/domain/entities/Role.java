package org.playlist.songify.domain.entities;

import org.springframework.security.core.GrantedAuthority;

public class Role extends BaseEntity implements GrantedAuthority {

    private String authority;

    public Role(){}

    public Role(String authority){
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
