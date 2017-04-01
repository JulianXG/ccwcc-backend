package cn.kalyter.ccwcc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public FlagExample() {
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

        public Criteria andBirdIdIsNull() {
            addCriterion("bird_id is null");
            return (Criteria) this;
        }

        public Criteria andBirdIdIsNotNull() {
            addCriterion("bird_id is not null");
            return (Criteria) this;
        }

        public Criteria andBirdIdEqualTo(Integer value) {
            addCriterion("bird_id =", value, "birdId");
            return (Criteria) this;
        }

        public Criteria andBirdIdNotEqualTo(Integer value) {
            addCriterion("bird_id <>", value, "birdId");
            return (Criteria) this;
        }

        public Criteria andBirdIdGreaterThan(Integer value) {
            addCriterion("bird_id >", value, "birdId");
            return (Criteria) this;
        }

        public Criteria andBirdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bird_id >=", value, "birdId");
            return (Criteria) this;
        }

        public Criteria andBirdIdLessThan(Integer value) {
            addCriterion("bird_id <", value, "birdId");
            return (Criteria) this;
        }

        public Criteria andBirdIdLessThanOrEqualTo(Integer value) {
            addCriterion("bird_id <=", value, "birdId");
            return (Criteria) this;
        }

        public Criteria andBirdIdIn(List<Integer> values) {
            addCriterion("bird_id in", values, "birdId");
            return (Criteria) this;
        }

        public Criteria andBirdIdNotIn(List<Integer> values) {
            addCriterion("bird_id not in", values, "birdId");
            return (Criteria) this;
        }

        public Criteria andBirdIdBetween(Integer value1, Integer value2) {
            addCriterion("bird_id between", value1, value2, "birdId");
            return (Criteria) this;
        }

        public Criteria andBirdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bird_id not between", value1, value2, "birdId");
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

        public Criteria andFlagColorCombinationIsNull() {
            addCriterion("flag_color_combination is null");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationIsNotNull() {
            addCriterion("flag_color_combination is not null");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationEqualTo(String value) {
            addCriterion("flag_color_combination =", value, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationNotEqualTo(String value) {
            addCriterion("flag_color_combination <>", value, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationGreaterThan(String value) {
            addCriterion("flag_color_combination >", value, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationGreaterThanOrEqualTo(String value) {
            addCriterion("flag_color_combination >=", value, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationLessThan(String value) {
            addCriterion("flag_color_combination <", value, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationLessThanOrEqualTo(String value) {
            addCriterion("flag_color_combination <=", value, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationLike(String value) {
            addCriterion("flag_color_combination like", value, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationNotLike(String value) {
            addCriterion("flag_color_combination not like", value, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationIn(List<String> values) {
            addCriterion("flag_color_combination in", values, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationNotIn(List<String> values) {
            addCriterion("flag_color_combination not in", values, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationBetween(String value1, String value2) {
            addCriterion("flag_color_combination between", value1, value2, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andFlagColorCombinationNotBetween(String value1, String value2) {
            addCriterion("flag_color_combination not between", value1, value2, "flagColorCombination");
            return (Criteria) this;
        }

        public Criteria andLuIsNull() {
            addCriterion("lu is null");
            return (Criteria) this;
        }

        public Criteria andLuIsNotNull() {
            addCriterion("lu is not null");
            return (Criteria) this;
        }

        public Criteria andLuEqualTo(String value) {
            addCriterion("lu =", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuNotEqualTo(String value) {
            addCriterion("lu <>", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuGreaterThan(String value) {
            addCriterion("lu >", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuGreaterThanOrEqualTo(String value) {
            addCriterion("lu >=", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuLessThan(String value) {
            addCriterion("lu <", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuLessThanOrEqualTo(String value) {
            addCriterion("lu <=", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuLike(String value) {
            addCriterion("lu like", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuNotLike(String value) {
            addCriterion("lu not like", value, "lu");
            return (Criteria) this;
        }

        public Criteria andLuIn(List<String> values) {
            addCriterion("lu in", values, "lu");
            return (Criteria) this;
        }

        public Criteria andLuNotIn(List<String> values) {
            addCriterion("lu not in", values, "lu");
            return (Criteria) this;
        }

        public Criteria andLuBetween(String value1, String value2) {
            addCriterion("lu between", value1, value2, "lu");
            return (Criteria) this;
        }

        public Criteria andLuNotBetween(String value1, String value2) {
            addCriterion("lu not between", value1, value2, "lu");
            return (Criteria) this;
        }

        public Criteria andRuIsNull() {
            addCriterion("ru is null");
            return (Criteria) this;
        }

        public Criteria andRuIsNotNull() {
            addCriterion("ru is not null");
            return (Criteria) this;
        }

        public Criteria andRuEqualTo(String value) {
            addCriterion("ru =", value, "ru");
            return (Criteria) this;
        }

        public Criteria andRuNotEqualTo(String value) {
            addCriterion("ru <>", value, "ru");
            return (Criteria) this;
        }

        public Criteria andRuGreaterThan(String value) {
            addCriterion("ru >", value, "ru");
            return (Criteria) this;
        }

        public Criteria andRuGreaterThanOrEqualTo(String value) {
            addCriterion("ru >=", value, "ru");
            return (Criteria) this;
        }

        public Criteria andRuLessThan(String value) {
            addCriterion("ru <", value, "ru");
            return (Criteria) this;
        }

        public Criteria andRuLessThanOrEqualTo(String value) {
            addCriterion("ru <=", value, "ru");
            return (Criteria) this;
        }

        public Criteria andRuLike(String value) {
            addCriterion("ru like", value, "ru");
            return (Criteria) this;
        }

        public Criteria andRuNotLike(String value) {
            addCriterion("ru not like", value, "ru");
            return (Criteria) this;
        }

        public Criteria andRuIn(List<String> values) {
            addCriterion("ru in", values, "ru");
            return (Criteria) this;
        }

        public Criteria andRuNotIn(List<String> values) {
            addCriterion("ru not in", values, "ru");
            return (Criteria) this;
        }

        public Criteria andRuBetween(String value1, String value2) {
            addCriterion("ru between", value1, value2, "ru");
            return (Criteria) this;
        }

        public Criteria andRuNotBetween(String value1, String value2) {
            addCriterion("ru not between", value1, value2, "ru");
            return (Criteria) this;
        }

        public Criteria andLdIsNull() {
            addCriterion("ld is null");
            return (Criteria) this;
        }

        public Criteria andLdIsNotNull() {
            addCriterion("ld is not null");
            return (Criteria) this;
        }

        public Criteria andLdEqualTo(String value) {
            addCriterion("ld =", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotEqualTo(String value) {
            addCriterion("ld <>", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdGreaterThan(String value) {
            addCriterion("ld >", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdGreaterThanOrEqualTo(String value) {
            addCriterion("ld >=", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdLessThan(String value) {
            addCriterion("ld <", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdLessThanOrEqualTo(String value) {
            addCriterion("ld <=", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdLike(String value) {
            addCriterion("ld like", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotLike(String value) {
            addCriterion("ld not like", value, "ld");
            return (Criteria) this;
        }

        public Criteria andLdIn(List<String> values) {
            addCriterion("ld in", values, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotIn(List<String> values) {
            addCriterion("ld not in", values, "ld");
            return (Criteria) this;
        }

        public Criteria andLdBetween(String value1, String value2) {
            addCriterion("ld between", value1, value2, "ld");
            return (Criteria) this;
        }

        public Criteria andLdNotBetween(String value1, String value2) {
            addCriterion("ld not between", value1, value2, "ld");
            return (Criteria) this;
        }

        public Criteria andRdIsNull() {
            addCriterion("rd is null");
            return (Criteria) this;
        }

        public Criteria andRdIsNotNull() {
            addCriterion("rd is not null");
            return (Criteria) this;
        }

        public Criteria andRdEqualTo(String value) {
            addCriterion("rd =", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdNotEqualTo(String value) {
            addCriterion("rd <>", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdGreaterThan(String value) {
            addCriterion("rd >", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdGreaterThanOrEqualTo(String value) {
            addCriterion("rd >=", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdLessThan(String value) {
            addCriterion("rd <", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdLessThanOrEqualTo(String value) {
            addCriterion("rd <=", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdLike(String value) {
            addCriterion("rd like", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdNotLike(String value) {
            addCriterion("rd not like", value, "rd");
            return (Criteria) this;
        }

        public Criteria andRdIn(List<String> values) {
            addCriterion("rd in", values, "rd");
            return (Criteria) this;
        }

        public Criteria andRdNotIn(List<String> values) {
            addCriterion("rd not in", values, "rd");
            return (Criteria) this;
        }

        public Criteria andRdBetween(String value1, String value2) {
            addCriterion("rd between", value1, value2, "rd");
            return (Criteria) this;
        }

        public Criteria andRdNotBetween(String value1, String value2) {
            addCriterion("rd not between", value1, value2, "rd");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeIsNull() {
            addCriterion("discovered_time is null");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeIsNotNull() {
            addCriterion("discovered_time is not null");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeEqualTo(Date value) {
            addCriterion("discovered_time =", value, "discoveredTime");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeNotEqualTo(Date value) {
            addCriterion("discovered_time <>", value, "discoveredTime");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeGreaterThan(Date value) {
            addCriterion("discovered_time >", value, "discoveredTime");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("discovered_time >=", value, "discoveredTime");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeLessThan(Date value) {
            addCriterion("discovered_time <", value, "discoveredTime");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeLessThanOrEqualTo(Date value) {
            addCriterion("discovered_time <=", value, "discoveredTime");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeIn(List<Date> values) {
            addCriterion("discovered_time in", values, "discoveredTime");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeNotIn(List<Date> values) {
            addCriterion("discovered_time not in", values, "discoveredTime");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeBetween(Date value1, Date value2) {
            addCriterion("discovered_time between", value1, value2, "discoveredTime");
            return (Criteria) this;
        }

        public Criteria andDiscoveredTimeNotBetween(Date value1, Date value2) {
            addCriterion("discovered_time not between", value1, value2, "discoveredTime");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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