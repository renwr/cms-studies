package com.briup.cms.web.controller;

import com.briup.cms.bean.Customer;
import com.briup.cms.service.ICustomerService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@Api(description = "客户相关接口")
public class CustomerController {

    @Autowired
    private ICustomerService iCustomerService;

    @GetMapping("/show")
    @ApiOperation("根据客户id查询")
    @ApiImplicitParam(name = "id",value = "客户id",paramType = "query",dataType = "int",required = true)
    public Customer test(int id) {

        return  iCustomerService.findById(id);
    }

    @PostMapping("/show1")
    @ApiOperation("正在测试两个参数")
    @ApiImplicitParams({@ApiImplicitParam(name = "id" , value = "客户id" , paramType = "query" , dataType = "int" ,required = true),
                        @ApiImplicitParam(name = "name" ,value = "客户名字" ,paramType = "query" , dataType = "string")})
    public String  test2(int id , String name) {

        return "c";
    }

   @GetMapping("/show3")
    @ApiOperation("测试一个对象")
    public Customer test3(Customer customer) {
        return customer;
    }

    @GetMapping("/show4")
    @ApiOperation("测试自定义相应结构")
    public Message<Customer> test4(Customer customer) {

       // return new Message<Customer>(200,"success" , new Customer(), new Date().getTime());
        return MessageUtil.success(customer);
    }

}
