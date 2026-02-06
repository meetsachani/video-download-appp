package o;

import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@HK1
/* loaded from: classes4.dex */
public final class YZ1<R> extends C6436g02<R> {
    @NotNull
    public final C8883py<R> b1;

    @FV(c = "kotlinx.coroutines.selects.SelectBuilderImpl$getResult$1", f = "SelectOld.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public final /* synthetic */ YZ1<R> a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(YZ1<R> yz1, HM<? super a> hm) {
            super(2, hm);
            this.a1 = yz1;
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z0;
            try {
                if (i != 0) {
                    if (i == 1) {
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    RT1.n(obj);
                    YZ1<R> yz1 = this.a1;
                    this.Z0 = 1;
                    obj = yz1.w(this);
                    if (obj == l) {
                        return l;
                    }
                }
                C7418k02.c(this.a1.b1, obj);
                return C7458kA2.a;
            } catch (Throwable th) {
                C7418k02.d(this.a1.b1, th);
                return C7458kA2.a;
            }
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            return new a(this.a1, hm);
        }
    }

    public YZ1(@NotNull HM<? super R> hm) {
        super(hm.getContext());
        this.b1 = new C8883py<>(C7048iT0.e(hm), 1);
    }

    @HK1
    @Nullable
    public final Object Q() {
        if (!this.b1.l()) {
            C5910dr.f(C10217vQ.a(getContext()), null, EnumC10949yQ.Y0, new a(this, null), 1, null);
            return this.b1.A();
        }
        return this.b1.A();
    }

    @HK1
    public final void R(@NotNull Throwable th) {
        C8883py<R> c8883py = this.b1;
        PT1.a aVar = PT1.Y;
        c8883py.q(PT1.b(RT1.a(th)));
    }
}
