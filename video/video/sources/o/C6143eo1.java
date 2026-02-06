package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.eo1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6143eo1 {
    @NotNull
    public static final C7592kj2 a = new C7592kj2("NO_OWNER");
    @NotNull
    public static final C7592kj2 b = new C7592kj2("ALREADY_LOCKED_BY_OWNER");
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 2;

    @FV(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {121}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: o.eo1$a */
    /* loaded from: classes4.dex */
    public static final class a<T> extends KM {
        public Object Y0;
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
            return C6143eo1.e(null, null, null, this);
        }
    }

    @NotNull
    public static final InterfaceC4826Yn1 a(boolean z) {
        return new C5900do1(z);
    }

    public static /* synthetic */ InterfaceC4826Yn1 b(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object e(@NotNull InterfaceC4826Yn1 interfaceC4826Yn1, @Nullable Object obj, @NotNull FA0<? extends T> fa0, @NotNull HM<? super T> hm) {
        a aVar;
        int i;
        try {
            if (hm instanceof a) {
                aVar = (a) hm;
                int i2 = aVar.c1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.c1 = i2 - Integer.MIN_VALUE;
                    Object obj2 = aVar.b1;
                    Object l = C7289jT0.l();
                    i = aVar.c1;
                    if (i == 0) {
                        if (i == 1) {
                            fa0 = (FA0) aVar.a1;
                            obj = aVar.Z0;
                            interfaceC4826Yn1 = (InterfaceC4826Yn1) aVar.Y0;
                            RT1.n(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj2);
                        aVar.Y0 = interfaceC4826Yn1;
                        aVar.Z0 = obj;
                        aVar.a1 = fa0;
                        aVar.c1 = 1;
                        if (interfaceC4826Yn1.e(obj, aVar) == l) {
                            return l;
                        }
                    }
                    return fa0.invoke();
                }
            }
            return fa0.invoke();
        } finally {
            UP0.d(1);
            interfaceC4826Yn1.h(obj);
            UP0.c(1);
        }
        aVar = new a(hm);
        Object obj22 = aVar.b1;
        Object l2 = C7289jT0.l();
        i = aVar.c1;
        if (i == 0) {
        }
    }

    public static final <T> Object f(InterfaceC4826Yn1 interfaceC4826Yn1, Object obj, FA0<? extends T> fa0, HM<? super T> hm) {
        UP0.e(0);
        interfaceC4826Yn1.e(obj, hm);
        UP0.e(1);
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            interfaceC4826Yn1.h(obj);
            UP0.c(1);
        }
    }

    public static /* synthetic */ Object g(InterfaceC4826Yn1 interfaceC4826Yn1, Object obj, FA0 fa0, HM hm, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        UP0.e(0);
        interfaceC4826Yn1.e(obj, hm);
        UP0.e(1);
        try {
            return fa0.invoke();
        } finally {
            UP0.d(1);
            interfaceC4826Yn1.h(obj);
            UP0.c(1);
        }
    }
}
