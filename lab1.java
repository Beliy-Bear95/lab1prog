public class lab1 {
    public static void main(String[]args){
        
        int[] s1 = new int[14];
        for(int d = 0; d < s1.length; d++){
            int k = 2 + d;
            s1[d] = k;
        }
        
        final float MINVALUE = -13.0F; 
        final float MAXVALUE = 14.0F;  
        float[] x = new float[20];
        for(int a = 0; a < x.length; a++){
            float randomValue = MINVALUE + (float) (Math.random() * (MAXVALUE - MINVALUE + 1.0));
            x[a] = randomValue;
        }

        float[][] s2 = new float[14][20];
        for(int i = 0; i < 14; i++){
            for(int j = 0; j < 20; j++){
                switch(s1[i]){
                    case 9: s2[i][j] = (float) Math.pow((4/Math.cbrt(x[j]/2)),3);
                    case 3, 4, 7, 8, 10, 14, 15: s2[i][j] = (float) Math.pow(((1/2) * Math.sin(Math.asin((x[j] + 0.5)/27))),Math.cbrt(Math.log(Math.abs(x[j]))));
                    default: s2[i][j] = (float) (Math.cos(Math.pow((Math.E),(Math.pow((3/x[j]),2))))) * (float) (Math.pow(((Math.pow(((1/4) * (Math.tan(x[j]) - 1)),3))/(Math.pow(x[j],3) - (2/3))),3) - 1);
                }
            }
        }
        
        for(int t = 0; t < 14; t++){
            for(int r = 0; r < 20; r++){
                System.out.printf("%.5f%n", s2[t][r]);
            }
        }
}
}