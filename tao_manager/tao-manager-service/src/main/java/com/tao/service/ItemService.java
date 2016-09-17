package com.tao.service;

import com.tao.pojo.TbItem;

import java.util.List;

/**
 * Created by txf on 2016-09-17.
 */
public interface ItemService {
    TbItem getItemById(long itemId);

    List<TbItem> getItemList();
}
