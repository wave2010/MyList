
public class MyArrayList<E> implements MyList<E>
{
	int count = 0;
	public Object[] array= new Object[count];

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
		
		boolean flag=false;
		for(int i=(array.length-1);i>0;i--)
		{
			if(array[i].equals(e) )
			{
				
				array[i]=null;
				flag=true;
			}
			
		}
		return flag;
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
