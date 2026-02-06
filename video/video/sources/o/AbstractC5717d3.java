package o;

import java.util.Arrays;
import o.AbstractC6202f3;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nAbstractSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,130:1\n27#2:131\n27#2:133\n27#2:136\n16#3:132\n16#3:134\n16#3:137\n1#4:135\n13346#5,2:138\n*S KotlinDebug\n*F\n+ 1 AbstractSharedFlow.kt\nkotlinx/coroutines/flow/internal/AbstractSharedFlow\n*L\n27#1:131\n42#1:133\n73#1:136\n27#1:132\n42#1:134\n73#1:137\n92#1:138,2\n*E\n"})
/* renamed from: o.d3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5717d3<S extends AbstractC6202f3<?>> {
    @Nullable
    public S[] X;
    public int Y;
    @Nullable
    public C3337Jg2 Y0;
    public int Z;

    public static final /* synthetic */ int e(AbstractC5717d3 abstractC5717d3) {
        return abstractC5717d3.Y;
    }

    public static final /* synthetic */ AbstractC6202f3[] g(AbstractC5717d3 abstractC5717d3) {
        return abstractC5717d3.X;
    }

    @NotNull
    public final S h() {
        S s;
        C3337Jg2 c3337Jg2;
        synchronized (this) {
            try {
                S[] sArr = this.X;
                if (sArr == null) {
                    sArr = j(2);
                    this.X = sArr;
                } else if (this.Y >= sArr.length) {
                    Object[] copyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    C6562gT0.o(copyOf, "copyOf(...)");
                    this.X = (S[]) ((AbstractC6202f3[]) copyOf);
                    sArr = (S[]) ((AbstractC6202f3[]) copyOf);
                }
                int i = this.Z;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = i();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                    C6562gT0.n(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!s.a(this));
                this.Z = i;
                this.Y++;
                c3337Jg2 = this.Y0;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c3337Jg2 != null) {
            c3337Jg2.g0(1);
        }
        return s;
    }

    @NotNull
    public abstract S i();

    @NotNull
    public abstract S[] j(int i);

    public final void k(@NotNull HA0<? super S, C7458kA2> ha0) {
        AbstractC6202f3[] abstractC6202f3Arr;
        if (this.Y != 0 && (abstractC6202f3Arr = this.X) != null) {
            for (AbstractC6202f3 abstractC6202f3 : abstractC6202f3Arr) {
                if (abstractC6202f3 != null) {
                    ha0.invoke(abstractC6202f3);
                }
            }
        }
    }

    public final void l(@NotNull S s) {
        C3337Jg2 c3337Jg2;
        int i;
        HM<C7458kA2>[] b;
        synchronized (this) {
            try {
                int i2 = this.Y - 1;
                this.Y = i2;
                c3337Jg2 = this.Y0;
                if (i2 == 0) {
                    this.Z = 0;
                }
                C6562gT0.n(s, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b = s.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (HM<C7458kA2> hm : b) {
            if (hm != null) {
                PT1.a aVar = PT1.Y;
                hm.q(PT1.b(C7458kA2.a));
            }
        }
        if (c3337Jg2 != null) {
            c3337Jg2.g0(-1);
        }
    }

    @NotNull
    public final InterfaceC9041qc2<Integer> m() {
        C3337Jg2 c3337Jg2;
        synchronized (this) {
            c3337Jg2 = this.Y0;
            if (c3337Jg2 == null) {
                c3337Jg2 = new C3337Jg2(this.Y);
                this.Y0 = c3337Jg2;
            }
        }
        return c3337Jg2;
    }

    public final int o() {
        return this.Y;
    }

    @Nullable
    public final S[] q() {
        return this.X;
    }
}
