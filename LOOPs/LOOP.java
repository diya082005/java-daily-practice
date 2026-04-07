public class LOOP {
    public static void main(String args[]){
        //int counter=0;
        /*  While loop
        while(counter<10){
            System.out.println("Hello world");
            counter++;
        }
        System.out.println("Done");
        */

       /* for loop
       for(int i=1;i<=5;i++){
        System.out.print("Hello world" + " ");
       }
        */

       /*do while loop
       int counter = 1;
       do{
        System.out.println("hello");
        counter++;
       }while(counter<=10);
       */

       /*Break statement
       for(int i=1;i<=5;i++){
        if (i==3){
            break;
        }
        System.out.println(i);
       }
       System.out.println("I am out of the loop");
       */
      //Continue Statement
      for(int i=1;i<=5;i++){
        if (i==3){
            continue;
        }
        System.out.println(i);
      }
      System.out.println();
    }
}