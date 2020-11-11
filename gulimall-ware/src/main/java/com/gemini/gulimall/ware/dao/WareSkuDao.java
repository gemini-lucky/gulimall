package com.gemini.gulimall.ware.dao;

import com.gemini.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 21:11:58
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
