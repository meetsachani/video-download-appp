package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.ArrayList;
import java.util.List;
import o.C4972Zy1;
import o.C8859ps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "-Path")
@InterfaceC8303na2({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n59#1,22:407\n209#1:433\n209#1:434\n1549#2:429\n1620#2,3:430\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n53#1:407,22\n199#1:433\n204#1:434\n53#1:429\n53#1:430,3\n*E\n"})
/* renamed from: o.l */
/* loaded from: classes4.dex */
public final class C7657l {
    @NotNull
    public static final C8859ps a;
    @NotNull
    public static final C8859ps b;
    @NotNull
    public static final C8859ps c;
    @NotNull
    public static final C8859ps d;
    @NotNull
    public static final C8859ps e;

    static {
        C8859ps.a aVar = C8859ps.Y0;
        a = aVar.l(RemoteSettings.i);
        b = aVar.l(C11298zs.h);
        c = aVar.l("/\\");
        d = aVar.l(UE.h);
        e = aVar.l("..");
    }

    @NotNull
    public static final List<C8859ps> A(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        ArrayList arrayList = new ArrayList();
        int M = M(c4972Zy1);
        if (M == -1) {
            M = 0;
        } else if (M < c4972Zy1.n().g0() && c4972Zy1.n().v(M) == 92) {
            M++;
        }
        int g0 = c4972Zy1.n().g0();
        int i = M;
        while (M < g0) {
            if (c4972Zy1.n().v(M) == 47 || c4972Zy1.n().v(M) == 92) {
                arrayList.add(c4972Zy1.n().n0(i, M));
                i = M + 1;
            }
            M++;
        }
        if (i < c4972Zy1.n().g0()) {
            arrayList.add(c4972Zy1.n().n0(i, c4972Zy1.n().g0()));
        }
        return arrayList;
    }

    @NotNull
    public static final C4972Zy1 B(@NotNull String str, boolean z) {
        C6562gT0.p(str, "<this>");
        return O(new C5422bq().K1(str), z);
    }

    @NotNull
    public static final String C(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        return c4972Zy1.n().s0();
    }

    @Nullable
    public static final Character D(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        if (C8859ps.J(c4972Zy1.n(), a, 0, 2, null) != -1 || c4972Zy1.n().g0() < 2 || c4972Zy1.n().v(1) != 58) {
            return null;
        }
        char v = (char) c4972Zy1.n().v(0);
        if (('a' > v || v >= '{') && ('A' > v || v >= '[')) {
            return null;
        }
        return Character.valueOf(v);
    }

    public static final int I(C4972Zy1 c4972Zy1) {
        int R = C8859ps.R(c4972Zy1.n(), a, 0, 2, null);
        if (R != -1) {
            return R;
        }
        return C8859ps.R(c4972Zy1.n(), b, 0, 2, null);
    }

    public static final C8859ps K(C4972Zy1 c4972Zy1) {
        C8859ps n = c4972Zy1.n();
        C8859ps c8859ps = a;
        if (C8859ps.J(n, c8859ps, 0, 2, null) != -1) {
            return c8859ps;
        }
        C8859ps n2 = c4972Zy1.n();
        C8859ps c8859ps2 = b;
        if (C8859ps.J(n2, c8859ps2, 0, 2, null) == -1) {
            return null;
        }
        return c8859ps2;
    }

    public static final boolean L(C4972Zy1 c4972Zy1) {
        if (!c4972Zy1.n().t(e) || (c4972Zy1.n().g0() != 2 && !c4972Zy1.n().X(c4972Zy1.n().g0() - 3, a, 0, 1) && !c4972Zy1.n().X(c4972Zy1.n().g0() - 3, b, 0, 1))) {
            return false;
        }
        return true;
    }

    public static final int M(C4972Zy1 c4972Zy1) {
        if (c4972Zy1.n().g0() == 0) {
            return -1;
        }
        if (c4972Zy1.n().v(0) == 47) {
            return 1;
        }
        if (c4972Zy1.n().v(0) == 92) {
            if (c4972Zy1.n().g0() <= 2 || c4972Zy1.n().v(1) != 92) {
                return 1;
            }
            int G = c4972Zy1.n().G(b, 2);
            if (G == -1) {
                return c4972Zy1.n().g0();
            }
            return G;
        }
        if (c4972Zy1.n().g0() > 2 && c4972Zy1.n().v(1) == 58 && c4972Zy1.n().v(2) == 92) {
            char v = (char) c4972Zy1.n().v(0);
            if ('a' > v || v >= '{') {
                if ('A' <= v && v < '[') {
                    return 3;
                }
            } else {
                return 3;
            }
        }
        return -1;
    }

    public static final boolean N(C5422bq c5422bq, C8859ps c8859ps) {
        if (!C6562gT0.g(c8859ps, b) || c5422bq.size() < 2 || c5422bq.x(1L) != 58) {
            return false;
        }
        char x = (char) c5422bq.x(0L);
        if ('a' > x || x >= '{') {
            if ('A' > x || x >= '[') {
                return false;
            }
            return true;
        }
        return true;
    }

    @NotNull
    public static final C4972Zy1 O(@NotNull C5422bq c5422bq, boolean z) {
        C8859ps c8859ps;
        boolean z2;
        boolean z3;
        C8859ps n3;
        C6562gT0.p(c5422bq, "<this>");
        C5422bq c5422bq2 = new C5422bq();
        C8859ps c8859ps2 = null;
        int i = 0;
        while (true) {
            if (!c5422bq.a1(0L, a)) {
                c8859ps = b;
                if (!c5422bq.a1(0L, c8859ps)) {
                    break;
                }
            }
            byte readByte = c5422bq.readByte();
            if (c8859ps2 == null) {
                c8859ps2 = P(readByte);
            }
            i++;
        }
        if (i >= 2 && C6562gT0.g(c8859ps2, c8859ps)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C6562gT0.m(c8859ps2);
            c5422bq2.K4(c8859ps2);
            c5422bq2.K4(c8859ps2);
        } else if (i > 0) {
            C6562gT0.m(c8859ps2);
            c5422bq2.K4(c8859ps2);
        } else {
            long P4 = c5422bq.P4(c);
            if (c8859ps2 == null) {
                if (P4 == -1) {
                    c8859ps2 = Q(C4972Zy1.Z);
                } else {
                    c8859ps2 = P(c5422bq.x(P4));
                }
            }
            if (N(c5422bq, c8859ps2)) {
                if (P4 == 2) {
                    c5422bq2.write(c5422bq, 3L);
                } else {
                    c5422bq2.write(c5422bq, 2L);
                }
            }
        }
        if (c5422bq2.size() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (!c5422bq.M3()) {
            long P42 = c5422bq.P4(c);
            if (P42 == -1) {
                n3 = c5422bq.G4();
            } else {
                n3 = c5422bq.n3(P42);
                c5422bq.readByte();
            }
            C8859ps c8859ps3 = e;
            if (C6562gT0.g(n3, c8859ps3)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (z && (z3 || (!arrayList.isEmpty() && !C6562gT0.g(C10662xF.s3(arrayList), c8859ps3)))) {
                        if (!z2 || arrayList.size() != 1) {
                            C9444sF.P0(arrayList);
                        }
                    } else {
                        arrayList.add(n3);
                    }
                }
            } else if (!C6562gT0.g(n3, d) && !C6562gT0.g(n3, C8859ps.Z0)) {
                arrayList.add(n3);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                c5422bq2.K4(c8859ps2);
            }
            c5422bq2.K4((C8859ps) arrayList.get(i2));
        }
        if (c5422bq2.size() == 0) {
            c5422bq2.K4(d);
        }
        return new C4972Zy1(c5422bq2.G4());
    }

    public static final C8859ps P(byte b2) {
        if (b2 != 47) {
            if (b2 == 92) {
                return b;
            }
            throw new IllegalArgumentException("not a directory separator: " + ((int) b2));
        }
        return a;
    }

    public static final C8859ps Q(String str) {
        if (C6562gT0.g(str, RemoteSettings.i)) {
            return a;
        }
        if (C6562gT0.g(str, C11298zs.h)) {
            return b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    public static final int j(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        C6562gT0.p(c4972Zy1, "<this>");
        C6562gT0.p(c4972Zy12, "other");
        return c4972Zy1.n().compareTo(c4972Zy12.n());
    }

    public static final boolean k(@NotNull C4972Zy1 c4972Zy1, @Nullable Object obj) {
        C6562gT0.p(c4972Zy1, "<this>");
        if ((obj instanceof C4972Zy1) && C6562gT0.g(((C4972Zy1) obj).n(), c4972Zy1.n())) {
            return true;
        }
        return false;
    }

    public static final int l(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        return c4972Zy1.n().hashCode();
    }

    public static final boolean m(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        if (M(c4972Zy1) != -1) {
            return true;
        }
        return false;
    }

    public static final boolean n(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        if (M(c4972Zy1) == -1) {
            return true;
        }
        return false;
    }

    public static final boolean o(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        if (M(c4972Zy1) == c4972Zy1.n().g0()) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final String p(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        return c4972Zy1.u().s0();
    }

    @NotNull
    public static final C8859ps q(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        int I = I(c4972Zy1);
        if (I != -1) {
            return C8859ps.o0(c4972Zy1.n(), I + 1, 0, 2, null);
        }
        if (c4972Zy1.I() != null && c4972Zy1.n().g0() == 2) {
            return C8859ps.Z0;
        }
        return c4972Zy1.n();
    }

    @NotNull
    public static final C4972Zy1 r(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        return C4972Zy1.Y.d(c4972Zy1.toString(), true);
    }

    @Nullable
    public static final C4972Zy1 s(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        if (!C6562gT0.g(c4972Zy1.n(), d) && !C6562gT0.g(c4972Zy1.n(), a) && !C6562gT0.g(c4972Zy1.n(), b) && !L(c4972Zy1)) {
            int I = I(c4972Zy1);
            if (I == 2 && c4972Zy1.I() != null) {
                if (c4972Zy1.n().g0() == 3) {
                    return null;
                }
                return new C4972Zy1(C8859ps.o0(c4972Zy1.n(), 0, 3, 1, null));
            } else if (I == 1 && c4972Zy1.n().h0(b)) {
                return null;
            } else {
                if (I == -1 && c4972Zy1.I() != null) {
                    if (c4972Zy1.n().g0() == 2) {
                        return null;
                    }
                    return new C4972Zy1(C8859ps.o0(c4972Zy1.n(), 0, 2, 1, null));
                } else if (I == -1) {
                    return new C4972Zy1(d);
                } else {
                    if (I == 0) {
                        return new C4972Zy1(C8859ps.o0(c4972Zy1.n(), 0, 1, 1, null));
                    }
                    return new C4972Zy1(C8859ps.o0(c4972Zy1.n(), 0, I, 1, null));
                }
            }
        }
        return null;
    }

    @NotNull
    public static final C4972Zy1 t(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        C6562gT0.p(c4972Zy1, "<this>");
        C6562gT0.p(c4972Zy12, "other");
        if (C6562gT0.g(c4972Zy1.o(), c4972Zy12.o())) {
            List<C8859ps> q = c4972Zy1.q();
            List<C8859ps> q2 = c4972Zy12.q();
            int min = Math.min(q.size(), q2.size());
            int i = 0;
            while (i < min && C6562gT0.g(q.get(i), q2.get(i))) {
                i++;
            }
            if (i == min && c4972Zy1.n().g0() == c4972Zy12.n().g0()) {
                return C4972Zy1.a.h(C4972Zy1.Y, UE.h, false, 1, null);
            }
            if (q2.subList(i, q2.size()).indexOf(e) == -1) {
                C5422bq c5422bq = new C5422bq();
                C8859ps K = K(c4972Zy12);
                if (K == null && (K = K(c4972Zy1)) == null) {
                    K = Q(C4972Zy1.Z);
                }
                int size = q2.size();
                for (int i2 = i; i2 < size; i2++) {
                    c5422bq.K4(e);
                    c5422bq.K4(K);
                }
                int size2 = q.size();
                while (i < size2) {
                    c5422bq.K4(q.get(i));
                    c5422bq.K4(K);
                    i++;
                }
                return O(c5422bq, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + c4972Zy1 + " and " + c4972Zy12).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + c4972Zy1 + " and " + c4972Zy12).toString());
    }

    @NotNull
    public static final C4972Zy1 u(@NotNull C4972Zy1 c4972Zy1, @NotNull String str, boolean z) {
        C6562gT0.p(c4972Zy1, "<this>");
        C6562gT0.p(str, "child");
        return x(c4972Zy1, O(new C5422bq().K1(str), false), z);
    }

    @NotNull
    public static final C4972Zy1 v(@NotNull C4972Zy1 c4972Zy1, @NotNull C5422bq c5422bq, boolean z) {
        C6562gT0.p(c4972Zy1, "<this>");
        C6562gT0.p(c5422bq, "child");
        return x(c4972Zy1, O(c5422bq, false), z);
    }

    @NotNull
    public static final C4972Zy1 w(@NotNull C4972Zy1 c4972Zy1, @NotNull C8859ps c8859ps, boolean z) {
        C6562gT0.p(c4972Zy1, "<this>");
        C6562gT0.p(c8859ps, "child");
        return x(c4972Zy1, O(new C5422bq().K4(c8859ps), false), z);
    }

    @NotNull
    public static final C4972Zy1 x(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12, boolean z) {
        C6562gT0.p(c4972Zy1, "<this>");
        C6562gT0.p(c4972Zy12, "child");
        if (!c4972Zy12.isAbsolute() && c4972Zy12.I() == null) {
            C8859ps K = K(c4972Zy1);
            if (K == null && (K = K(c4972Zy12)) == null) {
                K = Q(C4972Zy1.Z);
            }
            C5422bq c5422bq = new C5422bq();
            c5422bq.K4(c4972Zy1.n());
            if (c5422bq.size() > 0) {
                c5422bq.K4(K);
            }
            c5422bq.K4(c4972Zy12.n());
            return O(c5422bq, z);
        }
        return c4972Zy12;
    }

    @Nullable
    public static final C4972Zy1 y(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        int M = M(c4972Zy1);
        if (M == -1) {
            return null;
        }
        return new C4972Zy1(c4972Zy1.n().n0(0, M));
    }

    @NotNull
    public static final List<String> z(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "<this>");
        ArrayList<C8859ps> arrayList = new ArrayList();
        int M = M(c4972Zy1);
        if (M == -1) {
            M = 0;
        } else if (M < c4972Zy1.n().g0() && c4972Zy1.n().v(M) == 92) {
            M++;
        }
        int g0 = c4972Zy1.n().g0();
        int i = M;
        while (M < g0) {
            if (c4972Zy1.n().v(M) == 47 || c4972Zy1.n().v(M) == 92) {
                arrayList.add(c4972Zy1.n().n0(i, M));
                i = M + 1;
            }
            M++;
        }
        if (i < c4972Zy1.n().g0()) {
            arrayList.add(c4972Zy1.n().n0(i, c4972Zy1.n().g0()));
        }
        ArrayList arrayList2 = new ArrayList(C8466oF.b0(arrayList, 10));
        for (C8859ps c8859ps : arrayList) {
            arrayList2.add(c8859ps.s0());
        }
        return arrayList2;
    }

    public static /* synthetic */ void E() {
    }

    public static /* synthetic */ void F() {
    }

    public static /* synthetic */ void G() {
    }

    public static /* synthetic */ void H() {
    }

    public static /* synthetic */ void J() {
    }
}
