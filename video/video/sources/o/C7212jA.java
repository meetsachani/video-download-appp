package o;

import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,39:1\n732#2,3:40\n732#2,3:43\n732#2,3:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n17#1:40,3\n23#1:43,3\n30#1:46,3\n*E\n"})
/* renamed from: o.jA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7212jA<E> extends AbstractC9384s0<C7458kA2> implements InterfaceC6728hA<E> {
    @NotNull
    public final InterfaceC6728hA<E> Y0;

    public C7212jA(@NotNull InterfaceC5809dQ interfaceC5809dQ, @NotNull InterfaceC6728hA<E> interfaceC6728hA, boolean z, boolean z2) {
        super(interfaceC5809dQ, z, z2);
        this.Y0 = interfaceC6728hA;
    }

    @NotNull
    public Object B(E e) {
        return this.Y0.B(e);
    }

    @Override // o.OO1
    @Nullable
    public Object D(@NotNull HM<? super C10642xA<? extends E>> hm) {
        Object D = this.Y0.D(hm);
        C7289jT0.l();
        return D;
    }

    @Override // o.OO1
    @NotNull
    public InterfaceC5223b02<E> J() {
        return this.Y0.J();
    }

    @Override // o.OO1
    @NotNull
    public InterfaceC5223b02<C10642xA<E>> L() {
        return this.Y0.L();
    }

    @Override // o.OO1
    @NotNull
    public InterfaceC5223b02<E> R() {
        return this.Y0.R();
    }

    @NotNull
    public final InterfaceC6728hA<E> T1() {
        return this.Y0;
    }

    @Override // o.OO1
    @NotNull
    public Object U() {
        return this.Y0.U();
    }

    @Override // o.OO1
    @R61
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @IR1(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public Object V(@NotNull HM<? super E> hm) {
        return this.Y0.V(hm);
    }

    public boolean W(@Nullable Throwable th) {
        return this.Y0.W(th);
    }

    @Override // o.OO1
    public boolean b() {
        return this.Y0.b();
    }

    @Override // o.InterfaceC10362w02
    public void c(@NotNull HA0<? super Throwable, C7458kA2> ha0) {
        this.Y0.c(ha0);
    }

    @Override // o.C6812hV0, o.RU0
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        x0(new SU0(A0(), null, this));
    }

    @Override // o.C6812hV0, o.RU0, o.InterfaceC10800xp
    @InterfaceC9150r20(level = EnumC9879u20.Z, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean d(Throwable th) {
        x0(new SU0(A0(), null, this));
        return true;
    }

    @Nullable
    public Object d0(E e, @NotNull HM<? super C7458kA2> hm) {
        return this.Y0.d0(e, hm);
    }

    @NotNull
    public InterfaceC5708d02<E, InterfaceC10362w02<E>> e() {
        return this.Y0.e();
    }

    @Override // o.OO1
    @Nullable
    public Object g0(@NotNull HM<? super E> hm) {
        return this.Y0.g0(hm);
    }

    @Override // o.InterfaceC10362w02
    public boolean h0() {
        return this.Y0.h0();
    }

    @Override // o.C6812hV0, o.RU0, o.InterfaceC10800xp
    public final void i(@Nullable CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new SU0(A0(), null, this);
        }
        x0(cancellationException);
    }

    @Override // o.OO1
    public boolean isEmpty() {
        return this.Y0.isEmpty();
    }

    @Override // o.OO1
    @NotNull
    public InterfaceC9181rA<E> iterator() {
        return this.Y0.iterator();
    }

    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'trySend' method", replaceWith = @IR1(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return this.Y0.offer(e);
    }

    @Override // o.OO1
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @IR1(expression = "tryReceive().getOrNull()", imports = {}))
    @Nullable
    public E poll() {
        return this.Y0.poll();
    }

    @Override // o.C6812hV0
    public void x0(@NotNull Throwable th) {
        CancellationException G1 = C6812hV0.G1(this, th, null, 1, null);
        this.Y0.i(G1);
        v0(G1);
    }

    @NotNull
    public final InterfaceC6728hA<E> a() {
        return this;
    }
}
