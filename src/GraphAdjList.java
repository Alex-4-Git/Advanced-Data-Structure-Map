import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class GraphAdjList extends Graph{
	private Map<Integer, ArrayList<Integer>> adjListMap;

	@Override
	public void implementAddVertex() { 
		// TODO Auto-generated method stub
		adjListMap.put(getNumVertices(), new ArrayList<>());
	}

	@Override
	public List<Integer> getNeighbors(int v) {
		// TODO Auto-generated method stub
		return new ArrayList<>(adjListMap.get(v));
	}
	
	@Override
	public void implementAddEdge(int m, int n) {
		// TODO Auto-generated method stub
		adjListMap.get(m).add(n);
	}
	
	public List<Integer> getTwoHopNeighbors(int v){
		Set<Integer> neighbors = new HashSet<>();
		for(int n: adjListMap.get(v)){
			for(int m: adjListMap.get(n)){
				neighbors.add(m);
			}
		}
		return new ArrayList<>(neighbors);
	}

	
}
