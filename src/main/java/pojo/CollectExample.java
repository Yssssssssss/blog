package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CollectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CollectExample() {
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

        public Criteria andCollectIdIsNull() {
            addCriterion("collect_id is null");
            return (Criteria) this;
        }

        public Criteria andCollectIdIsNotNull() {
            addCriterion("collect_id is not null");
            return (Criteria) this;
        }

        public Criteria andCollectIdEqualTo(Integer value) {
            addCriterion("collect_id =", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdNotEqualTo(Integer value) {
            addCriterion("collect_id <>", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdGreaterThan(Integer value) {
            addCriterion("collect_id >", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_id >=", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdLessThan(Integer value) {
            addCriterion("collect_id <", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdLessThanOrEqualTo(Integer value) {
            addCriterion("collect_id <=", value, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdIn(List<Integer> values) {
            addCriterion("collect_id in", values, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdNotIn(List<Integer> values) {
            addCriterion("collect_id not in", values, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdBetween(Integer value1, Integer value2) {
            addCriterion("collect_id between", value1, value2, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_id not between", value1, value2, "collectId");
            return (Criteria) this;
        }

        public Criteria andCollectUseridIsNull() {
            addCriterion("collect_userId is null");
            return (Criteria) this;
        }

        public Criteria andCollectUseridIsNotNull() {
            addCriterion("collect_userId is not null");
            return (Criteria) this;
        }

        public Criteria andCollectUseridEqualTo(Integer value) {
            addCriterion("collect_userId =", value, "collectUserid");
            return (Criteria) this;
        }

        public Criteria andCollectUseridNotEqualTo(Integer value) {
            addCriterion("collect_userId <>", value, "collectUserid");
            return (Criteria) this;
        }

        public Criteria andCollectUseridGreaterThan(Integer value) {
            addCriterion("collect_userId >", value, "collectUserid");
            return (Criteria) this;
        }

        public Criteria andCollectUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_userId >=", value, "collectUserid");
            return (Criteria) this;
        }

        public Criteria andCollectUseridLessThan(Integer value) {
            addCriterion("collect_userId <", value, "collectUserid");
            return (Criteria) this;
        }

        public Criteria andCollectUseridLessThanOrEqualTo(Integer value) {
            addCriterion("collect_userId <=", value, "collectUserid");
            return (Criteria) this;
        }

        public Criteria andCollectUseridIn(List<Integer> values) {
            addCriterion("collect_userId in", values, "collectUserid");
            return (Criteria) this;
        }

        public Criteria andCollectUseridNotIn(List<Integer> values) {
            addCriterion("collect_userId not in", values, "collectUserid");
            return (Criteria) this;
        }

        public Criteria andCollectUseridBetween(Integer value1, Integer value2) {
            addCriterion("collect_userId between", value1, value2, "collectUserid");
            return (Criteria) this;
        }

        public Criteria andCollectUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_userId not between", value1, value2, "collectUserid");
            return (Criteria) this;
        }

        public Criteria andCollectTextidIsNull() {
            addCriterion("collect_textId is null");
            return (Criteria) this;
        }

        public Criteria andCollectTextidIsNotNull() {
            addCriterion("collect_textId is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTextidEqualTo(Integer value) {
            addCriterion("collect_textId =", value, "collectTextid");
            return (Criteria) this;
        }

        public Criteria andCollectTextidNotEqualTo(Integer value) {
            addCriterion("collect_textId <>", value, "collectTextid");
            return (Criteria) this;
        }

        public Criteria andCollectTextidGreaterThan(Integer value) {
            addCriterion("collect_textId >", value, "collectTextid");
            return (Criteria) this;
        }

        public Criteria andCollectTextidGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect_textId >=", value, "collectTextid");
            return (Criteria) this;
        }

        public Criteria andCollectTextidLessThan(Integer value) {
            addCriterion("collect_textId <", value, "collectTextid");
            return (Criteria) this;
        }

        public Criteria andCollectTextidLessThanOrEqualTo(Integer value) {
            addCriterion("collect_textId <=", value, "collectTextid");
            return (Criteria) this;
        }

        public Criteria andCollectTextidIn(List<Integer> values) {
            addCriterion("collect_textId in", values, "collectTextid");
            return (Criteria) this;
        }

        public Criteria andCollectTextidNotIn(List<Integer> values) {
            addCriterion("collect_textId not in", values, "collectTextid");
            return (Criteria) this;
        }

        public Criteria andCollectTextidBetween(Integer value1, Integer value2) {
            addCriterion("collect_textId between", value1, value2, "collectTextid");
            return (Criteria) this;
        }

        public Criteria andCollectTextidNotBetween(Integer value1, Integer value2) {
            addCriterion("collect_textId not between", value1, value2, "collectTextid");
            return (Criteria) this;
        }

        public Criteria andCollectDateIsNull() {
            addCriterion("collect_date is null");
            return (Criteria) this;
        }

        public Criteria andCollectDateIsNotNull() {
            addCriterion("collect_date is not null");
            return (Criteria) this;
        }

        public Criteria andCollectDateEqualTo(Date value) {
            addCriterionForJDBCDate("collect_date =", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("collect_date <>", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateGreaterThan(Date value) {
            addCriterionForJDBCDate("collect_date >", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("collect_date >=", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateLessThan(Date value) {
            addCriterionForJDBCDate("collect_date <", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("collect_date <=", value, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateIn(List<Date> values) {
            addCriterionForJDBCDate("collect_date in", values, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("collect_date not in", values, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("collect_date between", value1, value2, "collectDate");
            return (Criteria) this;
        }

        public Criteria andCollectDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("collect_date not between", value1, value2, "collectDate");
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