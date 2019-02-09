package com.company;

public class Main {

    public static void main(String[] args) {
	int[][] matrix;

	matrix = new int[3][3];

        matrix[0][0]= 1;
        matrix[0][1]= 2;
        matrix[0][2]= 3;
        matrix[1][0]= 4;
        matrix[1][1]= 5;
        matrix[1][2]= 6;
        matrix[2][0]= 7;
        matrix[2][1]= 8;
        matrix[2][2]= 9;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){

                System.out.print( matrix[i][j]+"\t");



            }

            System.out.println();
        }


        System.out.println("-----------------------------------------------");
        matrix1 = new int [][];
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matrix[j][i] = matrix1[g][h];
                System.out.print( matrix[j][i]+"\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------");

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                for (int c=0;c<3;c++){

                    matrix[i][j]+= matrix[i][c]*matrix[c][j];
                    System.out.print( matrix[i][j]+"\t");
                }

            }
            System.out.println();
        }


            }
        }

