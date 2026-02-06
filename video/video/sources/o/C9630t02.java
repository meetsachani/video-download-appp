package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.t02  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9630t02 {
    public static final int a;
    @NotNull
    public static final C7592kj2 b;
    @NotNull
    public static final C7592kj2 c;
    @NotNull
    public static final C7592kj2 d;
    @NotNull
    public static final C7592kj2 e;
    public static final int f;

    @FV(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {81}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    /* renamed from: o.t02$a */
    /* loaded from: classes4.dex */
    public static final class a<T> extends KM {
        public Object Y0;
        public Object Z0;
        public /* synthetic */ Object a1;
        public int b1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.a1 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return C9630t02.k(null, null, this);
        }
    }

    static {
        int e2;
        int e3;
        e2 = C3059Gk2.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        a = e2;
        b = new C7592kj2("PERMIT");
        c = new C7592kj2("TAKEN");
        d = new C7592kj2("BROKEN");
        e = new C7592kj2("CANCELLED");
        e3 = C3059Gk2.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f = e3;
    }

    @NotNull
    public static final InterfaceC8652p02 a(int i, int i2) {
        return new C9387s02(i, i2);
    }

    public static /* synthetic */ InterfaceC8652p02 b(int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return a(i, i2);
    }

    public static final C9873u02 j(long j, C9873u02 c9873u02) {
        return new C9873u02(j, c9873u02, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object k(@NotNull InterfaceC8652p02 interfaceC8652p02, @NotNull FA0<? extends T> fa0, @NotNull HM<? super T> hm) {
        a aVar;
        int i;
        try {
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.b1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.b1 = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.a1;
                    Object l = C7289jT0.l();
                    i = aVar.b1;
                    if (i == 0) {
                        if (i == 1) {
                            fa0 = (FA0) aVar.Z0;
                            interfaceC8652p02 = (InterfaceC8652p02) aVar.Y0;
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        aVar.Y0 = interfaceC8652p02;
                        aVar.Z0 = fa0;
                        aVar.b1 = 1;
                        if (interfaceC8652p02.b(aVar) == l) {
                            return l;
                        }
                    }
                    return fa0.invoke();
                }
            }
            return fa0.invoke();
        } finally {
            UP0.d(1);
            interfaceC8652p02.g();
            UP0.c(1);
        }
        aVar = new a(hm);
        Object obj2 = aVar.a1;
        Object l2 = C7289jT0.l();
        i = aVar.b1;
        if (i == 0) {
        }
    }

    public static final <T> Object l(InterfaceC8652p02 interfaceC8652p02, FA0<? extends T> fa0, HM<? super T> hm) {
        UP0.e(0);
        interfaceC8652p02.b(hm);
        UP0.e(1);
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            interfaceC8652p02.g();
            UP0.c(1);
        }
    }
}
