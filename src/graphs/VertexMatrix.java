package graphs;

import java.awt.Color;
import java.util.ArrayList;

public class VertexMatrix {
	int num; 
	ArrayList<Integer> connections; 
	Color color; 
	
	public VertexMatrix() { 
		num = 0; 
		connections = new ArrayList<Integer>(); 
	}
	public VertexMatrix(int n) { 
		num = n; 
		connections = new ArrayList<Integer>();
	}
	public VertexMatrix(int n, ArrayList<Integer> c) { 
		num = n; 
		connections = new ArrayList<Integer>(c); 
	}
	public void addConnection(int wantedVertex) { 
		if (connections.size() < wantedVertex + 1) { 
			increaseNodeSize(wantedVertex - connections.size() + 1); 
		}
		connections.set(wantedVertex, 1);	
	}
	/** 
	 * 
	 * @param wantedVertex
	 * @return
	 * Returns whether or not there was a connection to begin with
	 */
	public int removeConnection(int wantedVertex) {
		if (wantedVertex >= connections.size()) { 
			return 0;
		}
		int temp = connections.get(wantedVertex);
		connections.set(wantedVertex, 0); 
		return temp; 
		
	}
	public ArrayList<Integer> removeAllConnections(){ 
		ArrayList<Integer> temp = new ArrayList<Integer>(connections); 
		for (int i = 0; i < connections.size(); i++) { 
			connections.set(i, 0);
		}
		return temp;
	}
	public void increaseNodeSize(int n) { 
		for (int i =0; i< n; i++) {
			connections.add(0);
		}
	}
	public int[] getConnectionArray() { 
		int[] row = new int[connections.size()]; 
		for (int i = 0; i < connections.size(); i++) { 
			row[i] = connections.get(i);
		}
		return row;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}


}
