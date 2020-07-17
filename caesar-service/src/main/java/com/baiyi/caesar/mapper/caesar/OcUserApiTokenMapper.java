package com.baiyi.caesar.mapper.caesar;

import com.baiyi.caesar.domain.generator.caesar.OcUserApiToken;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface OcUserApiTokenMapper extends Mapper<OcUserApiToken> {

    int checkUserHasResourceAuthorize(@Param("token") String token, @Param("resourceName") String resourceName);
}