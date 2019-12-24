package com.wuwenjie.service;

import com.wuwenjie.dao.T_roomDAO;
import com.wuwenjie.entity.T_room;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class T_roomService {
    @Resource
    T_roomDAO t_roomDAO;
    public int add(T_room t_room){
        return t_roomDAO.insert(t_room);
    }

    public T_room updateShow(int roomid){
        return t_roomDAO.selectByPrimaryKey(roomid);
    }

    public int update(T_room t_room){
        return t_roomDAO.updateByPrimaryKey(t_room);
    }
    public List<Map<String,Object>> findAll(){
        return t_roomDAO.findAll();
    }
}
