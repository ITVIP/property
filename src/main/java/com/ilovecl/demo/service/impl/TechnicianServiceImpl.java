package com.ilovecl.demo.service.impl;

import com.ilovecl.demo.dao.TechnicianDao;
import com.ilovecl.demo.entity.Technician;
import com.ilovecl.demo.service.TechnicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:fly
 * @Description:维修人员Service层的实现
 * @Date:16:59 2018/9/14
 */
@Service("technicianService")
public class TechnicianServiceImpl implements TechnicianService {

    @Autowired
    private TechnicianDao technicianDao;

    /**
     * 根据报修单获取维修人员
     *
     * @param technicianId
     * @return
     */
    @Override
    public Technician getById(int technicianId) {
        return technicianDao.queryById(technicianId);
    }

    /**
     * 获取所有维修人员
     *
     * @return
     */
    @Override
    public List<Technician> getAllTechnician() {
        return technicianDao.queryAll();
    }

    /**
     * 增加一个维修人员
     *
     * @param name 姓名
     * @return
     */
    @Override
    public boolean addTechnician(String name) {
        technicianDao.addTechnician(name);

        return true;
    }

    /**
     * 删除一个维修人员
     *
     * @param id 维修人员的编号ID
     * @return
     */
    @Override
    public boolean deleteTechnician(int id) {
        technicianDao.delete(id);

        return true;
    }

    /**
     * 修改维修人员信息
     *
     * @param id      维修人员编号ID
     * @param newName 姓名
     * @return
     */
    @Override
    public boolean updateTechnician(int id, String newName) {
        technicianDao.update(id, newName);
        return true;
    }
}
