package com.test.www;

public class Text {
	public static void main(String[] args) {
        Tickets tickets = new Tickets();    
        new Thread(tickets).start();  
        new Thread(tickets).start();  
        new Thread(tickets).start();  

}
}
class Tickets extends Thread{
   private int num=10;
   @Override
   public void run() {
      while(num>0){
          sale();
      }

   }
       synchronized void sale() {  
           if(num > 0){    
               System.out.println(Thread.currentThread().getName() + "����һ��Ʊ����ʣ��"+ (--num) + "��Ʊ��");  
               try{    
                   Thread.sleep(100);    
               }catch(InterruptedException e){    
                   e.printStackTrace();    
               }    
           }    
       }    

	
}