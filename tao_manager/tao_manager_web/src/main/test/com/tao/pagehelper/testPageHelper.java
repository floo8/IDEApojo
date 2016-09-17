package com.tao.pagehelper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tao.mapper.TbItemMapper;
import com.tao.pojo.TbItem;
import com.tao.pojo.TbItemExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;
import java.util.List;

/**
 * Created by txf on 2016-09-17.
 */
public class testPageHelper {

    @Test
    public  void  testPageHelper() throws Exception{
        ApplicationContext appletContext=new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
        TbItemMapper itemMapper=appletContext.getBean(TbItemMapper.class);
        PageHelper.startPage(1,30);
        TbItemExample tbItemExample=new TbItemExample();
        List<TbItem> list=itemMapper.selectByExample(tbItemExample);
        PageInfo<TbItem> pageInfo=new PageInfo<TbItem>(list);
        long total=pageInfo.getTotal();
        System.out.println("total"+total);
        int pages=pageInfo.getPages();
        System.out.println("pages"+pages);
        int pageSize=pageInfo.getPageSize();
        System.out.println("pageSize"+pageSize);
    }
}
