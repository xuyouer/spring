package ltd.xiaomizha.mapper;

import ltd.xiaomizha.bean.UserRolesRelation;

/**
 * @author xiaom
 * @description 针对表【user_roles_relation(用户-身份关系表)】的数据库操作Mapper
 * @createDate 2024-08-01 21:12:34
 * @Entity ltd.xiaomizha.bean.UserRolesRelation
 */
public interface UserRolesRelationMapper {
    /**
     * 添加功能
     *
     * @param userRolesRelation
     * @return
     */
    boolean addUserRolesRelation(UserRolesRelation userRolesRelation);
}




