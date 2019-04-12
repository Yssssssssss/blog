package pojo;

import java.util.ArrayList;
import java.util.List;

public class LikesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LikesExample() {
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

        public Criteria andLikesIdIsNull() {
            addCriterion("likes_id is null");
            return (Criteria) this;
        }

        public Criteria andLikesIdIsNotNull() {
            addCriterion("likes_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikesIdEqualTo(Integer value) {
            addCriterion("likes_id =", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdNotEqualTo(Integer value) {
            addCriterion("likes_id <>", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdGreaterThan(Integer value) {
            addCriterion("likes_id >", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes_id >=", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdLessThan(Integer value) {
            addCriterion("likes_id <", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdLessThanOrEqualTo(Integer value) {
            addCriterion("likes_id <=", value, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdIn(List<Integer> values) {
            addCriterion("likes_id in", values, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdNotIn(List<Integer> values) {
            addCriterion("likes_id not in", values, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdBetween(Integer value1, Integer value2) {
            addCriterion("likes_id between", value1, value2, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("likes_id not between", value1, value2, "likesId");
            return (Criteria) this;
        }

        public Criteria andLikesUseridIsNull() {
            addCriterion("likes_userId is null");
            return (Criteria) this;
        }

        public Criteria andLikesUseridIsNotNull() {
            addCriterion("likes_userId is not null");
            return (Criteria) this;
        }

        public Criteria andLikesUseridEqualTo(Integer value) {
            addCriterion("likes_userId =", value, "likesUserid");
            return (Criteria) this;
        }

        public Criteria andLikesUseridNotEqualTo(Integer value) {
            addCriterion("likes_userId <>", value, "likesUserid");
            return (Criteria) this;
        }

        public Criteria andLikesUseridGreaterThan(Integer value) {
            addCriterion("likes_userId >", value, "likesUserid");
            return (Criteria) this;
        }

        public Criteria andLikesUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes_userId >=", value, "likesUserid");
            return (Criteria) this;
        }

        public Criteria andLikesUseridLessThan(Integer value) {
            addCriterion("likes_userId <", value, "likesUserid");
            return (Criteria) this;
        }

        public Criteria andLikesUseridLessThanOrEqualTo(Integer value) {
            addCriterion("likes_userId <=", value, "likesUserid");
            return (Criteria) this;
        }

        public Criteria andLikesUseridIn(List<Integer> values) {
            addCriterion("likes_userId in", values, "likesUserid");
            return (Criteria) this;
        }

        public Criteria andLikesUseridNotIn(List<Integer> values) {
            addCriterion("likes_userId not in", values, "likesUserid");
            return (Criteria) this;
        }

        public Criteria andLikesUseridBetween(Integer value1, Integer value2) {
            addCriterion("likes_userId between", value1, value2, "likesUserid");
            return (Criteria) this;
        }

        public Criteria andLikesUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("likes_userId not between", value1, value2, "likesUserid");
            return (Criteria) this;
        }

        public Criteria andLikesTextidIsNull() {
            addCriterion("likes_textId is null");
            return (Criteria) this;
        }

        public Criteria andLikesTextidIsNotNull() {
            addCriterion("likes_textId is not null");
            return (Criteria) this;
        }

        public Criteria andLikesTextidEqualTo(Integer value) {
            addCriterion("likes_textId =", value, "likesTextid");
            return (Criteria) this;
        }

        public Criteria andLikesTextidNotEqualTo(Integer value) {
            addCriterion("likes_textId <>", value, "likesTextid");
            return (Criteria) this;
        }

        public Criteria andLikesTextidGreaterThan(Integer value) {
            addCriterion("likes_textId >", value, "likesTextid");
            return (Criteria) this;
        }

        public Criteria andLikesTextidGreaterThanOrEqualTo(Integer value) {
            addCriterion("likes_textId >=", value, "likesTextid");
            return (Criteria) this;
        }

        public Criteria andLikesTextidLessThan(Integer value) {
            addCriterion("likes_textId <", value, "likesTextid");
            return (Criteria) this;
        }

        public Criteria andLikesTextidLessThanOrEqualTo(Integer value) {
            addCriterion("likes_textId <=", value, "likesTextid");
            return (Criteria) this;
        }

        public Criteria andLikesTextidIn(List<Integer> values) {
            addCriterion("likes_textId in", values, "likesTextid");
            return (Criteria) this;
        }

        public Criteria andLikesTextidNotIn(List<Integer> values) {
            addCriterion("likes_textId not in", values, "likesTextid");
            return (Criteria) this;
        }

        public Criteria andLikesTextidBetween(Integer value1, Integer value2) {
            addCriterion("likes_textId between", value1, value2, "likesTextid");
            return (Criteria) this;
        }

        public Criteria andLikesTextidNotBetween(Integer value1, Integer value2) {
            addCriterion("likes_textId not between", value1, value2, "likesTextid");
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