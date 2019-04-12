package pojo;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userGender;

    private String userWords;

    

	private String userEmail;

    private Integer userFansnum;

    private Date userRegistdate;

    private String userHeadportrait;

    private Integer userCollectionsnum;

    private Integer userFocusnum;

    private Integer userTextsnum;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender == null ? null : userGender.trim();
    }

    public String getUserWords() {
        return userWords;
    }

    public void setUserWords(String userWords) {
        this.userWords = userWords == null ? null : userWords.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Integer getUserFansnum() {
        return userFansnum;
    }

    public void setUserFansnum(Integer userFansnum) {
        this.userFansnum = userFansnum;
    }

    public Date getUserRegistdate() {
        return userRegistdate;
    }

    public void setUserRegistdate(Date userRegistdate) {
        this.userRegistdate = userRegistdate;
    }

    public String getUserHeadportrait() {
        return userHeadportrait;
    }

    public void setUserHeadportrait(String userHeadportrait) {
        this.userHeadportrait = userHeadportrait == null ? null : userHeadportrait.trim();
    }

    public Integer getUserCollectionsnum() {
        return userCollectionsnum;
    }

    public void setUserCollectionsnum(Integer userCollectionsnum) {
        this.userCollectionsnum = userCollectionsnum;
    }

    public Integer getUserFocusnum() {
        return userFocusnum;
    }

    public void setUserFocusnum(Integer userFocusnum) {
        this.userFocusnum = userFocusnum;
    }

    public Integer getUserTextsnum() {
        return userTextsnum;
    }

    public void setUserTextsnum(Integer userTextsnum) {
        this.userTextsnum = userTextsnum;
    }
    @Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userGender="
				+ userGender + ", userWords=" + userWords + ", userEmail=" + userEmail + ", userFansnum=" + userFansnum
				+ ", userRegistdate=" + userRegistdate + ", userHeadportrait=" + userHeadportrait
				+ ", userCollectionsnum=" + userCollectionsnum + ", userFocusnum=" + userFocusnum + ", userTextsnum="
				+ userTextsnum + "]";
	}
}