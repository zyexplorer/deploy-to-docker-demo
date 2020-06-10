package com.zy.explore.dockerdeploy.controller;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Title: UserController</p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author ZY
 * <p> Just go on !!!</p>
 * @date 2020年05月19日  14:36
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {


    @GetMapping("/list")
    public List<Map<String, Object>> getList() {
        log.info("来请求了");
        List<Map<String, Object>> list = Lists.newArrayList();
        HashMap<String, Object> map1 = Maps.newHashMap();
        map1.put("name", "张三");
        HashMap<String, Object> map2 = Maps.newHashMap();
        map2.put("name", "李四");
        HashMap<String, Object> map3 = Maps.newHashMap();
        map3.put("name", "王五");
        list.add(map1);
        list.add(map2);
        list.add(map3);
        log.info("请求完成了");
        return list;
    }

}
