
package Lab07;

public class Test {

    public static void main(String[] args) {
        Date d1=new Date(1,2,2020);
        Date d2=new Date(1,2,2020);
        Date d3=new Date(1,2,2020);
        Date d4=new Date(1,2,2020);
        Date d5=new Date(1,2,2020);
        Date d6=new Date(1,2,2020);
        Date d7=new Date(1,2,2020);
        Date d8=new Date(1,2,2020);
        Date d9=new Date(1,2,2020);
        Date d10=new Date(1,2,2020);
        
        UnderGraduate[] u=new UnderGraduate[5];
        u[0]=new UnderGraduate(68.5,"js01","john smith",d1,30);
        u[1]=new UnderGraduate(70,"js02","john smith",d2,25);
        u[2]=new UnderGraduate(39,"js03","john smith",d3,30);
        u[3]=new UnderGraduate(42.8,"js04","john smith",d4,50);
        u[4]=new UnderGraduate(79,"js05","john smith",d5,70);
        
        PostGraduate[] p=new PostGraduate[10];
        p[0]=new PostGraduate(3.89,"js06","john smith",d6,160);
        p[1]=new PostGraduate(3.1,"js07","john smith",d7,130);
        p[2]=new PostGraduate(2.1,"js08","john smith",d8,90);
        p[3]=new PostGraduate(1.9,"js09","john smith",d9,130);
        p[4]=new PostGraduate(2.01,"js10","john smith",d10,110);
        
        for(UnderGraduate x: u)//enhanced for loop , first you will have to specify the datatype and the give
            //any name ,then put colon(:) and the write the name of array
        {
            System.out.println(x);
            System.out.println("after bonus marks, your total merit becomes: "+(x.calculateMerit()+10));
        }
        
    }
    
}
