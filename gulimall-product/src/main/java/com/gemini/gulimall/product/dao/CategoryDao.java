package com.gemini.gulimall.product.dao;

import com.gemini.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 20:36:22
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
