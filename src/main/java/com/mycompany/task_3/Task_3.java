package com.mycompany.task_3;

public class Task_3 {

    public static void main(String[] args) {
        //TASK 3
        int x = 3, y=8;
        int cem=0;
        
        for(int i=x;i<=y;i++){
            if(i%2==0){
                cem+=i;
            }
        }
       
        System.out.println("Ikiye bolunenlerin cemi : " + cem);

    }
}
