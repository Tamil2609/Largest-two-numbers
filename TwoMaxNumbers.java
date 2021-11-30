public class TwoMaxNumbers
{
    public void max(int[] nums)
    {
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:nums)
        {
            if(maxOne < n)
            {
                maxTwo = maxOne;
                maxOne = n;
            }
            else if (maxTwo < n)
            {
                maxTwo = n;
            }
        }
        System.out.println("first maximum number:"+maxOne);
        System.out.println("second maximum number:"+maxTwo);
    }
    public static void main (String a[])
    {
        int num[] = {11,22,45,92,21,54,79,11};
        TwoMaxNumbers tmn = new TwoMaxNumbers();
        tmn.max(num);
    }
}
