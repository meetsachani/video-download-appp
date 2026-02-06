package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.qb0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9035qb0 extends Exception {
    public static final int Y = 0;
    public static final int Z = 1;
    public final int X;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.qb0$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public C9035qb0(int i, String str, Throwable th) {
        super(str, th);
        this.X = i;
    }

    public int a() {
        return this.X;
    }
}
