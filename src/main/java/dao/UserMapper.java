package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.User;
import pojo.UserExample;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);
    
    int updateByPrimaryKeySelectiveCountAdd(User record);//增删都可以
    
    int updateByPrimaryKey(User record);
    
}