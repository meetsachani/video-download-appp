package o;

import o.InterfaceC5809dQ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.sX1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9515sX1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: o.sX1$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements InterfaceC3882Ov0<T> {
        public final /* synthetic */ VA0<InterfaceC4076Qv0<? super T>, HM<? super C7458kA2>, Object> X;

        /* renamed from: o.sX1$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0339a extends KM {
            public /* synthetic */ Object Y0;
            public int a1;

            public C0339a(HM<? super C0339a> hm) {
                super(hm);
            }

            @Override // o.AbstractC5644cl
            public final Object F(Object obj) {
                this.Y0 = obj;
                this.a1 |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
            this.X = va0;
        }

        @Override // o.InterfaceC3882Ov0
        public Object a(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            Object i = this.X.i(interfaceC4076Qv0, hm);
            if (i == C7289jT0.l()) {
                return i;
            }
            return C7458kA2.a;
        }

        public Object e(InterfaceC4076Qv0<? super T> interfaceC4076Qv0, HM<? super C7458kA2> hm) {
            UP0.e(4);
            new C0339a(hm);
            UP0.e(5);
            this.X.i(interfaceC4076Qv0, hm);
            return C7458kA2.a;
        }
    }

    @InterfaceC8046mW0(name = "checkContext")
    public static final void b(@NotNull final C8780pX1<?> c8780pX1, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        if (((Number) interfaceC5809dQ.m(0, new VA0() { // from class: o.rX1
            @Override // o.VA0
            public final Object i(Object obj, Object obj2) {
                int c;
                c = C9515sX1.c(C8780pX1.this, ((Integer) obj).intValue(), (InterfaceC5809dQ.b) obj2);
                return Integer.valueOf(c);
            }
        })).intValue() == c8780pX1.a1) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + c8780pX1.Z0 + ",\n\t\tbut emission happened in " + interfaceC5809dQ + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final int c(C8780pX1 c8780pX1, int i, InterfaceC5809dQ.b bVar) {
        InterfaceC5809dQ.c<?> key = bVar.getKey();
        InterfaceC5809dQ.b f = c8780pX1.Z0.f(key);
        if (key != RU0.W) {
            if (bVar != f) {
                return Integer.MIN_VALUE;
            }
            return i + 1;
        }
        RU0 ru0 = (RU0) f;
        C6562gT0.n(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
        RU0 d = d((RU0) bVar, ru0);
        if (d == ru0) {
            if (ru0 == null) {
                return i;
            }
            return i + 1;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + d + ", expected child of " + ru0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }

    @Nullable
    public static final RU0 d(@Nullable RU0 ru0, @Nullable RU0 ru02) {
        while (ru0 != null) {
            if (ru0 == ru02 || !(ru0 instanceof MY1)) {
                return ru0;
            }
            ru0 = ((MY1) ru0).getParent();
        }
        return null;
    }

    @HK1
    @NotNull
    public static final <T> InterfaceC3882Ov0<T> e(@InterfaceC5183ar @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        return new a(va0);
    }
}
