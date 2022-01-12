package SHAPEE;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

class Shape {

      private double height;

      private double width;

      String colour;

      public void setVales(double height,double width){

         this.height=height;
         this.width=width;
      }

     public double getHeight() {

         return height;
     }
        public double getWidth() {

           return width;
        }

        public String getColour() {

           return colour;
        }



}
class  Rectangle extends Shape{

      public double getArea(){

         return (getHeight() * getWidth()) / 2;
      }

    public String GetShapecolour(){

         return getColour();
    }
}




class  Circle extends Shape{

   public double getArea(){

      return (getHeight() * getWidth() * Math.PI) ;
   }

}


class  cube extends Shape{
   public double getArea(){

      return (getHeight() * getHeight() *getHeight() ) ;
   }

}

class sphere extends Shape{

   public double getArea(){

      return ( 4 * Math.PI *getHeight() * getHeight() ) ;
   }
}


class sqaure extends Shape{


   public double getArea(){

      return (getHeight() * getWidth() ) ;
   }



}


 public class Runner{

     @BeforeMethod
     public void beforeMethod() {
         System.out.println("Starting Test");
     }

     @AfterMethod
     public void afterMethod() {

         System.out.println("Finished Test ");
     }


     @org.testng.annotations.Test
     public void testCalculateAreaRect() {

         Shape s;
         Rectangle rec=new Rectangle();
         s=rec;
         s.setVales(10,20);
         double Area = rec.getArea();
         Assert.assertEquals(Area,100.0);
     }


     @org.testng.annotations.Test
     public void testCalculateAreaCircle() {

         Shape s;
         Circle cir=new Circle();
         s=cir;
         s.setVales(10,20);
         double Area = cir.getArea();
         Assert.assertEquals(Area,628.3185307179587);
     }

    @Test
     public void testCalculateAreaSquare() {

         Shape s;
         sqaure sq=new sqaure();
         s=sq;
         s.setVales(10,20);
         double Area = sq.getArea();
         Assert.assertEquals(Area,200.0);
     }

     @Test
     public void testCalculateAreacube() {

         Shape s;
         cube sq=new cube();
         s=sq;
         s.setVales(10,20);
         double Area = sq.getArea();
         Assert.assertEquals(Area,1000.0);
     }

     @Test
     public void testCalculateAreasphere() {

         Shape s;
         sphere sq=new sphere();
         s=sq;
         s.setVales(10,20);
         double Area = sq.getArea();
         Assert.assertEquals(Area,1256.6370614359173);
     }




 }



















