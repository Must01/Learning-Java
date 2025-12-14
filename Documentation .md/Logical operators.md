# Logical Operators in Java.

## && : the and operator

    we check all the condition and both must be true

```java
    double temp = 20;
    if (temp <= 30 && temp >= 0) {
        System.out.print("The weather is GOOD 😀");
    }
```

## || : the or operator

    we check if only one condition is true

```java
    double temp = 20;
    if (temp <= 30 || temp < 0) {
        System.out.print("The weather is Bad 😔");
    }
```

## ! : the not operator

    we check more then one condition and both must be true

```java
    double temp = 20;
    boolean isSunny = false;
    if (temp <= 30 && temp >= 0) {
        System.out.print("The weather is GOOD 😀");
    } else if (!isSunny) {
        System.out.print("The weather is cloudy ☁️");
    }
```
