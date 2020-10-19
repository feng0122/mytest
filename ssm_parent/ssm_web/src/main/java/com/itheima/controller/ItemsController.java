package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemsController {
    @Autowired
   private ItemsService itemsService;
    @RequestMapping("/findAll")
    public String findAll01(Model model){
            List<Items> all = itemsService.findAll();
            model.addAttribute("all",all);
            return "success";


    }
}
