package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.lW1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7786lW1 implements HM<C7458kA2> {
    @Nullable
    public PT1<C7458kA2> X;

    public final void a() {
        synchronized (this) {
            while (true) {
                try {
                    PT1<C7458kA2> pt1 = this.X;
                    if (pt1 == null) {
                        C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } else {
                        RT1.n(pt1.l());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Nullable
    public final PT1<C7458kA2> b() {
        return this.X;
    }

    public final void c(@Nullable PT1<C7458kA2> pt1) {
        this.X = pt1;
    }

    @Override // o.HM
    @NotNull
    public InterfaceC5809dQ getContext() {
        return C3897Pa0.X;
    }

    @Override // o.HM
    public void q(@NotNull Object obj) {
        synchronized (this) {
            this.X = PT1.a(obj);
            C6562gT0.n(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }
}
