package multiplication;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MultiplicationTable {

    Set<Task> tasks = new HashSet<>(15);


    public MultiplicationTable() {
        Random random = new Random();
        while (tasks.size() < 15){
            tasks.add(new Task(random.nextInt(10), random.nextInt(10)));

        }
    }

    @Override
    public String toString() {
        return "MultiplicationTable{" +
                "tasks=" + tasks +
                '}';
    }
}
//Задание 2
//Учитель каждый урок начинает с того, чтобы задавать каждому ученику пример из таблицы умножения, чтобы проверить знания. Учитель хочет, чтобы все вопросы для учеников были разными. Всего в классе учатся 15 человек.
//
//Напишите программу, которая будет выводить в консоль 15 уникальных и случайных задач из таблицы умножения в столбец, то есть на одной строчке одно задание (от 2*2 до 9*9). Задачи должны быть уникальными, то есть примеры по типу 2*9 и 9*2 считаются повтором.
//
//Критерии оценки
//Создана коллекция, в которой хранится список задач.
//В консоль задачи выводятся в столбец, на каждой новой строчке новая задача.
//Исключены повторы заданий в списке.
