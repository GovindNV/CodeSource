import java.io.*;
public class For1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter values for n and x:");
        double n = Double.parseDouble(br.readLine());
        double x = Double.parseDouble(br.readLine());
        int p = 1;//power
        int den = 4;//denominator
        int diff = 0;//difference
        for(double i = 0;i<=n;p+=diff,den*=2)
        {
            
            System.out.println(Math.pow(x,p)/den+",");
            diff+=2;
            i=Math.pow(x,p)/den;
        }
    }
}