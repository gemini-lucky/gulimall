package com.gemini.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.*;

/**
 * 品牌
 * 
 * @author gemini
 * @email gemini@gmail.com
 * @date 2020-11-09 20:36:22
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 品牌id
	 */
	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */
	@NotBlank
	private String name;
	/**
	 * 品牌logo地址
	 */
	@NotEmpty
	@URL(message = "LOGO 必须是一个合法的 URL 地址")
	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
	private Integer showStatus;
	/**
	 * 检索首字母
	 */
    @NotEmpty
	@Pattern(regexp = "/^[a-zA-Z]$/", message = "检索首字母只能是 a-z 或 A-Z")
	private String firstLetter;
	/**
	 * 排序
	 */
    @NotNull
	@Min(value = 0, message = "排序只能是大于等于 0 的数字")
	private Integer sort;

}
