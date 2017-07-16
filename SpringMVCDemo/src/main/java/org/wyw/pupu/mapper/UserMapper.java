package org.wyw.pupu.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.wyw.pupu.domain.User;

public interface UserMapper {

	@Insert("insert into tb_user(username,password,email,phone,address,question,answer) values(#{username},#{password},#{email},#{phone},#{address},#{question},#{answer})")
	void insertUser(@Param("username")String username,
				  @Param("password") String password,
				  @Param("email") String email,
				  @Param("phone") String phone,
				@Param("address")String address,
				  @Param("question") String question,
				  @Param("answer") String answer);

	@Select("select* from tb_user where username=#{username} and password=#{password}")
	User findUsernameAndPasd(@Param("username")String username,@Param("password")String password);
	
	
	@Select("select * from tb_user where username=#{username} and question=#{question} and answer=#{answer}")
	User findQuestionAndAnswer(@Param("username")String username,@Param("question")String question,@Param("answer")String answer);
	
	@Select("select* from tb_user where id=#{user_id} ")
	User message(@Param("user_id")int user_id);
	
	@Update("update tb_user set password=#{newpwd} where username=#{username} and password=#{password}")
	Boolean updatepwd(@Param("username")String username,@Param("password")String password,@Param("newpwd")String newpwd);

}
