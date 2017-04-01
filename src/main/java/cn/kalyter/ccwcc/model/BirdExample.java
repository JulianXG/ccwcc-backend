package cn.kalyter.ccwcc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BirdExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public BirdExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNull() {
            addCriterion("name_zh is null");
            return (Criteria) this;
        }

        public Criteria andNameZhIsNotNull() {
            addCriterion("name_zh is not null");
            return (Criteria) this;
        }

        public Criteria andNameZhEqualTo(String value) {
            addCriterion("name_zh =", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotEqualTo(String value) {
            addCriterion("name_zh <>", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThan(String value) {
            addCriterion("name_zh >", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhGreaterThanOrEqualTo(String value) {
            addCriterion("name_zh >=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThan(String value) {
            addCriterion("name_zh <", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLessThanOrEqualTo(String value) {
            addCriterion("name_zh <=", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhLike(String value) {
            addCriterion("name_zh like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotLike(String value) {
            addCriterion("name_zh not like", value, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhIn(List<String> values) {
            addCriterion("name_zh in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotIn(List<String> values) {
            addCriterion("name_zh not in", values, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhBetween(String value1, String value2) {
            addCriterion("name_zh between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameZhNotBetween(String value1, String value2) {
            addCriterion("name_zh not between", value1, value2, "nameZh");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameLtIsNull() {
            addCriterion("name_lt is null");
            return (Criteria) this;
        }

        public Criteria andNameLtIsNotNull() {
            addCriterion("name_lt is not null");
            return (Criteria) this;
        }

        public Criteria andNameLtEqualTo(String value) {
            addCriterion("name_lt =", value, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtNotEqualTo(String value) {
            addCriterion("name_lt <>", value, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtGreaterThan(String value) {
            addCriterion("name_lt >", value, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtGreaterThanOrEqualTo(String value) {
            addCriterion("name_lt >=", value, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtLessThan(String value) {
            addCriterion("name_lt <", value, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtLessThanOrEqualTo(String value) {
            addCriterion("name_lt <=", value, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtLike(String value) {
            addCriterion("name_lt like", value, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtNotLike(String value) {
            addCriterion("name_lt not like", value, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtIn(List<String> values) {
            addCriterion("name_lt in", values, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtNotIn(List<String> values) {
            addCriterion("name_lt not in", values, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtBetween(String value1, String value2) {
            addCriterion("name_lt between", value1, value2, "nameLt");
            return (Criteria) this;
        }

        public Criteria andNameLtNotBetween(String value1, String value2) {
            addCriterion("name_lt not between", value1, value2, "nameLt");
            return (Criteria) this;
        }

        public Criteria andProtectClassIsNull() {
            addCriterion("protect_class is null");
            return (Criteria) this;
        }

        public Criteria andProtectClassIsNotNull() {
            addCriterion("protect_class is not null");
            return (Criteria) this;
        }

        public Criteria andProtectClassEqualTo(Integer value) {
            addCriterion("protect_class =", value, "protectClass");
            return (Criteria) this;
        }

        public Criteria andProtectClassNotEqualTo(Integer value) {
            addCriterion("protect_class <>", value, "protectClass");
            return (Criteria) this;
        }

        public Criteria andProtectClassGreaterThan(Integer value) {
            addCriterion("protect_class >", value, "protectClass");
            return (Criteria) this;
        }

        public Criteria andProtectClassGreaterThanOrEqualTo(Integer value) {
            addCriterion("protect_class >=", value, "protectClass");
            return (Criteria) this;
        }

        public Criteria andProtectClassLessThan(Integer value) {
            addCriterion("protect_class <", value, "protectClass");
            return (Criteria) this;
        }

        public Criteria andProtectClassLessThanOrEqualTo(Integer value) {
            addCriterion("protect_class <=", value, "protectClass");
            return (Criteria) this;
        }

        public Criteria andProtectClassIn(List<Integer> values) {
            addCriterion("protect_class in", values, "protectClass");
            return (Criteria) this;
        }

        public Criteria andProtectClassNotIn(List<Integer> values) {
            addCriterion("protect_class not in", values, "protectClass");
            return (Criteria) this;
        }

        public Criteria andProtectClassBetween(Integer value1, Integer value2) {
            addCriterion("protect_class between", value1, value2, "protectClass");
            return (Criteria) this;
        }

        public Criteria andProtectClassNotBetween(Integer value1, Integer value2) {
            addCriterion("protect_class not between", value1, value2, "protectClass");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andOrderIsNull() {
            addCriterion("order is null");
            return (Criteria) this;
        }

        public Criteria andOrderIsNotNull() {
            addCriterion("order is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEqualTo(String value) {
            addCriterion("order =", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotEqualTo(String value) {
            addCriterion("order <>", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThan(String value) {
            addCriterion("order >", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderGreaterThanOrEqualTo(String value) {
            addCriterion("order >=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThan(String value) {
            addCriterion("order <", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLessThanOrEqualTo(String value) {
            addCriterion("order <=", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderLike(String value) {
            addCriterion("order like", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotLike(String value) {
            addCriterion("order not like", value, "order");
            return (Criteria) this;
        }

        public Criteria andOrderIn(List<String> values) {
            addCriterion("order in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotIn(List<String> values) {
            addCriterion("order not in", values, "order");
            return (Criteria) this;
        }

        public Criteria andOrderBetween(String value1, String value2) {
            addCriterion("order between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andOrderNotBetween(String value1, String value2) {
            addCriterion("order not between", value1, value2, "order");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNull() {
            addCriterion("family is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIsNotNull() {
            addCriterion("family is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyEqualTo(String value) {
            addCriterion("family =", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotEqualTo(String value) {
            addCriterion("family <>", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThan(String value) {
            addCriterion("family >", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyGreaterThanOrEqualTo(String value) {
            addCriterion("family >=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThan(String value) {
            addCriterion("family <", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLessThanOrEqualTo(String value) {
            addCriterion("family <=", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyLike(String value) {
            addCriterion("family like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotLike(String value) {
            addCriterion("family not like", value, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyIn(List<String> values) {
            addCriterion("family in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotIn(List<String> values) {
            addCriterion("family not in", values, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyBetween(String value1, String value2) {
            addCriterion("family between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andFamilyNotBetween(String value1, String value2) {
            addCriterion("family not between", value1, value2, "family");
            return (Criteria) this;
        }

        public Criteria andGenusIsNull() {
            addCriterion("genus is null");
            return (Criteria) this;
        }

        public Criteria andGenusIsNotNull() {
            addCriterion("genus is not null");
            return (Criteria) this;
        }

        public Criteria andGenusEqualTo(String value) {
            addCriterion("genus =", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotEqualTo(String value) {
            addCriterion("genus <>", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusGreaterThan(String value) {
            addCriterion("genus >", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusGreaterThanOrEqualTo(String value) {
            addCriterion("genus >=", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusLessThan(String value) {
            addCriterion("genus <", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusLessThanOrEqualTo(String value) {
            addCriterion("genus <=", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusLike(String value) {
            addCriterion("genus like", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotLike(String value) {
            addCriterion("genus not like", value, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusIn(List<String> values) {
            addCriterion("genus in", values, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotIn(List<String> values) {
            addCriterion("genus not in", values, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusBetween(String value1, String value2) {
            addCriterion("genus between", value1, value2, "genus");
            return (Criteria) this;
        }

        public Criteria andGenusNotBetween(String value1, String value2) {
            addCriterion("genus not between", value1, value2, "genus");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardIsNull() {
            addCriterion("one_percent_standard is null");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardIsNotNull() {
            addCriterion("one_percent_standard is not null");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardEqualTo(Integer value) {
            addCriterion("one_percent_standard =", value, "onePercentStandard");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardNotEqualTo(Integer value) {
            addCriterion("one_percent_standard <>", value, "onePercentStandard");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardGreaterThan(Integer value) {
            addCriterion("one_percent_standard >", value, "onePercentStandard");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardGreaterThanOrEqualTo(Integer value) {
            addCriterion("one_percent_standard >=", value, "onePercentStandard");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardLessThan(Integer value) {
            addCriterion("one_percent_standard <", value, "onePercentStandard");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardLessThanOrEqualTo(Integer value) {
            addCriterion("one_percent_standard <=", value, "onePercentStandard");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardIn(List<Integer> values) {
            addCriterion("one_percent_standard in", values, "onePercentStandard");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardNotIn(List<Integer> values) {
            addCriterion("one_percent_standard not in", values, "onePercentStandard");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardBetween(Integer value1, Integer value2) {
            addCriterion("one_percent_standard between", value1, value2, "onePercentStandard");
            return (Criteria) this;
        }

        public Criteria andOnePercentStandardNotBetween(Integer value1, Integer value2) {
            addCriterion("one_percent_standard not between", value1, value2, "onePercentStandard");
            return (Criteria) this;
        }

        public Criteria andThreatenedIsNull() {
            addCriterion("threatened is null");
            return (Criteria) this;
        }

        public Criteria andThreatenedIsNotNull() {
            addCriterion("threatened is not null");
            return (Criteria) this;
        }

        public Criteria andThreatenedEqualTo(String value) {
            addCriterion("threatened =", value, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedNotEqualTo(String value) {
            addCriterion("threatened <>", value, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedGreaterThan(String value) {
            addCriterion("threatened >", value, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedGreaterThanOrEqualTo(String value) {
            addCriterion("threatened >=", value, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedLessThan(String value) {
            addCriterion("threatened <", value, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedLessThanOrEqualTo(String value) {
            addCriterion("threatened <=", value, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedLike(String value) {
            addCriterion("threatened like", value, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedNotLike(String value) {
            addCriterion("threatened not like", value, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedIn(List<String> values) {
            addCriterion("threatened in", values, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedNotIn(List<String> values) {
            addCriterion("threatened not in", values, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedBetween(String value1, String value2) {
            addCriterion("threatened between", value1, value2, "threatened");
            return (Criteria) this;
        }

        public Criteria andThreatenedNotBetween(String value1, String value2) {
            addCriterion("threatened not between", value1, value2, "threatened");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdIsNull() {
            addCriterion("is_water_bird is null");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdIsNotNull() {
            addCriterion("is_water_bird is not null");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdEqualTo(Boolean value) {
            addCriterion("is_water_bird =", value, "isWaterBird");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdNotEqualTo(Boolean value) {
            addCriterion("is_water_bird <>", value, "isWaterBird");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdGreaterThan(Boolean value) {
            addCriterion("is_water_bird >", value, "isWaterBird");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_water_bird >=", value, "isWaterBird");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdLessThan(Boolean value) {
            addCriterion("is_water_bird <", value, "isWaterBird");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdLessThanOrEqualTo(Boolean value) {
            addCriterion("is_water_bird <=", value, "isWaterBird");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdIn(List<Boolean> values) {
            addCriterion("is_water_bird in", values, "isWaterBird");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdNotIn(List<Boolean> values) {
            addCriterion("is_water_bird not in", values, "isWaterBird");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdBetween(Boolean value1, Boolean value2) {
            addCriterion("is_water_bird between", value1, value2, "isWaterBird");
            return (Criteria) this;
        }

        public Criteria andIsWaterBirdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_water_bird not between", value1, value2, "isWaterBird");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdIsNull() {
            addCriterion("is_wetland_depend_bird is null");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdIsNotNull() {
            addCriterion("is_wetland_depend_bird is not null");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdEqualTo(Boolean value) {
            addCriterion("is_wetland_depend_bird =", value, "isWetlandDependBird");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdNotEqualTo(Boolean value) {
            addCriterion("is_wetland_depend_bird <>", value, "isWetlandDependBird");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdGreaterThan(Boolean value) {
            addCriterion("is_wetland_depend_bird >", value, "isWetlandDependBird");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_wetland_depend_bird >=", value, "isWetlandDependBird");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdLessThan(Boolean value) {
            addCriterion("is_wetland_depend_bird <", value, "isWetlandDependBird");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdLessThanOrEqualTo(Boolean value) {
            addCriterion("is_wetland_depend_bird <=", value, "isWetlandDependBird");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdIn(List<Boolean> values) {
            addCriterion("is_wetland_depend_bird in", values, "isWetlandDependBird");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdNotIn(List<Boolean> values) {
            addCriterion("is_wetland_depend_bird not in", values, "isWetlandDependBird");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdBetween(Boolean value1, Boolean value2) {
            addCriterion("is_wetland_depend_bird between", value1, value2, "isWetlandDependBird");
            return (Criteria) this;
        }

        public Criteria andIsWetlandDependBirdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_wetland_depend_bird not between", value1, value2, "isWetlandDependBird");
            return (Criteria) this;
        }

        public Criteria andZhPinyinIsNull() {
            addCriterion("zh_pinyin is null");
            return (Criteria) this;
        }

        public Criteria andZhPinyinIsNotNull() {
            addCriterion("zh_pinyin is not null");
            return (Criteria) this;
        }

        public Criteria andZhPinyinEqualTo(String value) {
            addCriterion("zh_pinyin =", value, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinNotEqualTo(String value) {
            addCriterion("zh_pinyin <>", value, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinGreaterThan(String value) {
            addCriterion("zh_pinyin >", value, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinGreaterThanOrEqualTo(String value) {
            addCriterion("zh_pinyin >=", value, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinLessThan(String value) {
            addCriterion("zh_pinyin <", value, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinLessThanOrEqualTo(String value) {
            addCriterion("zh_pinyin <=", value, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinLike(String value) {
            addCriterion("zh_pinyin like", value, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinNotLike(String value) {
            addCriterion("zh_pinyin not like", value, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinIn(List<String> values) {
            addCriterion("zh_pinyin in", values, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinNotIn(List<String> values) {
            addCriterion("zh_pinyin not in", values, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinBetween(String value1, String value2) {
            addCriterion("zh_pinyin between", value1, value2, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andZhPinyinNotBetween(String value1, String value2) {
            addCriterion("zh_pinyin not between", value1, value2, "zhPinyin");
            return (Criteria) this;
        }

        public Criteria andIsAliveIsNull() {
            addCriterion("is_alive is null");
            return (Criteria) this;
        }

        public Criteria andIsAliveIsNotNull() {
            addCriterion("is_alive is not null");
            return (Criteria) this;
        }

        public Criteria andIsAliveEqualTo(Boolean value) {
            addCriterion("is_alive =", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveNotEqualTo(Boolean value) {
            addCriterion("is_alive <>", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveGreaterThan(Boolean value) {
            addCriterion("is_alive >", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_alive >=", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveLessThan(Boolean value) {
            addCriterion("is_alive <", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_alive <=", value, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveIn(List<Boolean> values) {
            addCriterion("is_alive in", values, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveNotIn(List<Boolean> values) {
            addCriterion("is_alive not in", values, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_alive between", value1, value2, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsAliveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_alive not between", value1, value2, "isAlive");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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