package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC2951Fi0
/* loaded from: classes4.dex */
public abstract class O0<T> implements InterfaceC3882Ov0<T>, InterfaceC9618sy<T> {

    @FV(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", i = {0}, l = {C9276rZ.p}, m = "collect", n = {"safeCollector"}, s = {"L$0"})
    /* loaded from: classes4.dex */
    public static final class a extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public final /* synthetic */ O0<T> a1;
        public int b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(O0<T> o0, HM<? super a> hm) {
            super(hm);
            this.a1 = o0;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return this.a1.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    @Override // o.InterfaceC3882Ov0
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm) {
        a aVar;
        int i;
        Throwable th;
        C8780pX1 c8780pX1;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i2 = aVar.b1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.b1 = i2 - Integer.MIN_VALUE;
                Object obj = aVar.Z0;
                Object l = C7289jT0.l();
                i = aVar.b1;
                if (i == 0) {
                    if (i == 1) {
                        c8780pX1 = (C8780pX1) aVar.Y0;
                        try {
                            RT1.n(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            c8780pX1.H();
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    InterfaceC4076Qv0<? super T> c8780pX12 = new C8780pX1<>(interfaceC4076Qv0, aVar.getContext());
                    try {
                        aVar.Y0 = c8780pX12;
                        aVar.b1 = 1;
                        if (e(c8780pX12, aVar) == l) {
                            return l;
                        }
                        c8780pX1 = c8780pX12;
                    } catch (Throwable th3) {
                        th = th3;
                        c8780pX1 = c8780pX12;
                        c8780pX1.H();
                        throw th;
                    }
                }
                c8780pX1.H();
                return C7458kA2.a;
            }
        }
        aVar = new a(this, hm);
        Object obj2 = aVar.Z0;
        Object l2 = C7289jT0.l();
        i = aVar.b1;
        if (i == 0) {
        }
        c8780pX1.H();
        return C7458kA2.a;
    }

    @Nullable
    public abstract Object e(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm);
}
