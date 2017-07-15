
public class MyArrayList<E> implements MyList<E> {

	int count = 0;

	capacity=0;
	private static final int INIT_CAPACITY = 10;

	E[] array = new E[10];

	public MyArrayList() {

		this(INIT_CAPACITY);
	}

	public MyArrayList(int initCapacity) {
		 capacity = initCapacity;
		array = = (E[]) new Object[capacity];
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		boolean flag = false;
		if (count == 0) {
			flag = true;
		}
		return flag;
	}

	@Override
	public boolean contain(E e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(E e) {

		count++;
		return false;
	}

	@Override
	public boolean remove(E e) {

		count--;
		return false;
	}

	@Override
	public void clear() {

		for(E e : this.){
			
		}

	}

	@Override
	public int indexOf(E e) {

		return 0;
	}

}
