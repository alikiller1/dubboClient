package per.liuqh.testdubbo;

import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class Consumer {  
  
    public static void main(String[] args) throws Exception {  
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(  
                new String[] { "dubbo-consumer.xml" });  
        context.start();  
        System.out.println("consume-消费都启动了");
        try{
       final  DemoService demoService = (DemoService) context.getBean("demoService"); //  
        for(int i=0;i<10;i++){
        	new Thread(){
        		@Override
        		public void run() {
        			String hello = demoService.sayHello("tom"); // ִ  
                    System.out.println("consume--"+new Date()+"--"+hello); //   
        		}
        	}.start();;
        }
        
  
          
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