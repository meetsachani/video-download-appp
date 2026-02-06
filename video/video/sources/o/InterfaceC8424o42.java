package o;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.HT1;
import o.InterfaceC8668p42;

/* renamed from: o.o42  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC8424o42<C extends InterfaceC8668p42> extends InterfaceC5015a91 {
    public static final int R0 = 1;
    public static final int S0 = 2;
    public static final int T0 = 3;
    public static final int U0 = 5;
    public static final int V0 = 0;
    public static final int W0 = 1;

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.o42$a */
    /* loaded from: classes3.dex */
    public @interface a {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.o42$b */
    /* loaded from: classes3.dex */
    public @interface b {
    }

    @HT1({HT1.a.Y})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: o.o42$c */
    /* loaded from: classes3.dex */
    public @interface c {
    }

    void a(C c2);

    void c(int i);

    void g(C c2);

    int getState();
}
