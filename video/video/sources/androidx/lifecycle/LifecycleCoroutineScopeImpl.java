package androidx.lifecycle;

import androidx.lifecycle.f;
import o.AbstractC4225Si2;
import o.C5910dr;
import o.C6314fV0;
import o.C6562gT0;
import o.C7289jT0;
import o.C7458kA2;
import o.C8909q40;
import o.FV;
import o.GZ0;
import o.HM;
import o.InterfaceC5809dQ;
import o.InterfaceC9974uQ;
import o.KZ0;
import o.RT1;
import o.VA0;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends GZ0 implements i {
    public final f X;
    public final InterfaceC5809dQ Y;

    @FV(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4225Si2 implements VA0<InterfaceC9974uQ, HM<? super C7458kA2>, Object> {
        public int Z0;
        public /* synthetic */ Object a1;

        public a(HM<? super a> hm) {
            super(2, hm);
        }

        @Override // o.AbstractC5644cl
        public final Object F(Object obj) {
            C7289jT0.l();
            if (this.Z0 == 0) {
                RT1.n(obj);
                InterfaceC9974uQ interfaceC9974uQ = (InterfaceC9974uQ) this.a1;
                if (LifecycleCoroutineScopeImpl.this.b().b().compareTo(f.b.INITIALIZED) < 0) {
                    C6314fV0.i(interfaceC9974uQ.a0(), null, 1, null);
                } else {
                    LifecycleCoroutineScopeImpl.this.b().a(LifecycleCoroutineScopeImpl.this);
                }
                return C7458kA2.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // o.VA0
        /* renamed from: U */
        public final Object i(InterfaceC9974uQ interfaceC9974uQ, HM<? super C7458kA2> hm) {
            return ((a) t(interfaceC9974uQ, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(hm);
            aVar.a1 = obj;
            return aVar;
        }
    }

    public LifecycleCoroutineScopeImpl(f fVar, InterfaceC5809dQ interfaceC5809dQ) {
        C6562gT0.p(fVar, "lifecycle");
        C6562gT0.p(interfaceC5809dQ, "coroutineContext");
        this.X = fVar;
        this.Y = interfaceC5809dQ;
        if (b().b() == f.b.DESTROYED) {
            C6314fV0.i(a0(), null, 1, null);
        }
    }

    @Override // o.InterfaceC9974uQ
    public InterfaceC5809dQ a0() {
        return this.Y;
    }

    @Override // o.GZ0
    public f b() {
        return this.X;
    }

    public final void f() {
        C5910dr.f(this, C8909q40.e().b0(), null, new a(null), 2, null);
    }

    @Override // androidx.lifecycle.i
    public void i(KZ0 kz0, f.a aVar) {
        C6562gT0.p(kz0, "source");
        C6562gT0.p(aVar, "event");
        if (b().b().compareTo(f.b.DESTROYED) <= 0) {
            b().d(this);
            C6314fV0.i(a0(), null, 1, null);
        }
    }
}
