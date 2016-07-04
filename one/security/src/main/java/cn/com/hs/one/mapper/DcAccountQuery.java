package cn.com.hs.one.mapper;

import cn.com.hs.one.model.DcAccount;

public interface DcAccountQuery {

	public DcAccount findByUsername(String username);
}
