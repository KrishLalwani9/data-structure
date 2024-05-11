class insertionSort
{
public static void insertionSortAlgo(int array[])
{
for(int i=1;i<=array.length-1;i++)
{
int curr=array[i];
int prev=i-1;
while(prev>=0 && array[prev] > curr)
{
array[prev+1]=array[prev];
prev--;
}
array[prev+1]=curr;
}
}
public static void printArray(int array[])
{
for(int value : array)
{
System.out.println(value);
}
}
public static void main(String gg[])
{
int array[]={3,5,93,6,2,4,39,22,1};
insertionSortAlgo(array);
printArray(array);
}
}