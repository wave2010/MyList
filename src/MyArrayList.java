
public class MyArrayList<E> implements MyList<E> {
	int count = 0;
	public Object[] array = new Object[count];

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
		boolean flag = false;
		for (Object ob : array) {
			if (ob == e) {
				flag = true;
			} else {
				flag = false;
			}

		}
		return flag;
	}

	@Override
	public boolean add(E e) {

		array[size() + 1] = e;

		count++;
		return false;

	}

	@Override
	public boolean remove(E e) {

		boolean flag = false;
		for (int i = (array.length - 1); i > 0; i--) {
			if (array[i].equals(e)) {
				count--;
				array[i] = null;
				flag = true;
			}

		}
		return flag;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
			ob = null;
		}

	}
	

	@Override
	public boolean equals(Object obj) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == obj){
				
			}
		}
		return equals(obj);
	}

	@Override
	public int indexOf(E e) {
		// TODO Auto-generated method stub
		return index;
	}

}
