package o;

import java.util.Arrays;

/* renamed from: o.dw2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5933dw2 {
    public static final int m = 4;
    public static final int n = 10;

    /* renamed from: o  reason: collision with root package name */
    public static final int f719o = 10;
    public static final int p = 5;
    public int[] a = new int[10];
    public int[] b = new int[10];
    public int c = 0;
    public int[] d = new int[10];
    public float[] e = new float[10];
    public int f = 0;
    public int[] g = new int[5];
    public String[] h = new String[5];
    public int i = 0;
    public int[] j = new int[4];
    public boolean[] k = new boolean[4];
    public int l = 0;

    public void a(int i, float f) {
        int i2 = this.f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    public void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.a;
        if (i3 >= iArr.length) {
            this.a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    public void c(int i, String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        if (i2 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    public void d(int i, boolean z) {
        int i2 = this.l;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i3 = this.l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.k;
        this.l = i3 + 1;
        zArr2[i3] = z;
    }

    public void e(int i, String str) {
        if (str != null) {
            c(i, str);
        }
    }

    public void f(C5933dw2 c5933dw2) {
        for (int i = 0; i < this.c; i++) {
            c5933dw2.b(this.a[i], this.b[i]);
        }
        for (int i2 = 0; i2 < this.f; i2++) {
            c5933dw2.a(this.d[i2], this.e[i2]);
        }
        for (int i3 = 0; i3 < this.i; i3++) {
            c5933dw2.c(this.g[i3], this.h[i3]);
        }
        for (int i4 = 0; i4 < this.l; i4++) {
            c5933dw2.d(this.j[i4], this.k[i4]);
        }
    }

    public void g(InterfaceC8148mw2 interfaceC8148mw2) {
        for (int i = 0; i < this.c; i++) {
            interfaceC8148mw2.b(this.a[i], this.b[i]);
        }
        for (int i2 = 0; i2 < this.f; i2++) {
            interfaceC8148mw2.c(this.d[i2], this.e[i2]);
        }
        for (int i3 = 0; i3 < this.i; i3++) {
            interfaceC8148mw2.e(this.g[i3], this.h[i3]);
        }
        for (int i4 = 0; i4 < this.l; i4++) {
            interfaceC8148mw2.d(this.j[i4], this.k[i4]);
        }
    }

    public void h() {
        this.l = 0;
        this.i = 0;
        this.f = 0;
        this.c = 0;
    }

    public int i(int i) {
        for (int i2 = 0; i2 < this.c; i2++) {
            if (this.a[i2] == i) {
                return this.b[i2];
            }
        }
        return -1;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.c + ", mCountFloat=" + this.f + ", mCountString=" + this.i + ", mCountBoolean=" + this.l + '}';
    }
}
