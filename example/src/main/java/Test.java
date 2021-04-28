import oracle.pgx.algorithm.PgxGraph;
import oracle.pgx.algorithm.annotations.GraphAlgorithm;
import oracle.pgx.algorithm.annotations.Out;
import oracle.pgx.algorithm.VertexProperty;
import oracle.pgx.algorithm.VertexSet;

@GraphAlgorithm
public class Test {
  public void markNeighbours(PgxGraph g, int hop, @Out VertexProperty<Boolean> mark) {
    int currentHop = 0;
  }
}
