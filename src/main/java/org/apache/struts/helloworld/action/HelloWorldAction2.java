package org.apache.struts.helloworld.action;


public class HelloWorldAction2{
   private String name;

   public String execute() throws Exception {
      return "success";
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}