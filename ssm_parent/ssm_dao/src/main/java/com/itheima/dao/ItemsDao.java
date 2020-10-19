package com.itheima.dao;



import com.itheima.pojo.Items;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("itemsDao")
public interface ItemsDao {

    /***
     * 查询所有
     */
    List<Items> findAll();

    /***
     * 保存操作
     *
     */
    int save(Items items);
}


