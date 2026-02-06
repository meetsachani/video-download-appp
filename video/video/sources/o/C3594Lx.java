package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.Lx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3594Lx extends Exception {
    public static final int Y = 0;
    public static final int Y0 = 2;
    public static final int Z = 1;
    public static final int Z0 = 3;
    public static final int a1 = 4;
    public static final int b1 = 5;
    public static final int c1 = 6;
    public final int X;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.Lx$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public C3594Lx(int i) {
        this.X = i;
    }

    public int a() {
        return this.X;
    }

    public C3594Lx(int i, String str) {
        super(str);
        this.X = i;
    }

    public C3594Lx(int i, String str, Throwable th) {
        super(str, th);
        this.X = i;
    }

    public C3594Lx(int i, Throwable th) {
        super(th);
        this.X = i;
    }
}
