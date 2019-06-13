package com.bawei.service;

import java.util.List;

public interface MovieService {

	List getList(/*String mname, String dname, int dida, String startTime, String endTime, int minPrice, int maxPrice,
			int shotTime, int longTime*/);

	void delete(int id);

}
