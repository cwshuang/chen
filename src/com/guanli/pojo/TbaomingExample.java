package com.guanli.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbaomingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbaomingExample() {
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

        public Criteria andXianluidIsNull() {
            addCriterion("xianluId is null");
            return (Criteria) this;
        }

        public Criteria andXianluidIsNotNull() {
            addCriterion("xianluId is not null");
            return (Criteria) this;
        }

        public Criteria andXianluidEqualTo(Integer value) {
            addCriterion("xianluId =", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidNotEqualTo(Integer value) {
            addCriterion("xianluId <>", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidGreaterThan(Integer value) {
            addCriterion("xianluId >", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidGreaterThanOrEqualTo(Integer value) {
            addCriterion("xianluId >=", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidLessThan(Integer value) {
            addCriterion("xianluId <", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidLessThanOrEqualTo(Integer value) {
            addCriterion("xianluId <=", value, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidIn(List<Integer> values) {
            addCriterion("xianluId in", values, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidNotIn(List<Integer> values) {
            addCriterion("xianluId not in", values, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidBetween(Integer value1, Integer value2) {
            addCriterion("xianluId between", value1, value2, "xianluid");
            return (Criteria) this;
        }

        public Criteria andXianluidNotBetween(Integer value1, Integer value2) {
            addCriterion("xianluId not between", value1, value2, "xianluid");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiIsNull() {
            addCriterion("lianxifangshi is null");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiIsNotNull() {
            addCriterion("lianxifangshi is not null");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiEqualTo(String value) {
            addCriterion("lianxifangshi =", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiNotEqualTo(String value) {
            addCriterion("lianxifangshi <>", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiGreaterThan(String value) {
            addCriterion("lianxifangshi >", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiGreaterThanOrEqualTo(String value) {
            addCriterion("lianxifangshi >=", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiLessThan(String value) {
            addCriterion("lianxifangshi <", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiLessThanOrEqualTo(String value) {
            addCriterion("lianxifangshi <=", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiLike(String value) {
            addCriterion("lianxifangshi like", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiNotLike(String value) {
            addCriterion("lianxifangshi not like", value, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiIn(List<String> values) {
            addCriterion("lianxifangshi in", values, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiNotIn(List<String> values) {
            addCriterion("lianxifangshi not in", values, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiBetween(String value1, String value2) {
            addCriterion("lianxifangshi between", value1, value2, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andLianxifangshiNotBetween(String value1, String value2) {
            addCriterion("lianxifangshi not between", value1, value2, "lianxifangshi");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNull() {
            addCriterion("beizhu is null");
            return (Criteria) this;
        }

        public Criteria andBeizhuIsNotNull() {
            addCriterion("beizhu is not null");
            return (Criteria) this;
        }

        public Criteria andBeizhuEqualTo(String value) {
            addCriterion("beizhu =", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotEqualTo(String value) {
            addCriterion("beizhu <>", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThan(String value) {
            addCriterion("beizhu >", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuGreaterThanOrEqualTo(String value) {
            addCriterion("beizhu >=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThan(String value) {
            addCriterion("beizhu <", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLessThanOrEqualTo(String value) {
            addCriterion("beizhu <=", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuLike(String value) {
            addCriterion("beizhu like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotLike(String value) {
            addCriterion("beizhu not like", value, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuIn(List<String> values) {
            addCriterion("beizhu in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotIn(List<String> values) {
            addCriterion("beizhu not in", values, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuBetween(String value1, String value2) {
            addCriterion("beizhu between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBeizhuNotBetween(String value1, String value2) {
            addCriterion("beizhu not between", value1, value2, "beizhu");
            return (Criteria) this;
        }

        public Criteria andBaomingshiIsNull() {
            addCriterion("baomingshi is null");
            return (Criteria) this;
        }

        public Criteria andBaomingshiIsNotNull() {
            addCriterion("baomingshi is not null");
            return (Criteria) this;
        }

        public Criteria andBaomingshiEqualTo(Date value) {
            addCriterionForJDBCDate("baomingshi =", value, "baomingshi");
            return (Criteria) this;
        }

        public Criteria andBaomingshiNotEqualTo(Date value) {
            addCriterionForJDBCDate("baomingshi <>", value, "baomingshi");
            return (Criteria) this;
        }

        public Criteria andBaomingshiGreaterThan(Date value) {
            addCriterionForJDBCDate("baomingshi >", value, "baomingshi");
            return (Criteria) this;
        }

        public Criteria andBaomingshiGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("baomingshi >=", value, "baomingshi");
            return (Criteria) this;
        }

        public Criteria andBaomingshiLessThan(Date value) {
            addCriterionForJDBCDate("baomingshi <", value, "baomingshi");
            return (Criteria) this;
        }

        public Criteria andBaomingshiLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("baomingshi <=", value, "baomingshi");
            return (Criteria) this;
        }

        public Criteria andBaomingshiIn(List<Date> values) {
            addCriterionForJDBCDate("baomingshi in", values, "baomingshi");
            return (Criteria) this;
        }

        public Criteria andBaomingshiNotIn(List<Date> values) {
            addCriterionForJDBCDate("baomingshi not in", values, "baomingshi");
            return (Criteria) this;
        }

        public Criteria andBaomingshiBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("baomingshi between", value1, value2, "baomingshi");
            return (Criteria) this;
        }

        public Criteria andBaomingshiNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("baomingshi not between", value1, value2, "baomingshi");
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