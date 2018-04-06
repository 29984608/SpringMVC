package controller;

import entity.ItemsBean;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Y
 * @date: 2018/4/6
 */

public class ItemsController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest Request, HttpServletResponse Response) throws Exception {
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

