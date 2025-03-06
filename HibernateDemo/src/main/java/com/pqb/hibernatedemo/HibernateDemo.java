/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pqb.hibernatedemo;

import com.pqb.repository.impl.ProductRepositoryImpl;
import com.pqb.pojo.Category;
import com.pqb.repository.impl.CategoryRepositoryImpl;
import com.pqb.repository.impl.StatsRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateDemo {

    public static void main(String[] args) {
//        CategoryRepositoryImpl s = new CategoryRepositoryImpl();
//        s.getCates().forEach(c -> System.out.println(c.getName()));
//        
        
//        Map<String, String> params = new HashMap<>();
//        params.put("kw", "iPhone");
//        params.put("page", "2");
//        ProductRepositoryImpl p2 = new ProductRepositoryImpl();
//        p2.getProducts(params).forEach(p -> System.out.printf("%d - %s - %.1f\n", p.getId(), p.getName(), p.getPrice()));

        StatsRepositoryImpl s = new StatsRepositoryImpl();
        s.statsReveneByProduct().forEach(q -> System.out.printf("%d - %s - %d\n", q[0], q[1], q[2]));
    }
}
