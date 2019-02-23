package com.leyou.money.web;

import com.leyou.common.vo.PageResult;
import com.leyou.money.pojo.MoneyCategory;
import com.leyou.money.service.MoneyCategoryService;
import com.leyou.money.vo.MoneyCategoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author bystander
 * @date 2018/9/15
 */
@RestController
@RequestMapping("money/category")
public class CategoryController {


    @Autowired
    private MoneyCategoryService categoryService;


    /**
     * 分页查询品牌信息
     *
     * @param page
     * @param rows
     * @param sortBy
     * @param desc
     * @param key
     * @return
     */
    @RequestMapping("page")
    public ResponseEntity<PageResult<MoneyCategory>> queryMoneyCategoryByPage(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "5") Integer rows,
            @RequestParam(value = "sortBy", required = false) String sortBy,
            @RequestParam(value = "desc", defaultValue = "false") Boolean desc,
            @RequestParam(value = "key", required = false) String key
    ) {
        return ResponseEntity.ok(categoryService.queryMoneyCategoryByPageAndSort(page, rows, sortBy, desc, key));

    }


    /**
     * 新增分类
     *
     * @param MoneyCategory
     * @return
     */
    @PostMapping
    public ResponseEntity<Void> addMoneyCategory(MoneyCategory MoneyCategory) {
        categoryService.saveMoneyCategory(MoneyCategory);
        return new ResponseEntity(HttpStatus.CREATED);
    }


    /**
     * 更新品牌
     *
     * @param MoneyCategoryVo
     * @return
     */
//    @PutMapping
//    public ResponseEntity<Void> updateMoneyCategory(MoneyCategoryVo MoneyCategoryVo) {
//        categoryService.updateMoneyCategory(MoneyCategoryVo);
//        return ResponseEntity.ok().build();
//    }

    /**
     * 删除品牌
     *
     * @param bid
     * @return
     */
    @DeleteMapping("bid/{bid}")
    public ResponseEntity<Void> deleteMoneyCategory(@PathVariable("bid") Long bid) {
        categoryService.deleteMoneyCategory(bid);
        return ResponseEntity.ok().build();
    }

    /**
     * 根据分类ID查询品牌
     *
     * @param cid
     * @return
     */
    @GetMapping("cid/{cid}")
    public ResponseEntity<List<MoneyCategory>> queryMoneyCategoryByCid(@PathVariable("cid") Long cid) {
        return ResponseEntity.ok(categoryService.queryMoneyCategoryByCid(cid));
    }

    /**
     * 根据商品品牌ID查询品牌
     *
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public ResponseEntity<MoneyCategory> queryById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(categoryService.queryMoneyCategoryByBid(id));
    }

    /**
     * 根据ids查询品牌
     * @param ids
     * @return
     */
    @GetMapping("list")
    public ResponseEntity<List<MoneyCategory>> queryMoneyCategorysByIds(@RequestParam("ids") List<Long> ids) {
        return ResponseEntity.ok(categoryService.queryMoneyCategoryByIds(ids));
    }




}
