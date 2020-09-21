package com.wanjiayun.service;

import com.wanjiayun.mapper.DepartmentMapper;
import com.wanjiayun.bean.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService{
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> selectAll() {
        return departmentMapper.findAllDepartment();
    }
}
