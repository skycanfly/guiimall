package com.daxian.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.daxian.common.utils.PageUtils;
import com.daxian.ware.entity.WmsWareSkuEntity;

import java.util.Map;

/**
 * εεεΊε­
 *
 * @author xianer
 * @email xianer@gmail.com
 * @date 2022-06-11 23:08:30
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

