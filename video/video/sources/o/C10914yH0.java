package o;

import o.AbstractC4253Sp2;
import o.TD0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC4912Zi0
@InterfaceC6480g82(version = "1.9")
/* renamed from: o.yH0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10914yH0 {
    @NotNull
    public static final c d = new c(null);
    @NotNull
    public static final C10914yH0 e;
    @NotNull
    public static final C10914yH0 f;
    public final boolean a;
    @NotNull
    public final b b;
    @NotNull
    public final d c;

    /* renamed from: o.yH0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public boolean a = C10914yH0.d.a().e();
        @Nullable
        public b.a b;
        @Nullable
        public d.a c;

        @HK1
        @NotNull
        public final C10914yH0 a() {
            b a;
            d a2;
            boolean z = this.a;
            b.a aVar = this.b;
            if (aVar == null || (a = aVar.a()) == null) {
                a = b.j.a();
            }
            d.a aVar2 = this.c;
            if (aVar2 == null || (a2 = aVar2.a()) == null) {
                a2 = d.h.a();
            }
            return new C10914yH0(z, a, a2);
        }

        @XP0
        public final void b(HA0<? super b.a, C7458kA2> ha0) {
            C6562gT0.p(ha0, "builderAction");
            ha0.invoke(c());
        }

        @NotNull
        public final b.a c() {
            if (this.b == null) {
                this.b = new b.a();
            }
            b.a aVar = this.b;
            C6562gT0.m(aVar);
            return aVar;
        }

        @NotNull
        public final d.a d() {
            if (this.c == null) {
                this.c = new d.a();
            }
            d.a aVar = this.c;
            C6562gT0.m(aVar);
            return aVar;
        }

        public final boolean e() {
            return this.a;
        }

        @XP0
        public final void f(HA0<? super d.a, C7458kA2> ha0) {
            C6562gT0.p(ha0, "builderAction");
            ha0.invoke(d());
        }

        public final void g(boolean z) {
            this.a = z;
        }
    }

    /* renamed from: o.yH0$b */
    /* loaded from: classes3.dex */
    public static final class b {
        @NotNull
        public static final C0360b j = new C0360b(null);
        @NotNull
        public static final b k = new b(Integer.MAX_VALUE, Integer.MAX_VALUE, TD0.a.Y0, "", "", "");
        public final int a;
        public final int b;
        @NotNull
        public final String c;
        @NotNull
        public final String d;
        @NotNull
        public final String e;
        @NotNull
        public final String f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        /* renamed from: o.yH0$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            public int a;
            public int b;
            @NotNull
            public String c;
            @NotNull
            public String d;
            @NotNull
            public String e;
            @NotNull
            public String f;

            public a() {
                C0360b c0360b = b.j;
                this.a = c0360b.a().g();
                this.b = c0360b.a().f();
                this.c = c0360b.a().h();
                this.d = c0360b.a().d();
                this.e = c0360b.a().c();
                this.f = c0360b.a().e();
            }

            @NotNull
            public final b a() {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f);
            }

            @NotNull
            public final String b() {
                return this.e;
            }

            @NotNull
            public final String c() {
                return this.d;
            }

            @NotNull
            public final String d() {
                return this.f;
            }

            public final int e() {
                return this.b;
            }

            public final int f() {
                return this.a;
            }

            @NotNull
            public final String g() {
                return this.c;
            }

            public final void h(@NotNull String str) {
                C6562gT0.p(str, "value");
                if (!C10763xf2.m3(str, '\n', false, 2, null) && !C10763xf2.m3(str, C8206nB.d, false, 2, null)) {
                    this.e = str;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in bytePrefix, but was " + str);
            }

            public final void i(@NotNull String str) {
                C6562gT0.p(str, "value");
                if (!C10763xf2.m3(str, '\n', false, 2, null) && !C10763xf2.m3(str, C8206nB.d, false, 2, null)) {
                    this.d = str;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSeparator, but was " + str);
            }

            public final void j(@NotNull String str) {
                C6562gT0.p(str, "value");
                if (!C10763xf2.m3(str, '\n', false, 2, null) && !C10763xf2.m3(str, C8206nB.d, false, 2, null)) {
                    this.f = str;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in byteSuffix, but was " + str);
            }

            public final void k(int i) {
                if (i > 0) {
                    this.b = i;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerGroup, but was " + i);
            }

            public final void l(int i) {
                if (i > 0) {
                    this.a = i;
                    return;
                }
                throw new IllegalArgumentException("Non-positive values are prohibited for bytesPerLine, but was " + i);
            }

            public final void m(@NotNull String str) {
                C6562gT0.p(str, "<set-?>");
                this.c = str;
            }
        }

        /* renamed from: o.yH0$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0360b {
            public /* synthetic */ C0360b(C9516sY c9516sY) {
                this();
            }

            @NotNull
            public final b a() {
                return b.k;
            }

            public C0360b() {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
            if (r4 != false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            boolean z;
            boolean z2;
            boolean c;
            boolean c2;
            boolean c3;
            boolean c4;
            C6562gT0.p(str, "groupSeparator");
            C6562gT0.p(str2, "byteSeparator");
            C6562gT0.p(str3, "bytePrefix");
            C6562gT0.p(str4, "byteSuffix");
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            boolean z3 = false;
            if (i == Integer.MAX_VALUE && i2 == Integer.MAX_VALUE) {
                z = true;
            } else {
                z = false;
            }
            this.g = z;
            if (str3.length() == 0 && str4.length() == 0 && str2.length() <= 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.h = z2;
            c = C11157zH0.c(str);
            if (!c) {
                c2 = C11157zH0.c(str2);
                if (!c2) {
                    c3 = C11157zH0.c(str3);
                    if (!c3) {
                        c4 = C11157zH0.c(str4);
                    }
                }
            }
            z3 = true;
            this.i = z3;
        }

        @NotNull
        public final StringBuilder b(@NotNull StringBuilder sb, @NotNull String str) {
            C6562gT0.p(sb, "sb");
            C6562gT0.p(str, "indent");
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(this.a);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(this.b);
            sb.append(",");
            sb.append('\n');
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append(this.c);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append(this.d);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("bytePrefix = \"");
            sb.append(this.e);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append(this.f);
            sb.append(AbstractC4253Sp2.b.x1);
            return sb;
        }

        @NotNull
        public final String c() {
            return this.e;
        }

        @NotNull
        public final String d() {
            return this.d;
        }

        @NotNull
        public final String e() {
            return this.f;
        }

        public final int f() {
            return this.b;
        }

        public final int g() {
            return this.a;
        }

        @NotNull
        public final String h() {
            return this.c;
        }

        public final boolean i() {
            return this.i;
        }

        public final boolean j() {
            return this.g;
        }

        public final boolean k() {
            return this.h;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            sb.append('\n');
            b(sb, "    ").append('\n');
            sb.append(C9811tl1.d);
            return sb.toString();
        }
    }

    /* renamed from: o.yH0$c */
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final C10914yH0 a() {
            return C10914yH0.e;
        }

        @NotNull
        public final C10914yH0 b() {
            return C10914yH0.f;
        }

        public c() {
        }
    }

    static {
        b.C0360b c0360b = b.j;
        b a2 = c0360b.a();
        d.b bVar = d.h;
        e = new C10914yH0(false, a2, bVar.a());
        f = new C10914yH0(true, c0360b.a(), bVar.a());
    }

    public C10914yH0(boolean z, @NotNull b bVar, @NotNull d dVar) {
        C6562gT0.p(bVar, "bytes");
        C6562gT0.p(dVar, "number");
        this.a = z;
        this.b = bVar;
        this.c = dVar;
    }

    @NotNull
    public final b c() {
        return this.b;
    }

    @NotNull
    public final d d() {
        return this.c;
    }

    public final boolean e() {
        return this.a;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        sb.append('\n');
        sb.append("    upperCase = ");
        sb.append(this.a);
        sb.append(",");
        sb.append('\n');
        sb.append("    bytes = BytesHexFormat(");
        sb.append('\n');
        this.b.b(sb, "        ").append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.c.b(sb, "        ").append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(C9811tl1.d);
        return sb.toString();
    }

    /* renamed from: o.yH0$d */
    /* loaded from: classes3.dex */
    public static final class d {
        @NotNull
        public static final b h = new b(null);
        @NotNull
        public static final d i = new d("", "", false, 1);
        @NotNull
        public final String a;
        @NotNull
        public final String b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        /* renamed from: o.yH0$d$b */
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(C9516sY c9516sY) {
                this();
            }

            @NotNull
            public final d a() {
                return d.i;
            }

            public b() {
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
            if (r3 != false) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public d(@NotNull String str, @NotNull String str2, boolean z, int i2) {
            boolean z2;
            boolean z3;
            boolean c;
            boolean c2;
            C6562gT0.p(str, "prefix");
            C6562gT0.p(str2, "suffix");
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = i2;
            boolean z4 = false;
            if (str.length() == 0 && str2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.e = z2;
            if (z2 && i2 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f = z3;
            c = C11157zH0.c(str);
            if (!c) {
                c2 = C11157zH0.c(str2);
            }
            z4 = true;
            this.g = z4;
        }

        @NotNull
        public final StringBuilder b(@NotNull StringBuilder sb, @NotNull String str) {
            C6562gT0.p(sb, "sb");
            C6562gT0.p(str, "indent");
            sb.append(str);
            sb.append("prefix = \"");
            sb.append(this.a);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("suffix = \"");
            sb.append(this.b);
            sb.append("\",");
            sb.append('\n');
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(this.c);
            sb.append(',');
            sb.append('\n');
            sb.append(str);
            sb.append("minLength = ");
            sb.append(this.d);
            return sb;
        }

        public final boolean c() {
            return this.g;
        }

        public final int d() {
            return this.d;
        }

        @NotNull
        public final String f() {
            return this.a;
        }

        public final boolean g() {
            return this.c;
        }

        @NotNull
        public final String h() {
            return this.b;
        }

        public final boolean i() {
            return this.e;
        }

        public final boolean j() {
            return this.f;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            sb.append('\n');
            b(sb, "    ").append('\n');
            sb.append(C9811tl1.d);
            return sb.toString();
        }

        @InterfaceC8303na2({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormat$NumberHexFormat$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,844:1\n1#2:845\n*E\n"})
        /* renamed from: o.yH0$d$a */
        /* loaded from: classes3.dex */
        public static final class a {
            @NotNull
            public String a;
            @NotNull
            public String b;
            public boolean c;
            public int d;

            public a() {
                b bVar = d.h;
                this.a = bVar.a().f();
                this.b = bVar.a().h();
                this.c = bVar.a().g();
                this.d = bVar.a().d();
            }

            @NotNull
            public final d a() {
                return new d(this.a, this.b, this.c, this.d);
            }

            public final int b() {
                return this.d;
            }

            @NotNull
            public final String d() {
                return this.a;
            }

            public final boolean e() {
                return this.c;
            }

            @NotNull
            public final String f() {
                return this.b;
            }

            public final void g(int i) {
                if (i > 0) {
                    this.d = i;
                    return;
                }
                throw new IllegalArgumentException(("Non-positive values are prohibited for minLength, but was " + i).toString());
            }

            public final void h(@NotNull String str) {
                C6562gT0.p(str, "value");
                if (!C10763xf2.m3(str, '\n', false, 2, null) && !C10763xf2.m3(str, C8206nB.d, false, 2, null)) {
                    this.a = str;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in prefix, but was " + str);
            }

            public final void i(boolean z) {
                this.c = z;
            }

            public final void j(@NotNull String str) {
                C6562gT0.p(str, "value");
                if (!C10763xf2.m3(str, '\n', false, 2, null) && !C10763xf2.m3(str, C8206nB.d, false, 2, null)) {
                    this.b = str;
                    return;
                }
                throw new IllegalArgumentException("LF and CR characters are prohibited in suffix, but was " + str);
            }

            @InterfaceC6480g82(version = "2.0")
            public static /* synthetic */ void c() {
            }
        }

        @InterfaceC6480g82(version = "2.0")
        public static /* synthetic */ void e() {
        }
    }
}
