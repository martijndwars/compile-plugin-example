package compile.plugin.example;

import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskEvent.Kind;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Log;

public class PostAnalyzeTaskListener implements TaskListener {

  private final JavacProcessingEnvironment processingEnvironment;

  public PostAnalyzeTaskListener(JavacProcessingEnvironment processingEnvironment) {
    this.processingEnvironment = processingEnvironment;
  }

  @Override
  public void started(TaskEvent e) {
    System.out.println("Started " + e);
  }

  @Override
  public void finished(TaskEvent e) {
    System.out.println("Finished " + e);

    Context context = processingEnvironment.getContext();
    Log log = Log.instance(context);
    System.out.println("#errors = " + log.nerrors);
  }
}
