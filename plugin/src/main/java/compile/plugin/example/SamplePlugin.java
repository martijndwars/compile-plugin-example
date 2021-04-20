package compile.plugin.example;

import com.sun.source.util.JavacTask;
import com.sun.source.util.Plugin;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.api.BasicJavacTask;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.util.Context;
import com.sun.tools.javac.util.Log;

public class SamplePlugin implements Plugin {

  @Override
  public String getName() {
    return "SamplePlugin";
  }

  @Override
  public void init(JavacTask task, String... args) {
    Context context = ((BasicJavacTask) task).getContext();
    JavacProcessingEnvironment processingEnvironment = JavacProcessingEnvironment.instance(context);
    Log.instance(context).printRawLines(Log.WriterKind.NOTICE, "Hello 2 from " + getName());

    // Register task listener
    TaskListener taskListener = new PostAnalyzeTaskListener(processingEnvironment);
    task.addTaskListener(taskListener);
  }
}
