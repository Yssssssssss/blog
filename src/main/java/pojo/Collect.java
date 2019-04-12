package pojo;

import java.util.Date;

public class Collect {
    private Integer collectId;

    private Integer collectUserid;

    private Integer collectTextid;

    private Date collectDate;
    private Text text;
    

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getCollectUserid() {
        return collectUserid;
    }

    public void setCollectUserid(Integer collectUserid) {
        this.collectUserid = collectUserid;
    }

    public Integer getCollectTextid() {
        return collectTextid;
    }

    public void setCollectTextid(Integer collectTextid) {
        this.collectTextid = collectTextid;
    }

    public Date getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Date collectDate) {
        this.collectDate = collectDate;
    }
    @Override
	public String toString() {
		return "Collect [collectId=" + collectId + ", collectUserid=" + collectUserid + ", collectTextid="
				+ collectTextid + ", collectDate=" + collectDate + ", text=" + text + "]";
	}
}