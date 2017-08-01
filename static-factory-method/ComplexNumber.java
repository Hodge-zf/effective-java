public final class ComplexNumber {

  /*returns an object of the class*/

  public static ComplexNumber valueOf(float nReal, float nImaginary) {
    return new ComplexNumber(nReal, nImaginary);
  }

  /*private constructor is hidden from caller*/

  private ComplexNumber(float nReal, float nImaginary) {
    aReal = nReal;
    aImaginary = nImaginary;
  }

  private float aReal;
  private float aImaginary;
}
