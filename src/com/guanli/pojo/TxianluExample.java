package com.guanli.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TxianluExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TxianluExample() {
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

        public Criteria andXianluminchengIsNull() {
            addCriterion("xianlumincheng is null");
            return (Criteria) this;
        }

        public Criteria andXianluminchengIsNotNull() {
            addCriterion("xianlumincheng is not null");
            return (Criteria) this;
        }

        public Criteria andXianluminchengEqualTo(String value) {
            addCriterion("xianlumincheng =", value, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengNotEqualTo(String value) {
            addCriterion("xianlumincheng <>", value, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengGreaterThan(String value) {
            addCriterion("xianlumincheng >", value, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengGreaterThanOrEqualTo(String value) {
            addCriterion("xianlumincheng >=", value, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengLessThan(String value) {
            addCriterion("xianlumincheng <", value, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengLessThanOrEqualTo(String value) {
            addCriterion("xianlumincheng <=", value, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengLike(String value) {
            addCriterion("xianlumincheng like", value, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengNotLike(String value) {
            addCriterion("xianlumincheng not like", value, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengIn(List<String> values) {
            addCriterion("xianlumincheng in", values, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengNotIn(List<String> values) {
            addCriterion("xianlumincheng not in", values, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengBetween(String value1, String value2) {
            addCriterion("xianlumincheng between", value1, value2, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andXianluminchengNotBetween(String value1, String value2) {
            addCriterion("xianlumincheng not between", value1, value2, "xianlumincheng");
            return (Criteria) this;
        }

        public Criteria andFatuandidianIsNull() {
            addCriterion("fatuandidian is null");
            return (Criteria) this;
        }

        public Criteria andFatuandidianIsNotNull() {
            addCriterion("fatuandidian is not null");
            return (Criteria) this;
        }

        public Criteria andFatuandidianEqualTo(String value) {
            addCriterion("fatuandidian =", value, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianNotEqualTo(String value) {
            addCriterion("fatuandidian <>", value, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianGreaterThan(String value) {
            addCriterion("fatuandidian >", value, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianGreaterThanOrEqualTo(String value) {
            addCriterion("fatuandidian >=", value, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianLessThan(String value) {
            addCriterion("fatuandidian <", value, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianLessThanOrEqualTo(String value) {
            addCriterion("fatuandidian <=", value, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianLike(String value) {
            addCriterion("fatuandidian like", value, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianNotLike(String value) {
            addCriterion("fatuandidian not like", value, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianIn(List<String> values) {
            addCriterion("fatuandidian in", values, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianNotIn(List<String> values) {
            addCriterion("fatuandidian not in", values, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianBetween(String value1, String value2) {
            addCriterion("fatuandidian between", value1, value2, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuandidianNotBetween(String value1, String value2) {
            addCriterion("fatuandidian not between", value1, value2, "fatuandidian");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianIsNull() {
            addCriterion("fatuanshiian is null");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianIsNotNull() {
            addCriterion("fatuanshiian is not null");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianEqualTo(Date value) {
            addCriterionForJDBCDate("fatuanshiian =", value, "fatuanshiian");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianNotEqualTo(Date value) {
            addCriterionForJDBCDate("fatuanshiian <>", value, "fatuanshiian");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianGreaterThan(Date value) {
            addCriterionForJDBCDate("fatuanshiian >", value, "fatuanshiian");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fatuanshiian >=", value, "fatuanshiian");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianLessThan(Date value) {
            addCriterionForJDBCDate("fatuanshiian <", value, "fatuanshiian");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fatuanshiian <=", value, "fatuanshiian");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianIn(List<Date> values) {
            addCriterionForJDBCDate("fatuanshiian in", values, "fatuanshiian");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianNotIn(List<Date> values) {
            addCriterionForJDBCDate("fatuanshiian not in", values, "fatuanshiian");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fatuanshiian between", value1, value2, "fatuanshiian");
            return (Criteria) this;
        }

        public Criteria andFatuanshiianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fatuanshiian not between", value1, value2, "fatuanshiian");
            return (Criteria) this;
        }

        public Criteria andXianlujiageIsNull() {
            addCriterion("xianlujiage is null");
            return (Criteria) this;
        }

        public Criteria andXianlujiageIsNotNull() {
            addCriterion("xianlujiage is not null");
            return (Criteria) this;
        }

        public Criteria andXianlujiageEqualTo(String value) {
            addCriterion("xianlujiage =", value, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageNotEqualTo(String value) {
            addCriterion("xianlujiage <>", value, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageGreaterThan(String value) {
            addCriterion("xianlujiage >", value, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageGreaterThanOrEqualTo(String value) {
            addCriterion("xianlujiage >=", value, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageLessThan(String value) {
            addCriterion("xianlujiage <", value, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageLessThanOrEqualTo(String value) {
            addCriterion("xianlujiage <=", value, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageLike(String value) {
            addCriterion("xianlujiage like", value, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageNotLike(String value) {
            addCriterion("xianlujiage not like", value, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageIn(List<String> values) {
            addCriterion("xianlujiage in", values, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageNotIn(List<String> values) {
            addCriterion("xianlujiage not in", values, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageBetween(String value1, String value2) {
            addCriterion("xianlujiage between", value1, value2, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andXianlujiageNotBetween(String value1, String value2) {
            addCriterion("xianlujiage not between", value1, value2, "xianlujiage");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIsNull() {
            addCriterion("lianxidianhua is null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIsNotNull() {
            addCriterion("lianxidianhua is not null");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaEqualTo(String value) {
            addCriterion("lianxidianhua =", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotEqualTo(String value) {
            addCriterion("lianxidianhua <>", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaGreaterThan(String value) {
            addCriterion("lianxidianhua >", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaGreaterThanOrEqualTo(String value) {
            addCriterion("lianxidianhua >=", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLessThan(String value) {
            addCriterion("lianxidianhua <", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLessThanOrEqualTo(String value) {
            addCriterion("lianxidianhua <=", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaLike(String value) {
            addCriterion("lianxidianhua like", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotLike(String value) {
            addCriterion("lianxidianhua not like", value, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaIn(List<String> values) {
            addCriterion("lianxidianhua in", values, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotIn(List<String> values) {
            addCriterion("lianxidianhua not in", values, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaBetween(String value1, String value2) {
            addCriterion("lianxidianhua between", value1, value2, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxidianhuaNotBetween(String value1, String value2) {
            addCriterion("lianxidianhua not between", value1, value2, "lianxidianhua");
            return (Criteria) this;
        }

        public Criteria andLianxirenIsNull() {
            addCriterion("lianxiren is null");
            return (Criteria) this;
        }

        public Criteria andLianxirenIsNotNull() {
            addCriterion("lianxiren is not null");
            return (Criteria) this;
        }

        public Criteria andLianxirenEqualTo(String value) {
            addCriterion("lianxiren =", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotEqualTo(String value) {
            addCriterion("lianxiren <>", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenGreaterThan(String value) {
            addCriterion("lianxiren >", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenGreaterThanOrEqualTo(String value) {
            addCriterion("lianxiren >=", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLessThan(String value) {
            addCriterion("lianxiren <", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLessThanOrEqualTo(String value) {
            addCriterion("lianxiren <=", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenLike(String value) {
            addCriterion("lianxiren like", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotLike(String value) {
            addCriterion("lianxiren not like", value, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenIn(List<String> values) {
            addCriterion("lianxiren in", values, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotIn(List<String> values) {
            addCriterion("lianxiren not in", values, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenBetween(String value1, String value2) {
            addCriterion("lianxiren between", value1, value2, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andLianxirenNotBetween(String value1, String value2) {
            addCriterion("lianxiren not between", value1, value2, "lianxiren");
            return (Criteria) this;
        }

        public Criteria andFabushijianIsNull() {
            addCriterion("fabushijian is null");
            return (Criteria) this;
        }

        public Criteria andFabushijianIsNotNull() {
            addCriterion("fabushijian is not null");
            return (Criteria) this;
        }

        public Criteria andFabushijianEqualTo(Date value) {
            addCriterionForJDBCDate("fabushijian =", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotEqualTo(Date value) {
            addCriterionForJDBCDate("fabushijian <>", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianGreaterThan(Date value) {
            addCriterionForJDBCDate("fabushijian >", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fabushijian >=", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianLessThan(Date value) {
            addCriterionForJDBCDate("fabushijian <", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fabushijian <=", value, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianIn(List<Date> values) {
            addCriterionForJDBCDate("fabushijian in", values, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotIn(List<Date> values) {
            addCriterionForJDBCDate("fabushijian not in", values, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fabushijian between", value1, value2, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andFabushijianNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fabushijian not between", value1, value2, "fabushijian");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(String value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(String value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(String value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(String value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(String value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(String value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLike(String value) {
            addCriterion("del like", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotLike(String value) {
            addCriterion("del not like", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<String> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<String> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(String value1, String value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(String value1, String value2) {
            addCriterion("del not between", value1, value2, "del");
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