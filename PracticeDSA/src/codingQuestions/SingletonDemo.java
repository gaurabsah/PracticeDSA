package codingQuestions;

public class SingletonDemo {
    private static SingletonDemo single_obj;

    private SingletonDemo(){
    }

    public SingletonDemo getInstance(){
        if (single_obj == null){
            single_obj = new SingletonDemo();
        }

        return single_obj;
    }
}
