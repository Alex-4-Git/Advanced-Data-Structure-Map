import java.util.List;

public abstract class Graph {
	private int numVertices;
	private int numEdges;
	
	public Graph(){
		numVertices = 0;
		numEdges = 0;
	}
	
	public int getNumVertices(){
		return numVertices;
	}
	
	public int getNumEdges(){
		return numEdges;
	}
	
	
	public void addVertex(int i){
		implementAddVertex();
		numVertices++;
	}
	
	public void addEdge(int m, int n){
		implementAddEdge(m, n);
		numEdges++;
	}
	
	public abstract void implementAddVertex();
	
	public abstract void implementAddEdge(int m, int n);
	
	public abstract List<Integer> getNeighbors(int v);
	
}
