package generics.interfacedemo;

interface Container<T>{
     abstract void add(T item);
     abstract T get(int index);
}
