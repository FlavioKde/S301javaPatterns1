package level1.exercise1.interfaces;

public interface HistoryStorage {
    void addCommand(String command);
    String getCommand(int index);
    void clearHistory();

}
