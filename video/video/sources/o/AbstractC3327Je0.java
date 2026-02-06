package o;

import o.S9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
/* renamed from: o.Je0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3327Je0 extends AbstractC7762lQ {
    public boolean Y0;
    public long Z;
    @Nullable
    public C7085ie<AbstractC7918m40<?>> Z0;

    public static /* synthetic */ void g0(AbstractC3327Je0 abstractC3327Je0, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            abstractC3327Je0.b0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
    }

    public static /* synthetic */ void n0(AbstractC3327Je0 abstractC3327Je0, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            abstractC3327Je0.m0(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    public final boolean A0() {
        AbstractC7918m40<?> K;
        C7085ie<AbstractC7918m40<?>> c7085ie = this.Z0;
        if (c7085ie == null || (K = c7085ie.K()) == null) {
            return false;
        }
        K.run();
        return true;
    }

    public boolean B0() {
        return false;
    }

    @Override // o.AbstractC7762lQ
    @NotNull
    public final AbstractC7762lQ W(int i, @Nullable String str) {
        QZ0.a(i);
        return QZ0.b(this, str);
    }

    public final void b0(boolean z) {
        long j0 = this.Z - j0(z);
        this.Z = j0;
        if (j0 <= 0 && this.Y0) {
            shutdown();
        }
    }

    public final boolean h() {
        if (this.Z > 0) {
            return true;
        }
        return false;
    }

    public final long j0(boolean z) {
        if (z) {
            return S9.c.M;
        }
        return 1L;
    }

    public final void k0(@NotNull AbstractC7918m40<?> abstractC7918m40) {
        C7085ie<AbstractC7918m40<?>> c7085ie = this.Z0;
        if (c7085ie == null) {
            c7085ie = new C7085ie<>();
            this.Z0 = c7085ie;
        }
        c7085ie.addLast(abstractC7918m40);
    }

    public long l0() {
        C7085ie<AbstractC7918m40<?>> c7085ie = this.Z0;
        if (c7085ie == null || c7085ie.isEmpty()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public final void m0(boolean z) {
        this.Z += j0(z);
        if (!z) {
            this.Y0 = true;
        }
    }

    public boolean p0() {
        return r0();
    }

    public final boolean q0() {
        if (this.Z >= j0(true)) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        C7085ie<AbstractC7918m40<?>> c7085ie = this.Z0;
        if (c7085ie != null) {
            return c7085ie.isEmpty();
        }
        return true;
    }

    public long y0() {
        if (!A0()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    public void shutdown() {
    }
}
