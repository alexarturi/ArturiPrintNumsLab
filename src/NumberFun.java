public class NumberFun {
    public NumberFun(){}

    public void printNums(int value, int numRounds){
        for (int i = 1; i<=numRounds; i++){
            int f = -1;
            while(f!=value){
                f = (int)(Math.random()*10);
                System.out.print(f);
            }
            System.out.println();
        }
    }
}
