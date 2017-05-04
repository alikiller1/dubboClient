package per.liuqh.testdubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.liuqh.serviceapi.service.DemoService;  
  
public class Consumer3 {  
  
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "dubbo-consumer3.xml" });  
        context.start();  
        System.out.println("consumer3-消费都启动了");
        try{
        DemoService demoService = (DemoService) context.getBean("demoService"); //  
        String hello = demoService.sayHello("tom"); // ִ  
        System.out.println(hello);
        }catch(Exception e){
        	e.printStackTrace();
        }
        System.in.read();  
    }  
  
}  