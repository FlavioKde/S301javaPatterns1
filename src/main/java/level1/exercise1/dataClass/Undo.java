package level1.exercise1.dataClass;

import level1.exercise1.interfaces.GetHistorySize;
import level1.exercise1.interfaces.HistoryStorage;
import level1.exercise1.interfaces.HistoryViewer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Undo implements HistoryStorage, HistoryViewer, GetHistorySize {
    private static Undo INSTANCE;
    private List<String>commandHistory;
    private int maxHistory = 100;

    private Undo(){
        commandHistory = new ArrayList<>();

    }

    public static Undo getUndo() {
        if(INSTANCE == null) {
            synchronized (Undo.class){
                if (INSTANCE == null){
                    INSTANCE = new Undo();
                }
            }
        }
        return INSTANCE;
    }
    @Override
    public void addCommand(String command){
        if(commandHistory.size() >= maxHistory){
            commandHistory.remove(0);
        }
        commandHistory.add(command);
    }
    @Override
    public String getCommand(int index) {
        if (index >= 0 && index < commandHistory.size()) {
            return commandHistory.get(index);
        }
        return null;
    }
    @Override
    public void clearHistory(){
        commandHistory.clear();
    }
    @Override
    public void showHistory(){
        commandHistory.forEach(System.out::println);
    }

    @Override
    public List<String> search(String keyword){
        return commandHistory.stream()
                .filter(cmd->cmd.contains(keyword))
                .collect(Collectors.toList());
    }
    @Override
    public void getHistorySize(){
        commandHistory.size();
    }

    @Override
    public String toString() {
        return "Undo{" +
                "commandHistory=" + commandHistory +
                ", maxHistory=" + maxHistory +
                '}';
    }
}
