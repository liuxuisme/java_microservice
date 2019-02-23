package com.leyou.money.vo;

import com.leyou.money.pojo.MoneyCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author bystander
 * @date 2018/9/17
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoneyCategoryVo {
    private int id;

    private int type_id;
    private int parent_id;
    private String name;
    private String description;
    private int sort;

    private int is_deleted;
    private int created_at;
    private int created_by;
    private int updated_at;
    private int updated_by;
}
