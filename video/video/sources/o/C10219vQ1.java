package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n+ 2 Regex.kt\nkotlin/text/RegexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,401:1\n22#2,3:402\n1#3:405\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nkotlin/text/Regex\n*L\n103#1:402,3\n*E\n"})
/* renamed from: o.vQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10219vQ1 implements Serializable {
    @NotNull
    public static final a Z = new a(null);
    @NotNull
    public final Pattern X;
    @Nullable
    public Set<? extends DQ1> Y;

    /* renamed from: o.vQ1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final int b(int i) {
            if ((i & 2) != 0) {
                return i | 64;
            }
            return i;
        }

        @NotNull
        public final String c(@NotNull String str) {
            C6562gT0.p(str, "literal");
            String quote = Pattern.quote(str);
            C6562gT0.o(quote, "quote(...)");
            return quote;
        }

        @NotNull
        public final String d(@NotNull String str) {
            C6562gT0.p(str, "literal");
            String quoteReplacement = Matcher.quoteReplacement(str);
            C6562gT0.o(quoteReplacement, "quoteReplacement(...)");
            return quoteReplacement;
        }

        @NotNull
        public final C10219vQ1 e(@NotNull String str) {
            C6562gT0.p(str, "literal");
            return new C10219vQ1(str, DQ1.Z0);
        }

        public a() {
        }
    }

    /* renamed from: o.vQ1$b */
    /* loaded from: classes3.dex */
    public static final class b implements Serializable {
        @NotNull
        public static final a Z = new a(null);
        private static final long serialVersionUID = 0;
        @NotNull
        public final String X;
        public final int Y;

        /* renamed from: o.vQ1$b$a */
        /* loaded from: classes3.dex */
        public static final class a {
            public /* synthetic */ a(C9516sY c9516sY) {
                this();
            }

            public a() {
            }
        }

        public b(@NotNull String str, int i) {
            C6562gT0.p(str, "pattern");
            this.X = str;
            this.Y = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.X, this.Y);
            C6562gT0.o(compile, "compile(...)");
            return new C10219vQ1(compile);
        }

        public final int a() {
            return this.Y;
        }

        @NotNull
        public final String b() {
            return this.X;
        }
    }

    /* renamed from: o.vQ1$c */
    /* loaded from: classes3.dex */
    public /* synthetic */ class c extends C7964mB0 implements HA0<P81, P81> {
        public static final c e1 = new c();

        public c() {
            super(1, P81.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // o.HA0
        /* renamed from: u0 */
        public final P81 invoke(P81 p81) {
            C6562gT0.p(p81, "p0");
            return p81.next();
        }
    }

    /* renamed from: o.vQ1$d */
    /* loaded from: classes3.dex */
    public static final class d implements HA0<DQ1, Boolean> {
        public final /* synthetic */ int X;

        public d(int i) {
            this.X = i;
        }

        @Override // o.HA0
        /* renamed from: c */
        public final Boolean invoke(DQ1 dq1) {
            boolean z;
            DQ1 dq12 = dq1;
            if ((this.X & dq12.e()) == dq12.getValue()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @FV(c = "kotlin.text.Regex$splitToSequence$1", f = "Regex.kt", i = {1, 1, 1}, l = {279, 287, 291}, m = "invokeSuspend", n = {"$this$sequence", "matcher", "splitCount"}, s = {"L$0", "L$1", "I$0"})
    /* renamed from: o.vQ1$e */
    /* loaded from: classes3.dex */
    public static final class e extends MT1 implements VA0<F02<? super String>, HM<? super C7458kA2>, Object> {
        public int Y0;
        public Object Z;
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ CharSequence c1;
        public final /* synthetic */ int d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CharSequence charSequence, int i, HM<? super e> hm) {
            super(2, hm);
            this.c1 = charSequence;
            this.d1 = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
            if (r6.b(r5, r9) != r0) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
            if (r6.b(r10, r9) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
            if (r10.b(r1, r9) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:21:0x0071). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            int i;
            F02 f02;
            Matcher matcher;
            int i2;
            Object l = C7289jT0.l();
            int i3 = this.Z0;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            RT1.n(obj);
                            return C7458kA2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.Y0;
                    f02 = (F02) this.a1;
                    RT1.n(obj);
                    matcher = (Matcher) this.Z;
                    i = matcher.end();
                    i2++;
                    if (i2 == this.d1 - 1 || !matcher.find()) {
                        CharSequence charSequence = this.c1;
                        String obj2 = charSequence.subSequence(i, charSequence.length()).toString();
                        this.a1 = null;
                        this.Z = null;
                        this.Z0 = 3;
                    }
                    String obj3 = this.c1.subSequence(i, matcher.start()).toString();
                    this.a1 = f02;
                    this.Z = matcher;
                    this.Y0 = i2;
                    this.Z0 = 2;
                } else {
                    RT1.n(obj);
                }
            } else {
                RT1.n(obj);
                F02 f022 = (F02) this.a1;
                Matcher matcher2 = C10219vQ1.this.X.matcher(this.c1);
                if (this.d1 != 1 && matcher2.find()) {
                    i = 0;
                    f02 = f022;
                    matcher = matcher2;
                    i2 = 0;
                    String obj32 = this.c1.subSequence(i, matcher.start()).toString();
                    this.a1 = f02;
                    this.Z = matcher;
                    this.Y0 = i2;
                    this.Z0 = 2;
                } else {
                    String obj4 = this.c1.toString();
                    this.Z0 = 1;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: O */
        public final Object i(F02<? super String> f02, HM<? super C7458kA2> hm) {
            return ((e) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            e eVar = new e(this.c1, this.d1, hm);
            eVar.a1 = obj;
            return eVar;
        }
    }

    @HK1
    public C10219vQ1(@NotNull Pattern pattern) {
        C6562gT0.p(pattern, "nativePattern");
        this.X = pattern;
    }

    public static /* synthetic */ P81 e(C10219vQ1 c10219vQ1, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c10219vQ1.d(charSequence, i);
    }

    public static /* synthetic */ B02 g(C10219vQ1 c10219vQ1, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c10219vQ1.f(charSequence, i);
    }

    public static final P81 h(C10219vQ1 c10219vQ1, CharSequence charSequence, int i) {
        return c10219vQ1.d(charSequence, i);
    }

    public static /* synthetic */ List s(C10219vQ1 c10219vQ1, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c10219vQ1.r(charSequence, i);
    }

    public static /* synthetic */ B02 u(C10219vQ1 c10219vQ1, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c10219vQ1.t(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.X.pattern();
        C6562gT0.o(pattern, "pattern(...)");
        return new b(pattern, this.X.flags());
    }

    public final boolean c(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "input");
        return this.X.matcher(charSequence).find();
    }

    @Nullable
    public final P81 d(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "input");
        Matcher matcher = this.X.matcher(charSequence);
        C6562gT0.o(matcher, "matcher(...)");
        return CQ1.a(matcher, i, charSequence);
    }

    @NotNull
    public final B02<P81> f(@NotNull final CharSequence charSequence, final int i) {
        C6562gT0.p(charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return U02.v(new FA0() { // from class: o.uQ1
                @Override // o.FA0
                public final Object invoke() {
                    P81 h;
                    h = C10219vQ1.h(C10219vQ1.this, charSequence, i);
                    return h;
                }
            }, c.e1);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i + ", input length: " + charSequence.length());
    }

    @NotNull
    public final Set<DQ1> i() {
        Set set = this.Y;
        if (set == null) {
            int flags = this.X.flags();
            EnumSet allOf = EnumSet.allOf(DQ1.class);
            C6562gT0.m(allOf);
            C9444sF.Q0(allOf, new d(flags));
            Set<DQ1> unmodifiableSet = Collections.unmodifiableSet(allOf);
            C6562gT0.o(unmodifiableSet, "unmodifiableSet(...)");
            this.Y = unmodifiableSet;
            return unmodifiableSet;
        }
        return set;
    }

    @NotNull
    public final String j() {
        String pattern = this.X.pattern();
        C6562gT0.o(pattern, "pattern(...)");
        return pattern;
    }

    @InterfaceC6480g82(version = "1.7")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @Nullable
    public final P81 k(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "input");
        Matcher region = this.X.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length());
        if (region.lookingAt()) {
            C6562gT0.m(region);
            return new Q81(region, charSequence);
        }
        return null;
    }

    @Nullable
    public final P81 l(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "input");
        Matcher matcher = this.X.matcher(charSequence);
        C6562gT0.o(matcher, "matcher(...)");
        return CQ1.b(matcher, charSequence);
    }

    public final boolean m(@NotNull CharSequence charSequence) {
        C6562gT0.p(charSequence, "input");
        return this.X.matcher(charSequence).matches();
    }

    @InterfaceC6480g82(version = "1.7")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    public final boolean n(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "input");
        return this.X.matcher(charSequence).useAnchoringBounds(false).useTransparentBounds(true).region(i, charSequence.length()).lookingAt();
    }

    @NotNull
    public final String o(@NotNull CharSequence charSequence, @NotNull String str) {
        C6562gT0.p(charSequence, "input");
        C6562gT0.p(str, "replacement");
        String replaceAll = this.X.matcher(charSequence).replaceAll(str);
        C6562gT0.o(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @NotNull
    public final String p(@NotNull CharSequence charSequence, @NotNull HA0<? super P81, ? extends CharSequence> ha0) {
        C6562gT0.p(charSequence, "input");
        C6562gT0.p(ha0, "transform");
        int i = 0;
        P81 e2 = e(this, charSequence, 0, 2, null);
        if (e2 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(charSequence, i, e2.c().d().intValue());
            sb.append(ha0.invoke(e2));
            i = e2.c().h().intValue() + 1;
            e2 = e2.next();
            if (i >= length) {
                break;
            }
        } while (e2 != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "toString(...)");
        return sb2;
    }

    @NotNull
    public final String q(@NotNull CharSequence charSequence, @NotNull String str) {
        C6562gT0.p(charSequence, "input");
        C6562gT0.p(str, "replacement");
        String replaceFirst = this.X.matcher(charSequence).replaceFirst(str);
        C6562gT0.o(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    @NotNull
    public final List<String> r(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "input");
        C10763xf2.h5(i);
        Matcher matcher = this.X.matcher(charSequence);
        if (i != 1 && matcher.find()) {
            int i2 = 10;
            if (i > 0) {
                i2 = C5075aO1.B(i, 10);
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = i - 1;
            int i4 = 0;
            do {
                arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
                i4 = matcher.end();
                if (i3 >= 0 && arrayList.size() == i3) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
            return arrayList;
        }
        return C7979mF.k(charSequence.toString());
    }

    @InterfaceC6480g82(version = "1.6")
    @InterfaceC10924yJ2(markerClass = {InterfaceC4912Zi0.class})
    @NotNull
    public final B02<String> t(@NotNull CharSequence charSequence, int i) {
        C6562gT0.p(charSequence, "input");
        C10763xf2.h5(i);
        return N02.b(new e(charSequence, i, null));
    }

    @NotNull
    public String toString() {
        String pattern = this.X.toString();
        C6562gT0.o(pattern, "toString(...)");
        return pattern;
    }

    @NotNull
    public final Pattern v() {
        return this.X;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10219vQ1(@NotNull String str) {
        this(r2);
        C6562gT0.p(str, "pattern");
        Pattern compile = Pattern.compile(str);
        C6562gT0.o(compile, "compile(...)");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10219vQ1(@NotNull String str, @NotNull DQ1 dq1) {
        this(r2);
        C6562gT0.p(str, "pattern");
        C6562gT0.p(dq1, "option");
        Pattern compile = Pattern.compile(str, Z.b(dq1.getValue()));
        C6562gT0.o(compile, "compile(...)");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C10219vQ1(@NotNull String str, @NotNull Set<? extends DQ1> set) {
        this(r2);
        C6562gT0.p(str, "pattern");
        C6562gT0.p(set, C9998uW1.m0);
        Pattern compile = Pattern.compile(str, Z.b(CQ1.e(set)));
        C6562gT0.o(compile, "compile(...)");
    }
}
