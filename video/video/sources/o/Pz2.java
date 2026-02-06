package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class Pz2<T> implements InterfaceC4076Qv0<T> {
    @NotNull
    public final InterfaceC5809dQ X;
    @NotNull
    public final Object Y;
    @NotNull
    public final VA0<T, HM<? super C7458kA2>, Object> Z;

    @FV(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", i = {}, l = {208}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<T, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ InterfaceC4076Qv0<T> b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super a> hm) {
            super(2, hm);
            this.b1 = interfaceC4076Qv0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                Object obj2 = this.a1;
                this.Z0 = 1;
                if (this.b1.c(obj2, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(T t, HM<? super C7458kA2> hm) {
            return ((a) t(t, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.b1, hm);
            aVar.a1 = obj;
            return aVar;
        }
    }

    public Pz2(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        this.X = interfaceC5809dQ;
        this.Y = C10795xn2.g(interfaceC5809dQ);
        this.Z = new a(interfaceC4076Qv0, null);
    }

    @Override // o.InterfaceC4076Qv0
    @Nullable
    public Object c(T t, @NotNull HM<? super C7458kA2> hm) {
        Object c = C7959mA.c(this.X, t, this.Y, this.Z, hm);
        if (c == C7289jT0.l()) {
            return c;
        }
        return C7458kA2.a;
    }
}
