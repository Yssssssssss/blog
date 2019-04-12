package service;

import java.util.List;

import pojo.Focus;
import pojo.Text;

public interface FocusService {
	public int saveFocus(Focus focus);
	public int delFocus(Focus focus);
	public List<Focus> getUserFocus(int userId);
	public List<Focus> getUserFans(int userId);
	public List<Focus> getUserCheckFocus(Focus focus);
	public List<Text> getFocusText(List<Focus> list);
}
