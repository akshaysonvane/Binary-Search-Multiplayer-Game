/**
 * Write a description of class NumberModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberModel  
{
    private int no=0;
    private int[] numbers= new int[12];
    /*
    public int getX()
    {
    return x;
    }

    public void setX(int x)
    {
    this.x = x;
    }

    public int getY()
    {
    return y;
    }

    public void setY(int y)
    {
    this.y = y;
    }
     */
    

    public void set_Numbers(int[] no)
    {
      
        this.numbers=no;
       /* for(int i=0; i<numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }*/
    }
    
    public int[] get_Number(){
        return numbers;
    }
}
