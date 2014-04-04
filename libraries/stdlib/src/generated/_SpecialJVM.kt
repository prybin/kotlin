package kotlin

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import java.util.*

/**
 * Searches array or range of array for provided element index using binary search algorithm. Array is expected to be sorted.
 */
public fun <T> Array<out T>.binarySearch(element: T, fromIndex: Int = 0, toIndex: Int = size - 1) : Int {
    return Arrays.binarySearch(this, fromIndex, toIndex, element)
}

/**
 * Searches array or range of array for provided element index using binary search algorithm. Array is expected to be sorted.
 */
public fun ByteArray.binarySearch(element: Byte, fromIndex: Int = 0, toIndex: Int = size - 1) : Int {
    return Arrays.binarySearch(this, fromIndex, toIndex, element)
}

/**
 * Searches array or range of array for provided element index using binary search algorithm. Array is expected to be sorted.
 */
public fun CharArray.binarySearch(element: Char, fromIndex: Int = 0, toIndex: Int = size - 1) : Int {
    return Arrays.binarySearch(this, fromIndex, toIndex, element)
}

/**
 * Searches array or range of array for provided element index using binary search algorithm. Array is expected to be sorted.
 */
public fun DoubleArray.binarySearch(element: Double, fromIndex: Int = 0, toIndex: Int = size - 1) : Int {
    return Arrays.binarySearch(this, fromIndex, toIndex, element)
}

/**
 * Searches array or range of array for provided element index using binary search algorithm. Array is expected to be sorted.
 */
public fun FloatArray.binarySearch(element: Float, fromIndex: Int = 0, toIndex: Int = size - 1) : Int {
    return Arrays.binarySearch(this, fromIndex, toIndex, element)
}

/**
 * Searches array or range of array for provided element index using binary search algorithm. Array is expected to be sorted.
 */
public fun IntArray.binarySearch(element: Int, fromIndex: Int = 0, toIndex: Int = size - 1) : Int {
    return Arrays.binarySearch(this, fromIndex, toIndex, element)
}

/**
 * Searches array or range of array for provided element index using binary search algorithm. Array is expected to be sorted.
 */
public fun LongArray.binarySearch(element: Long, fromIndex: Int = 0, toIndex: Int = size - 1) : Int {
    return Arrays.binarySearch(this, fromIndex, toIndex, element)
}

/**
 * Searches array or range of array for provided element index using binary search algorithm. Array is expected to be sorted.
 */
