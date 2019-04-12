package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNull() {
            addCriterion("user_gender is null");
            return (Criteria) this;
        }

        public Criteria andUserGenderIsNotNull() {
            addCriterion("user_gender is not null");
            return (Criteria) this;
        }

        public Criteria andUserGenderEqualTo(String value) {
            addCriterion("user_gender =", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotEqualTo(String value) {
            addCriterion("user_gender <>", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThan(String value) {
            addCriterion("user_gender >", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderGreaterThanOrEqualTo(String value) {
            addCriterion("user_gender >=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThan(String value) {
            addCriterion("user_gender <", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLessThanOrEqualTo(String value) {
            addCriterion("user_gender <=", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderLike(String value) {
            addCriterion("user_gender like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotLike(String value) {
            addCriterion("user_gender not like", value, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderIn(List<String> values) {
            addCriterion("user_gender in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotIn(List<String> values) {
            addCriterion("user_gender not in", values, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderBetween(String value1, String value2) {
            addCriterion("user_gender between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserGenderNotBetween(String value1, String value2) {
            addCriterion("user_gender not between", value1, value2, "userGender");
            return (Criteria) this;
        }

        public Criteria andUserWordsIsNull() {
            addCriterion("user_words is null");
            return (Criteria) this;
        }

        public Criteria andUserWordsIsNotNull() {
            addCriterion("user_words is not null");
            return (Criteria) this;
        }

        public Criteria andUserWordsEqualTo(String value) {
            addCriterion("user_words =", value, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsNotEqualTo(String value) {
            addCriterion("user_words <>", value, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsGreaterThan(String value) {
            addCriterion("user_words >", value, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsGreaterThanOrEqualTo(String value) {
            addCriterion("user_words >=", value, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsLessThan(String value) {
            addCriterion("user_words <", value, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsLessThanOrEqualTo(String value) {
            addCriterion("user_words <=", value, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsLike(String value) {
            addCriterion("user_words like", value, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsNotLike(String value) {
            addCriterion("user_words not like", value, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsIn(List<String> values) {
            addCriterion("user_words in", values, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsNotIn(List<String> values) {
            addCriterion("user_words not in", values, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsBetween(String value1, String value2) {
            addCriterion("user_words between", value1, value2, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserWordsNotBetween(String value1, String value2) {
            addCriterion("user_words not between", value1, value2, "userWords");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserFansnumIsNull() {
            addCriterion("user_fansNum is null");
            return (Criteria) this;
        }

        public Criteria andUserFansnumIsNotNull() {
            addCriterion("user_fansNum is not null");
            return (Criteria) this;
        }

        public Criteria andUserFansnumEqualTo(Integer value) {
            addCriterion("user_fansNum =", value, "userFansnum");
            return (Criteria) this;
        }

        public Criteria andUserFansnumNotEqualTo(Integer value) {
            addCriterion("user_fansNum <>", value, "userFansnum");
            return (Criteria) this;
        }

        public Criteria andUserFansnumGreaterThan(Integer value) {
            addCriterion("user_fansNum >", value, "userFansnum");
            return (Criteria) this;
        }

        public Criteria andUserFansnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_fansNum >=", value, "userFansnum");
            return (Criteria) this;
        }

        public Criteria andUserFansnumLessThan(Integer value) {
            addCriterion("user_fansNum <", value, "userFansnum");
            return (Criteria) this;
        }

        public Criteria andUserFansnumLessThanOrEqualTo(Integer value) {
            addCriterion("user_fansNum <=", value, "userFansnum");
            return (Criteria) this;
        }

        public Criteria andUserFansnumIn(List<Integer> values) {
            addCriterion("user_fansNum in", values, "userFansnum");
            return (Criteria) this;
        }

        public Criteria andUserFansnumNotIn(List<Integer> values) {
            addCriterion("user_fansNum not in", values, "userFansnum");
            return (Criteria) this;
        }

        public Criteria andUserFansnumBetween(Integer value1, Integer value2) {
            addCriterion("user_fansNum between", value1, value2, "userFansnum");
            return (Criteria) this;
        }

        public Criteria andUserFansnumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_fansNum not between", value1, value2, "userFansnum");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateIsNull() {
            addCriterion("user_registDate is null");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateIsNotNull() {
            addCriterion("user_registDate is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateEqualTo(Date value) {
            addCriterionForJDBCDate("user_registDate =", value, "userRegistdate");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_registDate <>", value, "userRegistdate");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateGreaterThan(Date value) {
            addCriterionForJDBCDate("user_registDate >", value, "userRegistdate");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_registDate >=", value, "userRegistdate");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateLessThan(Date value) {
            addCriterionForJDBCDate("user_registDate <", value, "userRegistdate");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_registDate <=", value, "userRegistdate");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateIn(List<Date> values) {
            addCriterionForJDBCDate("user_registDate in", values, "userRegistdate");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_registDate not in", values, "userRegistdate");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_registDate between", value1, value2, "userRegistdate");
            return (Criteria) this;
        }

        public Criteria andUserRegistdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_registDate not between", value1, value2, "userRegistdate");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitIsNull() {
            addCriterion("user_headPortrait is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitIsNotNull() {
            addCriterion("user_headPortrait is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitEqualTo(String value) {
            addCriterion("user_headPortrait =", value, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitNotEqualTo(String value) {
            addCriterion("user_headPortrait <>", value, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitGreaterThan(String value) {
            addCriterion("user_headPortrait >", value, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitGreaterThanOrEqualTo(String value) {
            addCriterion("user_headPortrait >=", value, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitLessThan(String value) {
            addCriterion("user_headPortrait <", value, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitLessThanOrEqualTo(String value) {
            addCriterion("user_headPortrait <=", value, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitLike(String value) {
            addCriterion("user_headPortrait like", value, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitNotLike(String value) {
            addCriterion("user_headPortrait not like", value, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitIn(List<String> values) {
            addCriterion("user_headPortrait in", values, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitNotIn(List<String> values) {
            addCriterion("user_headPortrait not in", values, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitBetween(String value1, String value2) {
            addCriterion("user_headPortrait between", value1, value2, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserHeadportraitNotBetween(String value1, String value2) {
            addCriterion("user_headPortrait not between", value1, value2, "userHeadportrait");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumIsNull() {
            addCriterion("user_collectionsNum is null");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumIsNotNull() {
            addCriterion("user_collectionsNum is not null");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumEqualTo(Integer value) {
            addCriterion("user_collectionsNum =", value, "userCollectionsnum");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumNotEqualTo(Integer value) {
            addCriterion("user_collectionsNum <>", value, "userCollectionsnum");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumGreaterThan(Integer value) {
            addCriterion("user_collectionsNum >", value, "userCollectionsnum");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_collectionsNum >=", value, "userCollectionsnum");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumLessThan(Integer value) {
            addCriterion("user_collectionsNum <", value, "userCollectionsnum");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumLessThanOrEqualTo(Integer value) {
            addCriterion("user_collectionsNum <=", value, "userCollectionsnum");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumIn(List<Integer> values) {
            addCriterion("user_collectionsNum in", values, "userCollectionsnum");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumNotIn(List<Integer> values) {
            addCriterion("user_collectionsNum not in", values, "userCollectionsnum");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumBetween(Integer value1, Integer value2) {
            addCriterion("user_collectionsNum between", value1, value2, "userCollectionsnum");
            return (Criteria) this;
        }

        public Criteria andUserCollectionsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_collectionsNum not between", value1, value2, "userCollectionsnum");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumIsNull() {
            addCriterion("user_focusNum is null");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumIsNotNull() {
            addCriterion("user_focusNum is not null");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumEqualTo(Integer value) {
            addCriterion("user_focusNum =", value, "userFocusnum");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumNotEqualTo(Integer value) {
            addCriterion("user_focusNum <>", value, "userFocusnum");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumGreaterThan(Integer value) {
            addCriterion("user_focusNum >", value, "userFocusnum");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_focusNum >=", value, "userFocusnum");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumLessThan(Integer value) {
            addCriterion("user_focusNum <", value, "userFocusnum");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumLessThanOrEqualTo(Integer value) {
            addCriterion("user_focusNum <=", value, "userFocusnum");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumIn(List<Integer> values) {
            addCriterion("user_focusNum in", values, "userFocusnum");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumNotIn(List<Integer> values) {
            addCriterion("user_focusNum not in", values, "userFocusnum");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumBetween(Integer value1, Integer value2) {
            addCriterion("user_focusNum between", value1, value2, "userFocusnum");
            return (Criteria) this;
        }

        public Criteria andUserFocusnumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_focusNum not between", value1, value2, "userFocusnum");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumIsNull() {
            addCriterion("user_textsNum is null");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumIsNotNull() {
            addCriterion("user_textsNum is not null");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumEqualTo(Integer value) {
            addCriterion("user_textsNum =", value, "userTextsnum");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumNotEqualTo(Integer value) {
            addCriterion("user_textsNum <>", value, "userTextsnum");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumGreaterThan(Integer value) {
            addCriterion("user_textsNum >", value, "userTextsnum");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_textsNum >=", value, "userTextsnum");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumLessThan(Integer value) {
            addCriterion("user_textsNum <", value, "userTextsnum");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumLessThanOrEqualTo(Integer value) {
            addCriterion("user_textsNum <=", value, "userTextsnum");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumIn(List<Integer> values) {
            addCriterion("user_textsNum in", values, "userTextsnum");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumNotIn(List<Integer> values) {
            addCriterion("user_textsNum not in", values, "userTextsnum");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumBetween(Integer value1, Integer value2) {
            addCriterion("user_textsNum between", value1, value2, "userTextsnum");
            return (Criteria) this;
        }

        public Criteria andUserTextsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("user_textsNum not between", value1, value2, "userTextsnum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}