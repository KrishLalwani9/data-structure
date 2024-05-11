class bubbleSort
{
public static void bubbleSortAlgo(int array[])
{
for(int turn=0;turn<array.length-1;turn++) // at every turn one largest element gone at the end
{
boolean swap=false;
for(int j=0;j<array.length-1-turn;j++)
{
if(array[j]>array[j+1])
{
swap=true;
int tmp=array[j];
array[j]=array[j+1];
array[j+1]=tmp;
}
}
if(swap==false)
{
return;
}
}
}
public static void printArray(int array[])
{
for(int x : array)
{
System.out.println(x);
}
}
public static void main(String gg[])
{
int array[]={1,2,3,4,5};
bubbleSortAlgo(array);
printArray(array);
}
}