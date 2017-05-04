package per.liuqh.testdubbo;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import per.liuqh.serviceapi.service.DemoService;  
  
public class Consumer2 {  
  
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "dubbo-consumer2.xml" });  
        context.start();  
        System.out.println("consume2-消费都启动了");
        try{
      final  DemoService demoService = (DemoService) context.getBean("demoService"); //  
        for(int i=0;i<10;i++){
        	new Thread(){
        		@Override
        		public void run() {
        			String hello = demoService.sayHello("tom"); // ִ  
                    System.out.println(hello); //   
        		}
        	}.start();;
        }
          
        }catch(Exception e){
        	e.printStackTrace();
        }
        System.in.read();  
    }  
  
}  