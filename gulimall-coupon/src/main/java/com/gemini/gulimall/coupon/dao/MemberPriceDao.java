package com.gemini.gulimall.coupon.dao;

import com.gemini.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 20:23:08
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
