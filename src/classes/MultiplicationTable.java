package classes;

public class Temp {
    private int number; //
    private int max_number = 9;

    boolean setNumber(int num) {
        if (1 <= num && num <= max_number) {
            number = num;
            return true;
        } else {
            return false;
        }
    }

    int getNumber() {
        return number;
    }

    boolean setMaxNumber(int max_num) {
        if (9 <= max_num && max_num <= 19) {
            max_number = max_num;
            return true;
        } else {
            return false;
        }
    }

    int getMaxNumber() {
        return max_number;
    }

    void printTable() {
        for (int i = 2; i <= max_number; i++) {
            System.out.println(number + "x" + i + "=" + number * i);
        }
    }

    public static void main(String[] args)//class 의 정의 만으로 static에서 사용가능
    {

        int i;
        Temp mtable = new Temp();

        mtable.setMaxNumber(9);

        for (i = 2; i < 10; i++) {
            mtable.setNumber(i);
            mtable.printTable();
        }
    }
}