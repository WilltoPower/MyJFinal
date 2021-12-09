package com.demo.controller;

import com.demo.service.MainStationService;

import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.render.Render;

@Path("/mainstation")
public class MainStationController extends Controller {
    @Inject
    MainStationService mainStationService;

    //测试页
    public void test1(){

        renderText("===主站测试页===");
    }
    //获取主站所有信息
    public void getMainStationList(){

        renderJson(mainStationService.getMainStationList());
    }
}
