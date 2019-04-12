package pojo;

import java.util.Date;

public class Text {
    private Integer textId;

    private String textTitle;

    private Date textReleasedate;

    private Integer textWriterid;

    private String textImg;

    private Integer textLikenum;

    private Integer textCommentnum;

    private Integer textCount;

    private Integer textCollectnum;

    private String textContent;

    private User user;
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	public Integer getTextId() {
        return textId;
    }

    public void setTextId(Integer textId) {
        this.textId = textId;
    }

    public String getTextTitle() {
        return textTitle;
    }

    public void setTextTitle(String textTitle) {
        this.textTitle = textTitle == null ? null : textTitle.trim();
    }

    public Date getTextReleasedate() {
        return textReleasedate;
    }

    public void setTextReleasedate(Date textReleasedate) {
        this.textReleasedate = textReleasedate;
    }

    public Integer getTextWriterid() {
        return textWriterid;
    }

    public void setTextWriterid(Integer textWriterid) {
        this.textWriterid = textWriterid;
    }

    public String getTextImg() {
        return textImg;
    }

    public void setTextImg(String textImg) {
        this.textImg = textImg == null ? null : textImg.trim();
    }

    public Integer getTextLikenum() {
        return textLikenum;
    }

    public void setTextLikenum(Integer textLikenum) {
        this.textLikenum = textLikenum;
    }

    public Integer getTextCommentnum() {
        return textCommentnum;
    }

    public void setTextCommentnum(Integer textCommentnum) {
        this.textCommentnum = textCommentnum;
    }

    public Integer getTextCount() {
        return textCount;
    }

    public void setTextCount(Integer textCount) {
        this.textCount = textCount;
    }

    public Integer getTextCollectnum() {
        return textCollectnum;
    }

    public void setTextCollectnum(Integer textCollectnum) {
        this.textCollectnum = textCollectnum;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent == null ? null : textContent.trim();
    }
    @Override
	public String toString() {
		return "Text [textId=" + textId + ", textTitle=" + textTitle + ", textReleasedate=" + textReleasedate
				+ ", textWriterid=" + textWriterid + ", textImg=" + textImg + ", textLikenum=" + textLikenum
				+ ", textCommentnum=" + textCommentnum + ", textCount=" + textCount + ", textCollectnum="
				+ textCollectnum + ", textContent=" + textContent + ", user=" + user + "]";
	}
}