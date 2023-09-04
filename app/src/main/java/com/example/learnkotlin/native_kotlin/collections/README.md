# Collections
- Located on `Kotlin.collections`
- Groups of a variable number of items (possibly zero) that are significant to the problem being solved and are commonly operated on
- Contains a number of objects of the same type
- Objects in a collection are called `elements` or `items`

## List
- Ordered collection with access to elements by indices
- `indices` : integer numbers that reflect their position
- the position start from 0

## ArrayList
- `ArrayList<DataType>()` : create array list from ArrayList Class
- `arrayListOf<DataType>()` : create array list from method
- `arrayListOf<DataType>(params)` : create array list from method with the value from `params`

### ArrayList Properties
- `size` : add a new elemet to arraylist
- `indices` : index

### ArrayList Method
- `add(element)` : add a new element to arraylist
- `add(index, element)` : insert a new element to arraylist at index position
- `first()` : return the first element
- `last()` : return the first element
- `remove(element)` : remove element from arraylist
- `removeAt(index)` : remove element at index

## Set
- Collection of unique elements.
- Group of objects without repetitions
- The order of set elements has no significance
- `setOf<DataType>()` : create set from method
- `setOf<DataType>(params)` : create set from method with the value form `params`

## Map
- Sometimes called `dictionary`
- key-value pairs
- Keys are unique
- Each key maps to exactly one value
- `mapOf<DataType, DataType>(key1 to value1, key2 to value2)` : create `immutable map` from method with the `key` and `value`
- `mutableMapOf<DataType, DataType>(key1 to value1, key2 to value2)` : create `mutable map` from method with the `key` and `value`
