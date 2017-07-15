import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

	int count =0;
	public Object[] array = new Object[100];

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
	return indexOf(e)>=0;
	}
		

	@Override
	public boolean add(E e) {
		array[size()] = e;
		count++;
		return true;
	}

	@Override
	public boolean remove(E e) {

		boolean flag = false;
		for (int i = (count-1); i > 0; i--) {
			if (e.equals(array[i])) {	
				array[i]=null;
				count--;
				flag=true;
			}
		}
		return flag;
	}

	@Override
	public void clear() {
		for (Object ob : array) {
			ob = null;
		}
	}

	@Override
	public boolean equals(Object obj) {
		int i = 0;
		if (obj instanceof MyArrayList<?>) {
			MyArrayList<Object> c = (MyArrayList<Object>) obj;
			while (i < count) {
				if (c.contain(this.array[i])) {
					i++;

				} else {
					return false;
				}
			}

		}
		return true;
	}

	@Override
	public int indexOf(E e) {

		for (int i = 0; i < count; i++) {
			if (e.equals(array[i])) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		StringBuilder stb=new StringBuilder();
		for (int i = 0; i < count; i++) {
			if(array[i]!=null)
			{
				stb.append(array[i]).append(" ");	
			}
			
		}
		return stb.toString();
	
			
	}

	@Override
	public void fill(E e) {
		// TODO Auto-generated method stub
		for (int i = 0; i <count; i++) {
			array[i]=e;
		}
	}
	
	
	
	
}