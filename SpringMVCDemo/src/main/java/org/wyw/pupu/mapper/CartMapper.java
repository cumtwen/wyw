package org.wyw.pupu.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.wyw.pupu.domain.Cart;

public interface CartMapper {

	@Select("select * from tb_cart where user_id=#{user_id} and good_id=#{good_id} ")
	Cart cartfind(@Param("user_id") int user_id,@Param("good_id") int good_id);
	
	@Select("select * from tb_cart where user_id=#{user_id} ")
	List<Cart> cartfindAll(@Param("user_id") int user_id);
	
	@Insert("insert into tb_cart(user_id,good_id,count,good_price) values (#{user_id},#{good_id},#{count},#{good_price})")
	void insertcart(@Param("user_id")int user_id,
				  @Param("good_id") int good_id,
				  @Param("count") int count,
				  @Param("good_price") String good_price);
	@Update("update tb_cart set count=#{count} where user_id=#{user_id} and good_id=#{good_id}")
	void updateCart(@Param("user_id") int user_id,@Param("good_id") int good_id,@Param("count")int count);
	
	@Delete("delete from tb_cart where user_id=#{user_id} and good_id=#{good_id}")
	void deletecart(@Param("user_id")int user_id,
			  @Param("good_id") int good_id);
	
	@Delete("delete from tb_cart where user_id=#{user_id}")
	void delallcart(@Param("user_id")int user_id);
}
