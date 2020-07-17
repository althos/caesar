package com.baiyi.caesar.service.user;

import com.baiyi.caesar.domain.generator.caesar.OcUserApiToken;

import java.util.List;

/**
 * @Author baiyi
 * @Date 2020/2/26 5:34 下午
 * @Version 1.0
 */
public interface OcUserApiTokenService {

    List<OcUserApiToken> queryOcUserApiTokenByUsername(String username);

    OcUserApiToken queryOcUserApiTokenByTokenAndValid(String token);

    OcUserApiToken queryOcUserApiTokenById(int id);

    void delOcUserApiTokenById(int id);

    OcUserApiToken addOcUserApiToken(OcUserApiToken ocUserApiToken);

    void  updateOcUserApiToken(OcUserApiToken ocUserApiToken);

    int checkUserHasResourceAuthorize(String token, String resourceName);
}
