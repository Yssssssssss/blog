package pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TextExample() {
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

        public Criteria andTextIdIsNull() {
            addCriterion("text_id is null");
            return (Criteria) this;
        }

        public Criteria andTextIdIsNotNull() {
            addCriterion("text_id is not null");
            return (Criteria) this;
        }

        public Criteria andTextIdEqualTo(Integer value) {
            addCriterion("text_id =", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdNotEqualTo(Integer value) {
            addCriterion("text_id <>", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdGreaterThan(Integer value) {
            addCriterion("text_id >", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_id >=", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdLessThan(Integer value) {
            addCriterion("text_id <", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdLessThanOrEqualTo(Integer value) {
            addCriterion("text_id <=", value, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdIn(List<Integer> values) {
            addCriterion("text_id in", values, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdNotIn(List<Integer> values) {
            addCriterion("text_id not in", values, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdBetween(Integer value1, Integer value2) {
            addCriterion("text_id between", value1, value2, "textId");
            return (Criteria) this;
        }

        public Criteria andTextIdNotBetween(Integer value1, Integer value2) {
            addCriterion("text_id not between", value1, value2, "textId");
            return (Criteria) this;
        }

        public Criteria andTextTitleIsNull() {
            addCriterion("text_title is null");
            return (Criteria) this;
        }

        public Criteria andTextTitleIsNotNull() {
            addCriterion("text_title is not null");
            return (Criteria) this;
        }

        public Criteria andTextTitleEqualTo(String value) {
            addCriterion("text_title =", value, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleNotEqualTo(String value) {
            addCriterion("text_title <>", value, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleGreaterThan(String value) {
            addCriterion("text_title >", value, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleGreaterThanOrEqualTo(String value) {
            addCriterion("text_title >=", value, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleLessThan(String value) {
            addCriterion("text_title <", value, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleLessThanOrEqualTo(String value) {
            addCriterion("text_title <=", value, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleLike(String value) {
            addCriterion("text_title like", value, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleNotLike(String value) {
            addCriterion("text_title not like", value, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleIn(List<String> values) {
            addCriterion("text_title in", values, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleNotIn(List<String> values) {
            addCriterion("text_title not in", values, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleBetween(String value1, String value2) {
            addCriterion("text_title between", value1, value2, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextTitleNotBetween(String value1, String value2) {
            addCriterion("text_title not between", value1, value2, "textTitle");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateIsNull() {
            addCriterion("text_releaseDate is null");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateIsNotNull() {
            addCriterion("text_releaseDate is not null");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateEqualTo(Date value) {
            addCriterion("text_releaseDate =", value, "textReleasedate");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateNotEqualTo(Date value) {
            addCriterion("text_releaseDate <>", value, "textReleasedate");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateGreaterThan(Date value) {
            addCriterion("text_releaseDate >", value, "textReleasedate");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateGreaterThanOrEqualTo(Date value) {
            addCriterion("text_releaseDate >=", value, "textReleasedate");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateLessThan(Date value) {
            addCriterion("text_releaseDate <", value, "textReleasedate");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateLessThanOrEqualTo(Date value) {
            addCriterion("text_releaseDate <=", value, "textReleasedate");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateIn(List<Date> values) {
            addCriterion("text_releaseDate in", values, "textReleasedate");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateNotIn(List<Date> values) {
            addCriterion("text_releaseDate not in", values, "textReleasedate");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateBetween(Date value1, Date value2) {
            addCriterion("text_releaseDate between", value1, value2, "textReleasedate");
            return (Criteria) this;
        }

        public Criteria andTextReleasedateNotBetween(Date value1, Date value2) {
            addCriterion("text_releaseDate not between", value1, value2, "textReleasedate");
            return (Criteria) this;
        }

        public Criteria andTextWriteridIsNull() {
            addCriterion("text_writerId is null");
            return (Criteria) this;
        }

        public Criteria andTextWriteridIsNotNull() {
            addCriterion("text_writerId is not null");
            return (Criteria) this;
        }

        public Criteria andTextWriteridEqualTo(Integer value) {
            addCriterion("text_writerId =", value, "textWriterid");
            return (Criteria) this;
        }

        public Criteria andTextWriteridNotEqualTo(Integer value) {
            addCriterion("text_writerId <>", value, "textWriterid");
            return (Criteria) this;
        }

        public Criteria andTextWriteridGreaterThan(Integer value) {
            addCriterion("text_writerId >", value, "textWriterid");
            return (Criteria) this;
        }

        public Criteria andTextWriteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_writerId >=", value, "textWriterid");
            return (Criteria) this;
        }

        public Criteria andTextWriteridLessThan(Integer value) {
            addCriterion("text_writerId <", value, "textWriterid");
            return (Criteria) this;
        }

        public Criteria andTextWriteridLessThanOrEqualTo(Integer value) {
            addCriterion("text_writerId <=", value, "textWriterid");
            return (Criteria) this;
        }

        public Criteria andTextWriteridIn(List<Integer> values) {
            addCriterion("text_writerId in", values, "textWriterid");
            return (Criteria) this;
        }

        public Criteria andTextWriteridNotIn(List<Integer> values) {
            addCriterion("text_writerId not in", values, "textWriterid");
            return (Criteria) this;
        }

        public Criteria andTextWriteridBetween(Integer value1, Integer value2) {
            addCriterion("text_writerId between", value1, value2, "textWriterid");
            return (Criteria) this;
        }

        public Criteria andTextWriteridNotBetween(Integer value1, Integer value2) {
            addCriterion("text_writerId not between", value1, value2, "textWriterid");
            return (Criteria) this;
        }

        public Criteria andTextImgIsNull() {
            addCriterion("text_img is null");
            return (Criteria) this;
        }

        public Criteria andTextImgIsNotNull() {
            addCriterion("text_img is not null");
            return (Criteria) this;
        }

        public Criteria andTextImgEqualTo(String value) {
            addCriterion("text_img =", value, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgNotEqualTo(String value) {
            addCriterion("text_img <>", value, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgGreaterThan(String value) {
            addCriterion("text_img >", value, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgGreaterThanOrEqualTo(String value) {
            addCriterion("text_img >=", value, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgLessThan(String value) {
            addCriterion("text_img <", value, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgLessThanOrEqualTo(String value) {
            addCriterion("text_img <=", value, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgLike(String value) {
            addCriterion("text_img like", value, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgNotLike(String value) {
            addCriterion("text_img not like", value, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgIn(List<String> values) {
            addCriterion("text_img in", values, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgNotIn(List<String> values) {
            addCriterion("text_img not in", values, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgBetween(String value1, String value2) {
            addCriterion("text_img between", value1, value2, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextImgNotBetween(String value1, String value2) {
            addCriterion("text_img not between", value1, value2, "textImg");
            return (Criteria) this;
        }

        public Criteria andTextLikenumIsNull() {
            addCriterion("text_likeNum is null");
            return (Criteria) this;
        }

        public Criteria andTextLikenumIsNotNull() {
            addCriterion("text_likeNum is not null");
            return (Criteria) this;
        }

        public Criteria andTextLikenumEqualTo(Integer value) {
            addCriterion("text_likeNum =", value, "textLikenum");
            return (Criteria) this;
        }

        public Criteria andTextLikenumNotEqualTo(Integer value) {
            addCriterion("text_likeNum <>", value, "textLikenum");
            return (Criteria) this;
        }

        public Criteria andTextLikenumGreaterThan(Integer value) {
            addCriterion("text_likeNum >", value, "textLikenum");
            return (Criteria) this;
        }

        public Criteria andTextLikenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_likeNum >=", value, "textLikenum");
            return (Criteria) this;
        }

        public Criteria andTextLikenumLessThan(Integer value) {
            addCriterion("text_likeNum <", value, "textLikenum");
            return (Criteria) this;
        }

        public Criteria andTextLikenumLessThanOrEqualTo(Integer value) {
            addCriterion("text_likeNum <=", value, "textLikenum");
            return (Criteria) this;
        }

        public Criteria andTextLikenumIn(List<Integer> values) {
            addCriterion("text_likeNum in", values, "textLikenum");
            return (Criteria) this;
        }

        public Criteria andTextLikenumNotIn(List<Integer> values) {
            addCriterion("text_likeNum not in", values, "textLikenum");
            return (Criteria) this;
        }

        public Criteria andTextLikenumBetween(Integer value1, Integer value2) {
            addCriterion("text_likeNum between", value1, value2, "textLikenum");
            return (Criteria) this;
        }

        public Criteria andTextLikenumNotBetween(Integer value1, Integer value2) {
            addCriterion("text_likeNum not between", value1, value2, "textLikenum");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumIsNull() {
            addCriterion("text_commentNum is null");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumIsNotNull() {
            addCriterion("text_commentNum is not null");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumEqualTo(Integer value) {
            addCriterion("text_commentNum =", value, "textCommentnum");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumNotEqualTo(Integer value) {
            addCriterion("text_commentNum <>", value, "textCommentnum");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumGreaterThan(Integer value) {
            addCriterion("text_commentNum >", value, "textCommentnum");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_commentNum >=", value, "textCommentnum");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumLessThan(Integer value) {
            addCriterion("text_commentNum <", value, "textCommentnum");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumLessThanOrEqualTo(Integer value) {
            addCriterion("text_commentNum <=", value, "textCommentnum");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumIn(List<Integer> values) {
            addCriterion("text_commentNum in", values, "textCommentnum");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumNotIn(List<Integer> values) {
            addCriterion("text_commentNum not in", values, "textCommentnum");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumBetween(Integer value1, Integer value2) {
            addCriterion("text_commentNum between", value1, value2, "textCommentnum");
            return (Criteria) this;
        }

        public Criteria andTextCommentnumNotBetween(Integer value1, Integer value2) {
            addCriterion("text_commentNum not between", value1, value2, "textCommentnum");
            return (Criteria) this;
        }

        public Criteria andTextCountIsNull() {
            addCriterion("text_count is null");
            return (Criteria) this;
        }

        public Criteria andTextCountIsNotNull() {
            addCriterion("text_count is not null");
            return (Criteria) this;
        }

        public Criteria andTextCountEqualTo(Integer value) {
            addCriterion("text_count =", value, "textCount");
            return (Criteria) this;
        }

        public Criteria andTextCountNotEqualTo(Integer value) {
            addCriterion("text_count <>", value, "textCount");
            return (Criteria) this;
        }

        public Criteria andTextCountGreaterThan(Integer value) {
            addCriterion("text_count >", value, "textCount");
            return (Criteria) this;
        }

        public Criteria andTextCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_count >=", value, "textCount");
            return (Criteria) this;
        }

        public Criteria andTextCountLessThan(Integer value) {
            addCriterion("text_count <", value, "textCount");
            return (Criteria) this;
        }

        public Criteria andTextCountLessThanOrEqualTo(Integer value) {
            addCriterion("text_count <=", value, "textCount");
            return (Criteria) this;
        }

        public Criteria andTextCountIn(List<Integer> values) {
            addCriterion("text_count in", values, "textCount");
            return (Criteria) this;
        }

        public Criteria andTextCountNotIn(List<Integer> values) {
            addCriterion("text_count not in", values, "textCount");
            return (Criteria) this;
        }

        public Criteria andTextCountBetween(Integer value1, Integer value2) {
            addCriterion("text_count between", value1, value2, "textCount");
            return (Criteria) this;
        }

        public Criteria andTextCountNotBetween(Integer value1, Integer value2) {
            addCriterion("text_count not between", value1, value2, "textCount");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumIsNull() {
            addCriterion("text_collectNum is null");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumIsNotNull() {
            addCriterion("text_collectNum is not null");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumEqualTo(Integer value) {
            addCriterion("text_collectNum =", value, "textCollectnum");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumNotEqualTo(Integer value) {
            addCriterion("text_collectNum <>", value, "textCollectnum");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumGreaterThan(Integer value) {
            addCriterion("text_collectNum >", value, "textCollectnum");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("text_collectNum >=", value, "textCollectnum");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumLessThan(Integer value) {
            addCriterion("text_collectNum <", value, "textCollectnum");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumLessThanOrEqualTo(Integer value) {
            addCriterion("text_collectNum <=", value, "textCollectnum");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumIn(List<Integer> values) {
            addCriterion("text_collectNum in", values, "textCollectnum");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumNotIn(List<Integer> values) {
            addCriterion("text_collectNum not in", values, "textCollectnum");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumBetween(Integer value1, Integer value2) {
            addCriterion("text_collectNum between", value1, value2, "textCollectnum");
            return (Criteria) this;
        }

        public Criteria andTextCollectnumNotBetween(Integer value1, Integer value2) {
            addCriterion("text_collectNum not between", value1, value2, "textCollectnum");
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