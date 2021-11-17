package com.example.designparttensingleton;

import com.example.designparttensingleton.factoryPattern.Computer;
import com.example.designparttensingleton.factoryPattern.ComputerFactory;
import com.example.designparttensingleton.singletonPattern.EagerInitializedSingleton;
import com.example.designparttensingleton.singletonPattern.LazyInitializedSingleton;
import com.example.designparttensingleton.singletonPattern.StaticBlockSingleton;
import com.example.designparttensingleton.singletonPattern.ThreadSafeSingleton;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignParttenSingletonApplication {

    public static void main(String[] args) {

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                LazyInitializedSingleton singleton1= LazyInitializedSingleton.getInstance();
//                System.out.println(singleton1.hashCode());
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                EagerInitializedSingleton singleton2= EagerInitializedSingleton.getInstance().getInstance();
//                System.out.println(singleton2.hashCode());
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                StaticBlockSingleton singleton3= StaticBlockSingleton.getInstance();
//                System.out.println(singleton3.hashCode());
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                ThreadSafeSingleton singleton4= ThreadSafeSingleton.getInstanceUsingDoubleLocking();
//                System.out.println(singleton4.hashCode());
//            }
//        }).start();
//        SpringApplication.run(DesignParttenSingletonApplication.class, args);
    }

}
