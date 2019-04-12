package pojo;

public class Focus {
    private Integer focusId;

    private Integer focusUserid;

    private Integer focusBeuserid;
    
    private User user;

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Focus [focusId=" + focusId + ", focusUserid=" + focusUserid + ", focusBeuserid=" + focusBeuserid
				+ ", user=" + user + "]";
	}

	public Integer getFocusId() {
        return focusId;
    }

    public void setFocusId(Integer focusId) {
        this.focusId = focusId;
    }

    public Integer getFocusUserid() {
        return focusUserid;
    }

    public void setFocusUserid(Integer focusUserid) {
        this.focusUserid = focusUserid;
    }

    public Integer getFocusBeuserid() {
        return focusBeuserid;
    }

    public void setFocusBeuserid(Integer focusBeuserid) {
        this.focusBeuserid = focusBeuserid;
    }
}