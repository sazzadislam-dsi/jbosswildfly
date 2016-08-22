package com.lynas;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sazzad on 8/22/16
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/")
    public String home() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.stream().filter(item-> item>2).forEach(System.out::println);
        return list.toString();
    }

}
