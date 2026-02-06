package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: o.pf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8807pf {
    public static final int c = 0;
    public static final int d = 1;
    public static final C8807pf e = new C8807pf(0, 1);
    public static final C8807pf f = new C8807pf(1, 1);
    public final int a;
    public final int b;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.pf$a */
    /* loaded from: classes.dex */
    public @interface a {
    }

    public C8807pf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }
}
