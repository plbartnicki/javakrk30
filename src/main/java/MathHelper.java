public class MathHelper
{
	public static double maxAbs( double num1, double num2 )
	{
		double num1Abs = Math.abs( num1 );
		double num2Abs = Math.abs( num2 );

		if(num1Abs > num2Abs) {
			return num1;
		}

		return num2;
//		return num1Abs > num2Abs ? num1 : num2;    //mozna tez krocej
	}
}
