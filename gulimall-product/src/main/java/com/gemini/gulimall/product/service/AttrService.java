package com.gemini.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gemini.common.utils.PageUtils;
import com.gemini.gulimall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 20:36:22
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

