package com.baiyi.caesar.decorator.jenkins;

import com.baiyi.caesar.common.util.BeanCopierUtils;
import com.baiyi.caesar.common.util.bae64.FileSizeUtils;
import com.baiyi.caesar.domain.generator.caesar.CsCiJobBuildArtifact;
import com.baiyi.caesar.domain.generator.caesar.CsOssBucket;
import com.baiyi.caesar.domain.vo.build.CiJobBuildVO;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author baiyi
 * @Date 2020/8/10 2:24 下午
 * @Version 1.0
 */
@Component
public class JobBuildArtifactDecorator {

    public List<CiJobBuildVO.BuildArtifact> decorator(List<CsCiJobBuildArtifact> artifacts, CsOssBucket csOssBucket) {
        if (CollectionUtils.isEmpty(artifacts))
            return Lists.newArrayList();

        return artifacts.stream().map(e -> {
            CiJobBuildVO.BuildArtifact buildArtifact = BeanCopierUtils.copyProperties(e, CiJobBuildVO.BuildArtifact.class);
            if (buildArtifact.getArtifactSize() != null && buildArtifact.getArtifactSize() >= 0)
                buildArtifact.setArtifactFileSize(FileSizeUtils.formetFileSize(buildArtifact.getArtifactSize()));
            if (csOssBucket != null) {
                buildArtifact.setOssUrl(Joiner.on("/").join(acqOssBucketUrl(csOssBucket), buildArtifact.getStoragePath()));
            }
            return buildArtifact;
        }).collect(Collectors.toList());
    }

    private String acqOssBucketUrl(CsOssBucket csOssBucket) {
        return "https://" + Joiner.on(".").join(csOssBucket.getName(), csOssBucket.getExtranetEndpoint());

    }


}
