package com.baiyi.caesar.service.user;

import com.baiyi.caesar.domain.generator.caesar.OcUserCredential;

import java.util.List;

/**
 * @Author baiyi
 * @Date 2020/2/27 6:41 下午
 * @Version 1.0
 */
public interface OcUserCredentialService {

    OcUserCredential queryOcUserCredentialByUniqueKey(OcUserCredential ocUserCredential);

    void addOcUserCredential(OcUserCredential ocUserCredential);

    void updateOcUserCredential(OcUserCredential ocUserCredential);

    List<OcUserCredential> queryOcUserCredentialByUserId(int userId);

}