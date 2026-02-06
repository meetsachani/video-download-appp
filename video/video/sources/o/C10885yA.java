package o;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n1#2:3117\n*E\n"})
/* renamed from: o.yA  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10885yA<E> extends QZ1<C10885yA<E>> {
    @Nullable
    public final C10804xq<E> Z0;
    public final /* synthetic */ AtomicReferenceArray a1;

    public C10885yA(long j, @Nullable C10885yA<E> c10885yA, @Nullable C10804xq<E> c10804xq, int i) {
        super(j, c10885yA, i);
        this.Z0 = c10804xq;
        this.a1 = new AtomicReferenceArray(C11047yq.b * 2);
    }

    public final boolean D(int i, @Nullable Object obj, @Nullable Object obj2) {
        return C3626Mf2.a(H(), (i * 2) + 1, obj, obj2);
    }

    public final void E(int i) {
        M(i, null);
    }

    @Nullable
    public final Object F(int i, @Nullable Object obj) {
        return H().getAndSet((i * 2) + 1, obj);
    }

    @NotNull
    public final C10804xq<E> G() {
        C10804xq<E> c10804xq = this.Z0;
        C6562gT0.m(c10804xq);
        return c10804xq;
    }

    public final /* synthetic */ AtomicReferenceArray H() {
        return this.a1;
    }

    public final E I(int i) {
        return (E) H().get(i * 2);
    }

    @Nullable
    public final Object J(int i) {
        return H().get((i * 2) + 1);
    }

    public final void K(int i, boolean z) {
        if (z) {
            G().z2((this.Z * C11047yq.b) + i);
        }
        A();
    }

    public final E L(int i) {
        E I = I(i);
        E(i);
        return I;
    }

    public final void M(int i, Object obj) {
        H().set(i * 2, obj);
    }

    public final void N(int i, @Nullable Object obj) {
        H().set((i * 2) + 1, obj);
    }

    public final void O(int i, E e) {
        M(i, e);
    }

    @Override // o.QZ1
    public int y() {
        return C11047yq.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
        E(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
        if (r0 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
        r4 = G().Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
        if (r4 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
        o.C8630ov1.a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    @Override // o.QZ1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(int i, @Nullable Throwable th, @NotNull InterfaceC5809dQ interfaceC5809dQ) {
        boolean z;
        HA0<E, C7458kA2> ha0;
        C7592kj2 c7592kj2;
        C7592kj2 c7592kj22;
        C7592kj2 c7592kj23;
        C7592kj2 c7592kj24;
        C7592kj2 c7592kj25;
        int i2 = C11047yq.b;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i -= i2;
        }
        E I = I(i);
        while (true) {
            Object J = J(i);
            if (!(J instanceof InterfaceC9220rJ2) && !(J instanceof C9463sJ2)) {
                c7592kj2 = C11047yq.l;
                if (J == c7592kj2) {
                    break;
                }
                c7592kj22 = C11047yq.m;
                if (J == c7592kj22) {
                    break;
                }
                c7592kj23 = C11047yq.i;
                if (J != c7592kj23) {
                    c7592kj24 = C11047yq.h;
                    if (J != c7592kj24) {
                        c7592kj25 = C11047yq.k;
                        if (J != c7592kj25 && J != C11047yq.f && J != C11047yq.z()) {
                            throw new IllegalStateException(("unexpected state: " + J).toString());
                        }
                        return;
                    }
                } else {
                    continue;
                }
            } else {
                if (D(i, J, z ? C11047yq.l : C11047yq.m)) {
                    E(i);
                    K(i, !z);
                    if (z && (ha0 = G().Y) != null) {
                        C8630ov1.a(ha0, I, interfaceC5809dQ);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
