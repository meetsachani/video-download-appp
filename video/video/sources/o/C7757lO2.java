package o;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import o.C4972Zy1;
import o.InterfaceC8148mw2;
import o.RP1;
import okhttp3.internal.ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n156#1:460\n*E\n"})
/* renamed from: o.lO2 */
/* loaded from: classes4.dex */
public final class C7757lO2 {
    public static final int a = 67324752;
    public static final int b = 33639248;
    public static final int c = 101010256;
    public static final int d = 117853008;
    public static final int e = 101075792;
    public static final int f = 8;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 1;
    public static final long j = 4294967295L;
    public static final int k = 1;
    public static final int l = 21589;

    @InterfaceC8303na2({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n1#1,328:1\n156#2:329\n*E\n"})
    /* renamed from: o.lO2$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C11156zH.l(((C7271jO2) t).a(), ((C7271jO2) t2).a());
        }
    }

    /* renamed from: o.lO2$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC8052mY0 implements HA0<C7271jO2, Boolean> {
        public static final b X = new b();

        public b() {
            super(1);
        }

        @Override // o.HA0
        @NotNull
        /* renamed from: c */
        public final Boolean invoke(@NotNull C7271jO2 c7271jO2) {
            C6562gT0.p(c7271jO2, "it");
            return Boolean.TRUE;
        }
    }

    /* renamed from: o.lO2$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC8052mY0 implements VA0<Integer, Long, C7458kA2> {
        public final /* synthetic */ RP1.a X;
        public final /* synthetic */ long Y;
        public final /* synthetic */ InterfaceC2677Cq Y0;
        public final /* synthetic */ RP1.g Z;
        public final /* synthetic */ RP1.g Z0;
        public final /* synthetic */ RP1.g a1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RP1.a aVar, long j, RP1.g gVar, InterfaceC2677Cq interfaceC2677Cq, RP1.g gVar2, RP1.g gVar3) {
            super(2);
            this.X = aVar;
            this.Y = j;
            this.Z = gVar;
            this.Y0 = interfaceC2677Cq;
            this.Z0 = gVar2;
            this.a1 = gVar3;
        }

