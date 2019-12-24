package com.wuwenjie.controller;

import com.wuwenjie.entity.T_room;
import com.wuwenjie.entity.T_roomtype;
import com.wuwenjie.service.T_roomService;
import com.wuwenjie.service.T_roomtypeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("t_room")
public class T_roomController {
    @Resource
    T_roomtypeService t_roomtypeService;
    @Resource
    T_roomService t_roomService;

    @RequestMapping("show")
    public String show(Model model){
        List<Map<String, Object>> all = t_roomService.findAll();
        model.addAttribute("all",all);
        return "show";
    }
    @RequestMapping("addShow")
    public String addShow(Model model){
        List<T_roomtype> query = t_roomtypeService.query();
        model.addAttribute("query",query);
        return "add";
    }
    @RequestMapping("add")
    public String add(T_room t_room){
        t_roomService.add(t_room);
        return "redirect:show";
    }

    @RequestMapping("updateShow")
    public String updateShow(Model model,int roomid){
        T_room t_room = t_roomService.updateShow(roomid);
        model.addAttribute("t_room",t_room);
        List<T_roomtype> query = t_roomtypeService.query();
        model.addAttribute("query",query);
        return "update";
    }
    @RequestMapping("update")
    public String update(T_room t_room){
        t_roomService.update(t_room);
        return "redirect:show";
    }
}
