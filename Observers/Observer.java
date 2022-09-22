package WS1.Observers;

/**
 * interface observer updates because of his duty to observe sensors and react accordingly to it
 * @param <T> type of the observed data we want to achieve
 */
public interface Observer <T>{
    public void update(T data);
}
