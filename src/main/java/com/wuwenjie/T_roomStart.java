package com.wuwenjie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 启动项必须在所有类的最外层
// 将当前类作为Springboot的应用程序
@SpringBootApplication
public class T_roomStart {
    public static void main(String[] args){
        // 运行spring应用程序
        SpringApplication.run(T_roomStart.class);
    }
}
