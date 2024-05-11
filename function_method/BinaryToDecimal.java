class BinaryToDecimal
{
    public static void binaryToDecimal(int binNum)
    {
        int dec=0;
        int pow=0;
        int ld;
        int num=binNum;
        while(binNum>0)
        {
            ld=binNum%10;
            dec=dec+(ld * (int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of "+num+" is : "+dec);
    }
    public static void main(String gg[])
    {
        binaryToDecimal(1000);
    }
}