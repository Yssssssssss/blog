package service;

import java.util.List;

import pojo.Text;

public interface TextService {
	public int saveText(Text text);
	public List<Text> getAllByWriterId(int writerId);
	public Text getById(int id);
	public List<Text> getTextsByTitle(String title);
	public List<Text> getByCount(int toIndex);
	public List<Text> getByLike(int toIndex);
	public List<Text> getByCollect(int toIndex);
	public List<Text> getByComment(int toIndex);
	public int updById(Text text) ;
	public int detById(int textId);
	public int updTextDataNumAdd(String type, int id);
	public int updTextDataNumSub(String type, int id);
	public List<Text> getAllText();
}
