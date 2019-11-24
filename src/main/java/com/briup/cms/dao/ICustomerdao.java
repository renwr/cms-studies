package com.briup.cms.dao;

import com.briup.cms.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

//Customer 是对于哪个类   Integet是主键的数据类型
public interface ICustomerdao extends JpaRepository<Customer , Integer> {

    Customer findById(int id);
}
