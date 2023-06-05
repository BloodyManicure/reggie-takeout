package com.blackhorse.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blackhorse.reggie.entity.Employee;
import com.blackhorse.reggie.mapper.EmployeeMapper;
import com.blackhorse.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
