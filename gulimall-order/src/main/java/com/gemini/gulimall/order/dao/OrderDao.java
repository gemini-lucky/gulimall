package com.gemini.gulimall.order.dao;

import com.gemini.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 21:05:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
