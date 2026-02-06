package o;

import java.util.List;
import o.InterfaceC7583kh1;

@Deprecated
/* renamed from: o.hi0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC6859hi0 extends InterfaceC11054yr2 {

    /* renamed from: o.hi0$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final String d = "ETSDefinition";
        public final C9593sr2 a;
        public final int[] b;
        public final int c;

        public a(C9593sr2 c9593sr2, int... iArr) {
            this(c9593sr2, iArr, 0);
        }

        public a(C9593sr2 c9593sr2, int[] iArr, int i) {
            if (iArr.length == 0) {
                I31.e(d, "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.a = c9593sr2;
            this.b = iArr;
            this.c = i;
        }
    }

    /* renamed from: o.hi0$b */
    /* loaded from: classes2.dex */
    public interface b {
        InterfaceC6859hi0[] a(a[] aVarArr, InterfaceC3643Mk interfaceC3643Mk, InterfaceC7583kh1.b bVar, AbstractC7373jp2 abstractC7373jp2);
    }

    void b();

    default long c() {
        return Long.MIN_VALUE;
    }

    boolean d(int i, long j);

    default boolean e(long j, AbstractC6238fC abstractC6238fC, List<? extends AbstractC2533Be1> list) {
        return false;
    }

    int f();

    boolean h(int i, long j);

    void i(float f);

    @InterfaceC11300zs1
    Object j();

    void l(long j, long j2, long j3, List<? extends AbstractC2533Be1> list, InterfaceC2631Ce1[] interfaceC2631Ce1Arr);

    void q();

    int r(long j, List<? extends AbstractC2533Be1> list);

    int s();

    C10833xx0 t();

    int u();

    default void k() {
    }

    default void v() {
    }

    default void p(boolean z) {
    }
}
