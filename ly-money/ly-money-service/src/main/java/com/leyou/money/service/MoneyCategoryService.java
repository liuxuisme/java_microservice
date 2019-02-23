package com.leyou.money.service;

import com.leyou.common.vo.PageResult;
import com.leyou.money.pojo.MoneyCategory;
import com.leyou.money.vo.MoneyCategoryVo;

import java.util.List;

/**
 * @author bystander
 * @date 2018/9/15
 */
public interface MoneyCategoryService {

    PageResult<MoneyCategory> queryMoneyCategoryByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key);

    void saveMoneyCategory(MoneyCategory MoneyCategory);

    List<MoneyCategory> queryCategoryByBid(Long bid);

//    void updateMoneyCategory(MoneyCategoryVo MoneyCategoryVo);

    void deleteMoneyCategory(Long bid);

    List<MoneyCategory> queryMoneyCategoryByCid(Long cid);

    MoneyCategory queryMoneyCategoryByBid(Long id);

    List<MoneyCategory> queryMoneyCategoryByIds(List<Long> ids);

}
