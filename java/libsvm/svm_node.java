package libsvm;
public class svm_node implements java.io.Serializable
{
	public final int index;
	public final double value;

  public svm_node(int index, double value) {
    this.index = index;
    this.value = value;
  }
}
