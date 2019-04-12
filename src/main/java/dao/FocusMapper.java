package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Focus;
import pojo.FocusExample;

public interface FocusMapper {
	long countByExample(FocusExample example);

	int deleteByExample(FocusExample example);

	int deleteByPrimaryKey(Integer focusId);

	int insert(Focus record);

	int insertSelective(Focus record);

	List<Focus> selectByExampleGetFocus(FocusExample example);

	List<Focus> selectByExampleGetFans(FocusExample example);

	Focus selectByPrimaryKey(Integer focusId);

	int updateByExampleSelective(@Param("record") Focus record, @Param("example") FocusExample example);

	int updateByExample(@Param("record") Focus record, @Param("example") FocusExample example);

	int updateByPrimaryKeySelective(Focus record);

	int updateByPrimaryKey(Focus record);
}