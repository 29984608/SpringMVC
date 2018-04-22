package controller;

import entity.ItemsBean;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Y
 * @date: 2018/4/22
 */

public class ItemsController2 implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

        request.setAttribute("items",list);
        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }
}