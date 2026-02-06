package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC9150r20(level = EnumC9879u20.Y, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@InterfaceC3681Mt1
/* loaded from: classes3.dex */
public final class YJ<E> implements InterfaceC10800xp<E> {
    @NotNull
    public final C11043yp<E> X;

    public YJ(C11043yp<E> c11043yp) {
        this.X = c11043yp;
    }

    @Override // o.InterfaceC10362w02
    @NotNull
    public Object B(E e) {
        return this.X.B(e);
    }

    @Override // o.InterfaceC10362w02
    public boolean W(@Nullable Throwable th) {
        return this.X.W(th);
    }

    public final E b() {
        return this.X.E2();
    }

    @Override // o.InterfaceC10362w02
    public void c(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
        this.X.c(ha0);
    }

    @Override // o.InterfaceC10800xp
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Binary compatibility only")
    public /* synthetic */ boolean d(Throwable th) {
        return this.X.d(th);
    }

    @Override // o.InterfaceC10362w02
    @Nullable
    public Object d0(E e, @NotNull HM<? super C7458kA2> hm) {
        return this.X.d0(e, hm);
    }

    @Override // o.InterfaceC10362w02
    @NotNull
    public InterfaceC5708d02<E, InterfaceC10362w02<E>> e() {
        return this.X.e();
    }

    @Nullable
    public final E f() {
        return this.X.G2();
    }

    @Override // o.InterfaceC10362w02
    public boolean h0() {
        return this.X.h0();
    }

    @Override // o.InterfaceC10800xp
    public void i(@Nullable CancellationException cancellationException) {
        this.X.i(cancellationException);
    }

    @Override // o.InterfaceC10362w02
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'trySend' method", replaceWith = @IR1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.X.offer(e);
    }

    @Override // o.InterfaceC10800xp
    @NotNull
    public OO1<E> z() {
        return this.X.z();
    }

    public YJ() {
        this(new C11043yp(-1));
    }

    public YJ(E e) {
        this();
        B(e);
    }
}
