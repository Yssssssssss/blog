package blog;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import dao.UserMapper;
import serviceImpl.CommentServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class MapperTest {
	@Autowired
	UserMapper usermapper;
	
	@Autowired
	CommentServiceImpl commentService;
	@Test
	public void insert() {
		//根据count排序
		/*TextExample example=new TextExample();
		Criteria createCriteria = example.createCriteria();
		example.setOrderByClause("count");
		 List<Text> list = textMapper.selectByExample(example);
		 */
		int delTextAllComment = commentService.delTextAllComment(16);System.out.println(delTextAllComment);
		}
	
	
	@Test
	public void seTest() {
	}
}
