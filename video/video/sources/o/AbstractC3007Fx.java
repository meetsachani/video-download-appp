package o;

/* renamed from: o.Fx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3007Fx {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;

    /* renamed from: o.Fx$a */
    /* loaded from: classes.dex */
    public enum a {
        RECOVERABLE,
        CRITICAL
    }

    /* renamed from: o.Fx$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public static b a(int i) {
            return b(i, null);
        }

        public static b b(int i, Throwable th) {
            return new C10529wi(i, th);
        }

        public abstract Throwable c();

        public abstract int d();

        public a e() {
            int d = d();
            if (d != 2 && d != 1 && d != 3) {
                return a.CRITICAL;
            }
            return a.RECOVERABLE;
        }
    }

    /* renamed from: o.Fx$c */
    /* loaded from: classes.dex */
    public enum c {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static AbstractC3007Fx a(c cVar) {
        return b(cVar, null);
    }

    public static AbstractC3007Fx b(c cVar, b bVar) {
        return new C10283vi(cVar, bVar);
    }

    public abstract b c();

    public abstract c d();
}
