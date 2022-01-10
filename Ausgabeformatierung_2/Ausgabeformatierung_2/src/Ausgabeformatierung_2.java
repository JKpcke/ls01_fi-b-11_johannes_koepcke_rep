public class Ausgabeformatierung_2 {
    public static void main(String[] args) throws Exception {
        String f = "Fahrenheit";
		String c = "Celsius";
		String extra = "|";
		String line = "------------------------";
		
		int onef 	= -20 ;
		int twof 	= -10;
		int threef 	= 0;
		int fourf 	= 20;
		int fivef 	= 30;
		
		double onec 	= -28.8889 ;
		double twoc 	= -23.3333 ;
		double threec 	= -17.7778 ;
		double fourc 	= -6.6667 ;
		double fivec 	= -1.1111 ;
		
		
		
		System.out.printf("%-11s %s %9s\n",f,extra,c );
		System.out.printf("%s\n", line);
		System.out.printf("%+-11d %1s %+9.2f\n", onef,extra,onec);
		System.out.printf("%+-11d %1s %+9.2f\n", twof,extra,twoc);
		System.out.printf("%+-11d %1s %+9.2f\n", threef,extra,threec);
		System.out.printf("%+-11d %1s %+9.2f\n", fourf,extra,fourc);
		System.out.printf("%+-11d %1s %+9.2f\n", fivef,extra,fivec);
    }
}
