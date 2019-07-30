package com.spcloud.organization.controller;

import com.spcloud.organization.model.OrganizationVO;
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

    /**
     * 根据id获取组织
     *
     * @param id
     * @return
     * @author welkin
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrganizationVO get(@PathVariable(value = "id") String id) {
        OrganizationVO organizationVO = new OrganizationVO();
        organizationVO.setId(id);
        organizationVO.setName("你好," + id);
        return organizationVO;
    }

}
