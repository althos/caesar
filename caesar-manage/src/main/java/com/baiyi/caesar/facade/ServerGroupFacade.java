package com.baiyi.caesar.facade;

import com.baiyi.caesar.domain.BusinessWrapper;
import com.baiyi.caesar.domain.DataTable;
import com.baiyi.caesar.domain.generator.caesar.OcUser;
import com.baiyi.caesar.domain.param.server.ServerGroupParam;
import com.baiyi.caesar.domain.param.server.ServerGroupTypeParam;
import com.baiyi.caesar.domain.param.server.SeverGroupPropertyParam;
import com.baiyi.caesar.domain.param.user.UserServerTreeParam;
import com.baiyi.caesar.domain.vo.server.*;

import java.util.List;
import java.util.Map;

/**
 * @Author baiyi
 * @Date 2020/2/21 11:00 上午
 * @Version 1.0
 */
public interface ServerGroupFacade {

    DataTable<ServerGroupVO.ServerGroup> queryServerGroupPage(ServerGroupParam.PageQuery pageQuery);

    BusinessWrapper<ServerGroupVO.ServerGroup> queryServerGroupById(int id);

    BusinessWrapper<Boolean> addServerGroup(ServerGroupVO.ServerGroup serverGroup);

    BusinessWrapper<Boolean> updateServerGroup(ServerGroupVO.ServerGroup serverGroup);

    BusinessWrapper<Boolean> deleteServerGroupById(int id);

    DataTable<ServerGroupTypeVO.ServerGroupType> queryServerGroupTypePage(ServerGroupTypeParam.PageQuery pageQuery);

    BusinessWrapper<Boolean> addServerGroupType(ServerGroupTypeVO.ServerGroupType serverGroupType);

    BusinessWrapper<Boolean> updateServerGroupType(ServerGroupTypeVO.ServerGroupType serverGroupType);

    BusinessWrapper<Boolean> deleteServerGroupTypeById(int id);

    DataTable<ServerGroupVO.ServerGroup> queryUserIncludeServerGroupPage(ServerGroupParam.UserServerGroupPageQuery pageQuery);

    DataTable<ServerGroupVO.ServerGroup> queryUserExcludeServerGroupPage(ServerGroupParam.UserServerGroupPageQuery pageQuery);

    BusinessWrapper<Boolean> grantUserServerGroup(ServerGroupParam.UserServerGroupPermission userServerGroupPermission);

    BusinessWrapper<Boolean> revokeUserServerGroup(ServerGroupParam.UserServerGroupPermission userServerGroupPermission);

    BusinessWrapper<List<ServerAttributeVO.ServerAttribute>> queryServerGroupAttribute(int id);

    BusinessWrapper<Map<Integer, Map<String, String>>> queryServerGroupPropertyMap(int id);

    BusinessWrapper<Map<Integer, Map<String, String>>> queryServerGroupPropertyMap(SeverGroupPropertyParam.PropertyParam propertyParam);

    BusinessWrapper<Boolean> saveServerGroupProperty(ServerGroupPropertyVO.ServerGroupProperty serverGroupProperty);

    BusinessWrapper<Boolean> saveServerGroupAttribute(ServerAttributeVO.ServerAttribute serverAttribute);

    BusinessWrapper<Boolean> delServerGroupPropertyById(int id);

    ServerTreeVO.MyServerTree queryUserServerTree(UserServerTreeParam.UserServerTreeQuery userServerTreeQuery, OcUser ocUser);

    BusinessWrapper<Map<String, String>> getServerTreeHostPatternMap(String uuid, OcUser ocUser);

}
