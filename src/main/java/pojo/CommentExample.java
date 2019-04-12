package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCommentIdIsNull() {
            addCriterion("comment_Id is null");
            return (Criteria) this;
        }

        public Criteria andCommentIdIsNotNull() {
            addCriterion("comment_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentIdEqualTo(Integer value) {
            addCriterion("comment_Id =", value, "CommentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotEqualTo(Integer value) {
            addCriterion("comment_Id <>", value, "CommentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThan(Integer value) {
            addCriterion("comment_Id >", value, "CommentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_Id >=", value, "CommentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThan(Integer value) {
            addCriterion("comment_Id <", value, "CommentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdLessThanOrEqualTo(Integer value) {
            addCriterion("comment_Id <=", value, "CommentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdIn(List<Integer> values) {
            addCriterion("comment_Id in", values, "CommentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotIn(List<Integer> values) {
            addCriterion("comment_Id not in", values, "CommentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdBetween(Integer value1, Integer value2) {
            addCriterion("comment_Id between", value1, value2, "CommentId");
            return (Criteria) this;
        }

        public Criteria andCommentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_Id not between", value1, value2, "CommentId");
            return (Criteria) this;
        }

        public Criteria andCommentTextidIsNull() {
            addCriterion("comment_textId is null");
            return (Criteria) this;
        }

        public Criteria andCommentTextidIsNotNull() {
            addCriterion("comment_textId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentTextidEqualTo(Integer value) {
            addCriterion("comment_textId =", value, "commentTextid");
            return (Criteria) this;
        }

        public Criteria andCommentTextidNotEqualTo(Integer value) {
            addCriterion("comment_textId <>", value, "commentTextid");
            return (Criteria) this;
        }

        public Criteria andCommentTextidGreaterThan(Integer value) {
            addCriterion("comment_textId >", value, "commentTextid");
            return (Criteria) this;
        }

        public Criteria andCommentTextidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_textId >=", value, "commentTextid");
            return (Criteria) this;
        }

        public Criteria andCommentTextidLessThan(Integer value) {
            addCriterion("comment_textId <", value, "commentTextid");
            return (Criteria) this;
        }

        public Criteria andCommentTextidLessThanOrEqualTo(Integer value) {
            addCriterion("comment_textId <=", value, "commentTextid");
            return (Criteria) this;
        }

        public Criteria andCommentTextidIn(List<Integer> values) {
            addCriterion("comment_textId in", values, "commentTextid");
            return (Criteria) this;
        }

        public Criteria andCommentTextidNotIn(List<Integer> values) {
            addCriterion("comment_textId not in", values, "commentTextid");
            return (Criteria) this;
        }

        public Criteria andCommentTextidBetween(Integer value1, Integer value2) {
            addCriterion("comment_textId between", value1, value2, "commentTextid");
            return (Criteria) this;
        }

        public Criteria andCommentTextidNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_textId not between", value1, value2, "commentTextid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridIsNull() {
            addCriterion("comment_userId is null");
            return (Criteria) this;
        }

        public Criteria andCommentUseridIsNotNull() {
            addCriterion("comment_userId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentUseridEqualTo(Integer value) {
            addCriterion("comment_userId =", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridNotEqualTo(Integer value) {
            addCriterion("comment_userId <>", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridGreaterThan(Integer value) {
            addCriterion("comment_userId >", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_userId >=", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridLessThan(Integer value) {
            addCriterion("comment_userId <", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridLessThanOrEqualTo(Integer value) {
            addCriterion("comment_userId <=", value, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridIn(List<Integer> values) {
            addCriterion("comment_userId in", values, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridNotIn(List<Integer> values) {
            addCriterion("comment_userId not in", values, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridBetween(Integer value1, Integer value2) {
            addCriterion("comment_userId between", value1, value2, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_userId not between", value1, value2, "commentUserid");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNull() {
            addCriterion("comment_date is null");
            return (Criteria) this;
        }

        public Criteria andCommentDateIsNotNull() {
            addCriterion("comment_date is not null");
            return (Criteria) this;
        }

        public Criteria andCommentDateEqualTo(Date value) {
            addCriterion("comment_date =", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotEqualTo(Date value) {
            addCriterion("comment_date <>", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThan(Date value) {
            addCriterion("comment_date >", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("comment_date >=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThan(Date value) {
            addCriterion("comment_date <", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateLessThanOrEqualTo(Date value) {
            addCriterion("comment_date <=", value, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateIn(List<Date> values) {
            addCriterion("comment_date in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotIn(List<Date> values) {
            addCriterion("comment_date not in", values, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateBetween(Date value1, Date value2) {
            addCriterion("comment_date between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentDateNotBetween(Date value1, Date value2) {
            addCriterion("comment_date not between", value1, value2, "commentDate");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidIsNull() {
            addCriterion("comment_replyId is null");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidIsNotNull() {
            addCriterion("comment_replyId is not null");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidEqualTo(Integer value) {
            addCriterion("comment_replyId =", value, "commentReplyid");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidNotEqualTo(Integer value) {
            addCriterion("comment_replyId <>", value, "commentReplyid");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidGreaterThan(Integer value) {
            addCriterion("comment_replyId >", value, "commentReplyid");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidGreaterThanOrEqualTo(Integer value) {
            addCriterion("comment_replyId >=", value, "commentReplyid");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidLessThan(Integer value) {
            addCriterion("comment_replyId <", value, "commentReplyid");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidLessThanOrEqualTo(Integer value) {
            addCriterion("comment_replyId <=", value, "commentReplyid");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidIn(List<Integer> values) {
            addCriterion("comment_replyId in", values, "commentReplyid");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidNotIn(List<Integer> values) {
            addCriterion("comment_replyId not in", values, "commentReplyid");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidBetween(Integer value1, Integer value2) {
            addCriterion("comment_replyId between", value1, value2, "commentReplyid");
            return (Criteria) this;
        }

        public Criteria andCommentReplyidNotBetween(Integer value1, Integer value2) {
            addCriterion("comment_replyId not between", value1, value2, "commentReplyid");
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