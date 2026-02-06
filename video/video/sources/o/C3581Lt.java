package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Lt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3581Lt<T> extends C7698lA<T> {
    @NotNull
    public final VA0<AI1<? super T>, HM<? super C7458kA2>, Object> Z0;

    @FV(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", i = {0}, l = {330}, m = "collectTo", n = {"scope"}, s = {"L$0"})
    /* renamed from: o.Lt$a */
    /* loaded from: classes4.dex */
    public static final class a extends KM {
        public Object Y0;
        public /* synthetic */ Object Z0;
        public final /* synthetic */ C3581Lt<T> a1;
        public int b1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3581Lt<T> c3581Lt, HM<? super a> hm) {
            super(hm);
            this.a1 = c3581Lt;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Z0 = obj;
            this.b1 |= Integer.MIN_VALUE;
            return this.a1.h(null, this);
        }
    }

    public /* synthetic */ C3581Lt(VA0 va0, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC7132iq enumC7132iq, int i2, C9516sY c9516sY) {
        this(va0, (i2 & 2) != 0 ? C3897Pa0.X : interfaceC5809dQ, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? EnumC7132iq.X : enumC7132iq);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    @Override // o.C7698lA, o.AbstractC7455kA
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(@NotNull AI1<? super T> ai1, @NotNull HM<? super C7458kA2> hm) {
        a aVar;
        int i;
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
                        ai1 = (AI1) aVar.Y0;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    aVar.Y0 = ai1;
                    aVar.b1 = 1;
                    if (super.h(ai1, aVar) == l) {
                        return l;
                    }
                }
                if (!ai1.h0()) {
                    return C7458kA2.a;
                }
                throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
            }
        }
        aVar = new a(this, hm);
        Object obj2 = aVar.Z0;
        Object l2 = C7289jT0.l();
        i = aVar.b1;
        if (i == 0) {
        }
        if (!ai1.h0()) {
        }
    }

    @Override // o.C7698lA, o.AbstractC7455kA
    @NotNull
    public AbstractC7455kA<T> i(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        return new C3581Lt(this.Z0, interfaceC5809dQ, i, enumC7132iq);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3581Lt(@NotNull VA0<? super AI1<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        super(va0, interfaceC5809dQ, i, enumC7132iq);
        this.Z0 = va0;
    }
}
