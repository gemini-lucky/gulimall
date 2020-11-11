package com.gemini.gulimall.coupon.dao;

import com.gemini.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 20:23:08
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
