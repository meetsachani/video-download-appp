package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;

/* loaded from: classes.dex */
public class PJ2 {
    public static final int e = 0;
    public static final int f = 1;
    public final SJ2[] a;
    public final String b;
    public final byte[] c;
    public final int d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    public PJ2(String str) {
        this(str, (SJ2[]) null);
    }

    public final void a(int i) {
        if (i == this.d) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + f(this.d) + " expected, but got " + f(i));
    }

    public byte[] b() {
        a(1);
        Objects.requireNonNull(this.c);
        return this.c;
    }

    public String c() {
        a(0);
        return this.b;
    }

    public SJ2[] d() {
        return this.a;
    }

    public int e() {
        return this.d;
    }

    public final String f(int i) {
        if (i != 0) {
            if (i != 1) {
                return "Unknown";
            }
            return "ArrayBuffer";
        }
        return "String";
    }

    public PJ2(String str, SJ2[] sj2Arr) {
        this.b = str;
        this.c = null;
        this.a = sj2Arr;
        this.d = 0;
    }

    public PJ2(byte[] bArr) {
        this(bArr, (SJ2[]) null);
    }

    public PJ2(byte[] bArr, SJ2[] sj2Arr) {
        Objects.requireNonNull(bArr);
        this.c = bArr;
        this.b = null;
        this.a = sj2Arr;
        this.d = 1;
    }
}
