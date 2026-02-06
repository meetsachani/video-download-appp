package o;

import o.C10642xA;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,90:1\n562#2,2:91\n529#2,2:93\n529#2,2:95\n562#2,2:97\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n33#1:91,2\n45#1:93,2\n77#1:95,2\n80#1:97,2\n*E\n"})
/* loaded from: classes3.dex */
public class ZJ<E> extends C10804xq<E> {
    public final int h1;
    @NotNull
    public final EnumC7132iq i1;

    public /* synthetic */ ZJ(int i, EnumC7132iq enumC7132iq, HA0 ha0, int i2, C9516sY c9516sY) {
        this(i, enumC7132iq, (i2 & 4) != 0 ? null : ha0);
    }

    public static /* synthetic */ <E> Object A2(ZJ<E> zj, E e, HM<? super C7458kA2> hm) {
        Iz2 c;
        Object D2 = zj.D2(e, true);
        if (D2 instanceof C10642xA.a) {
            C10642xA.f(D2);
            HA0<E, C7458kA2> ha0 = zj.Y;
            if (ha0 != null && (c = C8630ov1.c(ha0, e, null, 2, null)) != null) {
                C3917Pf0.a(c, zj.M0());
                throw c;
            }
            throw zj.M0();
        }
        return C7458kA2.a;
    }

    public static /* synthetic */ <E> Object B2(ZJ<E> zj, E e, HM<? super Boolean> hm) {
        Object D2 = zj.D2(e, true);
        if (!(D2 instanceof C10642xA.c)) {
            C7458kA2 c7458kA2 = (C7458kA2) D2;
            return C10557wp.a(true);
        }
        return C10557wp.a(false);
    }

    @Override // o.C10804xq, o.InterfaceC10362w02
    @NotNull
    public Object B(E e) {
        return D2(e, false);
    }

    public final Object C2(E e, boolean z) {
        HA0<E, C7458kA2> ha0;
        Iz2 c;
        Object B = super.B(e);
        if (!C10642xA.m(B) && !C10642xA.k(B)) {
            if (z && (ha0 = this.Y) != null && (c = C8630ov1.c(ha0, e, null, 2, null)) != null) {
                throw c;
            }
            return C10642xA.b.c(C7458kA2.a);
        }
        return B;
    }

    public final Object D2(E e, boolean z) {
        if (this.i1 == EnumC7132iq.Z) {
            return C2(e, z);
        }
        return p2(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.C10804xq
    public void P1(@NotNull InterfaceC6691h02<?> interfaceC6691h02, @Nullable Object obj) {
        Object B = B(obj);
        if (!(B instanceof C10642xA.c)) {
            C7458kA2 c7458kA2 = (C7458kA2) B;
            interfaceC6691h02.e(C7458kA2.a);
        } else if (B instanceof C10642xA.a) {
            C10642xA.f(B);
            interfaceC6691h02.e(C11047yq.z());
        } else {
            throw new IllegalStateException("unreachable");
        }
    }

    @Override // o.C10804xq
    @Nullable
    public Object V1(E e, @NotNull HM<? super Boolean> hm) {
        return B2(this, e, hm);
    }

    @Override // o.C10804xq, o.InterfaceC10362w02
    @Nullable
    public Object d0(E e, @NotNull HM<? super C7458kA2> hm) {
        return A2(this, e, hm);
    }

    @Override // o.C10804xq
    public boolean e1() {
        if (this.i1 == EnumC7132iq.Y) {
            return true;
        }
        return false;
    }

    @Override // o.C10804xq
    public boolean l2() {
        return false;
    }

    public ZJ(int i, @NotNull EnumC7132iq enumC7132iq, @Nullable HA0<? super E, C7458kA2> ha0) {
        super(i, ha0);
        this.h1 = i;
        this.i1 = enumC7132iq;
        if (enumC7132iq == EnumC7132iq.X) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C6551gQ1.d(C10804xq.class).V() + " instead").toString());
        } else if (i >= 1) {
        } else {
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
        }
    }
}
