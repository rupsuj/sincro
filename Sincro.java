package javapro;

import java.io.*;
public class Sincro
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;
        int dis=0,dis1=0,dis2=0,dis3=0,dis4=0,dis5=0;
        System.out.print("Enter the Customer Type :");
        String Customer_type = in.readLine();
        System.out.print("Enter Purchase Amount :");
        int n= Integer.parseInt(in.readLine());
        switch(Customer_type)
        {

          case "Regular" :
               if(n>=0 && n<=5000)
                dis=0;
               if(n>5000 && n<=10000)
            	dis = 0;
                dis2 = (n-5000)*10/100;
                if(n>10000)
                  {
                	dis = 0;
                    dis2 = (1000-5000)*10/100;
                    dis3 = (n-10000)*20/100;
                   }

               break;
          case "Premium" :

               if(n>=0 && n<=4000)
                dis= (n-0)*10/100;
                if(n>4000 && n<=8000)
                {
                dis = (4000-0)*10/100;
                dis2 = (n-4000)*15/100;
                }
                if(n>8000 && n<=12000)
                {
                dis = 4000*10/100;
                dis2 = (8000-4000)*15/100;
                dis3= (n-8000)*20/100;
                }
                if(n>12000)
                {
                dis = (4000-0)*10/100;
                dis2 = (8000-4000)*15/100;
                dis3 = (12000-8000)*20/100;
                dis4 = (n-12000)*30/100;
                }

                


                break;
          default :
              System.out.println("!!!!!!!!!!!!! Invalid Customer Type  !!!!!!!!!!!!!");
             flag=true;
        }

        dis5 = dis1+dis2+dis3+dis4+dis;
       if (flag == false)
        System.out.println("Bill Amount = "+(n-dis5));
     }
}