package com.baiyi.caesar.facade;

import com.baiyi.caesar.domain.BusinessWrapper;
import com.baiyi.caesar.domain.DataTable;
import com.baiyi.caesar.domain.param.kubernetes.KubernetesApplicationInstanceParam;
import com.baiyi.caesar.domain.param.kubernetes.KubernetesApplicationParam;
import com.baiyi.caesar.domain.vo.kubernetes.KubernetesApplicationVO;

import java.util.List;

/**
 * @Author baiyi
 * @Date 2020/7/1 6:11 下午
 * @Version 1.0
 */
public interface KubernetesApplicationFacade {


    DataTable<KubernetesApplicationVO.Application> queryMyKubernetesApplicationPage(KubernetesApplicationParam.PageQuery pageQuery);

    DataTable<KubernetesApplicationVO.Application> queryKubernetesApplicationPage(KubernetesApplicationParam.PageQuery pageQuery);

    BusinessWrapper<Boolean> addKubernetesApplication(KubernetesApplicationVO.Application application);

    BusinessWrapper<Boolean> addKubernetesApplicationInstance(KubernetesApplicationVO.Instance instance);

    BusinessWrapper<Boolean> createKubernetesDeployment(KubernetesApplicationInstanceParam.CreateByTemplate createDeployment);

    BusinessWrapper<Boolean> deleteKubernetesDeploymentById(int id);

    BusinessWrapper<Boolean> createKubernetesService(KubernetesApplicationInstanceParam.CreateByTemplate createService);

    BusinessWrapper<Boolean> deleteKubernetesServiceById(int id);

    BusinessWrapper<Boolean> updateKubernetesApplication(KubernetesApplicationVO.Application application);

    BusinessWrapper<Boolean> updateKubernetesApplicationInstance(KubernetesApplicationVO.Instance instance);

    BusinessWrapper<Boolean> deleteKubernetesApplicationInstanceById(int id);

    BusinessWrapper<Boolean> deleteKubernetesApplicationById(int id);

    DataTable<KubernetesApplicationVO.Instance> queryKubernetesApplicationInstancePage(KubernetesApplicationInstanceParam.PageQuery pageQuery);

    BusinessWrapper<KubernetesApplicationVO.Instance> queryKubernetesApplicationInstanceById(int id);

    List<String> queryKubernetesApplicationInstanceLabel(int envType);
}
