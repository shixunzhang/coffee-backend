package com.controller;

import com.common.ServerResponse;
import com.entity.CoffeeGoods;
import com.entity.User;
import com.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/api/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @RequestMapping(value = "/list.do",method = RequestMethod.POST)
    public ServerResponse<List<CoffeeGoods>> login(@RequestBody CoffeeGoods coffeeGoods) {
        ServerResponse<List<CoffeeGoods>> result = goodsService.findGoodsList(coffeeGoods.getGoodsCategory());
        if(result != null){
            return result;
        }
        else{
            return ServerResponse.createByErrorMessage("查询商品列表失败");
        }
    }
}