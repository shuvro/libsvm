package libsvm;
public class svm_parameter implements Cloneable,java.io.Serializable
{
	/* svm_type */
	public static final int C_SVC = 0;
	public static final int NU_SVC = 1;
	public static final int ONE_CLASS = 2;
	public static final int EPSILON_SVR = 3;
	public static final int NU_SVR = 4;

	/* kernel_type */
	public static final int LINEAR = 0;
	public static final int POLY = 1;
	public static final int RBF = 2;
	public static final int SIGMOID = 3;
	public static final int PRECOMPUTED = 4;

	public int svm_type;
	public int kernel_type;
	public int degree;	// for poly
	public double gamma;	// for poly/rbf/sigmoid
	public double coef0;	// for poly/sigmoid

	// these are for training only
	public double cache_size; // in MB
	public double eps;	// stopping criteria
	public double C;	// for C_SVC, EPSILON_SVR and NU_SVR
	public int nr_weight;		// for C_SVC
	public int[] weight_label;	// for C_SVC
	public double[] weight;		// for C_SVC
	public double nu;	// for NU_SVC, ONE_CLASS, and NU_SVR
	public double p;	// for EPSILON_SVR
	public int shrinking;	// use the shrinking heuristics
	public int probability; // do probability estimates

  public svm_parameter() {
    this.svm_type = svm_parameter.C_SVC;
    this.kernel_type = svm_parameter.RBF;
    this.degree = 3;
    this.gamma = 0;	// 1/num_features
    this.coef0 = 0;
    this.nu = 0.5;
    this.cache_size = 100;
    this.C = 1;
    this.eps = 1e-3;
    this.p = 0.1;
    this.shrinking = 1;
    this.probability = 1; // changed this to 1 as our current way of predicting the regressions rely on it to compute expectation.
    this.nr_weight = 0;
    this.weight_label = new int[0];
    this.weight = new double[0];
  }

	public Object clone() 
	{
		try 
		{
			return super.clone();
		} catch (CloneNotSupportedException e) 
		{
			return null;
		}
	}

}
