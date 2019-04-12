package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.TextMapper;
import pojo.Text;
import pojo.TextExample;
import pojo.TextExample.Criteria;
import service.TextService;

@Service
public class TextServiceImpl implements TextService {
	@Autowired
	TextMapper textMapper;


	@Override
	public List<Text> getAllText() {
		TextExample example=new TextExample();
		example.setOrderByClause("text_releasedate desc");
		List<Text> list = textMapper.selectByExample(example);
		return list;
	}

	@Override
	public int saveText(Text text) {
		return  textMapper.insertSelective(text);
	}

	@Override
	public List<Text> getAllByWriterId(int writerId) {// 查找某人的所有文章
		TextExample example = new TextExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andTextWriteridEqualTo(writerId);
		return textMapper.selectByExample(example);
	}

	@Override
	public Text getById(int id) {
		Text text = textMapper.selectByPrimaryKey(id);
		if (text != null) {
			this.updTextDataNumAdd("count", id);// 点击量加一
			return text;
		}
		return text;
	}

	@Override
	public List<Text> getTextsByTitle(String title) {
		TextExample example = new TextExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andTextTitleLike("%" + title + "%");
		return textMapper.selectByExample(example);
	}

	@Override
	public List<Text> getByCount(int toIndex) {
		TextExample example = new TextExample();
		Criteria createCriteria = example.createCriteria();
		example.setOrderByClause("text_count  desc");
		return textMapper.selectByExample(example).subList(0, toIndex);// 取一定量的数据
	}

	@Override
	public List<Text> getByLike(int toIndex) {
		TextExample example = new TextExample();
		Criteria createCriteria = example.createCriteria();
		example.setOrderByClause("text_likeNum  desc");
		return textMapper.selectByExample(example).subList(0, toIndex);// 取一定量的数据
	}

	@Override
	public List<Text> getByCollect(int toIndex) {
		TextExample example = new TextExample();
		Criteria createCriteria = example.createCriteria();
		example.setOrderByClause("text_collectNum  desc");
		return textMapper.selectByExample(example).subList(0, toIndex);// 取一定量的数据
	}

	@Override
	public List<Text> getByComment(int toIndex) {
		TextExample example = new TextExample();
		Criteria createCriteria = example.createCriteria();
		example.setOrderByClause("text_commentNum  desc");
		return textMapper.selectByExample(example).subList(0, toIndex);// 取一定量的数据
	}

	@Override
	public int updById(Text text) {
		return textMapper.updateByPrimaryKeySelective(text);
	}

	@Override
	public int detById(int textId) {
		// 删除文章，需要用户文章数减一，文章评论都要被删除，收藏表该文章的内容都要被删除
		return textMapper.deleteByPrimaryKey(textId);
	}

	@Override
	public int updTextDataNumAdd(String type, int id) {
		Text text = new Text();
		text.setTextId(id);
		int i = 0;
		if (type.equalsIgnoreCase("comment")) {
			text.setTextCommentnum(1);// 添加的数量
			i = textMapper.updateByPrimaryKeySelectiveCountAdd(text);
		} else if (type.equalsIgnoreCase("like")) {
			text.setTextLikenum(1);
			;
			i = textMapper.updateByPrimaryKeySelectiveCountAdd(text);
		} else if (type.equalsIgnoreCase("collection")) {
			text.setTextCollectnum(1);
			i = textMapper.updateByPrimaryKeySelectiveCountAdd(text);
		} else if (type.equalsIgnoreCase("count")) {
			text.setTextCount(1);
			i = textMapper.updateByPrimaryKeySelectiveCountAdd(text);
		}
		return i;
	}

	@Override
	public int updTextDataNumSub(String type, int id) {
		Text text = new Text();
		text.setTextId(id);
		int i = 0;
		if (type.equalsIgnoreCase("comment")) {
			text.setTextCommentnum(-1);// 添加的数量
			i = textMapper.updateByPrimaryKeySelectiveCountAdd(text);
		} else if (type.equalsIgnoreCase("like")) {
			text.setTextLikenum(-1);
			i = textMapper.updateByPrimaryKeySelectiveCountAdd(text);
		} else if (type.equalsIgnoreCase("collection")) {
			text.setTextCollectnum(-1);
			i = textMapper.updateByPrimaryKeySelectiveCountAdd(text);
		}
		return i;
	}
}
