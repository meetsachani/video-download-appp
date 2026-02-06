package o;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Iz1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3309Iz1 implements B02<Path> {
    @NotNull
    public final Path a;
    @NotNull
    public final DA1[] b;

    @FV(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {191, 197}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @InterfaceC8303na2({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,180:1\n44#2,19:181\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$bfsIterator$1\n*L\n101#1:181,19\n*E\n"})
    /* renamed from: o.Iz1$a */
    /* loaded from: classes3.dex */
    public static final class a extends MT1 implements VA0<F02<? super Path>, HM<? super C7458kA2>, Object> {
        public Object Y0;
        public Object Z;
        public Object Z0;
        public Object a1;
        public Object b1;
        public int c1;
        public /* synthetic */ Object d1;

        public a(HM<? super a> hm) {
            super(2, hm);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00fa  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00f8 -> B:11:0x007f). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00fa -> B:11:0x007f). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            C7085ie c7085ie;
            Q30 q30;
            F02 f02;
            C9381rz1 c9381rz1;
            Path path;
            C3309Iz1 c3309Iz1;
            boolean isDirectory;
            F02 f022;
            C7085ie c7085ie2;
            Q30 q302;
            C9381rz1 c9381rz12;
            C3309Iz1 c3309Iz12;
            Path path2;
            boolean isDirectory2;
            LinkOption linkOption;
            boolean exists;
            Object l = C7289jT0.l();
            int i = this.c1;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        q30 = (Q30) this.Y0;
                        c7085ie = (C7085ie) this.Z;
                        f02 = (F02) this.d1;
                        RT1.n(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    path2 = N30.a(this.b1);
                    c3309Iz12 = (C3309Iz1) this.a1;
                    c9381rz12 = (C9381rz1) this.Z0;
                    q302 = (Q30) this.Y0;
                    c7085ie2 = (C7085ie) this.Z;
                    f022 = (F02) this.d1;
                    RT1.n(obj);
                    C7085ie c7085ie3 = c7085ie2;
                    path = path2;
                    q30 = q302;
                    c3309Iz1 = c3309Iz12;
                    c7085ie = c7085ie3;
                    c9381rz1 = c9381rz12;
                    f02 = f022;
                    LinkOption[] k = c3309Iz1.k();
                    LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(k, k.length);
                    isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
                    if (isDirectory) {
                        c7085ie.addAll(q30.c(c9381rz1));
                    }
                }
            } else {
                RT1.n(obj);
                C7085ie c7085ie4 = new C7085ie();
                Q30 q303 = new Q30(C3309Iz1.this.i());
                c7085ie4.addLast(new C9381rz1(C3309Iz1.this.a, C3700Mz1.b(C3309Iz1.this.a, C3309Iz1.this.k()), null));
                c7085ie = c7085ie4;
                q30 = q303;
                f02 = (F02) this.d1;
            }
            while (!c7085ie.isEmpty()) {
                c9381rz1 = (C9381rz1) c7085ie.removeFirst();
                c3309Iz1 = C3309Iz1.this;
                path = c9381rz1.d();
                if (c9381rz1.c() != null) {
                    C9673tB1.O(path);
                }
                LinkOption[] k2 = c3309Iz1.k();
                LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(k2, k2.length);
                isDirectory2 = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
                if (!isDirectory2) {
                    linkOption = LinkOption.NOFOLLOW_LINKS;
                    exists = Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
                    if (exists) {
                        this.d1 = f02;
                        this.Z = c7085ie;
                        this.Y0 = q30;
                        this.Z0 = null;
                        this.a1 = null;
                        this.b1 = null;
                        this.c1 = 2;
                        if (f02.b(path, this) == l) {
                        }
                    }
                } else if (!C3700Mz1.a(c9381rz1)) {
                    if (c3309Iz1.j()) {
                        this.d1 = f02;
                        this.Z = c7085ie;
                        this.Y0 = q30;
                        this.Z0 = c9381rz1;
                        this.a1 = c3309Iz1;
                        this.b1 = path;
                        this.c1 = 1;
                        if (f02.b(path, this) != l) {
                            q302 = q30;
                            path2 = path;
                            c7085ie2 = c7085ie;
                            c3309Iz12 = c3309Iz1;
                            f022 = f02;
                            c9381rz12 = c9381rz1;
                            C7085ie c7085ie32 = c7085ie2;
                            path = path2;
                            q30 = q302;
                            c3309Iz1 = c3309Iz12;
                            c7085ie = c7085ie32;
                            c9381rz1 = c9381rz12;
                            f02 = f022;
                        }
                    }
                    LinkOption[] k3 = c3309Iz1.k();
                    LinkOption[] linkOptionArr3 = (LinkOption[]) Arrays.copyOf(k3, k3.length);
                    isDirectory = Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr3, linkOptionArr3.length));
                    if (isDirectory) {
                    }
                    while (!c7085ie.isEmpty()) {
                    }
                } else {
                    C3211Hz1.a();
                    throw C3113Gz1.a(path.toString());
                }
                return l;
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: O */
        public final Object i(F02<? super Path> f02, HM<? super C7458kA2> hm) {
            return ((a) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(hm);
            aVar.d1 = obj;
            return aVar;
        }
    }

    @FV(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {191, 197, 210, 216}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    @InterfaceC8303na2({"SMAP\nPathTreeWalk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n+ 2 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk\n*L\n1#1,180:1\n44#2,19:181\n44#2,19:200\n*S KotlinDebug\n*F\n+ 1 PathTreeWalk.kt\nkotlin/io/path/PathTreeWalk$dfsIterator$1\n*L\n70#1:181,19\n81#1:200,19\n*E\n"})
    /* renamed from: o.Iz1$b */
    /* loaded from: classes3.dex */
    public static final class b extends MT1 implements VA0<F02<? super Path>, HM<? super C7458kA2>, Object> {
        public Object Y0;
        public Object Z;
        public Object Z0;
        public Object a1;
        public Object b1;
        public int c1;
        public /* synthetic */ Object d1;

        public b(HM<? super b> hm) {
            super(2, hm);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x014c, code lost:
            if (r8.b(r11, r14) == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0156  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x01dc -> B:39:0x0150). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01de -> B:39:0x0150). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            F02 f02;
            C7085ie c7085ie;
            Q30 q30;
            C9381rz1 c9381rz1;
            C3309Iz1 c3309Iz1;
            Path d;
            boolean isDirectory;
            LinkOption linkOption;
            boolean exists;
            Q30 q302;
            Path path;
            F02 f022;
            C9381rz1 c9381rz12;
            C3309Iz1 c3309Iz12;
            C7085ie c7085ie2;
            C7085ie c7085ie3;
            boolean isDirectory2;
            boolean isDirectory3;
            LinkOption linkOption2;
            boolean exists2;
            boolean isDirectory4;
            Object l = C7289jT0.l();
            int i = this.c1;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            Path path2 = N30.a(this.b1);
                            C3309Iz1 c3309Iz13 = (C3309Iz1) this.a1;
                            C9381rz1 c9381rz13 = (C9381rz1) this.Z0;
                            Q30 q303 = (Q30) this.Y0;
                            C7085ie c7085ie4 = (C7085ie) this.Z;
                            F02 f023 = (F02) this.d1;
                            RT1.n(obj);
                            C7085ie c7085ie5 = c7085ie4;
                            Path d2 = path2;
                            q30 = q303;
                            C3309Iz1 c3309Iz14 = c3309Iz13;
                            c7085ie3 = c7085ie5;
                            C9381rz1 next = c9381rz13;
                            f02 = f023;
                            LinkOption[] k = c3309Iz14.k();
                            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(k, k.length);
                            isDirectory4 = Files.isDirectory(d2, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
                            if (isDirectory4) {
                                next.e(q30.c(next).iterator());
                                c7085ie3.addLast(next);
                            }
                            while (!c7085ie3.isEmpty()) {
                                Iterator<C9381rz1> a = ((C9381rz1) c7085ie3.last()).a();
                                C6562gT0.m(a);
                                if (a.hasNext()) {
                                    next = a.next();
                                    c3309Iz14 = C3309Iz1.this;
                                    d2 = next.d();
                                    if (next.c() != null) {
                                        C9673tB1.O(d2);
                                    }
                                    LinkOption[] k2 = c3309Iz14.k();
                                    LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(k2, k2.length);
                                    isDirectory3 = Files.isDirectory(d2, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
                                    if (!isDirectory3) {
                                        linkOption2 = LinkOption.NOFOLLOW_LINKS;
                                        exists2 = Files.exists(d2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption2}, 1));
                                        if (exists2) {
                                            this.d1 = f02;
                                            this.Z = c7085ie3;
                                            this.Y0 = q30;
                                            this.Z0 = null;
                                            this.a1 = null;
                                            this.b1 = null;
                                            this.c1 = 4;
                                            if (f02.b(d2, this) == l) {
                                            }
                                        } else {
                                            continue;
                                        }
                                    } else if (!C3700Mz1.a(next)) {
                                        if (c3309Iz14.j()) {
                                            this.d1 = f02;
                                            this.Z = c7085ie3;
                                            this.Y0 = q30;
                                            this.Z0 = next;
                                            this.a1 = c3309Iz14;
                                            this.b1 = d2;
                                            this.c1 = 3;
                                            if (f02.b(d2, this) != l) {
                                                q303 = q30;
                                                path2 = d2;
                                                c7085ie4 = c7085ie3;
                                                c3309Iz13 = c3309Iz14;
                                                f023 = f02;
                                                c9381rz13 = next;
                                                C7085ie c7085ie52 = c7085ie4;
                                                Path d22 = path2;
                                                q30 = q303;
                                                C3309Iz1 c3309Iz142 = c3309Iz13;
                                                c7085ie3 = c7085ie52;
                                                C9381rz1 next2 = c9381rz13;
                                                f02 = f023;
                                            }
                                        }
                                        LinkOption[] k3 = c3309Iz142.k();
                                        LinkOption[] linkOptionArr3 = (LinkOption[]) Arrays.copyOf(k3, k3.length);
                                        isDirectory4 = Files.isDirectory(d22, (LinkOption[]) Arrays.copyOf(linkOptionArr3, linkOptionArr3.length));
                                        if (isDirectory4) {
                                        }
                                        while (!c7085ie3.isEmpty()) {
                                        }
                                    } else {
                                        C3211Hz1.a();
                                        throw C3113Gz1.a(d22.toString());
                                    }
                                    return l;
                                }
                                c7085ie3.removeLast();
                            }
                            return C7458kA2.a;
                        }
                    }
                    q30 = (Q30) this.Y0;
                    c7085ie3 = (C7085ie) this.Z;
                    f02 = (F02) this.d1;
                    RT1.n(obj);
                    while (!c7085ie3.isEmpty()) {
                    }
                    return C7458kA2.a;
                }
                path = N30.a(this.b1);
                c3309Iz12 = (C3309Iz1) this.a1;
                c9381rz12 = (C9381rz1) this.Z0;
                q302 = (Q30) this.Y0;
                c7085ie2 = (C7085ie) this.Z;
                f022 = (F02) this.d1;
                RT1.n(obj);
            } else {
                RT1.n(obj);
                f02 = (F02) this.d1;
                c7085ie = new C7085ie();
                q30 = new Q30(C3309Iz1.this.i());
                c9381rz1 = new C9381rz1(C3309Iz1.this.a, C3700Mz1.b(C3309Iz1.this.a, C3309Iz1.this.k()), null);
                c3309Iz1 = C3309Iz1.this;
                d = c9381rz1.d();
                if (c9381rz1.c() != null) {
                    C9673tB1.O(d);
                }
                LinkOption[] k4 = c3309Iz1.k();
                LinkOption[] linkOptionArr4 = (LinkOption[]) Arrays.copyOf(k4, k4.length);
                isDirectory = Files.isDirectory(d, (LinkOption[]) Arrays.copyOf(linkOptionArr4, linkOptionArr4.length));
                if (!isDirectory) {
                    linkOption = LinkOption.NOFOLLOW_LINKS;
                    exists = Files.exists(d, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
                    if (exists) {
                        this.d1 = f02;
                        this.Z = c7085ie;
                        this.Y0 = q30;
                        this.c1 = 2;
                    }
                    c7085ie3 = c7085ie;
                    while (!c7085ie3.isEmpty()) {
                    }
                    return C7458kA2.a;
                } else if (!C3700Mz1.a(c9381rz1)) {
                    if (c3309Iz1.j()) {
                        this.d1 = f02;
                        this.Z = c7085ie;
                        this.Y0 = q30;
                        this.Z0 = c9381rz1;
                        this.a1 = c3309Iz1;
                        this.b1 = d;
                        this.c1 = 1;
                        if (f02.b(d, this) != l) {
                            q302 = q30;
                            path = d;
                            f022 = f02;
                            c9381rz12 = c9381rz1;
                            c3309Iz12 = c3309Iz1;
                            c7085ie2 = c7085ie;
                        }
                    }
                    LinkOption[] k5 = c3309Iz1.k();
                    LinkOption[] linkOptionArr5 = (LinkOption[]) Arrays.copyOf(k5, k5.length);
                    isDirectory2 = Files.isDirectory(d, (LinkOption[]) Arrays.copyOf(linkOptionArr5, linkOptionArr5.length));
                    if (isDirectory2) {
                        c9381rz1.e(q30.c(c9381rz1).iterator());
                        c7085ie.addLast(c9381rz1);
                    }
                    c7085ie3 = c7085ie;
                    while (!c7085ie3.isEmpty()) {
                    }
                    return C7458kA2.a;
                } else {
                    C3211Hz1.a();
                    throw C3113Gz1.a(d.toString());
                }
                return l;
            }
            F02 f024 = f022;
            d = path;
            q30 = q302;
            c9381rz1 = c9381rz12;
            f02 = f024;
            c7085ie = c7085ie2;
            c3309Iz1 = c3309Iz12;
            LinkOption[] k52 = c3309Iz1.k();
            LinkOption[] linkOptionArr52 = (LinkOption[]) Arrays.copyOf(k52, k52.length);
            isDirectory2 = Files.isDirectory(d, (LinkOption[]) Arrays.copyOf(linkOptionArr52, linkOptionArr52.length));
            if (isDirectory2) {
            }
            c7085ie3 = c7085ie;
            while (!c7085ie3.isEmpty()) {
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: O */
        public final Object i(F02<? super Path> f02, HM<? super C7458kA2> hm) {
            return ((b) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            b bVar = new b(hm);
            bVar.d1 = obj;
            return bVar;
        }
    }

    public C3309Iz1(@NotNull Path path, @NotNull DA1[] da1Arr) {
        C6562gT0.p(path, "start");
        C6562gT0.p(da1Arr, C9998uW1.m0);
        this.a = path;
        this.b = da1Arr;
    }

    public final Iterator<Path> g() {
        return N02.a(new a(null));
    }

    public final Iterator<Path> h() {
        return N02.a(new b(null));
    }

    public final boolean i() {
        return C7330jf.B8(this.b, DA1.Z);
    }

    @Override // o.B02
    @NotNull
    public Iterator<Path> iterator() {
        if (l()) {
            return g();
        }
        return h();
    }

    public final boolean j() {
        return C7330jf.B8(this.b, DA1.X);
    }

    public final LinkOption[] k() {
        return C11090z01.a.a(i());
    }

    public final boolean l() {
        return C7330jf.B8(this.b, DA1.Y);
    }

    public final Object m(F02<? super Path> f02, C9381rz1 c9381rz1, Q30 q30, HA0<? super List<C9381rz1>, C7458kA2> ha0, HM<? super C7458kA2> hm) {
        boolean isDirectory;
        LinkOption linkOption;
        boolean exists;
        boolean isDirectory2;
        Path d = c9381rz1.d();
        if (c9381rz1.c() != null) {
            C9673tB1.O(d);
        }
        LinkOption[] k = k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(k, k.length);
        isDirectory = Files.isDirectory(d, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (!isDirectory) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            exists = Files.exists(d, (LinkOption[]) Arrays.copyOf(new LinkOption[]{linkOption}, 1));
            if (exists) {
                UP0.e(0);
                f02.b(d, hm);
                UP0.e(1);
                return C7458kA2.a;
            }
        } else if (!C3700Mz1.a(c9381rz1)) {
            if (j()) {
                UP0.e(0);
                f02.b(d, hm);
                UP0.e(1);
            }
            LinkOption[] k2 = k();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(k2, k2.length);
            isDirectory2 = Files.isDirectory(d, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            if (isDirectory2) {
                ha0.invoke(q30.c(c9381rz1));
            }
        } else {
            C3211Hz1.a();
            throw C3113Gz1.a(d.toString());
        }
        return C7458kA2.a;
    }
}
