package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
/* renamed from: o.iA  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6971iA<T> extends AbstractC7455kA<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a1 = AtomicIntegerFieldUpdater.newUpdater(C6971iA.class, "consumed$volatile");
    @NotNull
    public final OO1<T> Y0;
    public final boolean Z0;
    private volatile /* synthetic */ int consumed$volatile;

    public /* synthetic */ C6971iA(OO1 oo1, boolean z, InterfaceC5809dQ interfaceC5809dQ, int i, EnumC7132iq enumC7132iq, int i2, C9516sY c9516sY) {
        this(oo1, z, (i2 & 4) != 0 ? C3897Pa0.X : interfaceC5809dQ, (i2 & 8) != 0 ? -3 : i, (i2 & 16) != 0 ? EnumC7132iq.X : enumC7132iq);
    }

    @Override // o.AbstractC7455kA, o.InterfaceC3882Ov0
    @Nullable
    public Object a(@NotNull InterfaceC4076Qv0<? super T> interfaceC4076Qv0, @NotNull HM<? super C7458kA2> hm) {
        if (this.Y == -3) {
            s();
            Object d = C4661Wv0.d(interfaceC4076Qv0, this.Y0, this.Z0, hm);
            if (d == C7289jT0.l()) {
                return d;
            }
            return C7458kA2.a;
        }
        Object a = super.a(interfaceC4076Qv0, hm);
        if (a == C7289jT0.l()) {
            return a;
        }
        return C7458kA2.a;
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public String e() {
        return "channel=" + this.Y0;
    }

    @Override // o.AbstractC7455kA
    @Nullable
    public Object h(@NotNull AI1<? super T> ai1, @NotNull HM<? super C7458kA2> hm) {
        Object d = C4661Wv0.d(new C10848y02(ai1), this.Y0, this.Z0, hm);
        if (d == C7289jT0.l()) {
            return d;
        }
        return C7458kA2.a;
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public AbstractC7455kA<T> i(@NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        return new C6971iA(this.Y0, this.Z0, interfaceC5809dQ, i, enumC7132iq);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public InterfaceC3882Ov0<T> j() {
        return new C6971iA(this.Y0, this.Z0, null, 0, null, 28, null);
    }

    @Override // o.AbstractC7455kA
    @NotNull
    public OO1<T> o(@NotNull InterfaceC9974uQ interfaceC9974uQ) {
        s();
        if (this.Y == -3) {
            return this.Y0;
        }
        return super.o(interfaceC9974uQ);
    }

    public final /* synthetic */ int q() {
        return this.consumed$volatile;
    }

    public final void s() {
        if (!this.Z0 || a1.getAndSet(this, 1) == 0) {
            return;
        }
        throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once");
    }

    public final /* synthetic */ void t(int i) {
        this.consumed$volatile = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6971iA(@NotNull OO1<? extends T> oo1, boolean z, @NotNull InterfaceC5809dQ interfaceC5809dQ, int i, @NotNull EnumC7132iq enumC7132iq) {
        super(interfaceC5809dQ, i, enumC7132iq);
        this.Y0 = oo1;
        this.Z0 = z;
        this.consumed$volatile = 0;
    }
}
