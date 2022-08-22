package daimasuixianglu.tu;

import java.util.*;

public class kechengbiao {
    List<List<Integer>> edges;
    int [] inEdges;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edges=new ArrayList<List<Integer>>();
        inEdges=new int[numCourses];
        //构造有向图
        for(int i=0;i<numCourses;i++){
            edges.add(new ArrayList<Integer>());
        }
        for(int []info:prerequisites){
            edges.get(info[1]).add(info[0]);
            inEdges[info[0]]++;
        }
        //把入度为0的加入队列
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inEdges[i]==0) queue.add(i);
        }
        int visited=0;
        while (!queue.isEmpty()){
            int u=queue.poll();
            visited++;
            for(int v:edges.get(u)){
                inEdges[v]--;
                if(inEdges[v]==0)
                    queue.add(v);
            }
        }
        return visited==numCourses;



    }
}
