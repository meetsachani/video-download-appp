package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC10472wS0
/* renamed from: o.s0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9384s0<T> extends C6812hV0 implements RU0, HM<T>, InterfaceC9974uQ {
    @NotNull
    public final InterfaceC5809dQ Z;

    public AbstractC9384s0(@NotNull InterfaceC5809dQ interfaceC5809dQ, boolean z, boolean z2) {
        super(z2);
        if (z) {
            b1((RU0) interfaceC5809dQ.f(RU0.W));
        }
        this.Z = interfaceC5809dQ.M(this);
    }

    @Override // o.C6812hV0
    @NotNull
    public String A0() {
        return NV.a(this) + " was cancelled";
    }

    public void O1(@Nullable Object obj) {
        s0(obj);
    }

    public final <R> void S1(@NotNull EnumC10949yQ enumC10949yQ, R r, @NotNull VA0<? super R, ? super HM<? super T>, ? extends Object> va0) {
        enumC10949yQ.h(va0, r, this);
    }

    @Override // o.InterfaceC9974uQ
    @NotNull
    public InterfaceC5809dQ a0() {
        return this.Z;
    }

    @Override // o.C6812hV0
    public final void a1(@NotNull Throwable th) {
        C8753pQ.b(this.Z, th);
    }

    @Override // o.HM
    @NotNull
    public final InterfaceC5809dQ getContext() {
        return this.Z;
    }

    @Override // o.C6812hV0, o.RU0
    public boolean h() {
        return super.h();
    }

    @Override // o.C6812hV0
    @NotNull
    public String m1() {
        String g = C7035iQ.g(this.Z);
        if (g == null) {
            return super.m1();
        }
        return '\"' + g + "\":" + super.m1();
    }

    @Override // o.HM
    public final void q(@NotNull Object obj) {
        Object l1 = l1(TH.b(obj));
        if (l1 == C7055iV0.b) {
            return;
        }
        O1(l1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C6812hV0
    public final void u1(@Nullable Object obj) {
        if (obj instanceof QH) {
            QH qh = (QH) obj;
            Q1(qh.a, qh.a());
            return;
        }
        R1(obj);
    }

    public static /* synthetic */ void P1() {
    }

    public void R1(T t) {
    }

    public void Q1(@NotNull Throwable th, boolean z) {
    }
}
