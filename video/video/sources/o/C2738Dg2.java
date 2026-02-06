package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Dg2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2738Dg2<T> implements V32<T> {
    @NotNull
    public final V32<T> X;
    @NotNull
    public final VA0<InterfaceC4076Qv0<? super T>, HM<? super C7458kA2>, Object> Y;

    @FV(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", i = {}, l = {408}, m = "collect", n = {}, s = {})
    /* renamed from: o.Dg2$a */
    /* loaded from: classes4.dex */
    public static final class a extends KM {
        public /* synthetic */ Object Y0;
        public final /* synthetic */ C2738Dg2<T> Z0;
        public int a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2738Dg2<T> c2738Dg2, HM<? super a> hm) {
            super(hm);
            this.Z0 = c2738Dg2;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.Y0 = obj;
            this.a1 |= Integer.MIN_VALUE;
            return this.Z0.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2738Dg2(@NotNull V32<? extends T> v32, @NotNull VA0<? super InterfaceC4076Qv0<? super T>, ? super HM<? super C7458kA2>, ? extends Object> va0) {
        this.X = v32;
        this.Y = va0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // o.V32, o.InterfaceC3882Ov0
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<?> hm) {
        a aVar;
        int i;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i2 = aVar.a1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.a1 = i2 - Integer.MIN_VALUE;
                Object obj = aVar.Y0;
                Object l = C7289jT0.l();
                i = aVar.a1;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    RT1.n(obj);
                } else {
                    RT1.n(obj);
                    V32<T> v32 = this.X;
                    C2640Cg2 c2640Cg2 = new C2640Cg2(interfaceC4076Qv0, this.Y);
                    aVar.a1 = 1;
                    if (v32.a(c2640Cg2, aVar) == l) {
                        return l;
                    }
                }
                throw new SX0();
            }
        }
        aVar = new a(this, hm);
        Object obj2 = aVar.Y0;
        Object l2 = C7289jT0.l();
        i = aVar.a1;
        if (i == 0) {
        }
        throw new SX0();
    }

    @Override // o.V32
    @NotNull
    public List<T> b() {
        return this.X.b();
    }
}
