package o;

import o.InterfaceC10362w02;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.zI1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11162zI1<E> extends C7212jA<E> implements AI1<E> {
    public C11162zI1(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull InterfaceC6728hA<E> interfaceC6728hA) {
        super(interfaceC5809dQ, interfaceC6728hA, true, true);
    }

    @Override // o.AbstractC9384s0
    public void Q1(@NotNull Throwable th, boolean z) {
        if (!T1().W(th) && !z) {
            C8753pQ.b(getContext(), th);
        }
    }

    @Override // o.AbstractC9384s0
    /* renamed from: U1 */
    public void R1(@NotNull C7458kA2 c7458kA2) {
        InterfaceC10362w02.a.a(T1(), null, 1, null);
    }

    @Override // o.AI1
    public /* bridge */ /* synthetic */ InterfaceC10362w02 a() {
        return a();
    }

    @Override // o.AbstractC9384s0, o.C6812hV0, o.RU0
    public boolean h() {
        return super.h();
    }
}
