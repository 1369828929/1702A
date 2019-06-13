package com.bawei.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.mapper.MovieMapper;

@Service
public class MovieServiceImpl implements MovieService {
	@Resource
	private MovieMapper mapper;

	@Override
	public List getList(/*String mname, String dname, int dida, String startTime, String endTime, int minPrice,
			int maxPrice, int shotTime, int longTime*/) {
		// TODO Auto-generated method stub
		return mapper.getList(/*mname,dname,dida,startTime,endTime,minPrice,maxPrice,shotTime,longTime*/);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		mapper.delete(id);
	}
	
}
