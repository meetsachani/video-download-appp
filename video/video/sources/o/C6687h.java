package o;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "-FileSystem")
@InterfaceC8303na2({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n52#2,5:156\n52#2,21:161\n60#2,10:182\n57#2,2:192\n71#2,2:194\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,5\n66#1:161,21\n65#1:182,10\n65#1:192,2\n65#1:194,2\n*E\n"})
/* renamed from: o.h  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6687h {

    @FV(c = "okio.internal.-FileSystem", f = "FileSystem.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {116, 135, C3503Kz.i0}, m = "collectRecursively", n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    /* renamed from: o.h$a */
    /* loaded from: classes4.dex */
    public static final class a extends KM {
        public Object Y0;
        public Object Z0;
        public Object a1;
        public Object b1;
        public Object c1;
        public boolean d1;
        public boolean e1;
        public /* synthetic */ Object f1;
        public int g1;

        public a(HM<? super a> hm) {
            super(hm);
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            this.f1 = obj;
            this.g1 |= Integer.MIN_VALUE;
            return C6687h.a(null, null, null, null, false, false, this);
        }
    }

    @FV(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: o.h$b */
    /* loaded from: classes4.dex */
    public static final class b extends MT1 implements VA0<F02<? super C4972Zy1>, HM<? super C7458kA2>, Object> {
        public /* synthetic */ Object Y0;
        public int Z;
        public final /* synthetic */ AbstractC2576Bp0 Z0;
        public final /* synthetic */ C4972Zy1 a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC2576Bp0 abstractC2576Bp0, C4972Zy1 c4972Zy1, HM<? super b> hm) {
            super(2, hm);
            this.Z0 = abstractC2576Bp0;
            this.a1 = c4972Zy1;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            Object l = C7289jT0.l();
            int i = this.Z;
            if (i != 0) {
                if (i == 1) {
                    RT1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                AbstractC2576Bp0 abstractC2576Bp0 = this.Z0;
                C7085ie c7085ie = new C7085ie();
                C4972Zy1 c4972Zy1 = this.a1;
                this.Z = 1;
                if (C6687h.a((F02) this.Y0, abstractC2576Bp0, c7085ie, c4972Zy1, false, true, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        @Nullable
        /* renamed from: O */
        public final Object i(@NotNull F02<? super C4972Zy1> f02, @Nullable HM<? super C7458kA2> hm) {
            return ((b) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        @NotNull
        public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
            b bVar = new b(this.Z0, this.a1, hm);
            bVar.Y0 = obj;
            return bVar;
        }
    }

    @FV(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", i = {0, 0}, l = {96}, m = "invokeSuspend", n = {"$this$sequence", "stack"}, s = {"L$0", "L$1"})
    /* renamed from: o.h$c */
    /* loaded from: classes4.dex */
    public static final class c extends MT1 implements VA0<F02<? super C4972Zy1>, HM<? super C7458kA2>, Object> {
        public Object Y0;
        public Object Z;
        public int Z0;
        public /* synthetic */ Object a1;
        public final /* synthetic */ C4972Zy1 b1;
        public final /* synthetic */ AbstractC2576Bp0 c1;
        public final /* synthetic */ boolean d1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C4972Zy1 c4972Zy1, AbstractC2576Bp0 abstractC2576Bp0, boolean z, HM<? super c> hm) {
            super(2, hm);
            this.b1 = c4972Zy1;
            this.c1 = abstractC2576Bp0;
            this.d1 = z;
        }

        @Override // o.AbstractC5644cl
        @Nullable
        public final Object F(@NotNull Object obj) {
            F02 f02;
            C7085ie c7085ie;
            Iterator<C4972Zy1> it;
            Object l = C7289jT0.l();
            int i = this.Z0;
            if (i != 0) {
                if (i == 1) {
                    it = (Iterator) this.Y0;
                    f02 = (F02) this.a1;
                    RT1.n(obj);
                    c7085ie = (C7085ie) this.Z;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                RT1.n(obj);
                C7085ie c7085ie2 = new C7085ie();
                c7085ie2.addLast(this.b1);
                f02 = (F02) this.a1;
                c7085ie = c7085ie2;
                it = this.c1.y(this.b1).iterator();
            }
            while (it.hasNext()) {
                AbstractC2576Bp0 abstractC2576Bp0 = this.c1;
                boolean z = this.d1;
                this.a1 = f02;
                this.Z = c7085ie;
                this.Y0 = it;
                this.Z0 = 1;
                if (C6687h.a(f02, abstractC2576Bp0, c7085ie, it.next(), z, false, this) == l) {
                    return l;
                }
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        @Nullable
        /* renamed from: O */
        public final Object i(@NotNull F02<? super C4972Zy1> f02, @Nullable HM<? super C7458kA2> hm) {
            return ((c) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        @NotNull
        public final HM<C7458kA2> t(@Nullable Object obj, @NotNull HM<?> hm) {
            c cVar = new c(this.b1, this.c1, this.d1, hm);
            cVar.a1 = obj;
            return cVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
        if (r15.b(r1, r4) == r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
        if (r0 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
        if (r11 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
        r6.addLast(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
        r3 = r3.iterator();
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
        if (r10.b(r1, r4) == r5) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb A[Catch: all -> 0x0138, TRY_LEAVE, TryCatch #2 {all -> 0x0138, blocks: (B:48:0x00f5, B:50:0x00fb, B:47:0x00ed), top: B:77:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0130 -> B:19:0x005d). Please submit an issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull F02<? super C4972Zy1> f02, @NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull C7085ie<C4972Zy1> c7085ie, @NotNull C4972Zy1 c4972Zy1, boolean z, boolean z2, @NotNull HM<? super C7458kA2> hm) {
        a aVar;
        int i;
        AbstractC2576Bp0 abstractC2576Bp02;
        C7085ie<C4972Zy1> c7085ie2;
        boolean z3;
        AbstractC2576Bp0 abstractC2576Bp03;
        boolean z4;
        F02<? super C4972Zy1> f022;
        List<C4972Zy1> z5;
        boolean z6;
        boolean z7;
        a aVar2;
        C7085ie<C4972Zy1> c7085ie3;
        AbstractC2576Bp0 abstractC2576Bp04;
        F02<? super C4972Zy1> f023;
        C4972Zy1 c4972Zy12 = c4972Zy1;
        boolean z8 = z2;
        if (hm instanceof a) {
            aVar = (a) hm;
            int i2 = aVar.g1;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.g1 = i2 - Integer.MIN_VALUE;
                Object obj = aVar.f1;
                Object l = C7289jT0.l();
                i = aVar.g1;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                RT1.n(obj);
                                return C7458kA2.a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        boolean z9 = aVar.e1;
                        boolean z10 = aVar.d1;
                        Iterator<C4972Zy1> it = (Iterator) aVar.c1;
                        C4972Zy1 c4972Zy13 = (C4972Zy1) aVar.b1;
                        C7085ie<C4972Zy1> c7085ie4 = (C7085ie) aVar.a1;
                        AbstractC2576Bp0 abstractC2576Bp05 = (AbstractC2576Bp0) aVar.Z0;
                        F02<? super C4972Zy1> f024 = (F02) aVar.Y0;
                        try {
                            RT1.n(obj);
                            boolean z11 = z9;
                            z4 = z10;
                            C4972Zy1 c4972Zy14 = c4972Zy13;
                            c7085ie2 = c7085ie4;
                            abstractC2576Bp03 = abstractC2576Bp05;
                            f022 = f024;
                            if (!it.hasNext()) {
                                try {
                                    C4972Zy1 next = it.next();
                                    aVar.Y0 = f022;
                                    aVar.Z0 = abstractC2576Bp03;
                                    aVar.a1 = c7085ie2;
                                    aVar.b1 = c4972Zy14;
                                    aVar.c1 = it;
                                    aVar.d1 = z4;
                                    aVar.e1 = z11;
                                    aVar.g1 = 2;
                                    Object a2 = a(f023, abstractC2576Bp04, c7085ie3, next, z6, z7, aVar2);
                                    f024 = f023;
                                    abstractC2576Bp05 = abstractC2576Bp04;
                                    c7085ie4 = c7085ie3;
                                    z11 = z7;
                                    if (a2 != l) {
                                        z4 = z6;
                                        aVar = aVar2;
                                        c7085ie2 = c7085ie4;
                                        abstractC2576Bp03 = abstractC2576Bp05;
                                        f022 = f024;
                                        if (!it.hasNext()) {
                                            c7085ie2.removeLast();
                                            z8 = z11;
                                            c4972Zy12 = c4972Zy14;
                                            if (z8) {
                                                aVar.Y0 = null;
                                                aVar.Z0 = null;
                                                aVar.a1 = null;
                                                aVar.b1 = null;
                                                aVar.c1 = null;
                                                aVar.g1 = 3;
                                            } else {
                                                return C7458kA2.a;
                                            }
                                        }
                                    }
                                    return l;
                                } catch (Throwable th) {
                                    th = th;
                                    c7085ie4 = c7085ie3;
                                    c7085ie4.removeLast();
                                    throw th;
                                }
                                z6 = z4;
                                z7 = z11;
                                aVar2 = aVar;
                                c7085ie3 = c7085ie2;
                                abstractC2576Bp04 = abstractC2576Bp03;
                                f023 = f022;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            c7085ie4.removeLast();
                            throw th;
                        }
                    } else {
                        boolean z12 = aVar.e1;
                        boolean z13 = aVar.d1;
                        C4972Zy1 c4972Zy15 = (C4972Zy1) aVar.b1;
                        c7085ie2 = (C7085ie) aVar.a1;
                        abstractC2576Bp03 = (AbstractC2576Bp0) aVar.Z0;
                        f022 = (F02) aVar.Y0;
                        RT1.n(obj);
                        z8 = z12;
                        z4 = z13;
                        c4972Zy12 = c4972Zy15;
                    }
                } else {
                    RT1.n(obj);
                    if (!z8) {
                        aVar.Y0 = f02;
                        abstractC2576Bp02 = abstractC2576Bp0;
                        aVar.Z0 = abstractC2576Bp02;
                        c7085ie2 = c7085ie;
                        aVar.a1 = c7085ie2;
                        aVar.b1 = c4972Zy12;
                        z3 = z;
                        aVar.d1 = z3;
                        aVar.e1 = z8;
                        aVar.g1 = 1;
                    } else {
                        abstractC2576Bp02 = abstractC2576Bp0;
                        c7085ie2 = c7085ie;
                        z3 = z;
                    }
                    abstractC2576Bp03 = abstractC2576Bp02;
                    z4 = z3;
                    f022 = f02;
                }
                z5 = abstractC2576Bp03.z(c4972Zy12);
                if (z5 == null) {
                    z5 = C8222nF.H();
                }
                if (!z5.isEmpty()) {
                    int i3 = 0;
                    C4972Zy1 c4972Zy16 = c4972Zy12;
                    while (true) {
                        if (z4 && c7085ie2.contains(c4972Zy16)) {
                            throw new IOException("symlink cycle at " + c4972Zy12);
                        }
                        C4972Zy1 h = h(abstractC2576Bp03, c4972Zy16);
                        if (h == null) {
                            break;
                        }
                        i3++;
                        c4972Zy16 = h;
                    }
                }
                if (z8) {
                }
            }
        }
        aVar = new a(hm);
        Object obj2 = aVar.f1;
        Object l2 = C7289jT0.l();
        i = aVar.g1;
        if (i == 0) {
        }
        z5 = abstractC2576Bp03.z(c4972Zy12);
        if (z5 == null) {
        }
        if (!z5.isEmpty()) {
        }
        if (z8) {
        }
    }

    public static final void b(@NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull C4972Zy1 c4972Zy1, @NotNull C4972Zy1 c4972Zy12) throws IOException {
        Long l;
        Long valueOf;
        C6562gT0.p(abstractC2576Bp0, "<this>");
        C6562gT0.p(c4972Zy1, "source");
        C6562gT0.p(c4972Zy12, "target");
        InterfaceC7072ia2 M = abstractC2576Bp0.M(c4972Zy1);
        Throwable th = null;
        try {
            InterfaceC2579Bq d = C9604su1.d(abstractC2576Bp0.J(c4972Zy12));
            valueOf = Long.valueOf(d.Q1(M));
            if (d != null) {
                try {
                    d.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            th = null;
        } catch (Throwable th3) {
            if (M != null) {
                try {
                    M.close();
                } catch (Throwable th4) {
                    C3917Pf0.a(th3, th4);
                }
            }
            th = th3;
            l = null;
        }
        if (th == null) {
            C6562gT0.m(valueOf);
            l = Long.valueOf(valueOf.longValue());
            if (M != null) {
                try {
                    M.close();
                } catch (Throwable th5) {
                    th = th5;
                }
            }
            if (th == null) {
                C6562gT0.m(l);
                return;
            }
            throw th;
        }
        throw th;
    }

    public static final void c(@NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException {
        C6562gT0.p(abstractC2576Bp0, "<this>");
        C6562gT0.p(c4972Zy1, "dir");
        C7085ie c7085ie = new C7085ie();
        for (C4972Zy1 c4972Zy12 = c4972Zy1; c4972Zy12 != null && !abstractC2576Bp0.w(c4972Zy12); c4972Zy12 = c4972Zy12.w()) {
            c7085ie.addFirst(c4972Zy12);
        }
        if (z && c7085ie.isEmpty()) {
            throw new IOException(c4972Zy1 + " already exists.");
        }
        Iterator<E> it = c7085ie.iterator();
        while (it.hasNext()) {
            abstractC2576Bp0.m((C4972Zy1) it.next());
        }
    }

    public static final void d(@NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException {
        boolean z2;
        C6562gT0.p(abstractC2576Bp0, "<this>");
        C6562gT0.p(c4972Zy1, "fileOrDirectory");
        Iterator it = N02.b(new b(abstractC2576Bp0, c4972Zy1, null)).iterator();
        while (it.hasNext()) {
            C4972Zy1 c4972Zy12 = (C4972Zy1) it.next();
            if (z && !it.hasNext()) {
                z2 = true;
            } else {
                z2 = false;
            }
            abstractC2576Bp0.r(c4972Zy12, z2);
        }
    }

    public static final boolean e(@NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(abstractC2576Bp0, "<this>");
        C6562gT0.p(c4972Zy1, "path");
        if (abstractC2576Bp0.E(c4972Zy1) != null) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final B02<C4972Zy1> f(@NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull C4972Zy1 c4972Zy1, boolean z) throws IOException {
        C6562gT0.p(abstractC2576Bp0, "<this>");
        C6562gT0.p(c4972Zy1, "dir");
        return N02.b(new c(c4972Zy1, abstractC2576Bp0, z, null));
    }

    @NotNull
    public static final C9340rp0 g(@NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(abstractC2576Bp0, "<this>");
        C6562gT0.p(c4972Zy1, "path");
        C9340rp0 E = abstractC2576Bp0.E(c4972Zy1);
        if (E != null) {
            return E;
        }
        throw new FileNotFoundException("no such file: " + c4972Zy1);
    }

    @Nullable
    public static final C4972Zy1 h(@NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull C4972Zy1 c4972Zy1) throws IOException {
        C6562gT0.p(abstractC2576Bp0, "<this>");
        C6562gT0.p(c4972Zy1, "path");
        C4972Zy1 i = abstractC2576Bp0.D(c4972Zy1).i();
        if (i == null) {
            return null;
        }
        C4972Zy1 w = c4972Zy1.w();
        C6562gT0.m(w);
        return w.C(i);
    }
}
