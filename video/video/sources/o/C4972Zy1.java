package o;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n45#2,3:133\n53#2,28:136\n59#2,22:168\n112#2:190\n117#2:191\n122#2,6:192\n139#2,5:198\n149#2:203\n154#2,25:204\n194#2:229\n199#2,11:230\n204#2,6:241\n199#2,11:247\n204#2,6:258\n228#2,36:264\n268#2:300\n282#2:301\n287#2:302\n292#2:303\n297#2:304\n1549#3:164\n1620#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,36\n97#1:300\n104#1:301\n106#1:302\n108#1:303\n110#1:304\n47#1:164\n47#1:165,3\n*E\n"})
/* renamed from: o.Zy1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4972Zy1 implements Comparable<C4972Zy1> {
    @NotNull
    public static final a Y = new a(null);
    @InterfaceC7058iW0
    @NotNull
    public static final String Z;
    @NotNull
    public final C8859ps X;

    /* renamed from: o.Zy1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ C4972Zy1 g(a aVar, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.b(file, z);
        }

        public static /* synthetic */ C4972Zy1 h(a aVar, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.d(str, z);
        }

        public static /* synthetic */ C4972Zy1 i(a aVar, Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.f(path, z);
        }

        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @InterfaceC8289nW0
        public final C4972Zy1 a(@NotNull File file) {
            C6562gT0.p(file, "<this>");
            return g(this, file, false, 1, null);
        }

        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @InterfaceC8289nW0
        public final C4972Zy1 b(@NotNull File file, boolean z) {
            C6562gT0.p(file, "<this>");
            String file2 = file.toString();
            C6562gT0.o(file2, "toString(...)");
            return d(file2, z);
        }

        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @InterfaceC8289nW0
        public final C4972Zy1 c(@NotNull String str) {
            C6562gT0.p(str, "<this>");
            return h(this, str, false, 1, null);
        }

        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @InterfaceC8289nW0
        public final C4972Zy1 d(@NotNull String str, boolean z) {
            C6562gT0.p(str, "<this>");
            return C7657l.B(str, z);
        }

        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @InterfaceC8289nW0
        public final C4972Zy1 e(@NotNull Path path) {
            C6562gT0.p(path, "<this>");
            return i(this, path, false, 1, null);
        }

        @NotNull
        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @InterfaceC8289nW0
        public final C4972Zy1 f(@NotNull Path path, boolean z) {
            C6562gT0.p(path, "<this>");
            return d(path.toString(), z);
        }

        public a() {
        }
    }

    static {
        String str = File.separator;
        C6562gT0.o(str, "separator");
        Z = str;
    }

    public C4972Zy1(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "bytes");
        this.X = c8859ps;
    }

    public static /* synthetic */ C4972Zy1 E(C4972Zy1 c4972Zy1, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c4972Zy1.z(str, z);
    }

    public static /* synthetic */ C4972Zy1 F(C4972Zy1 c4972Zy1, C8859ps c8859ps, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c4972Zy1.B(c8859ps, z);
    }

    public static /* synthetic */ C4972Zy1 G(C4972Zy1 c4972Zy1, C4972Zy1 c4972Zy12, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c4972Zy1.D(c4972Zy12, z);
    }

    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @InterfaceC8289nW0
    public static final C4972Zy1 g(@NotNull File file) {
        return Y.a(file);
    }

    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @InterfaceC8289nW0
    public static final C4972Zy1 h(@NotNull File file, boolean z) {
        return Y.b(file, z);
    }

    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @InterfaceC8289nW0
    public static final C4972Zy1 i(@NotNull String str) {
        return Y.c(str);
    }

    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @InterfaceC8289nW0
    public static final C4972Zy1 j(@NotNull String str, boolean z) {
        return Y.d(str, z);
    }

    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @InterfaceC8289nW0
    public static final C4972Zy1 l(@NotNull Path path) {
        return Y.e(path);
    }

    @NotNull
    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @InterfaceC8289nW0
    public static final C4972Zy1 m(@NotNull Path path, boolean z) {
        return Y.f(path, z);
    }

    @InterfaceC8046mW0(name = "resolve")
    @NotNull
    public final C4972Zy1 A(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "child");
        return C7657l.x(this, C7657l.O(new C5422bq().K4(c8859ps), false), false);
    }

    @NotNull
    public final C4972Zy1 B(@NotNull C8859ps c8859ps, boolean z) {
        C6562gT0.p(c8859ps, "child");
        return C7657l.x(this, C7657l.O(new C5422bq().K4(c8859ps), false), z);
    }

    @InterfaceC8046mW0(name = "resolve")
    @NotNull
    public final C4972Zy1 C(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "child");
        return C7657l.x(this, c4972Zy1, false);
    }

    @NotNull
    public final C4972Zy1 D(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "child");
        return C7657l.x(this, c4972Zy1, z);
    }

    @NotNull
    public final Path H() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        C6562gT0.o(path, "get(...)");
        return path;
    }

    @InterfaceC8046mW0(name = "volumeLetter")
    @Nullable
    public final Character I() {
        if (C8859ps.J(n(), C7657l.e(), 0, 2, null) != -1 || n().g0() < 2 || n().v(1) != 58) {
            return null;
        }
        char v = (char) n().v(0);
        if (('a' > v || v >= '{') && ('A' > v || v >= '[')) {
            return null;
        }
        return Character.valueOf(v);
    }

    @Override // java.lang.Comparable
    /* renamed from: e */
    public int compareTo(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "other");
        return n().compareTo(c4972Zy1.n());
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof C4972Zy1) && C6562gT0.g(((C4972Zy1) obj).n(), n())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return n().hashCode();
    }

    public final boolean isAbsolute() {
        if (C7657l.h(this) != -1) {
            return true;
        }
        return false;
    }

    @NotNull
    public final C8859ps n() {
        return this.X;
    }

    @Nullable
    public final C4972Zy1 o() {
        int h = C7657l.h(this);
        if (h == -1) {
            return null;
        }
        return new C4972Zy1(n().n0(0, h));
    }

    @NotNull
    public final List<String> p() {
        ArrayList<C8859ps> arrayList = new ArrayList();
        int h = C7657l.h(this);
        if (h == -1) {
            h = 0;
        } else if (h < n().g0() && n().v(h) == 92) {
            h++;
        }
        int g0 = n().g0();
        int i = h;
        while (h < g0) {
            if (n().v(h) == 47 || n().v(h) == 92) {
                arrayList.add(n().n0(i, h));
                i = h + 1;
            }
            h++;
        }
        if (i < n().g0()) {
            arrayList.add(n().n0(i, n().g0()));
        }
        ArrayList arrayList2 = new ArrayList(C8466oF.b0(arrayList, 10));
        for (C8859ps c8859ps : arrayList) {
            arrayList2.add(c8859ps.s0());
        }
        return arrayList2;
    }

    @NotNull
    public final List<C8859ps> q() {
        ArrayList arrayList = new ArrayList();
        int h = C7657l.h(this);
        if (h == -1) {
            h = 0;
        } else if (h < n().g0() && n().v(h) == 92) {
            h++;
        }
        int g0 = n().g0();
        int i = h;
        while (h < g0) {
            if (n().v(h) == 47 || n().v(h) == 92) {
                arrayList.add(n().n0(i, h));
                i = h + 1;
            }
            h++;
        }
        if (i < n().g0()) {
            arrayList.add(n().n0(i, n().g0()));
        }
        return arrayList;
    }

    public final boolean r() {
        if (C7657l.h(this) == -1) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (C7657l.h(this) == n().g0()) {
            return true;
        }
        return false;
    }

    @InterfaceC8046mW0(name = "name")
    @NotNull
    public final String t() {
        return u().s0();
    }

    @NotNull
    public final File toFile() {
        return new File(toString());
    }

    @NotNull
    public String toString() {
        return n().s0();
    }

    @InterfaceC8046mW0(name = "nameBytes")
    @NotNull
    public final C8859ps u() {
        int d = C7657l.d(this);
        if (d != -1) {
            return C8859ps.o0(n(), d + 1, 0, 2, null);
        }
        if (I() != null && n().g0() == 2) {
            return C8859ps.Z0;
        }
        return n();
    }

    @NotNull
    public final C4972Zy1 v() {
        return Y.d(toString(), true);
    }

    @InterfaceC8046mW0(name = androidx.constraintlayout.widget.e.W1)
    @Nullable
    public final C4972Zy1 w() {
        if (C6562gT0.g(n(), C7657l.b()) || C6562gT0.g(n(), C7657l.e()) || C6562gT0.g(n(), C7657l.a()) || C7657l.g(this)) {
            return null;
        }
        int d = C7657l.d(this);
        if (d == 2 && I() != null) {
            if (n().g0() == 3) {
                return null;
            }
            return new C4972Zy1(C8859ps.o0(n(), 0, 3, 1, null));
        } else if (d == 1 && n().h0(C7657l.a())) {
            return null;
        } else {
            if (d == -1 && I() != null) {
                if (n().g0() == 2) {
                    return null;
                }
                return new C4972Zy1(C8859ps.o0(n(), 0, 2, 1, null));
            } else if (d == -1) {
                return new C4972Zy1(C7657l.b());
            } else {
                if (d == 0) {
                    return new C4972Zy1(C8859ps.o0(n(), 0, 1, 1, null));
                }
                return new C4972Zy1(C8859ps.o0(n(), 0, d, 1, null));
            }
        }
    }

    @NotNull
    public final C4972Zy1 x(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "other");
        if (C6562gT0.g(o(), c4972Zy1.o())) {
            List<C8859ps> q = q();
            List<C8859ps> q2 = c4972Zy1.q();
            int min = Math.min(q.size(), q2.size());
            int i = 0;
            while (i < min && C6562gT0.g(q.get(i), q2.get(i))) {
                i++;
            }
            if (i == min && n().g0() == c4972Zy1.n().g0()) {
                return a.h(Y, UE.h, false, 1, null);
            }
            if (q2.subList(i, q2.size()).indexOf(C7657l.c()) == -1) {
                C5422bq c5422bq = new C5422bq();
                C8859ps f = C7657l.f(c4972Zy1);
                if (f == null && (f = C7657l.f(this)) == null) {
                    f = C7657l.i(Z);
                }
                int size = q2.size();
                for (int i2 = i; i2 < size; i2++) {
                    c5422bq.K4(C7657l.c());
                    c5422bq.K4(f);
                }
                int size2 = q.size();
                while (i < size2) {
                    c5422bq.K4(q.get(i));
                    c5422bq.K4(f);
                    i++;
                }
                return C7657l.O(c5422bq, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + c4972Zy1).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + c4972Zy1).toString());
    }

    @InterfaceC8046mW0(name = "resolve")
    @NotNull
    public final C4972Zy1 y(@NotNull String str) {
        C6562gT0.p(str, "child");
        return C7657l.x(this, C7657l.O(new C5422bq().K1(str), false), false);
    }

    @NotNull
    public final C4972Zy1 z(@NotNull String str, boolean z) {
        C6562gT0.p(str, "child");
        return C7657l.x(this, C7657l.O(new C5422bq().K1(str), false), z);
    }
}
