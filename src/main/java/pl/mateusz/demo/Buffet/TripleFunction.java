package pl.mateusz.demo.Buffet;
@FunctionalInterface
public interface TripleFunction<T, Q, W, E> {
    E apply(T t, Q q, W w);
}
