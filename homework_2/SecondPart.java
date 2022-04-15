public class SecondPart {
    public static void main(String[] args) {
        int x = 0;
        x = x + 1;
        x = x + 1;
        x = x + 1;

        System.out.println(x);

        //Output будет 3.
        //Изначально мы декларировали переменную х со значением 0.
        //Так как это у нас не final variable, мы можем его редактировать.
        //int x = 0;
        //х = 0 + 1; Здесь наш х прировнялся к 1.
        //х = 1 + 1; x равен 2.
        //x = 2 + 1; x равен 3.
        //System.out.println(x); наш х 3
    }
}
