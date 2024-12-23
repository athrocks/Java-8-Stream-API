
1. [BiFunction](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiFunction.html)
2. [BiConsumer](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiConsumer.html)
3. [BiPredicate](https://docs.oracle.com/javase/8/docs/api/java/util/function/BiPredicate.html)


```java
@FunctionalInterface
public interface BiFunction<T, U, R>{
	R apply(T t, U u);
}
```

```java
@FunctionalInterface
public interface Function<T, R> {
	R apply(T t);
}
```

---

```java
@FunctionalInterface
public interface BiConsumer<T, U> {
	void accept(T t, U u);
}
```

```java
@FunctionalInterface
public interface Consumer<T> {
	void accept(T t);
}
```

---

```java
@FunctionalInterface
public interface BiPredicate<T, U> {
	boolean test(T t, U u);
}
```

```java
@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}
```

---
