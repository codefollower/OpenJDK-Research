package test.d;

import static test.d.DAGExecutionEvent.Type.COMMIT_EVENT; 
import test.Event;

//这个例子用于测试 https://github.com/codefollower/Bats/pull/4
public class DAGExecutionEvent extends Event.BaseEvent<DAGExecutionEvent.Type> {
    protected DAGExecutionEvent(Type type) {
        super(type);
    }

    public enum Type implements Event.Type {
        HEARTBEAT_EVENT,
        STRAM_EVENT,
        COMMIT_EVENT
    }
}
