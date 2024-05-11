class selectionSort
{
public static void selectionSortAlgo(int array[])
{
int smallest;
int temp;
boolean swap=false;
for(int i=0;i<=array.length-2;i++)
{
smallest=i;
for(int j=i+1;j<=array.length-1;j++)
{
if(array[smallest]>array[j])
{
swap=true;
smallest=j;
}
}
if(swap==true)
{
temp=array[i];
array[i]=array[smallest];
array[smallest]=temp;
}else return;
}
}
public static void printArray(int array[])
{
for(int i=0;i<array.length;i++)
{
System.out.println(array[i]);
}
}
public static void main(String gg[])
{
int array[]={3,5,1,6,2,4};
selectionSortAlgo(array);
printArray(array);
}
}