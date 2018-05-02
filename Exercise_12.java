package Chapter_11_a_12;

import java.util.HashSet;
import java.util.LinkedList;

public class Exercise_12
{
    public static void main(String[] args)
    {
        LinkedList<String> s = new LinkedList<>();

        s.add("Hej");
        s.add("Farvel");
        s.add("Goddag");
        s.add("Hej");
        s.add("Farvel");
        s.add("Hej");
        s.add("Goddag");
        System.out.println(contains3(s));


    }
    public static boolean contains3 (LinkedList<String> list)
    {
        HashSet<String> aux =  new HashSet<>(list);

        for (String str1 : aux )
        {
            int count = 0;
            for (String str2 : list)
            {
                if (str1.equals(str2))
                {
                    count++;
                    if (count == 3)
                    {
                        return true;
                    }
                }
            }

        }
        return false;
    }
}
