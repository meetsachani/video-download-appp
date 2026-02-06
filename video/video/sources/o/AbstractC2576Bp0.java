package o;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.List;
import o.C4972Zy1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,165:1\n52#2,21:166\n52#2,21:187\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n67#1:166,21\n81#1:187,21\n*E\n"})
/* renamed from: o.Bp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2576Bp0 {
    @NotNull
    public static final a a = new a(null);
    @InterfaceC7058iW0
    @NotNull
    public static final AbstractC2576Bp0 b;
    @InterfaceC7058iW0
    @NotNull
    public static final C4972Zy1 c;
    @InterfaceC7058iW0
    @NotNull
    public static final AbstractC2576Bp0 d;

    /* renamed from: o.Bp0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @InterfaceC8046mW0(name = "get")
        @NotNull
        public final AbstractC2576Bp0 a(@NotNull FileSystem fileSystem) {
            C6562gT0.p(fileSystem, "<this>");
            return new C7862lq1(fileSystem);
        }

        public a() {
        }
    }

    static {
        AbstractC2576Bp0 c10240vW0;
        try {
            Class.forName("java.nio.file.Files");
            c10240vW0 = new C9831tq1();
        } catch (ClassNotFoundException unused) {
            c10240vW0 = new C10240vW0();
        }
        b = c10240vW0;
        C4972Zy1.a aVar = C4972Zy1.Y;
        String property = System.getProperty(C3451Kk2.e);
        C6562gT0.o(property, "getProperty(...)");
        c = C4972Zy1.a.h(aVar, property, false, 1, null);
        ClassLoader classLoader = C8524oT1.class.getClassLoader();
        C6562gT0.o(classLoader, "getClassLoader(...)");
        d = new C8524oT1(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ B02 C(AbstractC2576Bp0 abstractC2576Bp0, C4972Zy1 c4972Zy1, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return abstractC2576Bp0.B(c4972Zy1, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
    }

    public static /* synthetic */ AbstractC8848pp0 I(AbstractC2576Bp0 abstractC2576Bp0, C4972Zy1 c4972Zy1, boolean z, boolean z2, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return abstractC2576Bp0.H(c4972Zy1, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
    }

    public static /* synthetic */ J82 L(AbstractC2576Bp0 abstractC2576Bp0, C4972Zy1 c4972Zy1, boolean z, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return abstractC2576Bp0.K(c4972Zy1, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
    }

    public static /* synthetic */ Object c(AbstractC2576Bp0 abstractC2576Bp0, C4972Zy1 c4972Zy1, boolean z, HA0 ha0, int i, Object obj) throws IOException {
        Object obj2;
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            C6562gT0.p(c4972Zy1, "file");
            C6562gT0.p(ha0, "writerAction");
            InterfaceC2579Bq d2 = C9604su1.d(abstractC2576Bp0.K(c4972Zy1, z));
            Throwable th = null;
            try {
                obj2 = ha0.invoke(d2);
                UP0.d(1);
                if (d2 != null) {
                    try {
                        d2.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                UP0.c(1);
            } catch (Throwable th3) {
                UP0.d(1);
                if (d2 != null) {
                    try {
                        d2.close();
                    } catch (Throwable th4) {
                        C3917Pf0.a(th3, th4);
                    }
                }
                UP0.c(1);
                obj2 = null;
                th = th3;
            }
            if (th == null) {
                C6562gT0.m(obj2);
                return obj2;
            }
            throw th;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
    }

    public static /* synthetic */ J82 f(AbstractC2576Bp0 abstractC2576Bp0, C4972Zy1 c4972Zy1, boolean z, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return abstractC2576Bp0.e(c4972Zy1, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
    }

    public static /* synthetic */ void l(AbstractC2576Bp0 abstractC2576Bp0, C4972Zy1 c4972Zy1, boolean z, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            abstractC2576Bp0.k(c4972Zy1, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
    }

    public static /* synthetic */ void o(AbstractC2576Bp0 abstractC2576Bp0, C4972Zy1 c4972Zy1, boolean z, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            abstractC2576Bp0.n(c4972Zy1, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
    }

    public static /* synthetic */ void s(AbstractC2576Bp0 abstractC2576Bp0, C4972Zy1 c4972Zy1, boolean z, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            abstractC2576Bp0.r(c4972Zy1, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
    }

    public static /* synthetic */ void v(AbstractC2576Bp0 abstractC2576Bp0, C4972Zy1 c4972Zy1, boolean z, int i, Object obj) throws IOException {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            abstractC2576Bp0.u(c4972Zy1, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
    }

    @InterfaceC9511sW0
    @InterfaceC8046mW0(name = "get")
    @NotNull
    public static final AbstractC2576Bp0 x(@NotNull FileSystem fileSystem) {
        return a.a(fileSystem);
    }

    @NotNull
    public final B02<C4972Zy1> A(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "dir");
        return B(c4972Zy1, false);
    }

    @NotNull
    public B02<C4972Zy1> B(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "dir");
        return C6687h.f(this, c4972Zy1, z);
    }

    @NotNull
    public final C9340rp0 D(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "path");
        return C6687h.g(this, c4972Zy1);
    }

    @Nullable
    public abstract C9340rp0 E(@NotNull C4972Zy1 c4972Zy1) throws IOException;

    @NotNull
    public abstract AbstractC8848pp0 F(@NotNull C4972Zy1 c4972Zy1) throws IOException;

    @NotNull
    public final AbstractC8848pp0 G(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "file");
        return H(c4972Zy1, false, false);
    }

    @NotNull
    public abstract AbstractC8848pp0 H(@NotNull C4972Zy1 c4972Zy1, boolean z, boolean z2) throws IOException;

    @NotNull
    public final J82 J(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "file");
        return K(c4972Zy1, false);
    }

    @NotNull
    public abstract J82 K(@NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException;

    @NotNull
    public abstract InterfaceC7072ia2 M(@NotNull C4972Zy1 c4972Zy1) throws IOException;

    @InterfaceC8046mW0(name = "-read")
    public final <T> T a(@NotNull C4972Zy1 c4972Zy1, @NotNull HA0<? super InterfaceC2677Cq, ? extends T> ha0) throws IOException {
        T t;
        C6562gT0.p(c4972Zy1, "file");
        C6562gT0.p(ha0, "readerAction");
        InterfaceC2677Cq e = C9604su1.e(M(c4972Zy1));
        Throwable th = null;
        try {
            t = ha0.invoke(e);
            UP0.d(1);
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            UP0.c(1);
        } catch (Throwable th3) {
            UP0.d(1);
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th4) {
                    C3917Pf0.a(th3, th4);
                }
            }
            UP0.c(1);
            th = th3;
            t = null;
        }
        if (th == null) {
            C6562gT0.m(t);
            return t;
        }
        throw th;
    }

    @InterfaceC8046mW0(name = "-write")
    public final <T> T b(@NotNull C4972Zy1 c4972Zy1, boolean z, @NotNull HA0<? super InterfaceC2579Bq, ? extends T> ha0) throws IOException {
        T t;
        C6562gT0.p(c4972Zy1, "file");
        C6562gT0.p(ha0, "writerAction");
        InterfaceC2579Bq d2 = C9604su1.d(K(c4972Zy1, z));
        Throwable th = null;
        try {
            t = ha0.invoke(d2);
            UP0.d(1);
            if (d2 != null) {
                try {
                    d2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            UP0.c(1);
        } catch (Throwable th3) {
            UP0.d(1);
            if (d2 != null) {
                try {
                    d2.close();
                } catch (Throwable th4) {
                    C3917Pf0.a(th3, th4);
                }
            }
            UP0.c(1);
            th = th3;
            t = null;
        }
        if (th == null) {
            C6562gT0.m(t);
            return t;
        }
        throw th;
    }

    @NotNull
    public final J82 d(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "file");
        return e(c4972Zy1, false);
    }

    @NotNull
    public abstract J82 e(@NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException;

    public abstract void g(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) throws IOException;

    @NotNull
    public abstract C4972Zy1 h(@NotNull C4972Zy1 c4972Zy1) throws IOException;

    public void i(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) throws IOException {
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        C6687h.b(this, c4972Zy1, c4972Zy12);
    }

    public final void j(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "dir");
        k(c4972Zy1, false);
    }

    public final void k(@NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException {
        C6562gT0.p(c4972Zy1, "dir");
        C6687h.c(this, c4972Zy1, z);
    }

    public final void m(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "dir");
        n(c4972Zy1, false);
    }

    public abstract void n(@NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException;

    public abstract void p(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) throws IOException;

    public final void q(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "path");
        r(c4972Zy1, false);
    }

    public abstract void r(@NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException;

    public final void t(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "fileOrDirectory");
        u(c4972Zy1, false);
    }

    public void u(@NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException {
        C6562gT0.p(c4972Zy1, "fileOrDirectory");
        C6687h.d(this, c4972Zy1, z);
    }

    public final boolean w(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(c4972Zy1, "path");
        return C6687h.e(this, c4972Zy1);
    }

    @NotNull
    public abstract List<C4972Zy1> y(@NotNull C4972Zy1 c4972Zy1) throws IOException;

    @Nullable
    public abstract List<C4972Zy1> z(@NotNull C4972Zy1 c4972Zy1);
}
