package o;

import java.util.concurrent.CancellationException;
import o.RU0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Wq1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4644Wq1 extends AbstractC9627t0 implements RU0 {
    @NotNull
    public static final C4644Wq1 Y = new C4644Wq1();
    @NotNull
    public static final String Z = "NonCancellable can be used only as an argument for 'withContext', direct usages of its API are prohibited";

    public C4644Wq1() {
        super(RU0.W);
    }

    @Override // o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @NotNull
    public RU0 A(@NotNull RU0 ru0) {
        return RU0.a.j(this, ru0);
    }

    @Override // o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    @NotNull
    public ZB O(@NotNull InterfaceC5268bC interfaceC5268bC) {
        return C4741Xq1.X;
    }

    @Override // o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    @NotNull
    public B40 Q(boolean z, boolean z2, @NotNull HA0<? super Throwable, C7458kA2> ha0) {
        return C4741Xq1.X;
    }

    @Override // o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    @Nullable
    public Object T(@NotNull HM<? super C7458kA2> hm) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        i(null);
    }

    @Override // o.RU0, o.InterfaceC10800xp
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean d(Throwable th) {
        return false;
    }

    @Override // o.RU0
    @NotNull
    public ZZ1 e0() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // o.RU0
    @Nullable
    public RU0 getParent() {
        return null;
    }

    @Override // o.RU0
    public boolean h() {
        return true;
    }

    @Override // o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    @NotNull
    public B40 i0(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
        return C4741Xq1.X;
    }

    @Override // o.RU0
    public boolean isCancelled() {
        return false;
    }

    @Override // o.RU0
    public boolean l() {
        return false;
    }

    @Override // o.RU0
    @NotNull
    public B02<RU0> r() {
        return U02.l();
    }

    @Override // o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    public boolean start() {
        return false;
    }

    @NotNull
    public String toString() {
        return "NonCancellable";
    }

    @Override // o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    @NotNull
    public CancellationException u() {
        throw new IllegalStateException("This job is always active");
    }

    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    public static /* synthetic */ void I() {
    }

    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    public static /* synthetic */ void R() {
    }

    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    public static /* synthetic */ void U() {
    }

    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    public static /* synthetic */ void V() {
    }

    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    public static /* synthetic */ void W() {
    }

    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    public static /* synthetic */ void Z() {
    }

    @Override // o.RU0, o.InterfaceC10800xp
    @InterfaceC9150r20(level = EnumC9879u20.X, message = Z)
    public void i(@Nullable CancellationException cancellationException) {
    }
}
