package com.gemini.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gemini.common.utils.PageUtils;
import com.gemini.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 20:36:22
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

