package multiplication;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class MultiplicationTable {

    Set<Task> tasks = new HashSet<>(15);


    public MultiplicationTable() {
        Random random = new Random();
        while (tasks.size() < 15){
            tasks.add(new Task(random.nextInt(8)+2, random.nextInt(8)+2));

        }
    }

    @Override
    public String toString() {
        return "Задание: "+ tasks;
    }
}