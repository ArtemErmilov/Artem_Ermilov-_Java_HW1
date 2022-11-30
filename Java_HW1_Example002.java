package Homework.JAVA_HW1;
import java.io.IOException;//Очистка консоли


/**
 * Вывести все простые числа от 1 до 1000
 */
public class Java_HW1_Example002 {

    public static void main(String[] args)throws IOException, InterruptedException 
    {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Очистка консоли
        
        int [] array =  new int[999];
                
        for (int i = 0; i < array.length; i++)// Заполнение массива цифрами от 2 до 1000
         {
            array[i]=i+2;
        }

        for (int i = 0; i < array.length; i++) //Нахождение простых чисел решетом Эратосфена
        {
            if (array[i] != 0)
            {
                for (int index = i+1; index < array.length; index++) 
                {
                    if (array[index] !=0 && (array[index] % array[i] == 0)) array[index] = 0;
                }
            }
        }

        System.out.print("\n\n");
        int iter = 0;
        for (int i = 0; i < array.length; i++) // Вывод данных в консоль
        {   if (array[i]!=0)
            {
                System.out.print(array[i]+", ");
                iter++;
                if (iter==12)
                {
                    System.out.print("\n");
                    iter=0;
                }
            }
            
        }
        System.out.print("\n\n");

        
    }
}