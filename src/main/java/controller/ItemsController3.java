package controller;

import entity.ItemsBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Y
 * @date: 2018/4/22
 */
@Controller
public class ItemsController3  {
    /**
     * 功能描述: 商品列表查询
     *
     * @param:
     * @return: ModelAndView
     * @throws: Exception
     */
    @RequestMapping("/queryItems")
    public ModelAndView queryItems() throws Exception{
        List<ItemsBean> list = new ArrayList<ItemsBean>();

        ItemsBean items1 = new ItemsBean();
        items1.setName("小米MIX2S");
        items1.setPrice(3888);
        items1.setDetail("便宜不贵，实惠");

        ItemsBean items2 = new ItemsBean();
        items2.setName("iphone X");
        items2.setPrice(8888);
        items2.setDetail("穷人用苹果");

        ItemsBean items3 = new ItemsBean();
        items3.setName("华为P20");
        items3.setPrice(9999);
        items3.setDetail("低调奢华");

        list.add(items1);
        list.add(items2);
        list.add(items3);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("items",list);
        modelAndView.setViewName("/index.jsp");
        return modelAndView;
    }
}