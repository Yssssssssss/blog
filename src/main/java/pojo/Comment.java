package pojo;

import java.util.Date;

public class Comment {
	private Integer commentId;

	private Integer commentTextid;

	private Integer commentUserid;

	private Date commentDate;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private Integer commentReplyid;

	private String commentContent;
	private User user;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public Integer getCommentTextid() {
		return commentTextid;
	}

	public void setCommentTextid(Integer commentTextid) {
		this.commentTextid = commentTextid;
	}

	public Integer getCommentUserid() {
		return commentUserid;
	}

	public void setCommentUserid(Integer commentUserid) {
		this.commentUserid = commentUserid;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public Integer getCommentReplyid() {
		return commentReplyid;
	}

	public void setCommentReplyid(Integer commentReplyid) {
		this.commentReplyid = commentReplyid;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent == null ? null : commentContent.trim();
	}

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentTextid=" + commentTextid + ", commentUserid="
				+ commentUserid + ", commentDate=" + commentDate + ", commentReplyid=" + commentReplyid
				+ ", commentContent=" + commentContent + ", user=" + user + "]";
	}

	 

	 

}