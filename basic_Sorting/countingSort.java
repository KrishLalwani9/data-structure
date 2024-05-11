import java.util.*;
class countingSort
{
public static void countingSortAlgo(int array[])
{
int largest=Integer.MIN_VALUE;
for(int i=0;i<array.length;i++)
{
largest=Math.max(largest , array[i]);
}
//count numbers and store at index of number
int count[]=new int[largest+1];
for(int i=0;i<array.length;i++)
{
count[array[i]]++;
}
//sort by printing indexes of count array
int j=0;
for(int i=0;i<count.length;i++)
{
while(count[i]>0)
{
array[j]=i;
j++;
count[i]--;
}
}
}
public static void printArray(int ...array)
{
for(int value : array) System.out.println(value);
}
public static void main(String gg[])
{
int array[]={5,9,2,1,3,4,2,4,1,10,5,9};
countingSortAlgo(array);
printArray(array); 
}
}