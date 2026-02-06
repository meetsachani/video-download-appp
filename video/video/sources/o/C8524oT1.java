package o;

import com.google.firebase.messaging.TopicOperation;
import com.google.firebase.remoteconfig.internal.DefaultsXmlParser;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import o.C4972Zy1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n766#2:211\n857#2,2:212\n1549#2:214\n1620#2,3:215\n766#2:218\n857#2,2:219\n1549#2:221\n1620#2,3:222\n1603#2,9:225\n1855#2:234\n1856#2:236\n1612#2:237\n1603#2,9:238\n1855#2:247\n1856#2:249\n1612#2:250\n1#3:235\n1#3:248\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n74#1:211\n74#1:212,2\n75#1:214\n75#1:215,3\n90#1:218\n90#1:219,2\n91#1:221\n91#1:222,3\n173#1:225,9\n173#1:234\n173#1:236\n173#1:237\n174#1:238,9\n174#1:247\n174#1:249\n174#1:250\n173#1:235\n174#1:248\n*E\n"})
/* renamed from: o.oT1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8524oT1 extends AbstractC2576Bp0 {
    @NotNull
    public static final a h = new a(null);
    @NotNull
    public static final C4972Zy1 i = C4972Zy1.a.h(C4972Zy1.Y, RemoteSettings.i, false, 1, null);
    @NotNull
    public final ClassLoader e;
    @NotNull
    public final AbstractC2576Bp0 f;
    @NotNull
    public final EY0 g;

    /* renamed from: o.oT1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C4972Zy1 b() {
            return C8524oT1.i;
        }

        public final boolean c(C4972Zy1 c4972Zy1) {
            return !C9545sf2.a2(c4972Zy1.t(), C6497gD.d, true);
        }

        @NotNull
        public final C4972Zy1 d(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
            C6562gT0.p(c4972Zy1, "<this>");
            C6562gT0.p(c4972Zy12, C5445bv2.X);
            return b().y(C9545sf2.y2(C10763xf2.x4(c4972Zy1.toString(), c4972Zy12.toString()), '\\', '/', false, 4, null));
        }

        public a() {
        }
    }

    /* renamed from: o.oT1$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC8052mY0 implements FA0<List<? extends C4180Rx1<? extends AbstractC2576Bp0, ? extends C4972Zy1>>> {
        public b() {
            super(0);
        }

        @Override // o.FA0
        @NotNull
        public final List<? extends C4180Rx1<? extends AbstractC2576Bp0, ? extends C4972Zy1>> invoke() {
            C8524oT1 c8524oT1 = C8524oT1.this;
            return c8524oT1.T(c8524oT1.e);
        }
    }

    /* renamed from: o.oT1$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC8052mY0 implements HA0<C7271jO2, Boolean> {
        public static final c X = new c();

        public c() {
            super(1);
        }

        @Override // o.HA0
        @NotNull
        /* renamed from: c */
        public final Boolean invoke(@NotNull C7271jO2 c7271jO2) {
            C6562gT0.p(c7271jO2, DefaultsXmlParser.a);
            return Boolean.valueOf(C8524oT1.h.c(c7271jO2.a()));
        }
    }

    public /* synthetic */ C8524oT1(ClassLoader classLoader, boolean z, AbstractC2576Bp0 abstractC2576Bp0, int i2, C9516sY c9516sY) {
        this(classLoader, z, (i2 & 4) != 0 ? AbstractC2576Bp0.b : abstractC2576Bp0);
    }

    private final C4972Zy1 R(C4972Zy1 c4972Zy1) {
        return i.D(c4972Zy1, true);
    }

    @Override // o.AbstractC2576Bp0
    @Nullable
    public C9340rp0 E(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "path");
        if (!h.c(c4972Zy1)) {
            return null;
        }
        String W = W(c4972Zy1);
        for (C4180Rx1<AbstractC2576Bp0, C4972Zy1> c4180Rx1 : S()) {
            C9340rp0 E = c4180Rx1.a().E(c4180Rx1.b().y(W));
            if (E != null) {
                return E;
            }
        }
        return null;
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public AbstractC8848pp0 F(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "file");
        if (h.c(c4972Zy1)) {
            String W = W(c4972Zy1);
            for (C4180Rx1<AbstractC2576Bp0, C4972Zy1> c4180Rx1 : S()) {
                try {
                    return c4180Rx1.a().F(c4180Rx1.b().y(W));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + c4972Zy1);
        }
        throw new FileNotFoundException("file not found: " + c4972Zy1);
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public AbstractC8848pp0 H(@NotNull C4972Zy1 c4972Zy1, boolean z, boolean z2) {
        C6562gT0.p(c4972Zy1, "file");
        throw new IOException("resources are not writable");
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public J82 K(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public InterfaceC7072ia2 M(@NotNull C4972Zy1 c4972Zy1) {
        InterfaceC7072ia2 u;
        C6562gT0.p(c4972Zy1, "file");
        if (h.c(c4972Zy1)) {
            C4972Zy1 c4972Zy12 = i;
            InputStream resourceAsStream = this.e.getResourceAsStream(C4972Zy1.G(c4972Zy12, c4972Zy1, false, 2, null).x(c4972Zy12).toString());
            if (resourceAsStream != null && (u = C9604su1.u(resourceAsStream)) != null) {
                return u;
            }
            throw new FileNotFoundException("file not found: " + c4972Zy1);
        }
        throw new FileNotFoundException("file not found: " + c4972Zy1);
    }

    public final List<C4180Rx1<AbstractC2576Bp0, C4972Zy1>> S() {
        return (List) this.g.getValue();
    }

    public final List<C4180Rx1<AbstractC2576Bp0, C4972Zy1>> T(ClassLoader classLoader) {
        Enumeration<URL> resources = classLoader.getResources("");
        C6562gT0.o(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        C6562gT0.o(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            C6562gT0.m(url);
            C4180Rx1<AbstractC2576Bp0, C4972Zy1> U = U(url);
            if (U != null) {
                arrayList.add(U);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        C6562gT0.o(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        C6562gT0.o(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            C6562gT0.m(url2);
            C4180Rx1<AbstractC2576Bp0, C4972Zy1> V = V(url2);
            if (V != null) {
                arrayList2.add(V);
            }
        }
        return C10662xF.G4(arrayList, arrayList2);
    }

    public final C4180Rx1<AbstractC2576Bp0, C4972Zy1> U(URL url) {
        if (!C6562gT0.g(url.getProtocol(), "file")) {
            return null;
        }
        return C6670gv2.a(this.f, C4972Zy1.a.g(C4972Zy1.Y, new File(url.toURI()), false, 1, null));
    }

    public final C4180Rx1<AbstractC2576Bp0, C4972Zy1> V(URL url) {
        int Y3;
        String url2 = url.toString();
        C6562gT0.o(url2, "toString(...)");
        if (!C9545sf2.J2(url2, "jar:file:", false, 2, null) || (Y3 = C10763xf2.Y3(url2, TopicOperation.d, 0, false, 6, null)) == -1) {
            return null;
        }
        C4972Zy1.a aVar = C4972Zy1.Y;
        String substring = url2.substring(4, Y3);
        C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return C6670gv2.a(C7757lO2.d(C4972Zy1.a.g(aVar, new File(URI.create(substring)), false, 1, null), this.f, c.X), i);
    }

    public final String W(C4972Zy1 c4972Zy1) {
        return R(c4972Zy1).x(i).toString();
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public J82 e(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // o.AbstractC2576Bp0
    public void g(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public C4972Zy1 h(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "path");
        return R(c4972Zy1);
    }

    @Override // o.AbstractC2576Bp0
    public void n(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // o.AbstractC2576Bp0
    public void p(@NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) {
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // o.AbstractC2576Bp0
    public void r(@NotNull C4972Zy1 c4972Zy1, boolean z) {
        C6562gT0.p(c4972Zy1, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // o.AbstractC2576Bp0
    @NotNull
    public List<C4972Zy1> y(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "dir");
        String W = W(c4972Zy1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (C4180Rx1<AbstractC2576Bp0, C4972Zy1> c4180Rx1 : S()) {
            AbstractC2576Bp0 a2 = c4180Rx1.a();
            C4972Zy1 b2 = c4180Rx1.b();
            try {
                ArrayList<C4972Zy1> arrayList = new ArrayList();
                for (Object obj : a2.y(b2.y(W))) {
                    if (h.c((C4972Zy1) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C8466oF.b0(arrayList, 10));
                for (C4972Zy1 c4972Zy12 : arrayList) {
                    arrayList2.add(h.d(c4972Zy12, b2));
                }
                C9444sF.q0(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return C10662xF.Y5(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + c4972Zy1);
    }

    @Override // o.AbstractC2576Bp0
    @Nullable
    public List<C4972Zy1> z(@NotNull C4972Zy1 c4972Zy1) {
        C6562gT0.p(c4972Zy1, "dir");
        String W = W(c4972Zy1);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C4180Rx1<AbstractC2576Bp0, C4972Zy1>> it = S().iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            C4180Rx1<AbstractC2576Bp0, C4972Zy1> next = it.next();
            C4972Zy1 b2 = next.b();
            List<C4972Zy1> z2 = next.a().z(b2.y(W));
            if (z2 != null) {
                ArrayList<C4972Zy1> arrayList2 = new ArrayList();
                for (Object obj : z2) {
                    if (h.c((C4972Zy1) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C8466oF.b0(arrayList2, 10));
                for (C4972Zy1 c4972Zy12 : arrayList2) {
                    arrayList3.add(h.d(c4972Zy12, b2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                C9444sF.q0(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (!z) {
            return null;
        }
        return C10662xF.Y5(linkedHashSet);
    }

    public C8524oT1(@NotNull ClassLoader classLoader, boolean z, @NotNull AbstractC2576Bp0 abstractC2576Bp0) {
        C6562gT0.p(classLoader, "classLoader");
        C6562gT0.p(abstractC2576Bp0, "systemFileSystem");
        this.e = classLoader;
        this.f = abstractC2576Bp0;
        this.g = WY0.b(new b());
        if (z) {
            S().size();
        }
    }
}
