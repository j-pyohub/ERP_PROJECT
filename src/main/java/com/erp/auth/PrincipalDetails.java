package com.erp.auth;

import com.erp.dto.ManagerDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@RequiredArgsConstructor
public class PrincipalDetails implements UserDetails {

    private final ManagerDTO manager;
    private Long storeNo;

    public ManagerDTO getManager(){ return manager; }
    public void setStoreNo(Long storeNo) { this.storeNo = storeNo; }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(() -> manager.getRole());
    }
    @Override
    public String getPassword() {
        return manager.getPw();
    }

    @Override
    public String getUsername() {
        return manager.getManagerId(); // 로그인 ID
    }

    public Long getStoreNo() {
        return storeNo;
    }

}
