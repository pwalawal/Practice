// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
//import java.util.NoSuchElementException;
class PeekingIterator implements Iterator<Integer> {
    
    Integer peek;
    Iterator<Integer>itr;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    itr=iterator;
        if(itr.hasNext()){
            peek=itr.next();
        }
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return peek;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(peek==null) throw new java.util.NoSuchElementException();
	    Integer next=peek;
        peek=itr.hasNext()?itr.next():null;
        return next;
	}
	
	@Override
	public boolean hasNext() {
	    return peek!=null;
	}
}
