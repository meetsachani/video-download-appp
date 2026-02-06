package o;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Yp0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4833Yp0 implements B02<File> {
    @NotNull
    public final File a;
    @NotNull
    public final EnumC4449Uq0 b;
    @Nullable
    public final HA0<File, Boolean> c;
    @Nullable
    public final HA0<File, C7458kA2> d;
    @Nullable
    public final VA0<File, IOException, C7458kA2> e;
    public final int f;

    @InterfaceC8303na2({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$DirectoryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
    /* renamed from: o.Yp0$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull File file) {
            super(file);
            C6562gT0.p(file, "rootDir");
        }
    }

    /* renamed from: o.Yp0$b */
    /* loaded from: classes3.dex */
    public final class b extends AbstractC6692h1<File> {
        @NotNull
        public final ArrayDeque<c> Z;

        /* renamed from: o.Yp0$b$a */
        /* loaded from: classes3.dex */
        public final class a extends a {
            public boolean b;
            @Nullable
            public File[] c;
            public int d;
            public boolean e;
            public final /* synthetic */ b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull b bVar, File file) {
                super(file);
                C6562gT0.p(file, "rootDir");
                this.f = bVar;
            }

            @Override // o.C4833Yp0.c
            @Nullable
            public File b() {
                if (!this.e && this.c == null) {
                    HA0 ha0 = C4833Yp0.this.c;
                    if (ha0 != null && !((Boolean) ha0.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.c = listFiles;
                    if (listFiles == null) {
                        VA0 va0 = C4833Yp0.this.e;
                        if (va0 != null) {
                            va0.i(a(), new O3(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i = this.d;
                    C6562gT0.m(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.c;
                        C6562gT0.m(fileArr2);
                        int i2 = this.d;
                        this.d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.b) {
                    HA0 ha02 = C4833Yp0.this.d;
                    if (ha02 != null) {
                        ha02.invoke(a());
                    }
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        @InterfaceC8303na2({"SMAP\nFileTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileTreeWalk.kt\nkotlin/io/FileTreeWalk$FileTreeWalkIterator$SingleFileState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n1#2:274\n*E\n"})
        /* renamed from: o.Yp0$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public final class C0252b extends c {
            public boolean b;
            public final /* synthetic */ b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0252b(@NotNull b bVar, File file) {
                super(file);
                C6562gT0.p(file, "rootFile");
                this.c = bVar;
            }

            @Override // o.C4833Yp0.c
            @Nullable
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        /* renamed from: o.Yp0$b$c */
        /* loaded from: classes3.dex */
        public final class c extends a {
            public boolean b;
            @Nullable
            public File[] c;
            public int d;
            public final /* synthetic */ b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(@NotNull b bVar, File file) {
                super(file);
                C6562gT0.p(file, "rootDir");
                this.e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
                if (r0.length == 0) goto L30;
             */
            @Override // o.C4833Yp0.c
            @Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File b() {
                VA0 va0;
                if (!this.b) {
                    HA0 ha0 = C4833Yp0.this.c;
                    if (ha0 != null && !((Boolean) ha0.invoke(a())).booleanValue()) {
                        return null;
                    }
                    this.b = true;
                    return a();
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i = this.d;
                    C6562gT0.m(fileArr);
                    if (i >= fileArr.length) {
                        HA0 ha02 = C4833Yp0.this.d;
                        if (ha02 != null) {
                            ha02.invoke(a());
                        }
                        return null;
                    }
                }
                if (this.c == null) {
                    File[] listFiles = a().listFiles();
                    this.c = listFiles;
                    if (listFiles == null && (va0 = C4833Yp0.this.e) != null) {
                        va0.i(a(), new O3(a(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.c;
                    if (fileArr2 != null) {
                        C6562gT0.m(fileArr2);
                    }
                    HA0 ha03 = C4833Yp0.this.d;
                    if (ha03 != null) {
                        ha03.invoke(a());
                    }
                    return null;
                }
                File[] fileArr3 = this.c;
                C6562gT0.m(fileArr3);
                int i2 = this.d;
                this.d = i2 + 1;
                return fileArr3[i2];
            }
        }

        /* renamed from: o.Yp0$b$d */
        /* loaded from: classes3.dex */
        public /* synthetic */ class d {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[EnumC4449Uq0.values().length];
                try {
                    iArr[EnumC4449Uq0.X.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC4449Uq0.Y.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                a = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.Z = arrayDeque;
            if (C4833Yp0.this.a.isDirectory()) {
                arrayDeque.push(f(C4833Yp0.this.a));
            } else if (C4833Yp0.this.a.isFile()) {
                arrayDeque.push(new C0252b(this, C4833Yp0.this.a));
            } else {
                c();
            }
        }

        @Override // o.AbstractC6692h1
        public void b() {
            File g = g();
            if (g != null) {
                d(g);
            } else {
                c();
            }
        }

        public final a f(File file) {
            int i = d.a[C4833Yp0.this.b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new a(this, file);
                }
                throw new C3865Oq1();
            }
            return new c(this, file);
        }

        public final File g() {
            File b;
            while (true) {
                c peek = this.Z.peek();
                if (peek == null) {
                    return null;
                }
                b = peek.b();
                if (b == null) {
                    this.Z.pop();
                } else if (C6562gT0.g(b, peek.a()) || !b.isDirectory() || this.Z.size() >= C4833Yp0.this.f) {
                    break;
                } else {
                    this.Z.push(f(b));
                }
            }
            return b;
        }
    }

    /* renamed from: o.Yp0$c */
    /* loaded from: classes3.dex */
    public static abstract class c {
        @NotNull
        public final File a;

        public c(@NotNull File file) {
            C6562gT0.p(file, "root");
            this.a = file;
        }

        @NotNull
        public final File a() {
            return this.a;
        }

        @Nullable
        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4833Yp0(File file, EnumC4449Uq0 enumC4449Uq0, HA0<? super File, Boolean> ha0, HA0<? super File, C7458kA2> ha02, VA0<? super File, ? super IOException, C7458kA2> va0, int i) {
        this.a = file;
        this.b = enumC4449Uq0;
        this.c = ha0;
        this.d = ha02;
        this.e = va0;
        this.f = i;
    }

    @NotNull
    public final C4833Yp0 i(int i) {
        if (i > 0) {
            return new C4833Yp0(this.a, this.b, this.c, this.d, this.e, i);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i + '.');
    }

    @Override // o.B02
    @NotNull
    public Iterator<File> iterator() {
        return new b();
    }

    @NotNull
    public final C4833Yp0 j(@NotNull HA0<? super File, Boolean> ha0) {
        C6562gT0.p(ha0, "function");
        return new C4833Yp0(this.a, this.b, ha0, this.d, this.e, this.f);
    }

    @NotNull
    public final C4833Yp0 k(@NotNull VA0<? super File, ? super IOException, C7458kA2> va0) {
        C6562gT0.p(va0, "function");
        return new C4833Yp0(this.a, this.b, this.c, this.d, va0, this.f);
    }

    @NotNull
    public final C4833Yp0 l(@NotNull HA0<? super File, C7458kA2> ha0) {
        C6562gT0.p(ha0, "function");
        return new C4833Yp0(this.a, this.b, this.c, ha0, this.e, this.f);
    }

    public /* synthetic */ C4833Yp0(File file, EnumC4449Uq0 enumC4449Uq0, HA0 ha0, HA0 ha02, VA0 va0, int i, int i2, C9516sY c9516sY) {
        this(file, (i2 & 2) != 0 ? EnumC4449Uq0.X : enumC4449Uq0, ha0, ha02, va0, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4833Yp0(@NotNull File file, @NotNull EnumC4449Uq0 enumC4449Uq0) {
        this(file, enumC4449Uq0, null, null, null, 0, 32, null);
        C6562gT0.p(file, "start");
        C6562gT0.p(enumC4449Uq0, "direction");
    }

    public /* synthetic */ C4833Yp0(File file, EnumC4449Uq0 enumC4449Uq0, int i, C9516sY c9516sY) {
        this(file, (i & 2) != 0 ? EnumC4449Uq0.X : enumC4449Uq0);
    }
}
