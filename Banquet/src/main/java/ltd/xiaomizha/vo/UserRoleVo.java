package ltd.xiaomizha.vo;

import ltd.xiaomizha.bean.UserRoles;
import ltd.xiaomizha.bean.UserRolesRelation;

public class UserRoleVo {
    private UserRoles userRoles;
    private UserRolesRelation userRolesRelation;

    public UserRoleVo() {
    }

    public UserRoleVo(UserRoles userRoles) {
        this.userRoles = userRoles;
    }

    public UserRoleVo(UserRolesRelation userRolesRelation) {
        this.userRolesRelation = userRolesRelation;
    }

    public UserRoleVo(UserRoles userRoles, UserRolesRelation userRolesRelation) {
        this.userRoles = userRoles;
        this.userRolesRelation = userRolesRelation;
    }

    @Override
    public String toString() {
        return "UserRoleVo{" +
                "userRoles=" + userRoles +
                ", userRolesRelation=" + userRolesRelation +
                '}';
    }

    public UserRoles getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(UserRoles userRoles) {
        this.userRoles = userRoles;
    }

    public UserRolesRelation getUserRolesRelation() {
        return userRolesRelation;
    }

    public void setUserRolesRelation(UserRolesRelation userRolesRelation) {
        this.userRolesRelation = userRolesRelation;
    }
}
