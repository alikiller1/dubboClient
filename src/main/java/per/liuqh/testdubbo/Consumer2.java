package per.liuqh.testdubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Consumer2 {  
  
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "dubbo-consumer.xml" });  
        context.start();  
        System.out.println("消费都启动了");
        System.in.read();  
    }  
  
}  