package com.wuwenjie.dao;

import com.wuwenjie.entity.T_room;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface T_roomDAO extends tk.mybatis.mapper.common.Mapper<T_room> {
    @Select("select * from t_roomtype t join" +
            " t_room r on  t.typeid =r.roomid")
    List<Map<String,Object>>findAll();
}
