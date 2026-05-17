import tools.*;

class Hello
{

   
    public static void main(String a[]) {
        //  int num1 = 1;
        // int num2 = 2;
        // Calculator cal = new Calculator();

        // int result = cal.add(num1,num2);

        // System.out.println(result);

        // cal.playMusic();

        // String srt = cal.pen(9);
        // System.out.println(srt);

        //Array ---------------------------------------------------------------------------------------

        // int num[] = new int[4];

        // for(int i=0;i<5;i++){
        //     num[i]=i;
        //     System.out.println(num[i]);
        // }
        
        //Two dimentional Array----------------------------------------------------------------------------
 
    //     int num [][] = new int[3][4];

    //     for (int i=0;i<=2;i++)
    //         {
    //         for(int j=0;j<=3;j++){
    //             num[i][j]=(int)(Math.random()*10);
    //             System.out.print(num[i][j] + " ");
    //         }
    //         System.out.println("");
    //     }

    //    // enhanced for loop method-----------------------------------------------------------------------------

    //     for(int n[]: num){
    //         for(int m : n){
    //             System.err.print(m +" ");
    //         }System.out.println();
    //     }

       // Jagged array-----------------------------------------------------------------------------------------
       //what is jagged array?
        //A jagged array is an array of arrays where the inner arrays can have different lengths.

    //    int num [][] = new int[3][];
    //     num [0] = new int[3];
    //     num [1] = new int[4];
    //     num [2] = new int[2];

    //     for(int i=0;i<num.length;i++)
    //         {
    //         for(int j=0;j<num[i].length;j++){
    //             num[i][j]=(int)(Math.random()*10);
    //             System.out.print(num[i][j] + " ");
    //         }
    //         System.out.println("");
    //     }
        
    //     //enhanced (for enchanced loop we dont need to mention the length it will automatically take the length)
    //     for(int n[]:num){
    //         for(int m:n)
    //             {
    //              System.out.print(m+" ");
    //         }System.out.println();
    //     }

    //Arrey of objests form class Student----------------------------------------------------------------------------------------
    //     Student s1 = new Student();
    //     s1.name = "chandu";
    //     s1.rollno = 1;
    //     s1.marks = 100;

    //     Student s2 = new Student();
    //     s2.name = "shiva";
    //     s2.rollno = 2;
    //     s2.marks = 100;

    //     Student s3 = new Student();
    //     s3.name = "Bannu";
    //     s3.rollno = 3;
    //     s3.marks = 100;

    // Student students[] = new Student[3];
    //     students[0] = s1;
    //     students[1] = s2;
    //     students[2] = s3;

    //     //enhanced for loop
    //    for (Student stud : students) {
           
    //      System.out.println(stud.name + ":" + stud.marks);
    //    }

    // //Encapsulation-----------------------------------------------------------------------------------------------
    // Human obj = new Human();
    // Human obj1 = new Human(18,"chiva");


    // System.out.println(obj.getName()  + " : " +  obj.getAge());
    // System.out.println(obj1.getName()  + " : " +  obj1.getAge());
    
    //Static variable ----------------------------------------------------------------------------
    // Mobile obj = new Mobile();
    // Mobile obj1 = new Mobile();

    // obj.company = "Apple";
    // obj.price = 1500;
    // Mobile.name = "latest phone";

    // obj1.company = "Samsang";
    // obj1.price = 1600;
    // Mobile.name = "latest phone";


    // obj.show();
    // obj1.show();

    //Inheritance-- and method overriding---------------------------------------------------------------------------------------------
    AdvCal obj = new AdvCal();
    int r1 = obj.add(5, 5);
    // int r2 = obj.Sub(5, 5);
    // int r3 = obj.mul(5, 5);
    // int r4 = obj.div(5, 5);

    // System.out.println(r1+" "+r2+" " +r3+ " "+ r4);
     System.out.println(r1);

    }
}



