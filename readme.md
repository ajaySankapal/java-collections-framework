# java_collections_and_framework

## collection -
### Collection is a group of discrete object. Java does not provide any direct implementation of this interface. i.e there is no concrete class that implement collection. 
#### collection is a root interface of the collection framework
### collection
### |
### |-->List
### |
### |-->Set
### |
### |-->Queue
#### collection interface provide most common methods that can be used on the objects of collection 
##### 1. add() ----- boolean add(Object o)
##### 2. addAll() ----- boolean addAll(Collection c)
##### 3. remove() ------ boolean remove(Object o)
##### 4. removeAll() ----- boolean removeAll(Collection c)
##### 5. retainAll() ------- boolean retainAll(Collection c) --remnove all the elements from invoking collection except the elements present in the c
##### 6. clear() ------ void clear() --- remove all element from the collection
##### 7. contains() ----- boolean contains() -- return true if the object is present else false;
##### 8. containsAll() ----- boolean containsAll(Collection c) ---- returns true if all the elements of collection c is present in the invoking collection
##### 9. isEmpty() ---- boolean isEmpty(Collection c) ---- return true if the collection is empty
##### 10. size() ---- int size()
##### 11. iterator() ---- Iterator iterator() Provides cursor to get the object of collection one by one
##### 12. toArray() ----- Object[] toArray() ------- converts invoking collection to array

## Difference between Collection and Collections
### Collection is a root interface of collection framework
### Collections is a Utility Class for collection objects
#### Collections contain predefined static method which can be used while working with collection type of classes

#### Collections
##### |->sort()
##### |->reverse()
##### |->shuffle()
##### |->binarySearch()
##### |->disjoint()

### Generics
#### Main objective of generic is to provide type safety
#### To solve the problem of type casting
#### To enable developer to write less redundant code

