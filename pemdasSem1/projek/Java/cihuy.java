public class cihuy {
    public static void main(String[] args) {
    int [][] nilai = {
		{80,75,90,85, 990},
		{70,88,78,89},
        {95,82,78,89},
        {88, 88, 88, 88,88,8,0}
    };
     
    for (int i = 0; i < nilai.length; i++){
     	for (int j = 0; j < nilai[i].length; j++){
        	System.out.print(nilai[i] [j]+ " ");
        } 
        System.out.println();
    }

        // for (int g = 2; g <= 10; g+=2) {     
        // System.out.print(g + " "); 
        // } 
        // for (int i = 1; i <= 10; i++) { if (i == 5) break; System.out.print(i + " "); }

        // for (int i = 1; i <= 10; i += 3) {     System.out.print(i + " "); } 

        // int i = 1;  while (i <= 5) {     if (i == 3) {         i++;         continue;     }      System.out.print(i + " ");     i++; } 
    }

    
    //  public static void main(String[] args) {
    //     int[][] nilai = {
    //         { 80, 75, 90, 85 }, 
    //         { 70, 88, 92, 60 },
    //         { 95, 82, 78, 89 }  
    //     };
    //     // i = baris
    //     // j = nilai angka
    //     for (int i = 0; i < nilai.length; i++) {
    //         for (int j = 0; j < nilai[i].length; j++) {
    //             System.out.print(nilai[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
}
