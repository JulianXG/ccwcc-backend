package cn.kalyter.ccwcc.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public RecordExample() {
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

        public Criteria andBirdCountIsNull() {
            addCriterion("bird_count is null");
            return (Criteria) this;
        }

        public Criteria andBirdCountIsNotNull() {
            addCriterion("bird_count is not null");
            return (Criteria) this;
        }

        public Criteria andBirdCountEqualTo(Integer value) {
            addCriterion("bird_count =", value, "birdCount");
            return (Criteria) this;
        }

        public Criteria andBirdCountNotEqualTo(Integer value) {
            addCriterion("bird_count <>", value, "birdCount");
            return (Criteria) this;
        }

        public Criteria andBirdCountGreaterThan(Integer value) {
            addCriterion("bird_count >", value, "birdCount");
            return (Criteria) this;
        }

        public Criteria andBirdCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bird_count >=", value, "birdCount");
            return (Criteria) this;
        }

        public Criteria andBirdCountLessThan(Integer value) {
            addCriterion("bird_count <", value, "birdCount");
            return (Criteria) this;
        }

        public Criteria andBirdCountLessThanOrEqualTo(Integer value) {
            addCriterion("bird_count <=", value, "birdCount");
            return (Criteria) this;
        }

        public Criteria andBirdCountIn(List<Integer> values) {
            addCriterion("bird_count in", values, "birdCount");
            return (Criteria) this;
        }

        public Criteria andBirdCountNotIn(List<Integer> values) {
            addCriterion("bird_count not in", values, "birdCount");
            return (Criteria) this;
        }

        public Criteria andBirdCountBetween(Integer value1, Integer value2) {
            addCriterion("bird_count between", value1, value2, "birdCount");
            return (Criteria) this;
        }

        public Criteria andBirdCountNotBetween(Integer value1, Integer value2) {
            addCriterion("bird_count not between", value1, value2, "birdCount");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdIsNull() {
            addCriterion("checkpoint_id is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdIsNotNull() {
            addCriterion("checkpoint_id is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdEqualTo(Integer value) {
            addCriterion("checkpoint_id =", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotEqualTo(Integer value) {
            addCriterion("checkpoint_id <>", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdGreaterThan(Integer value) {
            addCriterion("checkpoint_id >", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkpoint_id >=", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdLessThan(Integer value) {
            addCriterion("checkpoint_id <", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdLessThanOrEqualTo(Integer value) {
            addCriterion("checkpoint_id <=", value, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdIn(List<Integer> values) {
            addCriterion("checkpoint_id in", values, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotIn(List<Integer> values) {
            addCriterion("checkpoint_id not in", values, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdBetween(Integer value1, Integer value2) {
            addCriterion("checkpoint_id between", value1, value2, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andCheckpointIdNotBetween(Integer value1, Integer value2) {
            addCriterion("checkpoint_id not between", value1, value2, "checkpointId");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("detail is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("detail is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("detail =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("detail <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("detail >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("detail >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("detail <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("detail <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("detail like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("detail not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("detail in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("detail not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("detail between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("detail not between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("weather is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("weather is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("weather =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("weather <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("weather >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("weather >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("weather <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("weather <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("weather like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("weather not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("weather in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("weather not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("weather between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("weather not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andVisitTimesIsNull() {
            addCriterion("visit_times is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimesIsNotNull() {
            addCriterion("visit_times is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimesEqualTo(Integer value) {
            addCriterion("visit_times =", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesNotEqualTo(Integer value) {
            addCriterion("visit_times <>", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesGreaterThan(Integer value) {
            addCriterion("visit_times >", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("visit_times >=", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesLessThan(Integer value) {
            addCriterion("visit_times <", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesLessThanOrEqualTo(Integer value) {
            addCriterion("visit_times <=", value, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesIn(List<Integer> values) {
            addCriterion("visit_times in", values, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesNotIn(List<Integer> values) {
            addCriterion("visit_times not in", values, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesBetween(Integer value1, Integer value2) {
            addCriterion("visit_times between", value1, value2, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andVisitTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("visit_times not between", value1, value2, "visitTimes");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNull() {
            addCriterion("record_time is null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIsNotNull() {
            addCriterion("record_time is not null");
            return (Criteria) this;
        }

        public Criteria andRecordTimeEqualTo(Date value) {
            addCriterion("record_time =", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotEqualTo(Date value) {
            addCriterion("record_time <>", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThan(Date value) {
            addCriterion("record_time >", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("record_time >=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThan(Date value) {
            addCriterion("record_time <", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeLessThanOrEqualTo(Date value) {
            addCriterion("record_time <=", value, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeIn(List<Date> values) {
            addCriterion("record_time in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotIn(List<Date> values) {
            addCriterion("record_time not in", values, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeBetween(Date value1, Date value2) {
            addCriterion("record_time between", value1, value2, "recordTime");
            return (Criteria) this;
        }

        public Criteria andRecordTimeNotBetween(Date value1, Date value2) {
            addCriterion("record_time not between", value1, value2, "recordTime");
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