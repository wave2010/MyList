
public class MyArrayList<E> implements MyList<E> {

	int count = 0;

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
		// TODO Auto-generated method stub

	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		return 0;
	}

}
