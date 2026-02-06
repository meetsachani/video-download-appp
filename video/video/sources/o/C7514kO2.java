package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import o.C4972Zy1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,175:1\n52#2,5:176\n52#2,21:181\n60#2,10:202\n57#2,2:212\n71#2,2:214\n52#2,21:216\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n102#1:176,5\n103#1:181,21\n102#1:202,10\n102#1:212,2\n102#1:214,2\n132#1:216,21\n*E\n"})
/* renamed from: o.kO2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7514kO2 extends AbstractC2576Bp0 {
    @NotNull
    public static final a i = new a(null);
    @NotNull
    public static final C4972Zy1 j = C4972Zy1.a.h(C4972Zy1.Y, RemoteSettings.i, false, 1, null);
    @NotNull
    public final C4972Zy1 e;
    @NotNull
    public final AbstractC2576Bp0 f;
    @NotNull
    public final Map<C4972Zy1, C7271jO2> g;
    @Nullable
    public final String h;

    /* renamed from: o.kO2$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C4972Zy1 a() {
            return C7514kO2.j;
        }

        public a() {
        }
    }

    public C7514kO2(@NotNull C4972Zy1 c4972Zy1, @NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull Map<C4972Zy1, C7271jO2> map, @Nullable String str) {
        C6562gT0.p(c4972Zy1, "zipPath");
        C6562gT0.p(abstractC2576Bp0, "fileSystem");
        C6562gT0.p(map, RemoteConfigConstants.ResponseFieldKey.h0);
        this.e = c4972Zy1;
        this.f = abstractC2576Bp0;
        this.g = map;
        this.h = str;
    }

    private final List<C4972Zy1> P(C4972Zy1 c4972Zy1, boolean z) {
        C7271jO2 c7271jO2 = this.g.get(O(c4972Zy1));
        if (c7271jO2 == null) {
            if (!z) {
                return null;
            }
            throw new IOException("not a directory: " + c4972Zy1);
        }
        return C10662xF.Y5(c7271jO2.b());
    }

    @Override // o.AbstractC2576Bp0
    @Nullable
    public C9340rp0 E(@NotNull C4972Zy1 c4972Zy1) {
        Long valueOf;
        C9340rp0 c9340rp0;
        Throwable th;
        C6562gT0.p(c4972Zy1, "path");
        C7271jO2 c7271jO2 = this.g.get(O(c4972Zy1));
        Throwable th2 = null;
        if (c7271jO2 == null) {
            return null;
        }
        boolean z = !c7271jO2.j();
        boolean j2 = c7271jO2.j();
        if (c7271jO2.j()) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(c7271jO2.i());
        }
        C9340rp0 c9340rp02 = new C9340rp0(z, j2, null, valueOf, null, c7271jO2.g(), null, null, 128, null);
        if (c7271jO2.h() == -1) {
            return c9340rp02;
        }
        AbstractC8848pp0 F = this.f.F(this.e);
        try {
            InterfaceC2677Cq e = C9604su1.e(F.F(c7271jO2.h()));
            c9340rp0 = C7757lO2.i(e, c9340rp02);
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            th = null;
        } catch (Throwable th4) {
            if (F != null) {
                try {
                    F.close();
                } catch (Throwable th5) {
                    C3917Pf0.a(th4, th5);
                }
            }
            c9340rp0 = null;
            th2 = th4;
        }
        if (th == null) {
            C6562gT0.m(c9340rp0);
            if (F != null) {
                try {
                    F.close();
                } catch (Throwable th6) {
                    th2 = th6;
                }
            }
            if (th2 == null) {
                C6562gT0.m(c9340rp0);
                return c9340rp0;
            }
            throw th2;
        }
        throw th;
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public AbstractC8848pp0 F(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public AbstractC8848pp0 H(@NotNull C4972Zy1 c4972Zy1, boolean z, boolean z2) {
        C6562gT0.p(c4972Zy1, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public J82 K(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public InterfaceC7072ia2 M(@NotNull C4972Zy1 c4972Zy1) throws IOException {
        InterfaceC2677Cq interfaceC2677Cq;
        C6562gT0.p(c4972Zy1, "file");
        C7271jO2 c7271jO2 = this.g.get(O(c4972Zy1));
        if (c7271jO2 != null) {
            AbstractC8848pp0 F = this.f.F(this.e);
            Throwable th = null;
            try {
                interfaceC2677Cq = C9604su1.e(F.F(c7271jO2.h()));
                if (F != null) {
                    try {
                        F.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (F != null) {
                    try {
                        F.close();
                    } catch (Throwable th4) {
                        C3917Pf0.a(th3, th4);
                    }
                }
                interfaceC2677Cq = null;
                th = th3;
            }
            if (th == null) {
                C6562gT0.m(interfaceC2677Cq);
                C7757lO2.l(interfaceC2677Cq);
                if (c7271jO2.e() == 0) {
                    return new C9846tu0(interfaceC2677Cq, c7271jO2.i(), true);
                }
                return new C9846tu0(new AP0(new C9846tu0(interfaceC2677Cq, c7271jO2.d(), true), new Inflater(true)), c7271jO2.i(), false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + c4972Zy1);
    }

    public final C4972Zy1 O(C4972Zy1 c4972Zy1) {
        return j.D(c4972Zy1, true);
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public J82 e(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.AbstractC2576Bp0
    public void g(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public C4972Zy1 h(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "path");
        C4972Zy1 O = O(c4972Zy1);
        if (this.g.containsKey(O)) {
            return O;
        }
        throw new FileNotFoundException(String.valueOf(c4972Zy1));
    }

    @Override // o.AbstractC2576Bp0
    public void n(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.AbstractC2576Bp0
    public void p(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.AbstractC2576Bp0
    public void r(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public List<C4972Zy1> y(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "dir");
        List<C4972Zy1> P = P(c4972Zy1, true);
        C6562gT0.m(P);
        return P;
    }

    @Override // o.AbstractC2576Bp0
    @Nullable
    public List<C4972Zy1> z(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "dir");
        return P(c4972Zy1, false);
    }
}
