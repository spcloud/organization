package com.spcloud.organization.controller;

import com.spcloud.organization.bean.OrganizationVO;
import com.spcloud.organization.mapper.OrganizationMapper;
import com.spcloud.organization.model.Organization;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 组织服务
 * @author: chenyk25600
 * @create: 2019-07-29 15:25
 **/
@RestController
@RequestMapping(value = "organization")
public class OrganizationController {

    @Autowired
    private OrganizationMapper organizationMapper;

    /**
     * 根据id获取组织
     *
     * @param id
     * @return
     * @author welkin
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrganizationVO get(@PathVariable(value = "id") Integer id) {
        Organization organization = organizationMapper.selectById(id);
        OrganizationVO organizationVO = new OrganizationVO();
        BeanUtils.copyProperties(organization, organizationVO);
        return organizationVO;
    }

}
