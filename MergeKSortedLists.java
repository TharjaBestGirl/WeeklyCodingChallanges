import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeKSortedLists {
	public static List<Integer> mergeKSortedLists(int K,List<LinkedList<Integer>> Lists) {
		List<Integer> llist=new LinkedList<Integer>();
		
		for (int i = 0; i < K; i++) {
			int size = Lists.get(i).size();
			for (int j = 0; j < size; j++) {
				llist.add(Lists.get(i).get(j));
			}
		}
		
		Collections.sort(llist);
		
		return llist;
    }

    public static void main(String args[]) {
    	int K = 3;
    	LinkedList<Integer> llist=new LinkedList<Integer>();
    	LinkedList<Integer> llist2=new LinkedList<Integer>();
    	LinkedList<Integer> llist3=new LinkedList<Integer>();
    	
    	List<LinkedList<Integer>> list = new ArrayList<LinkedList<Integer>>();

    	llist.add(1);
    	llist.add(4);
    	llist.add(5);
    	
    	llist2.add(1);
    	llist2.add(3);
    	llist2.add(4);
    	
    	llist3.add(2);
    	llist3.add(6);
    	
    	list.add(llist);
    	list.add(llist2);
    	list.add(llist3);
    	
    	System.out.println(mergeKSortedLists(K,list).toString());
    }
}
