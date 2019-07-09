package org.study.llf.sofa;

import com.alipay.sofa.ark.support.startup.SofaArkBootstrap;
import org.study.llf.sofa.service.Haha;
import org.study.llf.sofa.service.Hehe;

/**
 * Description 类描述
 *
 * @author luolifeng
 * @version 1.0.0
 * Date 2019-07-08
 * Time 16:41
 */
public class App {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread.getName(1)================================================"+Thread.currentThread().getName());
        System.out.println("Thread.currentThread(1)================================================"+Thread.currentThread().getClass().getClassLoader());
//        SofaArkBootstrap.launch(args);
        System.out.println("Thread.currentThread(2)================================================"+Thread.currentThread().getClass().getClassLoader());
        new Haha().test();
        new Hehe().test();
        System.out.println("================================================"+App.class.getClassLoader());
    }
}
