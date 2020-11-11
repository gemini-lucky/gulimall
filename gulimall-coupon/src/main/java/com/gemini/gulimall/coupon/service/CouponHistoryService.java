package com.gemini.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gemini.common.utils.PageUtils;
import com.gemini.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 20:23:08
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

