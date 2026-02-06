package o;

import o.C3440Ki;
import o.InterfaceC6615gi;

@InterfaceC6615gi
/* renamed from: o.Te0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4304Te0 {
    public static final long a = 10485760;
    public static final int b = 200;
    public static final int c = 10000;
    public static final long d = 604800000;
    public static final int e = 81920;
    public static final AbstractC4304Te0 f = a().f(10485760).d(200).b(10000).c(604800000).e(e).a();

    @InterfaceC6615gi.a
    /* renamed from: o.Te0$a */
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract AbstractC4304Te0 a();

        public abstract a b(int i);

        public abstract a c(long j);

        public abstract a d(int i);

        public abstract a e(int i);

        public abstract a f(long j);
    }

    public static a a() {
        return new C3440Ki.b();
    }

    public abstract int b();

    public abstract long c();

    public abstract int d();

    public abstract int e();

    public abstract long f();

    public a g() {
        return a().f(f()).d(d()).b(b()).c(c()).e(e());
    }
}
