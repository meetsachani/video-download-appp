package o;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Bd2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2530Bd2<T> implements InterfaceC3882Ov0<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater Y = AtomicIntegerFieldUpdater.newUpdater(C2530Bd2.class, "consumed$volatile");
    @NotNull
    public final Stream<T> X;
    private volatile /* synthetic */ int consumed$volatile = 0;

    @FV(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {22}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    /* renamed from: o.Bd2$a */
    /* loaded from: classes4.dex */
    public static final class a extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ C2530Bd2<T> c1;
        public int d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2530Bd2<T> c2530Bd2, HM<? super a> hm) {
            super(hm);
            this.c1 = c2530Bd2;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.b1 = obj;
            this.d1 |= Integer.MIN_VALUE;
            return this.c1.a(null, this);
        }
    }

    public C2530Bd2(@NotNull Stream<T> stream) {
        this.X = stream;
    }

    private final /* synthetic */ int e() {
        return this.consumed$volatile;
    }

    private final /* synthetic */ void h(int i) {
        this.consumed$volatile = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #0 {all -> 0x0036, blocks: (B:12:0x0031, B:22:0x0058, B:24:0x005e), top: B:35:0x0031 }] */
    @Override // o.InterfaceC3882Ov0
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm) {
        a aVar;
        int i;
        C2530Bd2<T> c2530Bd2;
        InterfaceC4076Qv0<? super T> interfaceC4076Qv02;
        Iterator<T> it;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i2 = aVar.d1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d1 = i2 - Integer.MIN_VALUE;
                Object obj = aVar.b1;
                Object l = C7289jT0.l();
                i = aVar.d1;
                if (i == 0) {
                    if (i == 1) {
                        it = (Iterator) aVar.a1;
                        InterfaceC4076Qv0<? super T> interfaceC4076Qv03 = (InterfaceC4076Qv0) aVar.Z0;
                        c2530Bd2 = (C2530Bd2) aVar.Y0;
                        try {
                            RT1.n(obj);
                            interfaceC4076Qv02 = interfaceC4076Qv03;
                        } catch (Throwable th) {
                            th = th;
                            c2530Bd2.X.close();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    if (Y.compareAndSet(this, 0, 1)) {
                        try {
                            interfaceC4076Qv02 = interfaceC4076Qv0;
                            it = this.X.iterator();
                            c2530Bd2 = this;
                        } catch (Throwable th2) {
                            th = th2;
                            c2530Bd2 = this;
                            c2530Bd2.X.close();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("Stream.consumeAsFlow can be collected only once");
                    }
                }
                while (it.hasNext()) {
                    aVar.Y0 = c2530Bd2;
                    aVar.Z0 = interfaceC4076Qv02;
                    aVar.a1 = it;
                    aVar.d1 = 1;
                    if (interfaceC4076Qv02.c((T) it.next(), aVar) == l) {
                        return l;
                    }
                }
                c2530Bd2.X.close();
                return C7458kA2.a;
            }
        }
        aVar = new a(this, hm);
        Object obj2 = aVar.b1;
        Object l2 = C7289jT0.l();
        i = aVar.d1;
        if (i == 0) {
        }
        while (it.hasNext()) {
        }
        c2530Bd2.X.close();
        return C7458kA2.a;
    }
}
