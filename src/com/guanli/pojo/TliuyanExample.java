package com.guanli.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TliuyanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TliuyanExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNeirongIsNull() {
            addCriterion("neirong is null");
            return (Criteria) this;
        }

        public Criteria andNeirongIsNotNull() {
            addCriterion("neirong is not null");
            return (Criteria) this;
        }

        public Criteria andNeirongEqualTo(String value) {
            addCriterion("neirong =", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotEqualTo(String value) {
            addCriterion("neirong <>", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongGreaterThan(String value) {
            addCriterion("neirong >", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongGreaterThanOrEqualTo(String value) {
            addCriterion("neirong >=", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLessThan(String value) {
            addCriterion("neirong <", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLessThanOrEqualTo(String value) {
            addCriterion("neirong <=", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongLike(String value) {
            addCriterion("neirong like", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotLike(String value) {
            addCriterion("neirong not like", value, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongIn(List<String> values) {
            addCriterion("neirong in", values, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotIn(List<String> values) {
            addCriterion("neirong not in", values, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongBetween(String value1, String value2) {
            addCriterion("neirong between", value1, value2, "neirong");
            return (Criteria) this;
        }

        public Criteria andNeirongNotBetween(String value1, String value2) {
            addCriterion("neirong not between", value1, value2, "neirong");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiIsNull() {
            addCriterion("liuyanshi is null");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiIsNotNull() {
            addCriterion("liuyanshi is not null");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiEqualTo(Date value) {
            addCriterionForJDBCDate("liuyanshi =", value, "liuyanshi");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiNotEqualTo(Date value) {
            addCriterionForJDBCDate("liuyanshi <>", value, "liuyanshi");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiGreaterThan(Date value) {
            addCriterionForJDBCDate("liuyanshi >", value, "liuyanshi");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("liuyanshi >=", value, "liuyanshi");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiLessThan(Date value) {
            addCriterionForJDBCDate("liuyanshi <", value, "liuyanshi");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("liuyanshi <=", value, "liuyanshi");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiIn(List<Date> values) {
            addCriterionForJDBCDate("liuyanshi in", values, "liuyanshi");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiNotIn(List<Date> values) {
            addCriterionForJDBCDate("liuyanshi not in", values, "liuyanshi");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("liuyanshi between", value1, value2, "liuyanshi");
            return (Criteria) this;
        }

        public Criteria andLiuyanshiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("liuyanshi not between", value1, value2, "liuyanshi");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andHuifuIsNull() {
            addCriterion("huifu is null");
            return (Criteria) this;
        }

        public Criteria andHuifuIsNotNull() {
            addCriterion("huifu is not null");
            return (Criteria) this;
        }

        public Criteria andHuifuEqualTo(String value) {
            addCriterion("huifu =", value, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuNotEqualTo(String value) {
            addCriterion("huifu <>", value, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuGreaterThan(String value) {
            addCriterion("huifu >", value, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuGreaterThanOrEqualTo(String value) {
            addCriterion("huifu >=", value, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuLessThan(String value) {
            addCriterion("huifu <", value, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuLessThanOrEqualTo(String value) {
            addCriterion("huifu <=", value, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuLike(String value) {
            addCriterion("huifu like", value, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuNotLike(String value) {
            addCriterion("huifu not like", value, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuIn(List<String> values) {
            addCriterion("huifu in", values, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuNotIn(List<String> values) {
            addCriterion("huifu not in", values, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuBetween(String value1, String value2) {
            addCriterion("huifu between", value1, value2, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifuNotBetween(String value1, String value2) {
            addCriterion("huifu not between", value1, value2, "huifu");
            return (Criteria) this;
        }

        public Criteria andHuifushiIsNull() {
            addCriterion("huifushi is null");
            return (Criteria) this;
        }

        public Criteria andHuifushiIsNotNull() {
            addCriterion("huifushi is not null");
            return (Criteria) this;
        }

        public Criteria andHuifushiEqualTo(Date value) {
            addCriterionForJDBCDate("huifushi =", value, "huifushi");
            return (Criteria) this;
        }

        public Criteria andHuifushiNotEqualTo(Date value) {
            addCriterionForJDBCDate("huifushi <>", value, "huifushi");
            return (Criteria) this;
        }

        public Criteria andHuifushiGreaterThan(Date value) {
            addCriterionForJDBCDate("huifushi >", value, "huifushi");
            return (Criteria) this;
        }

        public Criteria andHuifushiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("huifushi >=", value, "huifushi");
            return (Criteria) this;
        }

        public Criteria andHuifushiLessThan(Date value) {
            addCriterionForJDBCDate("huifushi <", value, "huifushi");
            return (Criteria) this;
        }

        public Criteria andHuifushiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("huifushi <=", value, "huifushi");
            return (Criteria) this;
        }

        public Criteria andHuifushiIn(List<Date> values) {
            addCriterionForJDBCDate("huifushi in", values, "huifushi");
            return (Criteria) this;
        }

        public Criteria andHuifushiNotIn(List<Date> values) {
            addCriterionForJDBCDate("huifushi not in", values, "huifushi");
            return (Criteria) this;
        }

        public Criteria andHuifushiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("huifushi between", value1, value2, "huifushi");
            return (Criteria) this;
        }

        public Criteria andHuifushiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("huifushi not between", value1, value2, "huifushi");
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