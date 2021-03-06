package com.baiyi.caesar.domain.vo.application;

import com.baiyi.caesar.domain.vo.jenkins.JenkinsInstanceVO;
import com.baiyi.caesar.domain.vo.tag.TagVO;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @Author baiyi
 * @Date 2020/7/21 3:02 下午
 * @Version 1.0
 */
public class ApplicationVO {

    @Data
    @NoArgsConstructor
    @ApiModel
    public static class Application {

        private List<TagVO.Tag> tags;
        private List<ScmMember> scmMembers;
        private Integer id;
        private String name;
        private String applicationKey;
        private Integer kubernetesApplicationId;
        private Integer engineType;
        private Date createTime;
        private Date updateTime;
        private String comment;
    }

    @Data
    @NoArgsConstructor
    @ApiModel
    public static class ScmMember {

        private List<TagVO.Tag> tags;

        private Integer id;
        private Integer applicationId;
        private String scmType;
        private Integer scmId;
        private String scmSshUrl;
        private Date createTime;
        private Date updateTime;
        private String comment;
    }

    @Data
    @NoArgsConstructor
    @ApiModel
    public static class Engine {

        private JenkinsInstanceVO.Instance instance;

        private Integer id;
        private Integer applicationId;
        private Integer jenkinsInstanceId;
        private Date createTime;
        private Date updateTime;
        private String comment;
    }


}
