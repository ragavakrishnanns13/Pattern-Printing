import java.util.*;
public class patterns {
    public static void patternOne(int n){
        //* * * 
        //* * * 
        //* * * 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patternTwo(int n){
        //* 
        //* * 
        //* * *  
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patternThree(int n){
        //1
        //1 2 
        //1 2 3
        //1 2 3 4
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    public static void patternFour(int n){
        //1
        //2 2
        //3 3 3 
        //4 4 4 4
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(i+1+" ");
            }
            System.out.println();
        }
    }
    public static void patternFive(int n){
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patternSix(int n){
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2 
        //1
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1+" ");
            }
            System.out.println();
        }
    }
    public static void patternSeven(int n){
        //     *
        //    ***   
        //   *****  
        //  ******* 
        // *********
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void patternEight(int n){
        // *********
        //  ******* 
        //   *****  
        //    ***   
        //     *    
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<(2*n)-(2*i+1);j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void patternNine(int n){
        //     *    
        //    ***   
        //   *****  
        //  ******* 
        // *********
        // *********
        //  ******* 
        //   *****  
        //    ***   
        //     *  
        //Combine pattern eight and nine to get diamond
        patternSeven(n);
        patternEight(n);
    }
    public static void patternTen(int n){
            // *
            // **
            // ***   upper part
            // ****
            // ***** ---------- 
            // ****
            // ***   lower part
            // **
            // *    
        //upper part
        for(int i=0;i<(n/2)+1;i++){
            //star
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=0;i<(n/2);i++){
            //star
            for(int j=0;j<(n/2)-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternEleven(int n){
        //1
        //01
        //101
        //0101
        int start = 1;
        for(int i=0;i<n;i++){
            if(i%2==0) start = 1;
            else start = 0;
            for(int j=0;j<=i;j++){
                System.out.print(start);
                //flip back to zero
                start = 1 - start;
            }
            System.out.println();
        }
    }
    public static void patternTwelve(int n){
        //1      1
        //12    21
        //123  321
        //12344321
        for(int i=0;i<n;i++){
            //for number left side
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            //for space left side
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //for space right side
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //for number right side
            for(int j=i+1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void patternThirteen(int n){
        //1 
        //2 3 
        //4 5 6 
        //7 8 9 10 
        //11 12 13 14 15 
        int num = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                
                System.out.print(num);
                System.out.print(" ");
                num+=1;
            }
            System.out.println();
        }
    }
    public static void patternFourteen(int n){
        //A 
        //A B 
        //A B C 
        //A B C D 
        //A B C D E 
        for(int i=0;i<n;i++){
            int ch = 65;
            for(int j=0;j<i+1;j++){
                System.out.print((char)ch);
                System.out.print(" ");
                ch+=1;
            }
            System.out.println();
        }
    }
    public static void patternFifteen(int n){
        // A B C D E 
        // A B C D 
        // A B C 
        // A B 
        // A 
        for(int i=0;i<n;i++){
            int ch = 65;
            for(int j=n-i;j>0;j--){
                System.out.print((char)ch);
                System.out.print(" ");
                ch+=1;
            }
            System.out.println();
        }
    }
    public static void patternSixteen(int n){
        //A 
        //B B 
        //C C C
        //D D D D 
        //E E E E E
        int ch = 65;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print((char)ch);
                System.out.print(" ");
            }
            ch+=1;
            System.out.println();
        }
    }
    public static void patternSeventeen(int n){
        //     A
        //    ABA
        //   ABCBA
        //  ABCDCBA
        // ABCDEDCBA
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int ch = 65;
            //increasing alphabets
            for(int j=0; j<i+1; j++){
                System.out.print((char)ch++);
            }
            //decreasing alphabets
            for(int j=i-1;j>=0;j--){
                ch = 65+j;
                System.out.print((char)ch--);
            }
            System.out.println();
        }
    }
    public static void patternEighteen(int n){
        // E 
        // D E 
        // C D E 
        // B C D E 
        // A B C D E 
        for(int i=0;i<n;i++){
            int ch = 65+n-i-1;
            for(int j=0;j<i+1;j++){
                System.out.print((char)ch++);
                System.out.print(" ");
            }    
            System.out.println();
        }
    }
    public static void patternNineteen(int n){
        // **********
        // ****  ****
        // ***    *** upper symmetry
        // **      **
        // *        *   - - - - - 
        // *        *
        // **      ** lower symmetry
        // ***    ***
        // ****  ****
        // **********
        //upper symmetry
        for(int i=0;i<n;i++){
            //star
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            //star
             for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower symmetry
        for(int i=0;i<n;i++){
            //star
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=(n-i-1)*2;j>0;j--){
                System.out.print(" ");
            }
            //star
             for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternTwenty(int n){
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        //upper
        for(int i=0;i<n;i++){
            //star
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            //space
            for(int j=(n-i-1)*2;j>0;j--){
                System.out.print(" ");
            }
            //star
             for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower
        for(int i=0;i<n-1;i++){
            //star
            for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<(i*2)+2;j++){
                System.out.print(" ");
            }
            //star
             for(int j=0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void patternTwentyOne(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //only when you are border
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void patternTwentyTwo(int n){
        // 4444444
        // 4333334
        // 4322234
        // 4321234
        // 4322234
        // 4333334
        // 4444444
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //cell is first row, last row or first column or last column
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("4");
                }
                //cell is second row, second last row or second column or second last column
                else if(i==1 || i==n-2 || j==1 || j==n-2){
                    System.out.print("3");
                }
                //cell is third row, third last row or third column or third last column
                else if(i==2 || i==n-3 || j==2 || j==n-3){
                    System.out.print("2");
                }
                //if none of the above cells then print 1
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternTwentyTwo(n);
    }
}
