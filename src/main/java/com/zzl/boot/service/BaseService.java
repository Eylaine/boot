package com.zzl.boot.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.UUID;

/**
 * Description:
 * Date: 2018/11/14
 *
 * @author: Eylaine
 */
public class BaseService {

    /**
     * 获取32位的UUID
     * @return uuid
     */
    public String getUUID() {
        return UUID.randomUUID().toString().trim().replaceAll("-", "");
    }

    protected JSONObject json = new JSONObject();

    protected JSONArray jsonArray = new JSONArray();
}
