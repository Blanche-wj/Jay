package com.wuwenjie.service;

import com.wuwenjie.dao.T_roomtypeDAO;
import com.wuwenjie.entity.T_roomtype;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class T_roomtypeService {
    @Resource
    T_roomtypeDAO t_roomtypeDAO;
    public List<T_roomtype> query(){
        return t_roomtypeDAO.selectAll();
    }
}
