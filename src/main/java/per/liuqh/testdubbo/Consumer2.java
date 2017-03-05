package per.liuqh.testdubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Consumer2 {  
  
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "dubbo-consumer.xml" });  
        context.start();  
        System.out.println("consumer2-消费都启动了");
        try{
        DemoService demoService = (DemoService) context.getBean("demoService"); //  
        String hello = demoService.sayHello("tom"); // ִ  
        System.out.println("consumer2-"+hello); //   
  
          
       /* List<User> list = demoService.getUsers();  
        if (list != null && list.size() > 0) {  
            for (int i = 0; i < list.size(); i++) {  
                System.out.println(list.get(i));  
            }  
        }  */
        }catch(Exception e){
        	e.printStackTrace();
        }
        System.in.read();  
    }  
  
}  