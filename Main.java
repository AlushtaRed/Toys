package ToysShop;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        Toy toy1 = new Toy();
        toy1.name = "Конструктор";
        toy1.ID = 1;
        toy1.probability = 20;
        Toy toy2 = new Toy();
        toy2.name = "Робот";
        toy2.ID = 2;
        toy2.probability = 20;
        Toy toy3 = new Toy();
        toy3.name = "Кукла";
        toy3.ID = 3;
        toy3.probability = 60;

        Queue<Toy> toyList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            switch (probability()) {
                case 1:
                    toyList.add(toy1);
                    break;
                case 2:
                    toyList.add(toy2);
                    break;
                case 3:
                    toyList.add(toy3);
                    break;
                default:
                    break;
            }
          
        }
        System.out.println(toyList);
        System.out.println();

        while (!toyList.isEmpty()) {
            getToy(toyList);
        }
        System.out.println(toyList);

    }

    // static void printAsQueue(Queue<Toy> list) {
    //     while (!list.isEmpty()) {
    //         System.out.println(list.poll());
    //     }
    // }

    static void getToy(Queue<Toy> list) throws IOException {
        Toy res = list.poll();
        System.out.println(res);
        String filePath = "toys.txt";
        FileWriter writer = new FileWriter(filePath, true);
            writer.write("Ваш выигрыш: " + res.name);
            writer.write("\n");
            writer.close();
      
    }

    public static int probability() {
        Random rng = new Random();
        int rand = rng.nextInt(1, 100);
        if (rand <= 20) {

            return 1;
        } else if (rand > 20 && rand <= 40) {
            return 2;
        } else if (rand > 40) {
            return 3;
        } else
            return 0;
    }

}
