package cn.com.hs.one.biz.home.service.impl;

import org.springframework.stereotype.Service;

import cn.com.hs.one.biz.home.service.HomeService;


@Service
public class HomeServiceImpl implements HomeService {

	public String home(){
		return "Hello Spring";
	}
}
