package com.demo.service.impl;

import com.demo.common.model.MainStation;
import com.demo.service.MainStationService;
import com.jfinal.plugin.activerecord.Db;

import java.util.List;

public class MainStationServiceImpl implements MainStationService {

    MainStation mainStation = new MainStation().dao();
    @Override
    public List<Object> getMainStationList() {
        List<Object> query = Db.query("select * from MainStation");
        return query;

    }
}
