/**
 * Write a description of class NumberModel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberModel  
{
    private static NumberModel numberModel = null;

    public static NumberModel getInstance()
    {
        if(numberModel == null)
        {
            numberModel = new NumberModel();
        }

        return numberModel;
    }

    private int no = 0;
    private Integer[] numbers = new Integer[12];

    public void setNo(int no)
    {
        this.no = no;
    }

    public int getNo()
    {
        return no;
    }

    public void setNumbers(Integer[] no)
    {
        this.numbers=no;
    }

    public Integer[] getNumber(){
        return numbers;
    }
}
