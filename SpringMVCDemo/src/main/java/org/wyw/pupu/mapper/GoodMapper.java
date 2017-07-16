package org.wyw.pupu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.wyw.pupu.domain.Good;
import org.wyw.pupu.domain.Remark;

public interface GoodMapper {


	@Select("select* from tb_good where type=#{type}")
	List<Good> typefindAll(@Param("type") String type);
	
	@Select("select* from tb_good where type1=#{type1}")
	List<Good> type1findAll(@Param("type1") String type1);
	
	@Select("select* from tb_good where id=#{id}")
	Good singlefindAll(@Param("id") Integer id);
	
	@Select("select* from tb_good where now=#{now}")
	List<Good> nowfindAll(@Param("now") String now);
	
	@Select("select* from tb_remark where good_id=#{id}")
	List<Remark> remarkfindAll(@Param("id") Integer id);
}
