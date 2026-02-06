package o;

import java.util.concurrent.CancellationException;
import o.InterfaceC10362w02;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,124:1\n732#2,3:125\n732#2,3:128\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n*L\n73#1:125,3\n79#1:128,3\n*E\n"})
/* renamed from: o.Ap  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2477Ap<E> extends AbstractC9384s0<C7458kA2> implements AI1<E>, InterfaceC10800xp<E> {
    @NotNull
    public final InterfaceC10800xp<E> Y0;

    public C2477Ap(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull InterfaceC10800xp<E> interfaceC10800xp, boolean z) {
        super(interfaceC5809dQ, false, z);
        this.Y0 = interfaceC10800xp;
        b1((RU0) interfaceC5809dQ.f(RU0.W));
    }

    @Override // o.InterfaceC10362w02
    @NotNull
    public Object B(E e) {
        return this.Y0.B(e);
    }

    @Override // o.AbstractC9384s0
    public void Q1(@NotNull Throwable th, boolean z) {
        if (!this.Y0.W(th) && !z) {
            C8753pQ.b(getContext(), th);
        }
    }

    @NotNull
    public final InterfaceC10800xp<E> T1() {
        return this.Y0;
    }

    @Override // o.AbstractC9384s0
    /* renamed from: U1 */
    public void R1(@NotNull C7458kA2 c7458kA2) {
        InterfaceC10362w02.a.a(this.Y0, null, 1, null);
    }

    @Override // o.InterfaceC10362w02
    public boolean W(@Nullable Throwable th) {
        boolean W = this.Y0.W(th);
        start();
        return W;
    }

    @Override // o.InterfaceC10362w02
    public void c(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
        this.Y0.c(ha0);
    }

    @Override // o.C6812hV0, o.RU0, o.InterfaceC10800xp
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean d(Throwable th) {
        if (th == null) {
            th = new SU0(A0(), null, this);
        }
        x0(th);
        return true;
    }

    @Override // o.InterfaceC10362w02
    @Nullable
    public Object d0(E e, @NotNull HM<? super C7458kA2> hm) {
        return this.Y0.d0(e, hm);
    }

    @Override // o.InterfaceC10362w02
    @NotNull
    public InterfaceC5708d02<E, InterfaceC10362w02<E>> e() {
        return this.Y0.e();
    }

    @Override // o.AbstractC9384s0, o.C6812hV0, o.RU0
    public boolean h() {
        return super.h();
    }

    @Override // o.InterfaceC10362w02
    public boolean h0() {
        return this.Y0.h0();
    }

    @Override // o.C6812hV0, o.RU0, o.InterfaceC10800xp
    public final void i(@Nullable CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new SU0(A0(), null, this);
        }
        x0(cancellationException);
    }

    @Override // o.InterfaceC10362w02
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'trySend' method", replaceWith = @IR1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.Y0.offer(e);
    }

    @Override // o.C6812hV0
    public void x0(@NotNull Throwable th) {
        CancellationException G1 = C6812hV0.G1(this, th, null, 1, null);
        this.Y0.i(G1);
        v0(G1);
    }

    @Override // o.InterfaceC10800xp
    @NotNull
    public OO1<E> z() {
        return this.Y0.z();
    }

    @Override // o.AI1
    @NotNull
    public InterfaceC10362w02<E> a() {
        return this;
    }
}
