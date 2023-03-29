import java.io.*;
import java.util.*;

public class Kata{
    static int find(int[] integers){
        Stack<Integer> evens = new Stack<Integer>();
        Stack<Integer> odds = new Stack<Integer>();
        for (var i = 0; i < integers.length; i++)
        {
            if ((integers[i] % 2) == 0)
            {
                evens.push(integers[i]);
            }
            else
            {
                odds.push(integers[i]);
            }
        }
        var elen = evens.size();
        var olen = odds.size();

        if (elen > olen)
        {
            return odds.get(0);
        }
        else
        {
            return evens.get(0);
        }
    }}