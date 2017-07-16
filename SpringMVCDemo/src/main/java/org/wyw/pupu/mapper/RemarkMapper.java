package org.wyw.pupu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.wyw.pupu.domain.Remark;

public interface RemarkMapper {
	@Insert("insert into tb_remark values (#{user_id},#{good_id},#{order_id},#{remark},#{logistics},#{quality},#{ service})")
	void insRemark(@Param("user_id")int user_id,
			  @Param("good_id") int good_id,
			  @Param("order_id") int order_id,
			  @Param("remark") String remark,
			@Param("logistics")String logistics,
			  @Param("quality") String quality,
			  @Param("service") String service);
	
	@Select("select * from tb_remark where good_id=#{good_id}")
	Remark remark(@Param("good_id") int good_id);
			  
}
