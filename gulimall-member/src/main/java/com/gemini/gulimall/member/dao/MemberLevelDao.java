package com.gemini.gulimall.member.dao;

import com.gemini.gulimall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 20:55:15
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
