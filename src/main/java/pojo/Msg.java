package pojo;

import java.util.HashMap;

public class Msg {
private int code;
private String msg;
private HashMap map=new HashMap();
@Override
public String toString() {
	return "Msg [code=" + code + ", msg=" + msg + ", map=" + map + "]";
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public HashMap<String, Object> getMap() {
	return map;
}
public void setMap(HashMap map) {
	this.map = map;
}
public static Msg success() {
	Msg result=new Msg();
	result.setCode(100);
	result.setMsg("成功");
	return result;
}
public static Msg failed() {
	Msg result=new Msg();
	result.setCode(200);
	result.setMsg("失败");
	return result;
}
public  Msg add(String key,Object value) {
	 this.getMap().put(key, value);
	 return this;
}
}
