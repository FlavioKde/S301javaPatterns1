package level1.exercise1.dataClass;



public class ManagerUNDO {
    private Undo history = Undo.getUndo();

    public void loadExamples(){
        history.addCommand("comando 1");
        history.addCommand("comando 2");
        history.addCommand("ls -la");
    }

}
