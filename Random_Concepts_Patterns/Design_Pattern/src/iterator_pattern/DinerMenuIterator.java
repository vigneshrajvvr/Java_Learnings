package iterator_pattern;

public class DinerMenuIterator implements Iterator {
	
	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		return items.length > position;
	}

	@Override
	public MenuItem next() {
		
		return items[position++];
	}

}