        public final void c(int i, long j) {
            long j2;
            if (i == 1) {
                RP1.a aVar = this.X;
                if (!aVar.X) {
                    aVar.X = true;
                    if (j >= this.Y) {
                        RP1.g gVar = this.Z;
                        long j3 = gVar.X;
                        if (j3 == 4294967295L) {
                            j3 = this.Y0.z2();
                        }
                        gVar.X = j3;
                        RP1.g gVar2 = this.Z0;
                        long j4 = 0;
                        if (gVar2.X == 4294967295L) {
                            j2 = this.Y0.z2();
                        } else {
                            j2 = 0;
                        }
                        gVar2.X = j2;
                        RP1.g gVar3 = this.a1;
                        if (gVar3.X == 4294967295L) {
                            j4 = this.Y0.z2();
                        }
                        gVar3.X = j4;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ C7458kA2 i(Integer num, Long l) {
            c(num.intValue(), l.longValue());
            return C7458kA2.a;
        }
    }

    /* renamed from: o.lO2$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC8052mY0 implements VA0<Integer, Long, C7458kA2> {
        public final /* synthetic */ InterfaceC2677Cq X;
        public final /* synthetic */ RP1.h<Long> Y;
        public final /* synthetic */ RP1.h<Long> Y0;
        public final /* synthetic */ RP1.h<Long> Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2677Cq interfaceC2677Cq, RP1.h<Long> hVar, RP1.h<Long> hVar2, RP1.h<Long> hVar3) {
            super(2);
            this.X = interfaceC2677Cq;
            this.Y = hVar;
            this.Z = hVar2;
            this.Y0 = hVar3;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
        public final void c(int i, long j) {
            boolean z;
            boolean z2;
            if (i == 21589) {
                long j2 = 1;
                if (j >= 1) {
                    byte readByte = this.X.readByte();
                    boolean z3 = false;
                    if ((readByte & 1) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((readByte & 2) == 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((readByte & 4) == 4) {
                        z3 = true;
                    }
                    InterfaceC2677Cq interfaceC2677Cq = this.X;
                    if (z) {
                        j2 = 5;
                    }
                    if (z2) {
                        j2 += 4;
                    }
                    if (z3) {
                        j2 += 4;
                    }
                    if (j >= j2) {
                        if (z) {
                            this.Y.X = Long.valueOf(interfaceC2677Cq.S4() * 1000);
                        }
                        if (z2) {
                            this.Z.X = Long.valueOf(this.X.S4() * 1000);
                        }
                        if (z3) {
                            this.Y0.X = Long.valueOf(this.X.S4() * 1000);
                            return;
                        }
                        return;
                    }
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }

        @Override // o.VA0
        public /* bridge */ /* synthetic */ C7458kA2 i(Integer num, Long l) {
            c(num.intValue(), l.longValue());
            return C7458kA2.a;
        }
    }

    public static final Map<C4972Zy1, C7271jO2> a(List<C7271jO2> list) {
        C4972Zy1 h2 = C4972Zy1.a.h(C4972Zy1.Y, RemoteSettings.i, false, 1, null);
        Map<C4972Zy1, C7271jO2> j0 = C8926q81.j0(C6670gv2.a(h2, new C7271jO2(h2, true, null, 0L, 0L, 0L, 0, null, 0L, InterfaceC8148mw2.g.p, null)));
        for (C7271jO2 c7271jO2 : C10662xF.x5(list, new a())) {
            if (j0.put(c7271jO2.a(), c7271jO2) == null) {
                while (true) {
                    C4972Zy1 w = c7271jO2.a().w();
                    if (w != null) {
                        C7271jO2 c7271jO22 = j0.get(w);
                        if (c7271jO22 != null) {
                            c7271jO22.b().add(c7271jO2.a());
                            break;
                        }
                        C7271jO2 c7271jO23 = new C7271jO2(w, true, null, 0L, 0L, 0L, 0, null, 0L, InterfaceC8148mw2.g.p, null);
                        j0.put(w, c7271jO23);
                        c7271jO23.b().add(c7271jO2.a());
                        c7271jO2 = c7271jO23;
                    }
                }
            }
        }
        return j0;
    }

    public static final Long b(int i2, int i3) {
        if (i3 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i2 >> 9) & 127) + 1980, ((i2 >> 5) & 15) - 1, i2 & 31, (i3 >> 11) & 31, (i3 >> 5) & 63, (i3 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    public static final String c(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String num = Integer.toString(i2, BB.a(16));
        C6562gT0.o(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    @NotNull
    public static final C7514kO2 d(@NotNull C4972Zy1 c4972Zy1, @NotNull AbstractC2576Bp0 abstractC2576Bp0, @NotNull HA0<? super C7271jO2, Boolean> ha0) throws IOException {
        int S4;
        C6562gT0.p(c4972Zy1, "zipPath");
        C6562gT0.p(abstractC2576Bp0, "fileSystem");
        C6562gT0.p(ha0, "predicate");
        AbstractC8848pp0 F = abstractC2576Bp0.F(c4972Zy1);
        try {
            long size = F.size() - 22;
            if (size >= 0) {
                long max = Math.max(size - 65536, 0L);
                while (true) {
                    InterfaceC2677Cq e2 = C9604su1.e(F.F(size));
                    if (e2.S4() == 101010256) {
                        C5132ae0 g2 = g(e2);
                        String e3 = e2.e3(g2.b());
                        e2.close();
                        long j2 = size - 20;
                        if (j2 > 0) {
                            InterfaceC2677Cq e4 = C9604su1.e(F.F(j2));
                            if (e4.S4() == 117853008) {
                                int S42 = e4.S4();
                                long z2 = e4.z2();
                                if (e4.S4() == 1 && S42 == 0) {
                                    InterfaceC2677Cq e5 = C9604su1.e(F.F(z2));
                                    if (e5.S4() == 101075792) {
                                        g2 = k(e5, g2);
                                        C7458kA2 c7458kA2 = C7458kA2.a;
                                        C5033aE.a(e5, null);
                                    } else {
                                        throw new IOException("bad zip: expected " + c(e) + " but was " + c(S4));
                                    }
                                } else {
                                    throw new IOException("unsupported zip: spanned");
                                }
                            }
                            C7458kA2 c7458kA22 = C7458kA2.a;
                            C5033aE.a(e4, null);
                        }
                        ArrayList arrayList = new ArrayList();
                        InterfaceC2677Cq e6 = C9604su1.e(F.F(g2.a()));
                        long c2 = g2.c();
                        for (long j3 = 0; j3 < c2; j3++) {
                            C7271jO2 f2 = f(e6);
                            if (f2.h() < g2.a()) {
                                if (ha0.invoke(f2).booleanValue()) {
                                    arrayList.add(f2);
                                }
                            } else {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                        }
                        C7458kA2 c7458kA23 = C7458kA2.a;
                        C5033aE.a(e6, null);
                        C7514kO2 c7514kO2 = new C7514kO2(c4972Zy1, abstractC2576Bp0, a(arrayList), e3);
                        C5033aE.a(F, null);
                        return c7514kO2;
                    }
                    e2.close();
                    size--;
                    if (size < max) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                }
            } else {
                throw new IOException("not a zip: size=" + F.size());
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C5033aE.a(F, th);
                throw th2;
            }
        }
    }

    public static /* synthetic */ C7514kO2 e(C4972Zy1 c4972Zy1, AbstractC2576Bp0 abstractC2576Bp0, HA0 ha0, int i2, Object obj) throws IOException {
        if ((i2 & 4) != 0) {
            ha0 = b.X;
        }
        return d(c4972Zy1, abstractC2576Bp0, ha0);
    }

    @NotNull
    public static final C7271jO2 f(@NotNull InterfaceC2677Cq interfaceC2677Cq) throws IOException {
        int S4;
        long j2;
        C6562gT0.p(interfaceC2677Cq, "<this>");
        if (interfaceC2677Cq.S4() == 33639248) {
            interfaceC2677Cq.skip(4L);
            short w2 = interfaceC2677Cq.w2();
            int i2 = w2 & Xx2.Y0;
            if ((w2 & 1) == 0) {
                int w22 = interfaceC2677Cq.w2() & Xx2.Y0;
                Long b2 = b(interfaceC2677Cq.w2() & Xx2.Y0, interfaceC2677Cq.w2() & Xx2.Y0);
                long S42 = interfaceC2677Cq.S4() & 4294967295L;
                RP1.g gVar = new RP1.g();
                gVar.X = interfaceC2677Cq.S4() & 4294967295L;
                RP1.g gVar2 = new RP1.g();
                gVar2.X = interfaceC2677Cq.S4() & 4294967295L;
                int w23 = interfaceC2677Cq.w2() & Xx2.Y0;
                int w24 = interfaceC2677Cq.w2() & Xx2.Y0;
                int w25 = interfaceC2677Cq.w2() & Xx2.Y0;
                interfaceC2677Cq.skip(8L);
                RP1.g gVar3 = new RP1.g();
                gVar3.X = interfaceC2677Cq.S4() & 4294967295L;
                String e3 = interfaceC2677Cq.e3(w23);
                if (!C10763xf2.m3(e3, (char) 0, false, 2, null)) {
                    if (gVar2.X == 4294967295L) {
                        j2 = 8;
                    } else {
                        j2 = 0;
                    }
                    if (gVar.X == 4294967295L) {
                        j2 += 8;
                    }
                    if (gVar3.X == 4294967295L) {
                        j2 += 8;
                    }
                    RP1.a aVar = new RP1.a();
                    h(interfaceC2677Cq, w24, new c(aVar, j2, gVar2, interfaceC2677Cq, gVar, gVar3));
                    if (j2 > 0 && !aVar.X) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    return new C7271jO2(C4972Zy1.a.h(C4972Zy1.Y, RemoteSettings.i, false, 1, null).y(e3), C9545sf2.b2(e3, RemoteSettings.i, false, 2, null), interfaceC2677Cq.e3(w25), S42, gVar.X, gVar2.X, w22, b2, gVar3.X);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i2));
        }
        throw new IOException("bad zip: expected " + c(b) + " but was " + c(S4));
    }

    public static final C5132ae0 g(InterfaceC2677Cq interfaceC2677Cq) throws IOException {
        int w2 = interfaceC2677Cq.w2() & Xx2.Y0;
        int w22 = interfaceC2677Cq.w2() & Xx2.Y0;
        long w23 = interfaceC2677Cq.w2() & Xx2.Y0;
        if (w23 == (interfaceC2677Cq.w2() & Xx2.Y0) && w2 == 0 && w22 == 0) {
            interfaceC2677Cq.skip(4L);
            return new C5132ae0(w23, 4294967295L & interfaceC2677Cq.S4(), interfaceC2677Cq.w2() & Xx2.Y0);
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void h(InterfaceC2677Cq interfaceC2677Cq, int i2, VA0<? super Integer, ? super Long, C7458kA2> va0) {
        long j2 = i2;
        while (j2 != 0) {
            if (j2 >= 4) {
                int w2 = interfaceC2677Cq.w2() & Xx2.Y0;
                long w22 = interfaceC2677Cq.w2() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                long j3 = j2 - 4;
                if (j3 >= w22) {
                    interfaceC2677Cq.Q2(w22);
                    long size = interfaceC2677Cq.B().size();
                    va0.i(Integer.valueOf(w2), Long.valueOf(w22));
                    long size2 = (interfaceC2677Cq.B().size() + w22) - size;
                    int i3 = (size2 > 0L ? 1 : (size2 == 0L ? 0 : -1));
                    if (i3 >= 0) {
                        if (i3 > 0) {
                            interfaceC2677Cq.B().skip(size2);
                        }
                        j2 = j3 - w22;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + w2);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    @NotNull
    public static final C9340rp0 i(@NotNull InterfaceC2677Cq interfaceC2677Cq, @NotNull C9340rp0 c9340rp0) {
        C6562gT0.p(interfaceC2677Cq, "<this>");
        C6562gT0.p(c9340rp0, "basicMetadata");
        C9340rp0 j2 = j(interfaceC2677Cq, c9340rp0);
        C6562gT0.m(j2);
        return j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C9340rp0 j(InterfaceC2677Cq interfaceC2677Cq, C9340rp0 c9340rp0) {
        T t;
        int S4;
        RP1.h hVar = new RP1.h();
        if (c9340rp0 != null) {
            t = c9340rp0.g();
        } else {
            t = 0;
        }
        hVar.X = t;
        RP1.h hVar2 = new RP1.h();
        RP1.h hVar3 = new RP1.h();
        if (interfaceC2677Cq.S4() == 67324752) {
            interfaceC2677Cq.skip(2L);
            short w2 = interfaceC2677Cq.w2();
            int i2 = w2 & Xx2.Y0;
            if ((w2 & 1) == 0) {
                interfaceC2677Cq.skip(18L);
                long w22 = interfaceC2677Cq.w2() & WebSocketProtocol.PAYLOAD_SHORT_MAX;
                int w23 = interfaceC2677Cq.w2() & Xx2.Y0;
                interfaceC2677Cq.skip(w22);
                if (c9340rp0 == null) {
                    interfaceC2677Cq.skip(w23);
                    return null;
                }
                h(interfaceC2677Cq, w23, new d(interfaceC2677Cq, hVar, hVar2, hVar3));
                return new C9340rp0(c9340rp0.k(), c9340rp0.j(), null, c9340rp0.h(), (Long) hVar3.X, (Long) hVar.X, (Long) hVar2.X, null, 128, null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i2));
        }
        throw new IOException("bad zip: expected " + c(a) + " but was " + c(S4));
    }

    public static final C5132ae0 k(InterfaceC2677Cq interfaceC2677Cq, C5132ae0 c5132ae0) throws IOException {
        interfaceC2677Cq.skip(12L);
        int S4 = interfaceC2677Cq.S4();
        int S42 = interfaceC2677Cq.S4();
        long z2 = interfaceC2677Cq.z2();
        if (z2 == interfaceC2677Cq.z2() && S4 == 0 && S42 == 0) {
            interfaceC2677Cq.skip(8L);
            return new C5132ae0(z2, interfaceC2677Cq.z2(), c5132ae0.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void l(@NotNull InterfaceC2677Cq interfaceC2677Cq) {
        C6562gT0.p(interfaceC2677Cq, "<this>");
        j(interfaceC2677Cq, null);
    }
}
