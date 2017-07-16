package org.wyw.pupu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.wyw.pupu.domain.Collect;

public interface CollectMapper {

	@Select("select* from tb_collect where user_id=#{user_id}")
	List<Collect> collectfindAll(@Param("user_id") int user_id);
	
	@Select("select* from tb_collect where user_id=#{user_id} and good_id=#{good_id}")
	Collect collectfind(@Param("user_id") int user_id,@Param("good_id") int good_id);
	
	@Insert("insert into tb_collect(user_id,good_id,good_price) values (#{user_id},#{good_id},#{good_price})")
	void insertcollect(@Param("user_id")int user_id,
				  @Param("good_id") int good_id,
				  @Param("good_price") String good_price);
	
	@Delete("delete from tb_collect where user_id=#{user_id} and good_id=#{good_id}")
	void delcollect(@Param("user_id") int user_id,@Param("good_id") int good_id);
	
	@Delete("delete from tb_collect where user_id=#{user_id}")
	void delAllcollect(@Param("user_id") int user_id);
}
