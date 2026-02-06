package o;

import org.jetbrains.annotations.NotNull;

/* renamed from: o.l42  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC7677l42 {
    @NotNull
    public static final a a = a.a;

    /* renamed from: o.l42$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        @NotNull
        public static final InterfaceC7677l42 b = new C6339fc2();
        @NotNull
        public static final InterfaceC7677l42 c = new C6594gc2();

        public static /* synthetic */ InterfaceC7677l42 b(a aVar, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            if ((i & 2) != 0) {
                j2 = Long.MAX_VALUE;
            }
            return aVar.a(j, j2);
        }

        @NotNull
        public final InterfaceC7677l42 a(long j, long j2) {
            return new C6837hc2(j, j2);
        }

        @NotNull
        public final InterfaceC7677l42 c() {
            return b;
        }

        @NotNull
        public final InterfaceC7677l42 d() {
            return c;
        }
    }

    @NotNull
    InterfaceC3882Ov0<EnumC7191j42> a(@NotNull InterfaceC9041qc2<Integer> interfaceC9041qc2);
}
