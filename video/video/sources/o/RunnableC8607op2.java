package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.op2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC8607op2<U, T extends U> extends MY1<T> implements Runnable {
    @InterfaceC7058iW0
    public final long Z0;

    public RunnableC8607op2(long j, @NotNull HM<? super U> hm) {
        super(hm.getContext(), hm);
        this.Z0 = j;
    }

    @Override // o.AbstractC9384s0, o.C6812hV0
    @NotNull
    public String m1() {
        return super.m1() + "(timeMillis=" + this.Z0 + ')';
    }

    @Override // java.lang.Runnable
    public void run() {
        v0(C9342rp2.a(this.Z0, P10.d(getContext()), this));
    }
}
