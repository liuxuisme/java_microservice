package com.leyou.money.service.impl;

import com.leyou.common.enums.ExceptionEnum;
import com.leyou.common.exception.LyException;
import com.leyou.common.vo.PageResult;
import com.leyou.money.mapper.MoneyCategoryMapper;
import com.leyou.money.pojo.MoneyCategory;
import com.leyou.money.service.MoneyCategoryService;
import com.leyou.money.vo.MoneyCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoneyCategoryServiceImpl implements MoneyCategoryService {

    @Autowired
    private MoneyCategoryMapper categoryMapper;

    @Override
    public PageResult<MoneyCategory> queryMoneyCategoryByPageAndSort(Integer page, Integer rows, String sortBy, Boolean desc, String key) {
        return null;
    }

    @Override
    public void saveMoneyCategory(MoneyCategory MoneyCategory) {
        int resultCount = categoryMapper.insert(MoneyCategory);
        if (resultCount == 0) {
            throw new LyException(ExceptionEnum.BRAND_CREATE_FAILED);
        }
    }

    @Override
    public List<MoneyCategory> queryCategoryByBid(Long bid) {
        return null;
    }

    @Override
    public void deleteMoneyCategory(Long bid) {

    }

    @Override
    public List<MoneyCategory> queryMoneyCategoryByCid(Long cid) {
        return null;
    }

    @Override
    public MoneyCategory queryMoneyCategoryByBid(Long id) {
        return null;
    }

    @Override
    public List<MoneyCategory> queryMoneyCategoryByIds(List<Long> ids) {
        return null;
    }
}
