package org.wyw.pupu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.wyw.pupu.domain.Order;

public interface OrderMapper {

	@Select("select * from tb_order where user_id=#{user_id} order by porr desc")
	List<Order> orderfindAll(@Param("user_id") int user_id);
	
	@Insert("insert into tb_order(user_id,good_id,good_price,state,count,total,porr) values (#{user_id},#{good_id},#{good_price},#{state},#{count},#{total},#{porr})")
	void insertorder(@Param("user_id")int user_id,
			  @Param("good_id") int good_id,
			  @Param("good_price") String good_price,
			  @Param("state") String state,
			  @Param("count") int count,
			  @Param("total") float total,
			  @Param("porr") String porr);
	
	@Update("update tb_order set state=#{state},porr=#{porr} where id=#{id}")
	void updateorder(@Param("id") int id,
			@Param("state") String state,
			@Param("porr") String porr);
	
	//更新库存
	@Update("update tb_good set count=count-#{count} where id=#{id}")
	void updategood(@Param("id") int id,
			@Param("count") int count);
	
	//减少购物车里的商品
	@Delete("delete from tb_cart where user_id=#{user_id} and good_id=#{good_id}")
	void deletecart(@Param("user_id")int user_id,
			  @Param("good_id") int good_id);

	
	//更新销售数据
	@Update("update tb_good set sale=sale+#{count} where id=#{id}")
	void updatesale(@Param("id") int id,
			@Param("count") int count);
	
	@Select("select * from tb_order where user_id=#{user_id} and id=#{good_id}")
	Order orderGet(@Param("user_id")int user_id,
			  @Param("good_id") int good_id);
}
