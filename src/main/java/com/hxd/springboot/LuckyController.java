package com.hxd.springboot;

import com.hxd.Pojo.ConfigBean;
import com.hxd.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class LuckyController {
    @Autowired
    ConfigBean configBean;

    @RequestMapping("/lucky")
    public String config() {
        return configBean.getGreeting() + " >>>>" + configBean.getName() + " >>>>" + configBean.getUuid() + " >>>>" + configBean.getMax();
    }

    @Autowired
    User user;

    @RequestMapping("/user")
    public String user() {
        return user.getName() + user.getAge();
    }
}
