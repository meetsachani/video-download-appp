package o;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* renamed from: o.Ro0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4147Ro0 implements Serializable {
    private static final long serialVersionUID = 1185122225658782848L;
    public final transient List<InterfaceC2670Co0> X;
    public final C6887hp0 Y;
    public final Comparator<File> Y0;
    public final transient FileFilter Z;

    /* renamed from: o.Ro0$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC10679xJ0.values().length];
            a = iArr;
            try {
                iArr[EnumC10679xJ0.SYSTEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC10679xJ0.INSENSITIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: o.Ro0$b */
    /* loaded from: classes4.dex */
    public static final class b extends C2<C4147Ro0, b> {
        public C6887hp0 b;
        public FileFilter c;
        public EnumC10679xJ0 d;

        public /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File N() {
            return d().i();
        }

        @Override // o.XK0
        /* renamed from: O */
        public C4147Ro0 get() throws IOException {
            return new C4147Ro0(this, (a) null);
        }

        public b P(FileFilter fileFilter) {
            this.c = fileFilter;
            return (b) c();
        }

        public b Q(EnumC10679xJ0 enumC10679xJ0) {
            this.d = enumC10679xJ0;
            return (b) c();
        }

        public b R(C6887hp0 c6887hp0) {
            this.b = c6887hp0;
            return (b) c();
        }

        public b() {
        }
    }

    public /* synthetic */ C4147Ro0(b bVar, a aVar) {
        this(bVar);
    }

    public static Comparator<File> A(EnumC10679xJ0 enumC10679xJ0) {
        int i = a.a[EnumC10679xJ0.t(enumC10679xJ0, EnumC10679xJ0.SYSTEM).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return C9580so1.Y;
            }
            return C9580so1.Y0;
        }
        return C9580so1.a1;
    }

    public static /* synthetic */ void b(C4147Ro0 c4147Ro0, InterfaceC2670Co0 interfaceC2670Co0) {
        c4147Ro0.getClass();
        interfaceC2670Co0.d(c4147Ro0);
    }

    public static /* synthetic */ void c(C4147Ro0 c4147Ro0, InterfaceC2670Co0 interfaceC2670Co0) {
        c4147Ro0.getClass();
        interfaceC2670Co0.a(c4147Ro0);
    }

    public static /* synthetic */ void d(C6887hp0 c6887hp0, File file, InterfaceC2670Co0 interfaceC2670Co0) {
        if (c6887hp0.i()) {
            interfaceC2670Co0.g(file);
        } else {
            interfaceC2670Co0.c(file);
        }
    }

    public static /* synthetic */ void f(C6887hp0 c6887hp0, InterfaceC2670Co0 interfaceC2670Co0) {
        if (c6887hp0.i()) {
            interfaceC2670Co0.f(c6887hp0.b());
        } else {
            interfaceC2670Co0.b(c6887hp0.b());
        }
    }

    public static /* synthetic */ C6887hp0[] g(int i) {
        return new C6887hp0[i];
    }

    public static /* synthetic */ void h(C6887hp0 c6887hp0, InterfaceC2670Co0 interfaceC2670Co0) {
        if (c6887hp0.i()) {
            interfaceC2670Co0.h(c6887hp0.b());
        } else {
            interfaceC2670Co0.e(c6887hp0.b());
        }
    }

    public static b j() {
        return new b(null);
    }

    public void i(InterfaceC2670Co0 interfaceC2670Co0) {
        if (interfaceC2670Co0 != null) {
            this.X.add(interfaceC2670Co0);
        }
    }

    public final void k(C6887hp0 c6887hp0, C6887hp0[] c6887hp0Arr, File[] fileArr) {
        C6887hp0[] c6887hp0Arr2;
        if (fileArr.length > 0) {
            c6887hp0Arr2 = new C6887hp0[fileArr.length];
        } else {
            c6887hp0Arr2 = C6887hp0.d1;
        }
        int i = 0;
        for (C6887hp0 c6887hp02 : c6887hp0Arr) {
            while (i < fileArr.length && this.Y0.compare(c6887hp02.b(), fileArr[i]) > 0) {
                C6887hp0 m = m(c6887hp0, fileArr[i]);
                c6887hp0Arr2[i] = m;
                p(m);
                i++;
            }
            if (i < fileArr.length && this.Y0.compare(c6887hp02.b(), fileArr[i]) == 0) {
                o(c6887hp02, fileArr[i]);
                k(c6887hp02, c6887hp02.a(), x(fileArr[i]));
                c6887hp0Arr2[i] = c6887hp02;
                i++;
            } else {
                k(c6887hp02, c6887hp02.a(), C3961Pq0.r);
                q(c6887hp02);
            }
        }
        while (i < fileArr.length) {
            C6887hp0 m2 = m(c6887hp0, fileArr[i]);
            c6887hp0Arr2[i] = m2;
            p(m2);
            i++;
        }
        c6887hp0.m(c6887hp0Arr2);
    }

    public void l() {
        this.X.forEach(new Consumer() { // from class: o.Oo0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4147Ro0.b(C4147Ro0.this, (InterfaceC2670Co0) obj);
            }
        });
        File b2 = this.Y.b();
        if (b2.exists()) {
            C6887hp0 c6887hp0 = this.Y;
            k(c6887hp0, c6887hp0.a(), x(b2));
        } else if (this.Y.j()) {
            C6887hp0 c6887hp02 = this.Y;
            k(c6887hp02, c6887hp02.a(), C3961Pq0.r);
        }
        this.X.forEach(new Consumer() { // from class: o.Po0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4147Ro0.c(C4147Ro0.this, (InterfaceC2670Co0) obj);
            }
        });
    }

    public final C6887hp0 m(C6887hp0 c6887hp0, File file) {
        C6887hp0 k = c6887hp0.k(file);
        k.l(file);
        k.m(w(file, k));
        return k;
    }

    public final void o(final C6887hp0 c6887hp0, final File file) {
        if (c6887hp0.l(file)) {
            this.X.forEach(new Consumer() { // from class: o.Jo0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C4147Ro0.d(C6887hp0.this, file, (InterfaceC2670Co0) obj);
                }
            });
        }
    }

    public final void p(final C6887hp0 c6887hp0) {
        this.X.forEach(new Consumer() { // from class: o.Mo0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4147Ro0.h(C6887hp0.this, (InterfaceC2670Co0) obj);
            }
        });
        Stream.of((Object[]) c6887hp0.a()).forEach(new Consumer() { // from class: o.No0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4147Ro0.this.p((C6887hp0) obj);
            }
        });
    }

    public final void q(final C6887hp0 c6887hp0) {
        this.X.forEach(new Consumer() { // from class: o.Qo0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4147Ro0.f(C6887hp0.this, (InterfaceC2670Co0) obj);
            }
        });
    }

    public Comparator<File> r() {
        return this.Y0;
    }

    public File s() {
        return this.Y.b();
    }

    public FileFilter t() {
        return this.Z;
    }

    public String toString() {
        return getClass().getSimpleName() + "[file='" + s().getPath() + '\'' + C6566gU0.h + this.Z.toString() + ", listeners=" + this.X.size() + C6566gU0.g;
    }

    public Iterable<InterfaceC2670Co0> u() {
        return new ArrayList(this.X);
    }

    public void v() throws Exception {
        C6887hp0 c6887hp0 = this.Y;
        c6887hp0.l(c6887hp0.b());
        C6887hp0 c6887hp02 = this.Y;
        c6887hp02.m(w(c6887hp02.b(), this.Y));
    }

    public final C6887hp0[] w(File file, final C6887hp0 c6887hp0) {
        return (C6887hp0[]) Stream.of((Object[]) x(file)).map(new Function() { // from class: o.Ko0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C6887hp0 m;
                m = C4147Ro0.this.m(c6887hp0, (File) obj);
                return m;
            }
        }).toArray(new IntFunction() { // from class: o.Lo0
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return C4147Ro0.g(i);
            }
        });
    }

    public final File[] x(File file) {
        if (file.isDirectory()) {
            return z(file.listFiles(this.Z));
        }
        return C3961Pq0.r;
    }

    public void y(final InterfaceC2670Co0 interfaceC2670Co0) {
        if (interfaceC2670Co0 != null) {
            this.X.removeIf(new Predicate() { // from class: o.Io0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return InterfaceC2670Co0.this.equals((InterfaceC2670Co0) obj);
                }
            });
        }
    }

    public final File[] z(File[] fileArr) {
        if (fileArr == null) {
            return C3961Pq0.r;
        }
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, this.Y0);
        }
        return fileArr;
    }

    public C4147Ro0(b bVar) {
        this(bVar.b != null ? bVar.b : new C6887hp0(bVar.N()), bVar.c, A(bVar.d));
    }

    @Deprecated
    public C4147Ro0(File file) {
        this(file, (FileFilter) null);
    }

    @Deprecated
    public C4147Ro0(File file, FileFilter fileFilter) {
        this(file, fileFilter, (EnumC10679xJ0) null);
    }

    @Deprecated
    public C4147Ro0(File file, FileFilter fileFilter, EnumC10679xJ0 enumC10679xJ0) {
        this(new C6887hp0(file), fileFilter, enumC10679xJ0);
    }

    public C4147Ro0(C6887hp0 c6887hp0, FileFilter fileFilter, Comparator<File> comparator) {
        this.X = new CopyOnWriteArrayList();
        Objects.requireNonNull(c6887hp0, "rootEntry");
        Objects.requireNonNull(c6887hp0.b(), "rootEntry.getFile()");
        this.Y = c6887hp0;
        this.Z = fileFilter == null ? Cu2.Z : fileFilter;
        Objects.requireNonNull(comparator, "comparator");
        this.Y0 = comparator;
    }

    public C4147Ro0(C6887hp0 c6887hp0, FileFilter fileFilter, EnumC10679xJ0 enumC10679xJ0) {
        this(c6887hp0, fileFilter, A(enumC10679xJ0));
    }

    @Deprecated
    public C4147Ro0(String str) {
        this(new File(str));
    }

    @Deprecated
    public C4147Ro0(String str, FileFilter fileFilter) {
        this(new File(str), fileFilter);
    }

    @Deprecated
    public C4147Ro0(String str, FileFilter fileFilter, EnumC10679xJ0 enumC10679xJ0) {
        this(new File(str), fileFilter, enumC10679xJ0);
    }

    public void n() throws Exception {
    }
}
