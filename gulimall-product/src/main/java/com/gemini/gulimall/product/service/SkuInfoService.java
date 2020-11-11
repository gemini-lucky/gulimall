package com.gemini.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gemini.common.utils.PageUtils;
import com.gemini.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 20:36:22
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

