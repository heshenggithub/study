package cn.com.hs.one.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cn.com.hs.one.mapper.DcAccountQuery;
import cn.com.hs.one.model.DcAccount;

public class CustomUserDetailsService implements UserDetailsService{

	@Autowired 
	DcAccountQuery dcAccountQuery;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        DcAccount dcAccount = dcAccountQuery.findByUsername(username);
        if(dcAccount == null){
            throw new UsernameNotFoundException("not found");
        }
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(dcAccount.getUserName()));
        return new org.springframework.security.core.userdetails.User(dcAccount.getUserName(),
        		dcAccount.getPassword(), authorities);
    }

}
