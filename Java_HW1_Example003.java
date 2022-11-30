package Homework.JAVA_HW1;
import java.io.IOException;//Очистка консоли
import java.lang.ref.Cleaner;
import java.util.Scanner;

/**
 * Реализовать простой калькулятор 
 * Математические операции: сумма (+), разность(-), произведение(*), деление(/) , 
 * возведение в степень(^), нахождение корня (sqrt)
 */
public class Java_HW1_Example003 {

    static int inInt(String text, String textError) // Ввод числа в формате Int
    {   System.out.print(text);
        while (true) 
        {   
            try 
            {
            
            Scanner scanner = new Scanner(System.in, "cp866");
            int data = scanner.nextInt();
            scanner.close();
            return data;
            
            } 
            catch (Exception e) 
            {
            System.out.print(textError);
            continue;
            }        
            
        }
    }

    static int inIntMinMax(int min, int max, String text, String textError) // Ввод числа в формате Int в диапазоне от min до max
    {   System.out.print(text);
        while (true) 
        {   
            try 
            {
            
            Scanner scanner = new Scanner(System.in, "cp866");
            int data = scanner.nextInt();
            
            if (data < min || data > max)
            {
                System.out.print(textError);
                continue;
               
            }
            //scanner.close();
            return data;
            
            } 
            catch (Exception e) 
            {
            System.out.print(textError);
            continue;
            } 
                   
        }
            
        
    }

    static Double inDouble(String text,String textError) // Ввод числа в формате Double
    {   System.out.print(text);
        while (true)
        {
        try {         
                 
                Scanner scanner = new Scanner(System.in, "cp866");
                Double data = scanner.nextDouble();
                //scanner.close();
                return data;
            
            }
            catch (Exception e) 
            {
                System.out.print(textError);
                continue;  
            }
        }
          
    }
    

    public static void main(String[] args) throws IOException, InterruptedException
    { new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); // Очистка консоли
        
        String text1 = "Выберите, какие математические операции будем выполнять:";
        String text2 = "\n1 - сумма (+)\n2 - разность(-)\n3 - произведение(*)\n4 - деление(/)\n5 - возведение в степень(^)\n6 - нахождение корня (sqrt)";
        System.out.println(text1+text2);

        String text3 = "Введите число от 1 до 6, для выбора математического действия: ";
        String textError3 = "Число введено не верно, введите его заново от 1 до 6: ";
        int mathData = inIntMinMax(1, 6, text3, textError3);

        String text4 = "Введите первое число: ";
        String textError4 = "Число введено не правильно, введите его заново: ";
        Double number_a = inDouble(text4, textError4);
        
        String text5 ="";
        switch (mathData)
        {
            case 1:
            case 2:
            case 3:
            case 4:
                    text5= "Введите второе число:";
                    break;
            case 5:
                    text5 = "Введите степень числа: ";
                    break;   
                    
        }
        Double number_b = 0.0;
        if (mathData!=6){
        String textError5 = "Число введено не правильно, введите его заново: ";
        number_b = inDouble(text5, textError5);
        }

        Double result = 0D;
        
        switch (mathData)
        {
            case 1: result= number_a + number_b;
                    break;
            case 2: result= number_a - number_b;
                    break;
            case 3: result= number_a * number_b;
                    break;
            case 4: result= number_a / number_b;
                    break;
            case 5: result= Math.pow(number_a, number_b);
                    break;
            case 6: result= Math.sqrt(number_a);
                    break;
        }
        System.out.println("Ответ "+result);
        
        
    }
}