public fun ShortArray.binarySearch(element: Short, fromIndex: Int = 0, toIndex: Int = size - 1) : Int {
    return Arrays.binarySearch(this, fromIndex, toIndex, element)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun <T> Array<out T>.copyOf() : Array<T> {
    return Arrays.copyOf(this, size) as Array<T>
}

/**
 * Returns new array which is a copy of the original array
 */
public fun BooleanArray.copyOf() : BooleanArray {
    return Arrays.copyOf(this, size)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun ByteArray.copyOf() : ByteArray {
    return Arrays.copyOf(this, size)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun CharArray.copyOf() : CharArray {
    return Arrays.copyOf(this, size)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun DoubleArray.copyOf() : DoubleArray {
    return Arrays.copyOf(this, size)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun FloatArray.copyOf() : FloatArray {
    return Arrays.copyOf(this, size)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun IntArray.copyOf() : IntArray {
    return Arrays.copyOf(this, size)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun LongArray.copyOf() : LongArray {
    return Arrays.copyOf(this, size)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun ShortArray.copyOf() : ShortArray {
    return Arrays.copyOf(this, size)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun <T> Array<out T>.copyOf(newSize: Int) : Array<T?> {
    return Arrays.copyOf(this, newSize) as Array<T?>
}

/**
 * Returns new array which is a copy of the original array
 */
public fun BooleanArray.copyOf(newSize: Int) : BooleanArray {
    return Arrays.copyOf(this, newSize)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun ByteArray.copyOf(newSize: Int) : ByteArray {
    return Arrays.copyOf(this, newSize)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun CharArray.copyOf(newSize: Int) : CharArray {
    return Arrays.copyOf(this, newSize)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun DoubleArray.copyOf(newSize: Int) : DoubleArray {
    return Arrays.copyOf(this, newSize)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun FloatArray.copyOf(newSize: Int) : FloatArray {
    return Arrays.copyOf(this, newSize)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun IntArray.copyOf(newSize: Int) : IntArray {
    return Arrays.copyOf(this, newSize)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun LongArray.copyOf(newSize: Int) : LongArray {
    return Arrays.copyOf(this, newSize)
}

/**
 * Returns new array which is a copy of the original array
 */
public fun ShortArray.copyOf(newSize: Int) : ShortArray {
    return Arrays.copyOf(this, newSize)
}

/**
 * Returns new array which is a copy of range of original array
 */
public fun <T> Array<out T>.copyOfRange(from: Int, to: Int) : Array<T> {
    return Arrays.copyOfRange(this, from, to)
}

/**
 * Returns new array which is a copy of range of original array
 */
public fun BooleanArray.copyOfRange(from: Int, to: Int) : BooleanArray {
    return Arrays.copyOfRange(this, from, to)
}

/**
 * Returns new array which is a copy of range of original array
 */
public fun ByteArray.copyOfRange(from: Int, to: Int) : ByteArray {
    return Arrays.copyOfRange(this, from, to)
}

/**
 * Returns new array which is a copy of range of original array
 */
public fun CharArray.copyOfRange(from: Int, to: Int) : CharArray {
    return Arrays.copyOfRange(this, from, to)
}

/**
 * Returns new array which is a copy of range of original array
 */
public fun DoubleArray.copyOfRange(from: Int, to: Int) : DoubleArray {
    return Arrays.copyOfRange(this, from, to)
}

/**
 * Returns new array which is a copy of range of original array
 */
public fun FloatArray.copyOfRange(from: Int, to: Int) : FloatArray {
    return Arrays.copyOfRange(this, from, to)
}

/**
 * Returns new array which is a copy of range of original array
 */
public fun IntArray.copyOfRange(from: Int, to: Int) : IntArray {
    return Arrays.copyOfRange(this, from, to)
}

/**
 * Returns new array which is a copy of range of original array
 */
public fun LongArray.copyOfRange(from: Int, to: Int) : LongArray {
    return Arrays.copyOfRange(this, from, to)
}

/**
 * Returns new array which is a copy of range of original array
 */
public fun ShortArray.copyOfRange(from: Int, to: Int) : ShortArray {
    return Arrays.copyOfRange(this, from, to)
}

/**
 * Fills original array with the provided value
 */
public fun <T> Array<out T>.fill(element: T) : Array<out T> {
    Arrays.fill(this, element)
    return this
    
}

/**
 * Fills original array with the provided value
 */
public fun BooleanArray.fill(element: Boolean) : BooleanArray {
    Arrays.fill(this, element)
    return this
    
}

/**
 * Fills original array with the provided value
 */
public fun ByteArray.fill(element: Byte) : ByteArray {
    Arrays.fill(this, element)
    return this
    
}

/**
 * Fills original array with the provided value
 */
public fun CharArray.fill(element: Char) : CharArray {
    Arrays.fill(this, element)
    return this
    
}

/**
 * Fills original array with the provided value
 */
public fun DoubleArray.fill(element: Double) : DoubleArray {
    Arrays.fill(this, element)
    return this
    
}

/**
 * Fills original array with the provided value
 */
public fun FloatArray.fill(element: Float) : FloatArray {
    Arrays.fill(this, element)
    return this
    
}

/**
 * Fills original array with the provided value
 */
public fun IntArray.fill(element: Int) : IntArray {
    Arrays.fill(this, element)
    return this
    
}

/**
 * Fills original array with the provided value
 */
public fun LongArray.fill(element: Long) : LongArray {
    Arrays.fill(this, element)
    return this
    
}

/**
 * Fills original array with the provided value
 */
public fun ShortArray.fill(element: Short) : ShortArray {
    Arrays.fill(this, element)
    return this
    
}

/**
 * Returns a list containing all elements that are instances of specified class
 */
public fun <T, R: T> Array<out T>.filterIsInstance(klass: Class<R>) : List<R> {
    return filterIsInstanceTo(ArrayList<R>(), klass)
    
}

/**
 * Returns a list containing all elements that are instances of specified class
 */
public fun <T, R: T> Iterable<T>.filterIsInstance(klass: Class<R>) : List<R> {
    return filterIsInstanceTo(ArrayList<R>(), klass)
    
}

/**
 * Returns a stream containing all elements that are instances of specified class
 */
public fun <T, R: T> Stream<T>.filterIsInstance(klass: Class<R>) : Stream<T> {
    return FilteringStream(this, true, { klass.isInstance(it) })
    
}

/**
 * Appends all elements that are instances of specified class into the given *collection*
 */
public fun <T, C: MutableCollection<in R>, R: T> Array<out T>.filterIsInstanceTo(collection: C, klass: Class<R>) : C {
    for (element in this) if (klass.isInstance(element)) collection.add(element as R)
    return collection
    
}

/**
 * Appends all elements that are instances of specified class into the given *collection*
 */
public fun <T, C: MutableCollection<in R>, R: T> Iterable<T>.filterIsInstanceTo(collection: C, klass: Class<R>) : C {
    for (element in this) if (klass.isInstance(element)) collection.add(element as R)
    return collection
    
}

/**
 * Appends all elements that are instances of specified class into the given *collection*
 */
public fun <T, C: MutableCollection<in R>, R: T> Stream<T>.filterIsInstanceTo(collection: C, klass: Class<R>) : C {
    for (element in this) if (klass.isInstance(element)) collection.add(element as R)
    return collection
    
}

/**
 * Sorts array or range in array inplace
 */
public fun <T> Array<out T>.sort(fromIndex : Int = 0, toIndex : Int = size - 1) : Unit {
    Arrays.sort(this, fromIndex, toIndex)
}

/**
 * Sorts array or range in array inplace
 */
public fun ByteArray.sort(fromIndex : Int = 0, toIndex : Int = size - 1) : Unit {
    Arrays.sort(this, fromIndex, toIndex)
}

/**
 * Sorts array or range in array inplace
 */
public fun CharArray.sort(fromIndex : Int = 0, toIndex : Int = size - 1) : Unit {
    Arrays.sort(this, fromIndex, toIndex)
}

/**
 * Sorts array or range in array inplace
 */
public fun DoubleArray.sort(fromIndex : Int = 0, toIndex : Int = size - 1) : Unit {
    Arrays.sort(this, fromIndex, toIndex)
}

/**
 * Sorts array or range in array inplace
 */
public fun FloatArray.sort(fromIndex : Int = 0, toIndex : Int = size - 1) : Unit {
    Arrays.sort(this, fromIndex, toIndex)
}

/**
 * Sorts array or range in array inplace
 */
public fun IntArray.sort(fromIndex : Int = 0, toIndex : Int = size - 1) : Unit {
    Arrays.sort(this, fromIndex, toIndex)
}

/**
 * Sorts array or range in array inplace
 */
public fun LongArray.sort(fromIndex : Int = 0, toIndex : Int = size - 1) : Unit {
    Arrays.sort(this, fromIndex, toIndex)
}

/**
 * Sorts array or range in array inplace
 */
public fun ShortArray.sort(fromIndex : Int = 0, toIndex : Int = size - 1) : Unit {
    Arrays.sort(this, fromIndex, toIndex)
}

