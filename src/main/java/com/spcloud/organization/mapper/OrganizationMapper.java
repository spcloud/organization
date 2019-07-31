package com.spcloud.organization.mapper;

import com.spcloud.organization.model.Organization;
import org.apache.ibatis.annotations.Param;

public interface OrganizationMapper {
    /**
     * 根据id获取
     *
     * @return
     * @author welkin
     */
    Organization selectById(@Param("id") Integer id);
}
