package gitLearning;

public class Calculator 
{ 
    public int addition(int x, int y) 
    { 
       return x + y; 
    } 
    public int subtraction(int x, int y) 
    { 
       return x - y; 
    } 
    public int multiplication(int x, int y) 
    {     
       return x * y; 
    } 
    public int division(int x, int y) 
    { 
       return x / y; 
    }
    
    public int power(int x, int y)
    {
    	int response = 1;
    	for(int i= 1; i<= y ; i++)
    	{
    	response = 	response* response;
    	}
    	return response;
    }
} 