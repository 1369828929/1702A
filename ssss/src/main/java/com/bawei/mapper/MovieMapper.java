package com.bawei.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;
public interface MovieMapper {

	List getList(/*@Param("mname")String mname, @Param("dname")String dname, @Param("dida")int dida, @Param("startTime")String startTime, @Param("endTime")String endTime, @Param("minPrice")int minPrice, @Param("maxPrice")int maxPrice,
			@Param("shotTime")int shotTime, @Param("longTime")int longTime*/);

	void delete(@Param("id")int id);
	
}
