package o;

/* loaded from: classes.dex */
public abstract class AS {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;

    /* loaded from: classes.dex */
    public static class a extends AS {
        public double d;
        public double[] e;

        public a(double d, double[] dArr) {
            this.d = d;
            this.e = dArr;
        }

        @Override // o.AS
        public double c(double d, int i) {
            return this.e[i];
        }

        @Override // o.AS
        public void d(double d, double[] dArr) {
            double[] dArr2 = this.e;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // o.AS
        public void e(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.e;
                if (i < dArr.length) {
                    fArr[i] = (float) dArr[i];
                    i++;
                } else {
                    return;
                }
            }
        }

        @Override // o.AS
        public double f(double d, int i) {
            return 0.0d;
        }

        @Override // o.AS
        public void g(double d, double[] dArr) {
            for (int i = 0; i < this.e.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // o.AS
        public double[] h() {
            return new double[]{this.d};
        }
    }

    public static AS a(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            if (i != 2) {
                return new C5949e01(dArr, dArr2);
            }
            return new a(dArr[0], dArr2[0]);
        }
        return new C3156Hk1(dArr, dArr2);
    }

    public static AS b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C3713Nd(iArr, dArr, dArr2);
    }

    public abstract double c(double d, int i);

    public abstract void d(double d, double[] dArr);

    public abstract void e(double d, float[] fArr);

    public abstract double f(double d, int i);

    public abstract void g(double d, double[] dArr);

    public abstract double[] h();
}
