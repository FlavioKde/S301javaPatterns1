package level1.exercise1.mainManager;

import level1.exercise1.dataClass.ManagerUNDO;
import level1.exercise1.dataClass.Undo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ManagerUNDO managerUNDO = new ManagerUNDO();
        managerUNDO.loadExamples();

        Undo history = Undo.getUndo();
        System.out.println("--show history--");
        history.showHistory();

        System.out.println("--search command--");
        List<String>resultado = history.search("comando 1");
        resultado.forEach(System.out::println);

        System.out.println("--Search by index--");
        System.out.println(history.getCommand(1));



    }
}