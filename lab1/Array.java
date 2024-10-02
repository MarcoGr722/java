//Завдання №5: цикл for
//Написати програму для обчислення суми всіх елементів у 2D-масиві.

public class Array {
        public static void main(String[] args) {

            int[][] array = {
                    {1, 2, 13},
                    {7, 5, 6},
                    {4, 12, 9}
            };


            int sum = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
            }
            System.out.println("Сума всіх елемент. у 2D масиві: " + sum);
        }

}

