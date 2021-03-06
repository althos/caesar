package com.baiyi.caesar.service.jenkins;

import com.baiyi.caesar.domain.DataTable;
import com.baiyi.caesar.domain.generator.caesar.CsCiJob;
import com.baiyi.caesar.domain.param.application.CiJobParam;

/**
 * @Author baiyi
 * @Date 2020/7/29 11:40 上午
 * @Version 1.0
 */
public interface CsCiJobService {

    DataTable<CsCiJob> queryCsCiJobByParam(CiJobParam.CiJobPageQuery pageQuery);

    void addCsCiJob(CsCiJob csCiJob);

    void updateCsCiJob(CsCiJob csCiJob);

    void deleteCsCiJobById(int id);

    CsCiJob queryCsCiJobById(int id);
}
