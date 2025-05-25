package level1.exercise1.interfaces;

import java.util.List;

public interface HistoryViewer {
    void showHistory();
    List<String> search(String keyword);
}
