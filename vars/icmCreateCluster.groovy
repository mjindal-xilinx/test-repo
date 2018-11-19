
import com.ibm.icm.cluster_automation.*

def call(String clusterName, int enCount, int wnCount){
    ClusterInfo clusterInfo = new ClusterInfo(this,clusterName, enCount, wnCount)
    println(clusterInfo.clusterName)
    println(clusterInfo.edgeNodeCount)
    println(clusterInfo.workerNodeCount)
}




