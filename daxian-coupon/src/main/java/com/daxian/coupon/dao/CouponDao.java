package com.daxian.coupon.dao;

import com.daxian.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 21:15:49
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
