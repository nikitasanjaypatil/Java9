

import java.io.*;

class Array2 {

        public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of planes : ");
		int plane = Integer.parseInt(br.readLine());

		System.out.println("Enter number of rows : ");
		int row = Integer.parseInt(br.readLine());

		System.out.println("Enter number of cols : ");
                int col = Integer.parseInt(br.readLine());

		int marr[][][] = new int[plane][row][col];

                for(int i = 0; i < plane; i++) {

                        for(int j = 0; j < row; j++) {

				for(int k = 0; k < col; k++) {

					int a = Integer.parseInt(br.readLine());
                                	marr[i][j][k] = a;
				}
                        }
                }

		int sum = 0;
		for(int i = 0; i < plane; i++) {

			for(int j = 0; j < row; j++) {

				for(int k = 0; k < col; k++) {

					sum = sum + marr[i][j][k];
				}
			}
                }
		System.out.println("Sum = " + sum);
        }
}
