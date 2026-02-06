package o;

import o.RP1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class E40<T> implements InterfaceC3882Ov0<T> {
    @NotNull
    public final InterfaceC3882Ov0<T> X;
    @InterfaceC7058iW0
    @NotNull
    public final HA0<T, Object> Y;
    @InterfaceC7058iW0
    @NotNull
    public final VA0<Object, Object, Boolean> Z;

    /* loaded from: classes4.dex */
    public static final class a<T> implements InterfaceC4076Qv0 {
        public final /* synthetic */ E40<T> X;
        public final /* synthetic */ RP1.h<Object> Y;
        public final /* synthetic */ InterfaceC4076Qv0<T> Z;

        @FV(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", i = {}, l = {73}, m = "emit", n = {}, s = {})
        /* renamed from: o.E40$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0178a extends KM {
            public /* synthetic */ Object Y0;
            public final /* synthetic */ a<T> Z0;
            public int a1;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0178a(a<? super T> aVar, HM<? super C0178a> hm) {
                super(hm);
                this.Z0 = aVar;
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return this.Z0.c(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(E40<T> e40, RP1.h<Object> hVar, InterfaceC4076Qv0<? super T> interfaceC4076Qv0) {
            this.X = e40;
            this.Y = hVar;
            this.Z = interfaceC4076Qv0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        @Override // o.InterfaceC4076Qv0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object c(T t, HM<? super C7458kA2> hm) {
            C0178a c0178a;
            int i;
            if (hm instanceof C0178a) {
                c0178a = (C0178a) hm;
                int i2 = c0178a.a1;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0178a.a1 = i2 - Integer.MIN_VALUE;
                    Object obj = c0178a.Y0;
                    Object l = C7289jT0.l();
                    i = c0178a.a1;
                    if (i == 0) {
                        if (i == 1) {
                            RT1.n(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        RT1.n(obj);
                        T t2 = (T) this.X.Y.invoke(t);
                        Object obj2 = this.Y.X;
                        if (obj2 != C9596ss1.a && this.X.Z.i(obj2, t2).booleanValue()) {
                            return C7458kA2.a;
                        }
                        this.Y.X = t2;
                        InterfaceC4076Qv0<T> interfaceC4076Qv0 = this.Z;
                        c0178a.a1 = 1;
                        if (interfaceC4076Qv0.c(t, c0178a) == l) {
                            return l;
                        }
                    }
                    return C7458kA2.a;
                }
            }
            c0178a = new C0178a(this, hm);
            Object obj3 = c0178a.Y0;
            Object l2 = C7289jT0.l();
            i = c0178a.a1;
            if (i == 0) {
            }
            return C7458kA2.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E40(@NotNull InterfaceC3882Ov0<? extends T> interfaceC3882Ov0, @NotNull HA0<? super T, ? extends Object> ha0, @NotNull VA0<Object, Object, Boolean> va0) {
        this.X = interfaceC3882Ov0;
        this.Y = ha0;
        this.Z = va0;
    }

    @Override // o.InterfaceC3882Ov0
    @Nullable
    public Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm) {
        RP1.h hVar = new RP1.h();
        hVar.X = (T) C9596ss1.a;
        Object a2 = this.X.a(new a(this, hVar, interfaceC4076Qv0), hm);
        if (a2 == C7289jT0.l()) {
            return a2;
        }
        return C7458kA2.a;
    }
}
