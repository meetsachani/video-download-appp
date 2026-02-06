package o;

import java.io.PrintStream;
import java.util.Arrays;

/* renamed from: o.uX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10000uX0 {

    /* renamed from: o.uX0$a */
    /* loaded from: classes.dex */
    public static class a {
        public static final int d = 999;
        public int[] a = new int[101];
        public BS[] b = new BS[101];
        public int c;

        public a() {
            b();
        }

        public void a(int i, BS bs) {
            if (this.b[i] != null) {
                e(i);
            }
            this.b[i] = bs;
            int[] iArr = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, (Object) null);
            this.c = 0;
        }

        public void c() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.a, this.c)));
            System.out.print("K: [");
            for (int i = 0; i < this.c; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = C6566gU0.h;
                }
                sb.append(str);
                sb.append(g(i));
                printStream2.print(sb.toString());
            }
            System.out.println(C6566gU0.g);
        }

        public int d(int i) {
            return this.a[i];
        }

        public void e(int i) {
            this.b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.c;
                if (i2 < i4) {
                    int[] iArr = this.a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.c = i4 - 1;
                    return;
                }
            }
        }

        public int f() {
            return this.c;
        }

        public BS g(int i) {
            return this.b[this.a[i]];
        }
    }

    /* renamed from: o.uX0$b */
    /* loaded from: classes.dex */
    public static class b {
        public static final int d = 999;
        public int[] a = new int[101];
        public NT[] b = new NT[101];
        public int c;

        public b() {
            b();
        }

        public void a(int i, NT nt) {
            if (this.b[i] != null) {
                e(i);
            }
            this.b[i] = nt;
            int[] iArr = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, (Object) null);
            this.c = 0;
        }

        public void c() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.a, this.c)));
            System.out.print("K: [");
            for (int i = 0; i < this.c; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = C6566gU0.h;
                }
                sb.append(str);
                sb.append(g(i));
                printStream2.print(sb.toString());
            }
            System.out.println(C6566gU0.g);
        }

        public int d(int i) {
            return this.a[i];
        }

        public void e(int i) {
            this.b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.c;
                if (i2 < i4) {
                    int[] iArr = this.a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.c = i4 - 1;
                    return;
                }
            }
        }

        public int f() {
            return this.c;
        }

        public NT g(int i) {
            return this.b[this.a[i]];
        }
    }

    /* renamed from: o.uX0$c */
    /* loaded from: classes.dex */
    public static class c {
        public static final int d = 999;
        public int[] a = new int[101];
        public float[][] b = new float[101];
        public int c;

        public c() {
            b();
        }

        public void a(int i, float[] fArr) {
            if (this.b[i] != null) {
                e(i);
            }
            this.b[i] = fArr;
            int[] iArr = this.a;
            int i2 = this.c;
            this.c = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void b() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, (Object) null);
            this.c = 0;
        }

        public void c() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.a, this.c)));
            System.out.print("K: [");
            for (int i = 0; i < this.c; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = C6566gU0.h;
                }
                sb.append(str);
                sb.append(Arrays.toString(g(i)));
                printStream2.print(sb.toString());
            }
            System.out.println(C6566gU0.g);
        }

        public int d(int i) {
            return this.a[i];
        }

        public void e(int i) {
            this.b[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.c;
                if (i2 < i4) {
                    int[] iArr = this.a;
                    if (i == iArr[i2]) {
                        iArr[i2] = 999;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.c = i4 - 1;
                    return;
                }
            }
        }

        public int f() {
            return this.c;
        }

        public float[] g(int i) {
            return this.b[this.a[i]];
        }
    }
}
