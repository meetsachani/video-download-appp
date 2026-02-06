package o;

import o.RP1;
import o.Y70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.rp2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9342rp2 {

    @FV(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {101}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    /* renamed from: o.rp2$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends KM {
        public long Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public int c1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.c1 |= Integer.MIN_VALUE;
            return C9342rp2.e(0L, null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (r4 == null) goto L10;
     */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C8363np2 a(long j, @NotNull O10 o10, @NotNull RU0 ru0) {
        Q10 q10;
        String str;
        if (o10 instanceof Q10) {
            q10 = (Q10) o10;
        } else {
            q10 = null;
        }
        if (q10 != null) {
            Y70.a aVar = Y70.Y;
            str = q10.q(C6223f80.x(j, EnumC6964i80.Y0));
        }
        str = "Timed out waiting for " + j + " ms";
        return new C8363np2(str, ru0);
    }

    public static final <U, T extends U> Object b(RunnableC8607op2<U, ? super T> runnableC8607op2, VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0) {
        C5829dV0.x(runnableC8607op2, P10.d(runnableC8607op2.Y0.getContext()).o(runnableC8607op2.Z0, runnableC8607op2, runnableC8607op2.getContext()));
        return Rz2.c(runnableC8607op2, runnableC8607op2, va0);
    }

    @Nullable
    public static final <T> Object c(long j, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        if (j > 0) {
            Object b = b(new RunnableC8607op2(j, hm), va0);
            if (b == C7289jT0.l()) {
                MV.c(hm);
            }
            return b;
        }
        throw new C8363np2("Timed out immediately");
    }

    @Nullable
    public static final <T> Object d(long j, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        return c(P10.e(j), va0, hm);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.op2, T] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object e(long j, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        a aVar;
        int i;
        RP1.h hVar;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i2 = aVar.c1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.c1 = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b1;
                Object l = C7289jT0.l();
                i = aVar.c1;
                if (i == 0) {
                    if (i == 1) {
                        hVar = (RP1.h) aVar.a1;
                        VA0 va02 = (VA0) aVar.Z0;
                        try {
                            RT1.n(obj);
                            return obj;
                        } catch (C8363np2 e) {
                            e = e;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    if (j <= 0) {
                        return null;
                    }
                    RP1.h hVar2 = new RP1.h();
                    try {
                        aVar.Z0 = va0;
                        aVar.a1 = hVar2;
                        aVar.Y0 = j;
                        aVar.c1 = 1;
                        ?? r2 = (T) new RunnableC8607op2(j, aVar);
                        hVar2.X = r2;
                        Object b = b(r2, va0);
                        if (b == C7289jT0.l()) {
                            MV.c(aVar);
                        }
                        if (b == l) {
                            return l;
                        }
                        return b;
                    } catch (C8363np2 e2) {
                        e = e2;
                        hVar = hVar2;
                    }
                }
                if (e.X != hVar.X) {
                    return null;
                }
                throw e;
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.b1;
        Object l2 = C7289jT0.l();
        i = aVar.c1;
        if (i == 0) {
        }
        if (e.X != hVar.X) {
        }
    }

    @Nullable
    public static final <T> Object f(long j, @NotNull VA0<? super InterfaceC9974uQ, ? super HM<? super T>, ? extends Object> va0, @NotNull HM<? super T> hm) {
        return e(P10.e(j), va0, hm);
    }
}
