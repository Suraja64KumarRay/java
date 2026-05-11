public class hlw_rect {
    public static void patternrec(int totrow,int totcol)
    {
        //outer loop
        for(int i=1;i<=totrow;i++)
        {
            // inner column
            for(int j=1;j<=totcol;j++)
            {
                // cell - (i,j)
                if(i==1 || i==totrow || j==1 || j==totcol)
                {
                    // boundary cell
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        patternrec(5, 5);
    }
}
