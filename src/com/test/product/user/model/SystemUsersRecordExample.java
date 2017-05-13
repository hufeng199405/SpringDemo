package com.test.product.user.model;

import java.util.ArrayList;
import java.util.List;

public class SystemUsersRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SystemUsersRecordExample() {
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

        public Criteria andSystemUsersIdIsNull() {
            addCriterion("system_users_id is null");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdIsNotNull() {
            addCriterion("system_users_id is not null");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdEqualTo(Integer value) {
            addCriterion("system_users_id =", value, "systemUsersId");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdNotEqualTo(Integer value) {
            addCriterion("system_users_id <>", value, "systemUsersId");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdGreaterThan(Integer value) {
            addCriterion("system_users_id >", value, "systemUsersId");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("system_users_id >=", value, "systemUsersId");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdLessThan(Integer value) {
            addCriterion("system_users_id <", value, "systemUsersId");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdLessThanOrEqualTo(Integer value) {
            addCriterion("system_users_id <=", value, "systemUsersId");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdIn(List<Integer> values) {
            addCriterion("system_users_id in", values, "systemUsersId");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdNotIn(List<Integer> values) {
            addCriterion("system_users_id not in", values, "systemUsersId");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdBetween(Integer value1, Integer value2) {
            addCriterion("system_users_id between", value1, value2, "systemUsersId");
            return (Criteria) this;
        }

        public Criteria andSystemUsersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("system_users_id not between", value1, value2, "systemUsersId");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNull() {
            addCriterion("user_login_name is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIsNotNull() {
            addCriterion("user_login_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameEqualTo(String value) {
            addCriterion("user_login_name =", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotEqualTo(String value) {
            addCriterion("user_login_name <>", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThan(String value) {
            addCriterion("user_login_name >", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_name >=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThan(String value) {
            addCriterion("user_login_name <", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLessThanOrEqualTo(String value) {
            addCriterion("user_login_name <=", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameLike(String value) {
            addCriterion("user_login_name like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotLike(String value) {
            addCriterion("user_login_name not like", value, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameIn(List<String> values) {
            addCriterion("user_login_name in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotIn(List<String> values) {
            addCriterion("user_login_name not in", values, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameBetween(String value1, String value2) {
            addCriterion("user_login_name between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginNameNotBetween(String value1, String value2) {
            addCriterion("user_login_name not between", value1, value2, "userLoginName");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordIsNull() {
            addCriterion("user_login_password is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordIsNotNull() {
            addCriterion("user_login_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordEqualTo(String value) {
            addCriterion("user_login_password =", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotEqualTo(String value) {
            addCriterion("user_login_password <>", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordGreaterThan(String value) {
            addCriterion("user_login_password >", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_password >=", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordLessThan(String value) {
            addCriterion("user_login_password <", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_login_password <=", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordLike(String value) {
            addCriterion("user_login_password like", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotLike(String value) {
            addCriterion("user_login_password not like", value, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordIn(List<String> values) {
            addCriterion("user_login_password in", values, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotIn(List<String> values) {
            addCriterion("user_login_password not in", values, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordBetween(String value1, String value2) {
            addCriterion("user_login_password between", value1, value2, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andUserLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("user_login_password not between", value1, value2, "userLoginPassword");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andUsersNameIsNull() {
            addCriterion("users_name is null");
            return (Criteria) this;
        }

        public Criteria andUsersNameIsNotNull() {
            addCriterion("users_name is not null");
            return (Criteria) this;
        }

        public Criteria andUsersNameEqualTo(String value) {
            addCriterion("users_name =", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotEqualTo(String value) {
            addCriterion("users_name <>", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameGreaterThan(String value) {
            addCriterion("users_name >", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameGreaterThanOrEqualTo(String value) {
            addCriterion("users_name >=", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLessThan(String value) {
            addCriterion("users_name <", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLessThanOrEqualTo(String value) {
            addCriterion("users_name <=", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameLike(String value) {
            addCriterion("users_name like", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotLike(String value) {
            addCriterion("users_name not like", value, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameIn(List<String> values) {
            addCriterion("users_name in", values, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotIn(List<String> values) {
            addCriterion("users_name not in", values, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameBetween(String value1, String value2) {
            addCriterion("users_name between", value1, value2, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersNameNotBetween(String value1, String value2) {
            addCriterion("users_name not between", value1, value2, "usersName");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneIsNull() {
            addCriterion("users_phone is null");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneIsNotNull() {
            addCriterion("users_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneEqualTo(String value) {
            addCriterion("users_phone =", value, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneNotEqualTo(String value) {
            addCriterion("users_phone <>", value, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneGreaterThan(String value) {
            addCriterion("users_phone >", value, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("users_phone >=", value, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneLessThan(String value) {
            addCriterion("users_phone <", value, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneLessThanOrEqualTo(String value) {
            addCriterion("users_phone <=", value, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneLike(String value) {
            addCriterion("users_phone like", value, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneNotLike(String value) {
            addCriterion("users_phone not like", value, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneIn(List<String> values) {
            addCriterion("users_phone in", values, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneNotIn(List<String> values) {
            addCriterion("users_phone not in", values, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneBetween(String value1, String value2) {
            addCriterion("users_phone between", value1, value2, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersPhoneNotBetween(String value1, String value2) {
            addCriterion("users_phone not between", value1, value2, "usersPhone");
            return (Criteria) this;
        }

        public Criteria andUsersAgeIsNull() {
            addCriterion("users_age is null");
            return (Criteria) this;
        }

        public Criteria andUsersAgeIsNotNull() {
            addCriterion("users_age is not null");
            return (Criteria) this;
        }

        public Criteria andUsersAgeEqualTo(Integer value) {
            addCriterion("users_age =", value, "usersAge");
            return (Criteria) this;
        }

        public Criteria andUsersAgeNotEqualTo(Integer value) {
            addCriterion("users_age <>", value, "usersAge");
            return (Criteria) this;
        }

        public Criteria andUsersAgeGreaterThan(Integer value) {
            addCriterion("users_age >", value, "usersAge");
            return (Criteria) this;
        }

        public Criteria andUsersAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_age >=", value, "usersAge");
            return (Criteria) this;
        }

        public Criteria andUsersAgeLessThan(Integer value) {
            addCriterion("users_age <", value, "usersAge");
            return (Criteria) this;
        }

        public Criteria andUsersAgeLessThanOrEqualTo(Integer value) {
            addCriterion("users_age <=", value, "usersAge");
            return (Criteria) this;
        }

        public Criteria andUsersAgeIn(List<Integer> values) {
            addCriterion("users_age in", values, "usersAge");
            return (Criteria) this;
        }

        public Criteria andUsersAgeNotIn(List<Integer> values) {
            addCriterion("users_age not in", values, "usersAge");
            return (Criteria) this;
        }

        public Criteria andUsersAgeBetween(Integer value1, Integer value2) {
            addCriterion("users_age between", value1, value2, "usersAge");
            return (Criteria) this;
        }

        public Criteria andUsersAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("users_age not between", value1, value2, "usersAge");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdIsNull() {
            addCriterion("users_card_id is null");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdIsNotNull() {
            addCriterion("users_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdEqualTo(String value) {
            addCriterion("users_card_id =", value, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdNotEqualTo(String value) {
            addCriterion("users_card_id <>", value, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdGreaterThan(String value) {
            addCriterion("users_card_id >", value, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("users_card_id >=", value, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdLessThan(String value) {
            addCriterion("users_card_id <", value, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdLessThanOrEqualTo(String value) {
            addCriterion("users_card_id <=", value, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdLike(String value) {
            addCriterion("users_card_id like", value, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdNotLike(String value) {
            addCriterion("users_card_id not like", value, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdIn(List<String> values) {
            addCriterion("users_card_id in", values, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdNotIn(List<String> values) {
            addCriterion("users_card_id not in", values, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdBetween(String value1, String value2) {
            addCriterion("users_card_id between", value1, value2, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersCardIdNotBetween(String value1, String value2) {
            addCriterion("users_card_id not between", value1, value2, "usersCardId");
            return (Criteria) this;
        }

        public Criteria andUsersPositionIsNull() {
            addCriterion("users_position is null");
            return (Criteria) this;
        }

        public Criteria andUsersPositionIsNotNull() {
            addCriterion("users_position is not null");
            return (Criteria) this;
        }

        public Criteria andUsersPositionEqualTo(String value) {
            addCriterion("users_position =", value, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionNotEqualTo(String value) {
            addCriterion("users_position <>", value, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionGreaterThan(String value) {
            addCriterion("users_position >", value, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionGreaterThanOrEqualTo(String value) {
            addCriterion("users_position >=", value, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionLessThan(String value) {
            addCriterion("users_position <", value, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionLessThanOrEqualTo(String value) {
            addCriterion("users_position <=", value, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionLike(String value) {
            addCriterion("users_position like", value, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionNotLike(String value) {
            addCriterion("users_position not like", value, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionIn(List<String> values) {
            addCriterion("users_position in", values, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionNotIn(List<String> values) {
            addCriterion("users_position not in", values, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionBetween(String value1, String value2) {
            addCriterion("users_position between", value1, value2, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersPositionNotBetween(String value1, String value2) {
            addCriterion("users_position not between", value1, value2, "usersPosition");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressIsNull() {
            addCriterion("users_home_address is null");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressIsNotNull() {
            addCriterion("users_home_address is not null");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressEqualTo(String value) {
            addCriterion("users_home_address =", value, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressNotEqualTo(String value) {
            addCriterion("users_home_address <>", value, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressGreaterThan(String value) {
            addCriterion("users_home_address >", value, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("users_home_address >=", value, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressLessThan(String value) {
            addCriterion("users_home_address <", value, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("users_home_address <=", value, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressLike(String value) {
            addCriterion("users_home_address like", value, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressNotLike(String value) {
            addCriterion("users_home_address not like", value, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressIn(List<String> values) {
            addCriterion("users_home_address in", values, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressNotIn(List<String> values) {
            addCriterion("users_home_address not in", values, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressBetween(String value1, String value2) {
            addCriterion("users_home_address between", value1, value2, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersHomeAddressNotBetween(String value1, String value2) {
            addCriterion("users_home_address not between", value1, value2, "usersHomeAddress");
            return (Criteria) this;
        }

        public Criteria andUsersStatusIsNull() {
            addCriterion("users_status is null");
            return (Criteria) this;
        }

        public Criteria andUsersStatusIsNotNull() {
            addCriterion("users_status is not null");
            return (Criteria) this;
        }

        public Criteria andUsersStatusEqualTo(Integer value) {
            addCriterion("users_status =", value, "usersStatus");
            return (Criteria) this;
        }

        public Criteria andUsersStatusNotEqualTo(Integer value) {
            addCriterion("users_status <>", value, "usersStatus");
            return (Criteria) this;
        }

        public Criteria andUsersStatusGreaterThan(Integer value) {
            addCriterion("users_status >", value, "usersStatus");
            return (Criteria) this;
        }

        public Criteria andUsersStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_status >=", value, "usersStatus");
            return (Criteria) this;
        }

        public Criteria andUsersStatusLessThan(Integer value) {
            addCriterion("users_status <", value, "usersStatus");
            return (Criteria) this;
        }

        public Criteria andUsersStatusLessThanOrEqualTo(Integer value) {
            addCriterion("users_status <=", value, "usersStatus");
            return (Criteria) this;
        }

        public Criteria andUsersStatusIn(List<Integer> values) {
            addCriterion("users_status in", values, "usersStatus");
            return (Criteria) this;
        }

        public Criteria andUsersStatusNotIn(List<Integer> values) {
            addCriterion("users_status not in", values, "usersStatus");
            return (Criteria) this;
        }

        public Criteria andUsersStatusBetween(Integer value1, Integer value2) {
            addCriterion("users_status between", value1, value2, "usersStatus");
            return (Criteria) this;
        }

        public Criteria andUsersStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("users_status not between", value1, value2, "usersStatus");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkIsNull() {
            addCriterion("users_remark is null");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkIsNotNull() {
            addCriterion("users_remark is not null");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkEqualTo(String value) {
            addCriterion("users_remark =", value, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkNotEqualTo(String value) {
            addCriterion("users_remark <>", value, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkGreaterThan(String value) {
            addCriterion("users_remark >", value, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("users_remark >=", value, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkLessThan(String value) {
            addCriterion("users_remark <", value, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkLessThanOrEqualTo(String value) {
            addCriterion("users_remark <=", value, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkLike(String value) {
            addCriterion("users_remark like", value, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkNotLike(String value) {
            addCriterion("users_remark not like", value, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkIn(List<String> values) {
            addCriterion("users_remark in", values, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkNotIn(List<String> values) {
            addCriterion("users_remark not in", values, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkBetween(String value1, String value2) {
            addCriterion("users_remark between", value1, value2, "usersRemark");
            return (Criteria) this;
        }

        public Criteria andUsersRemarkNotBetween(String value1, String value2) {
            addCriterion("users_remark not between", value1, value2, "usersRemark");
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