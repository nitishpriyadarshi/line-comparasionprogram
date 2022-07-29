public class LineComparison {
    float x1,x2,y1,y2;
    Scanner sc = new Scanner(System.in);

    public void getLinePoint()
    {
        System.out.println("Enter The Value of X1 :");
        x1=sc.nextFloat();

        System.out.println("Enter The Value of Y1 :");
        y1=sc.nextFloat();

        System.out.println("Enter the Value of X2 :");
        x2=sc.nextFloat();

        System.out.println("Enter the Value of Y2 :");
        y2=sc.nextFloat();

    }
    public double getLengthOfLine()
    {
        double lengthofLine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        return lengthofLine;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparison LC1 = new LineComparison();
        LineComparison LC2 = new LineComparison();

        LC1.getLinePoint();
        LC2.getLinePoint();

        double line1Length = LC1.getLengthOfLine();
        double line2Length = LC2.getLengthOfLine();

        System.out.println("Length of Line1 : "+line1Length);
        System.out.println("Length of Line2 : "+line2Length);

        if(line1Length == line2Length) {
            System.out.println("Length of Line1 and Line2 are Equal");
        } else {
            System.out.println("Length of Line1 and Line2 are Not Equal");
        }


    }
}