// JW (Jefford Shau, William Vongphanith)
// APCS
// HW55 -- Never Fear, Big Oh Is Here!
// 2022-01-11
// time spent: 0.5 hr

/*
DISCO:
  0. Analyzed the ArrayList methods to find the complexity of its execution time.
QCC:
  0. What is an example of a method that has a complexity of O(n^3)?
*/

import java.util.ArrayList;

public class OrderedArrayList {
    private ArrayList<Integer> _data;

    /*
     * Constructor.
     * Best-case performance: O(1)
     * Worst-case performance: O(1)
     Explanation: Regardless, a new memory is allocated for a new instance of _data. This means the complexity is constant.
     */
    public OrderedArrayList(){
        _data = new ArrayList<Integer>();
    }

    /*
     * Inserts the value into the correct position in the list.
     * Uses the binary search algorithm.
     * Best-case performance: O(1)
     * Worst-case performance: O(n)
     Explanation: In the best-case scenario, the value is added at the end of the array so that no values have to shift 1 to the right. This means that the complexity is constant. In the worst-case scenario, the index of the added value is anywhere but the end. This means that the n elements greater than the argument index have to shift 1 to the right, classifying this case as linear.
     */
    public void add(int value){
        int idx = Utils.binarySearchInsert(_data, value);
        _data.add(idx, value);
    }

    /*
     * Removes the value from the list.
     * Best-case performance: O(1)
     * Worst-case performance: O(n)
     Explanation: In the best-case scenario, the index removed is the last index of the array. No values will have to be shifted over, which means the complexity is constant. In the worst-case scenario, the index removed is the first index of the array. This index is removed and the n-1 elements are shifted over 1 to the left. This means the complexity is linear.
     */
    public void remove(int index) {
        _data.remove(index);
    }

    /*
     * Returns the value at the given index.
     * Best-case performance: O(1)
     * Worst-case performance: O(1)
     Explanation: This method retrieves one value regardless of the index. This means that its complexity is constant.
     */
    public int get(int index) {
        return _data.get(index);
    }

    /*
     * Returns the number of elements in the list.
     * Best-case performance: O(1)
     * Worst-case performance: O(1)
     Explanation: In the best-case scenario, the number of elements in the list is 0. The complexity would be constant because size of the array would not depend on n elements. However in the worst-case scenario, the length of the array is longer than 0 and the method would have to go through all n-1 elements to calculate the size of the array. This would mean the complexity is linear.
     */
    public int size() {
        return _data.size();
    }

    /*
     * Returns the index of the value in the list.
     * Best-case performance: O(1)
     * Worst-case performance: O(n)
     Explanation: In the best-case scenario, the value has the index of 1 and does not have to iterate through the list n-1 times. This means that the complexity would be constant. In the worst-case scenario, the value has the index of n-1 or is not in the list at all. In these cases, the method has to iterate through the whole array n-1 times, which means that the complexity is linear.
     */
    public int indexOf(int value) {
        return _data.indexOf(value);
    }

    /*
     * Manually set a value in the list.
     * Best-case performance: O(1)
     * Worst-case performance: O(1)
     Explanation: Regardless of the value or the index arguments, the method is replacing one value at a specific index with a different value. This means that the complexity is constant.
     */
    public void set(int index, int value) {
        _data.set(index, value);
    }

    /*
     * Returns a string representation of the list.
     * Best-case performance: O(1)
     * Worst-case performance: O(n)
     Explanation: In the best-case scenario, the size of the list is 0. In this case, the for loop is ignored and the complexity is constant. In the worst-case scenario, the list is length n and the for loop must iterate through n-1 times. This means the complexity is linear.
     */
    public String toString(){
        String retStr = "[";
        for( int i = 0; i < _data.size(); i++ ) {
            retStr += _data.get( i );
            if( i != _data.size() - 1 )
                retStr += ", ";
        }
        retStr += "]";
        return retStr;
    }
}
