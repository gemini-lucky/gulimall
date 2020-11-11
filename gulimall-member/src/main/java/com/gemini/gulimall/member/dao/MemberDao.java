package com.gemini.gulimall.member.dao;

import com.gemini.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 20:55:15
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
