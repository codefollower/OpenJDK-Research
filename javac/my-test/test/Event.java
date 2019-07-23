package test;

import test.Event.Type;

public interface Event<T extends Type> {

    interface Type {
    }

    T getType();

    class BaseEvent<T extends Type> implements Event<T> {
        private final T type;

        protected BaseEvent(T type) {
            this.type = type;
        }

        @Override
        public T getType() {
            return type;
        }
    }
}
