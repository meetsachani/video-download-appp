package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.yq */
/* loaded from: classes3.dex */
public final class C11047yq {
    @NotNull
    public static final C7592kj2 A;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 2;
    public static final int E = 3;
    public static final int F = 60;
    public static final long G = 1152921504606846975L;
    public static final long H = 4611686018427387904L;
    public static final long I = 4611686018427387903L;
    @NotNull
    public static final C10885yA<Object> a = new C10885yA<>(-1, null, null, 0);
    @InterfaceC7058iW0
    public static final int b;
    public static final int c;
    public static final long d = 0;
    public static final long e = Long.MAX_VALUE;
    @InterfaceC7058iW0
    @NotNull
    public static final C7592kj2 f;
    @NotNull
    public static final C7592kj2 g;
    @NotNull
    public static final C7592kj2 h;
    @NotNull
    public static final C7592kj2 i;
    @NotNull
    public static final C7592kj2 j;
    @NotNull
    public static final C7592kj2 k;
    @NotNull
    public static final C7592kj2 l;
    @NotNull
    public static final C7592kj2 m;
    @NotNull
    public static final C7592kj2 n;
    @NotNull

    /* renamed from: o */
    public static final C7592kj2 f922o;
    @NotNull
    public static final C7592kj2 p;
    @NotNull
    public static final C7592kj2 q;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 3;
    public static final int v = 4;
    public static final int w = 5;
    @NotNull
    public static final C7592kj2 x;
    @NotNull
    public static final C7592kj2 y;
    @NotNull
    public static final C7592kj2 z;

    /* renamed from: o.yq$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a<E> extends C7964mB0 implements VA0<Long, C10885yA<E>, C10885yA<E>> {
        public static final a e1 = new a();

        public a() {
            super(2, C11047yq.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ Object i(Long l, Object obj) {
            return u0(l.longValue(), (C10885yA) obj);
        }

        public final C10885yA<E> u0(long j, C10885yA<E> c10885yA) {
            return C11047yq.x(j, c10885yA);
        }
    }

    static {
        int e2;
        int e3;
        e2 = C3059Gk2.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
        b = e2;
        e3 = C3059Gk2.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);
        c = e3;
        f = new C7592kj2("BUFFERED");
        g = new C7592kj2("SHOULD_BUFFER");
        h = new C7592kj2("S_RESUMING_BY_RCV");
        i = new C7592kj2("RESUMING_BY_EB");
        j = new C7592kj2("POISONED");
        k = new C7592kj2("DONE_RCV");
        l = new C7592kj2("INTERRUPTED_SEND");
        m = new C7592kj2("INTERRUPTED_RCV");
        n = new C7592kj2("CHANNEL_CLOSED");
        f922o = new C7592kj2("SUSPEND");
        p = new C7592kj2("SUSPEND_NO_WAITER");
        q = new C7592kj2("FAILED");
        x = new C7592kj2("NO_RECEIVE_RESULT");
        y = new C7592kj2("CLOSE_HANDLER_CLOSED");
        z = new C7592kj2("CLOSE_HANDLER_INVOKED");
        A = new C7592kj2("NO_CLOSE_CAUSE");
    }

    public static final long A(long j2) {
        return j2 & 4611686018427387903L;
    }

    public static final boolean B(long j2) {
        if ((j2 & 4611686018427387904L) != 0) {
            return true;
        }
        return false;
    }

    public static final int C(long j2) {
        return (int) (j2 >> 60);
    }

    public static final long D(long j2) {
        return j2 & G;
    }

    public static final long E(int i2) {
        if (i2 != 0) {
            if (i2 != Integer.MAX_VALUE) {
                return i2;
            }
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean F(InterfaceC8396ny<? super T> interfaceC8396ny, T t2, XA0<? super Throwable, ? super T, ? super InterfaceC5809dQ, C7458kA2> xa0) {
        Object I2 = interfaceC8396ny.I(t2, null, xa0);
        if (I2 != null) {
            interfaceC8396ny.j0(I2);
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean G(InterfaceC8396ny interfaceC8396ny, Object obj, XA0 xa0, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            xa0 = null;
        }
        return F(interfaceC8396ny, obj, xa0);
    }

    public static final /* synthetic */ long a(long j2, boolean z2) {
        return v(j2, z2);
    }

    public static final /* synthetic */ long b(long j2, int i2) {
        return w(j2, i2);
    }

    public static final /* synthetic */ C7592kj2 d() {
        return y;
    }

    public static final /* synthetic */ C7592kj2 e() {
        return z;
    }

    public static final /* synthetic */ C7592kj2 f() {
        return k;
    }

    public static final /* synthetic */ int g() {
        return c;
    }

    public static final /* synthetic */ C7592kj2 h() {
        return q;
    }

    public static final /* synthetic */ C7592kj2 i() {
        return m;
    }

    public static final /* synthetic */ C7592kj2 j() {
        return l;
    }

    public static final /* synthetic */ C7592kj2 k() {
        return g;
    }

    public static final /* synthetic */ C7592kj2 l() {
        return A;
    }

    public static final /* synthetic */ C7592kj2 m() {
        return x;
    }

    public static final /* synthetic */ C10885yA n() {
        return a;
    }

    public static final /* synthetic */ C7592kj2 o() {
        return j;
    }

    public static final /* synthetic */ C7592kj2 p() {
        return i;
    }

    public static final /* synthetic */ C7592kj2 q() {
        return h;
    }

    public static final /* synthetic */ C7592kj2 r() {
        return f922o;
    }

    public static final /* synthetic */ C7592kj2 s() {
        return p;
    }

    public static final /* synthetic */ long t(int i2) {
        return E(i2);
    }

    public static final /* synthetic */ boolean u(InterfaceC8396ny interfaceC8396ny, Object obj, XA0 xa0) {
        return F(interfaceC8396ny, obj, xa0);
    }

    public static final long v(long j2, boolean z2) {
        long j3;
        if (z2) {
            j3 = 4611686018427387904L;
        } else {
            j3 = 0;
        }
        return j3 + j2;
    }

    public static final long w(long j2, int i2) {
        return (i2 << 60) + j2;
    }

    public static final <E> C10885yA<E> x(long j2, C10885yA<E> c10885yA) {
        return new C10885yA<>(j2, c10885yA, c10885yA.G(), 0);
    }

    @NotNull
    public static final <E> FW0<C10885yA<E>> y() {
        return a.e1;
    }

    @NotNull
    public static final C7592kj2 z() {
        return n;
    }
}
