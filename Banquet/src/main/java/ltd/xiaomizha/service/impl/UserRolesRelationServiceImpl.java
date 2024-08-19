package ltd.xiaomizha.service.impl;

import ltd.xiaomizha.bean.UserRolesRelation;
import ltd.xiaomizha.mapper.UserRolesRelationMapper;
import ltd.xiaomizha.service.UserRolesRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRolesRelationServiceImpl implements UserRolesRelationService {
    @Autowired
    private UserRolesRelationMapper userRolesRelationMapper;

    /**
     * 添加功能
     *
     * @param userRolesRelation
     * @return
     */
    @Override
    public boolean addUserRolesRelation(UserRolesRelation userRolesRelation) {
        return userRolesRelationMapper.addUserRolesRelation(userRolesRelation);
    }
}
