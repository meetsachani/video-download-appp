package o;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import o.JV;
import o.PT1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,616:1\n146#1:634\n147#1,4:636\n152#1,5:641\n146#1:646\n147#1,4:648\n152#1,5:653\n1#2:617\n1#2:635\n1#2:647\n774#3:618\n865#3,2:619\n1216#3,2:621\n1246#3,4:623\n1863#3,2:661\n360#3,7:669\n1827#3,8:676\n607#4:627\n607#4:640\n607#4:652\n607#4:658\n1317#4,2:659\n37#5,2:628\n37#5,2:630\n37#5,2:632\n1682#6,6:663\n1790#6,6:684\n*S KotlinDebug\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n241#1:634\n241#1:636,4\n241#1:641,5\n248#1:646\n248#1:648,4\n248#1:653,5\n241#1:635\n248#1:647\n106#1:618\n106#1:619,2\n107#1:621,2\n107#1:623,4\n303#1:661,2\n412#1:669,7\n502#1:676,8\n150#1:627\n241#1:640\n248#1:652\n283#1:658\n284#1:659,2\n207#1:628,2\n208#1:630,2\n209#1:632,2\n351#1:663,6\n554#1:684,6\n*E\n"})
@HK1
/* loaded from: classes3.dex */
public final class JV {
    @NotNull
    public static final JV a;
    @NotNull
    public static final StackTraceElement b;
    @NotNull
    public static final SimpleDateFormat c;
    @Nullable
    public static Thread d;
    @NotNull
    public static final C11164zJ<a<?>, Boolean> e;
    public static boolean f;
    public static boolean g;
    public static boolean h;
    @Nullable
    public static final HA0<Boolean, C7458kA2> i;
    @NotNull
    public static final C11164zJ<InterfaceC10706xQ, CV> j;
    public static final /* synthetic */ b k;

    /* loaded from: classes3.dex */
    public static final class a<T> implements HM<T>, InterfaceC10706xQ {
        @InterfaceC7058iW0
        @NotNull
        public final HM<T> X;
        @InterfaceC7058iW0
        @NotNull
        public final CV Y;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull HM<? super T> hm, @NotNull CV cv) {
            this.X = hm;
            this.Y = cv;
        }

        @Override // o.InterfaceC10706xQ
        @Nullable
        public StackTraceElement Y() {
            C2620Cb2 a = a();
            if (a != null) {
                return a.Y();
            }
            return null;
        }

        public final C2620Cb2 a() {
            return this.Y.d();
        }

        @Override // o.InterfaceC10706xQ
        @Nullable
        public InterfaceC10706xQ g() {
            C2620Cb2 a = a();
            if (a != null) {
                return a.g();
            }
            return null;
        }

        @Override // o.HM
        @NotNull
        public InterfaceC5809dQ getContext() {
            return this.X.getContext();
        }

        @Override // o.HM
        public void q(@NotNull Object obj) {
            JV.a.I(this);
            this.X.q(obj);
        }

        @NotNull
        public String toString() {
            return this.X.toString();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ AtomicIntegerFieldUpdater a = AtomicIntegerFieldUpdater.newUpdater(b.class, "installations$volatile");
        public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(b.class, "sequenceNumber$volatile");
        private volatile /* synthetic */ int installations$volatile;
        private volatile /* synthetic */ long sequenceNumber$volatile;

        public b() {
        }

        public final /* synthetic */ int c() {
            return this.installations$volatile;
        }

        public final /* synthetic */ long e() {
            return this.sequenceNumber$volatile;
        }

        public final /* synthetic */ void g(int i) {
            this.installations$volatile = i;
        }

        public final /* synthetic */ void h(long j) {
            this.sequenceNumber$volatile = j;
        }

        public /* synthetic */ b(C9516sY c9516sY) {
            this();
        }
    }

    @InterfaceC8303na2({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,616:1\n1#2:617\n241#3:618\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class c implements HA0<a<?>, BV> {
        @Override // o.HA0
        /* renamed from: c */
        public final BV invoke(a<?> aVar) {
            InterfaceC5809dQ c;
            if (JV.a.C(aVar) || (c = aVar.Y.c()) == null) {
                return null;
            }
            return new BV(aVar.Y, c);
        }
    }

    @InterfaceC8303na2({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,102:1\n150#2:103\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C11156zH.l(Long.valueOf(((a) t).Y.b), Long.valueOf(((a) t2).Y.b));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @InterfaceC8303na2({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,616:1\n1#2:617\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class e<R> implements HA0<a<?>, R> {
        public final /* synthetic */ VA0<a<?>, InterfaceC5809dQ, R> X;

        /* JADX WARN: Multi-variable type inference failed */
        public e(VA0<? super a<?>, ? super InterfaceC5809dQ, ? extends R> va0) {
            this.X = va0;
        }

        @Override // o.HA0
        /* renamed from: c */
        public final R invoke(a<?> aVar) {
            InterfaceC5809dQ c;
            if (JV.a.C(aVar) || (c = aVar.Y.c()) == null) {
                return null;
            }
            return this.X.i(aVar, c);
        }
    }

    @InterfaceC8303na2({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,102:1\n283#2:103\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C11156zH.l(Long.valueOf(((a) t).Y.b), Long.valueOf(((a) t2).Y.b));
        }
    }

    @InterfaceC8303na2({"SMAP\nDebugProbesImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl$dumpCoroutinesInfoImpl$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DebugProbesImpl.kt\nkotlinx/coroutines/debug/internal/DebugProbesImpl\n*L\n1#1,616:1\n1#2:617\n248#3:618\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class g implements HA0<a<?>, TV> {
        @Override // o.HA0
        /* renamed from: c */
        public final TV invoke(a<?> aVar) {
            InterfaceC5809dQ c;
            if (JV.a.C(aVar) || (c = aVar.Y.c()) == null) {
                return null;
            }
            return new TV(aVar.Y, c);
        }
    }

    static {
        JV jv = new JV();
        a = jv;
        b = new C7816lf().b();
        c = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        e = new C11164zJ<>(false, 1, null);
        f = true;
        h = true;
        i = jv.w();
        j = new C11164zJ<>(true);
        k = new b(null);
    }

    public static final C7458kA2 S() {
        j.x();
        return C7458kA2.a;
    }

    public static final boolean l(a aVar) {
        return !a.C(aVar);
    }

    @NotNull
    public final String A(@NotNull RU0 ru0) {
        if (D()) {
            Set<a<?>> s = s();
            ArrayList<a> arrayList = new ArrayList();
            for (Object obj : s) {
                if (((a) obj).X.getContext().f(RU0.W) != null) {
                    arrayList.add(obj);
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(C5075aO1.u(C8683p81.j(C8466oF.b0(arrayList, 10)), 16));
            for (a aVar : arrayList) {
                linkedHashMap.put(C5829dV0.A(aVar.X.getContext()), aVar.Y);
            }
            StringBuilder sb = new StringBuilder();
            a.e(ru0, linkedHashMap, sb, "");
            String sb2 = sb.toString();
            C6562gT0.o(sb2, "toString(...)");
            return sb2;
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    public final void B() {
        HA0<Boolean, C7458kA2> ha0;
        if (b.a.incrementAndGet(k) <= 1) {
            R();
            if (!Y7.a.a() && (ha0 = i) != null) {
                ha0.invoke(Boolean.TRUE);
            }
        }
    }

    public final boolean C(a<?> aVar) {
        RU0 ru0;
        InterfaceC5809dQ c2 = aVar.Y.c();
        if (c2 == null || (ru0 = (RU0) c2.f(RU0.W)) == null || !ru0.l()) {
            return false;
        }
        e.remove(aVar);
        return true;
    }

    @InterfaceC8046mW0(name = "isInstalled$kotlinx_coroutines_debug")
    public final boolean D() {
        if (b.a.get(k) > 0) {
            return true;
        }
        return false;
    }

    public final boolean E(StackTraceElement stackTraceElement) {
        return C9545sf2.J2(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    public final a<?> F(HM<?> hm) {
        InterfaceC10706xQ interfaceC10706xQ;
        if (hm instanceof InterfaceC10706xQ) {
            interfaceC10706xQ = (InterfaceC10706xQ) hm;
        } else {
            interfaceC10706xQ = null;
        }
        if (interfaceC10706xQ == null) {
            return null;
        }
        return G(interfaceC10706xQ);
    }

    public final a<?> G(InterfaceC10706xQ interfaceC10706xQ) {
        while (!(interfaceC10706xQ instanceof a)) {
            interfaceC10706xQ = interfaceC10706xQ.g();
            if (interfaceC10706xQ == null) {
                return null;
            }
        }
        return (a) interfaceC10706xQ;
    }

    public final void H(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    public final void I(a<?> aVar) {
        InterfaceC10706xQ M;
        e.remove(aVar);
        InterfaceC10706xQ f2 = aVar.Y.f();
        if (f2 != null && (M = M(f2)) != null) {
            j.remove(M);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> HM<T> J(@NotNull HM<? super T> hm) {
        C2620Cb2 c2620Cb2;
        if (D()) {
            if (h && hm.getContext() == C3897Pa0.X) {
                return hm;
            }
            if (F(hm) == null) {
                if (g) {
                    c2620Cb2 = U(N(new Exception()));
                } else {
                    c2620Cb2 = null;
                }
                return f(hm, c2620Cb2);
            }
        }
        return hm;
    }

    public final void K(@NotNull HM<?> hm) {
        Y(hm, DV.b);
    }

    public final void L(@NotNull HM<?> hm) {
        Y(hm, DV.c);
    }

    public final InterfaceC10706xQ M(InterfaceC10706xQ interfaceC10706xQ) {
        do {
            interfaceC10706xQ = interfaceC10706xQ.g();
            if (interfaceC10706xQ == null) {
                return null;
            }
        } while (interfaceC10706xQ.Y() == null);
        return interfaceC10706xQ;
    }

    public final <T extends Throwable> List<StackTraceElement> N(T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i3 = length2 - 1;
                if (C6562gT0.g(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i2 = length2;
                    break;
                } else if (i3 < 0) {
                    break;
                } else {
                    length2 = i3;
                }
            }
        }
        int i4 = i2 + 1;
        if (!f) {
            int i5 = length - i4;
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(stackTrace[i6 + i4]);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i4) + 1);
        while (i4 < length) {
            if (E(stackTrace[i4])) {
                arrayList2.add(stackTrace[i4]);
                int i7 = i4 + 1;
                while (i7 < length && E(stackTrace[i7])) {
                    i7++;
                }
                int i8 = i7 - 1;
                int i9 = i8;
                while (i9 > i4 && stackTrace[i9].getFileName() == null) {
                    i9--;
                }
                if (i9 > i4 && i9 < i8) {
                    arrayList2.add(stackTrace[i9]);
                }
                arrayList2.add(stackTrace[i8]);
                i4 = i7;
            } else {
                arrayList2.add(stackTrace[i4]);
                i4++;
            }
        }
        return arrayList2;
    }

    public final void O(boolean z) {
        g = z;
    }

    public final void P(boolean z) {
        h = z;
    }

    public final void Q(boolean z) {
        f = z;
    }

    public final void R() {
        d = C6144eo2.c(false, true, null, "Coroutines Debugger Cleaner", 0, new FA0() { // from class: o.IV
            @Override // o.FA0
            public final Object invoke() {
                C7458kA2 S;
                S = JV.S();
                return S;
            }
        }, 21, null);
    }

    public final void T() {
        Thread thread = d;
        if (thread == null) {
            return;
        }
        d = null;
        thread.interrupt();
        thread.join();
    }

    public final C2620Cb2 U(List<StackTraceElement> list) {
        C2620Cb2 c2620Cb2 = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                c2620Cb2 = new C2620Cb2(c2620Cb2, listIterator.previous());
            }
        }
        return new C2620Cb2(c2620Cb2, b);
    }

    public final String V(Object obj) {
        String b2;
        b2 = KV.b(obj.toString());
        return b2;
    }

    public final void W() {
        HA0<Boolean, C7458kA2> ha0;
        if (D()) {
            if (b.a.decrementAndGet(k) == 0) {
                T();
                e.clear();
                j.clear();
                if (!Y7.a.a() && (ha0 = i) != null) {
                    ha0.invoke(Boolean.FALSE);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Agent was not installed");
    }

    public final void X(InterfaceC10706xQ interfaceC10706xQ, String str) {
        InterfaceC10706xQ interfaceC10706xQ2;
        boolean z;
        if (D()) {
            C11164zJ<InterfaceC10706xQ, CV> c11164zJ = j;
            CV remove = c11164zJ.remove(interfaceC10706xQ);
            if (remove != null) {
                z = false;
            } else {
                a<?> G = G(interfaceC10706xQ);
                if (G != null && (remove = G.Y) != null) {
                    InterfaceC10706xQ f2 = remove.f();
                    if (f2 != null) {
                        interfaceC10706xQ2 = M(f2);
                    } else {
                        interfaceC10706xQ2 = null;
                    }
                    if (interfaceC10706xQ2 != null) {
                        c11164zJ.remove(interfaceC10706xQ2);
                    }
                    z = true;
                } else {
                    return;
                }
            }
            C6562gT0.n(interfaceC10706xQ, "null cannot be cast to non-null type kotlin.coroutines.Continuation<*>");
            remove.j(str, (HM) interfaceC10706xQ, z);
            InterfaceC10706xQ M = M(interfaceC10706xQ);
            if (M != null) {
                c11164zJ.put(M, remove);
            }
        }
    }

    public final void Y(HM<?> hm, String str) {
        InterfaceC10706xQ interfaceC10706xQ;
        if (D()) {
            if (!h || hm.getContext() != C3897Pa0.X) {
                if (C6562gT0.g(str, DV.b)) {
                    if (hm instanceof InterfaceC10706xQ) {
                        interfaceC10706xQ = (InterfaceC10706xQ) hm;
                    } else {
                        interfaceC10706xQ = null;
                    }
                    if (interfaceC10706xQ != null) {
                        X(interfaceC10706xQ, str);
                        return;
                    }
                    return;
                }
                a<?> F = F(hm);
                if (F == null) {
                    return;
                }
                Z(F, hm, str);
            }
        }
    }

    public final void Z(a<?> aVar, HM<?> hm, String str) {
        if (!D()) {
            return;
        }
        aVar.Y.j(str, hm, true);
    }

    public final void e(RU0 ru0, Map<RU0, CV> map, StringBuilder sb, String str) {
        CV cv = map.get(ru0);
        if (cv == null) {
            if (!(ru0 instanceof MY1)) {
                sb.append(str + u(ru0) + '\n');
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('\t');
                str = sb2.toString();
            }
        } else {
            String g2 = cv.g();
            sb.append(str + u(ru0) + ", continuation is " + g2 + " at line " + ((StackTraceElement) C10662xF.J2(cv.h())) + '\n');
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append('\t');
            str = sb3.toString();
        }
        for (RU0 ru02 : ru0.r()) {
            e(ru02, map, sb, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> HM<T> f(HM<? super T> hm, C2620Cb2 c2620Cb2) {
        if (!D()) {
            return hm;
        }
        a<?> aVar = new a<>(hm, new CV(hm.getContext(), c2620Cb2, b.b.incrementAndGet(k)));
        C11164zJ<a<?>, Boolean> c11164zJ = e;
        c11164zJ.put(aVar, Boolean.TRUE);
        if (!D()) {
            c11164zJ.clear();
        }
        return aVar;
    }

    @InterfaceC8046mW0(name = "dumpCoroutines")
    public final void g(@NotNull PrintStream printStream) {
        synchronized (printStream) {
            a.k(printStream);
            C7458kA2 c7458kA2 = C7458kA2.a;
        }
    }

    @NotNull
    public final List<BV> h() {
        if (D()) {
            return C6695h12.G3(C6695h12.Q1(C6695h12.o3(C10662xF.C1(s()), new d()), new c()));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @NotNull
    public final Object[] i() {
        String str;
        String str2;
        String V;
        List<BV> h2 = h();
        int size = h2.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (BV bv : h2) {
            InterfaceC5809dQ a2 = bv.a();
            C9245rQ c9245rQ = (C9245rQ) a2.f(C9245rQ.Z);
            Long l = null;
            if (c9245rQ != null && (V = c9245rQ.V()) != null) {
                str = V(V);
            } else {
                str = null;
            }
            AbstractC7762lQ abstractC7762lQ = (AbstractC7762lQ) a2.f(AbstractC7762lQ.Y);
            if (abstractC7762lQ != null) {
                str2 = V(abstractC7762lQ);
            } else {
                str2 = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(str);
            sb.append(",\n                    \"id\": ");
            C8996qQ c8996qQ = (C8996qQ) a2.f(C8996qQ.Z);
            if (c8996qQ != null) {
                l = Long.valueOf(c8996qQ.V());
            }
            sb.append(l);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(str2);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(bv.f());
            sb.append(",\n                    \"state\": \"");
            sb.append(bv.g());
            sb.append("\"\n                } \n                ");
            arrayList3.add(C7819lf2.v(sb.toString()));
            arrayList2.add(bv.d());
            arrayList.add(bv.e());
        }
        return new Object[]{'[' + C10662xF.p3(arrayList3, null, null, null, 0, null, null, 63, null) + ']', arrayList.toArray(new Thread[0]), arrayList2.toArray(new InterfaceC10706xQ[0]), h2.toArray(new BV[0])};
    }

    public final <R> List<R> j(VA0<? super a<?>, ? super InterfaceC5809dQ, ? extends R> va0) {
        if (D()) {
            return C6695h12.G3(C6695h12.Q1(C6695h12.o3(C10662xF.C1(s()), new d()), new e(va0)));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    public final void k(PrintStream printStream) {
        String g2;
        if (D()) {
            printStream.print("Coroutines dump " + c.format(Long.valueOf(System.currentTimeMillis())));
            for (a aVar : C6695h12.o3(C6695h12.N0(C10662xF.C1(s()), new HA0() { // from class: o.HV
                @Override // o.HA0
                public final Object invoke(Object obj) {
                    boolean l;
                    l = JV.l((JV.a) obj);
                    return Boolean.valueOf(l);
                }
            }), new f())) {
                CV cv = aVar.Y;
                List<StackTraceElement> h2 = cv.h();
                JV jv = a;
                List<StackTraceElement> p = jv.p(cv.g(), cv.lastObservedThread, h2);
                if (C6562gT0.g(cv.g(), DV.b) && p == h2) {
                    g2 = cv.g() + " (Last suspension stacktrace, not an actual stacktrace)";
                } else {
                    g2 = cv.g();
                }
                printStream.print("\n\nCoroutine " + aVar.X + ", state: " + g2);
                if (h2.isEmpty()) {
                    printStream.print("\n\tat " + b);
                    jv.H(printStream, cv.e());
                } else {
                    jv.H(printStream, p);
                }
            }
            return;
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @NotNull
    public final List<TV> m() {
        if (D()) {
            return C6695h12.G3(C6695h12.Q1(C6695h12.o3(C10662xF.C1(s()), new d()), new g()));
        }
        throw new IllegalStateException("Debug probes are not installed");
    }

    @NotNull
    public final List<StackTraceElement> n(@NotNull BV bv, @NotNull List<StackTraceElement> list) {
        return p(bv.g(), bv.e(), list);
    }

    @NotNull
    public final String o(@NotNull BV bv) {
        String str;
        List<StackTraceElement> n = n(bv, bv.h());
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : n) {
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"declaringClass\": \"");
            sb.append(stackTraceElement.getClassName());
            sb.append("\",\n                    \"methodName\": \"");
            sb.append(stackTraceElement.getMethodName());
            sb.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            if (fileName != null) {
                str = V(fileName);
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(",\n                    \"lineNumber\": ");
            sb.append(stackTraceElement.getLineNumber());
            sb.append("\n                }\n                ");
            arrayList.add(C7819lf2.v(sb.toString()));
        }
        return '[' + C10662xF.p3(arrayList, null, null, null, 0, null, null, 63, null) + ']';
    }

    public final List<StackTraceElement> p(String str, Thread thread, List<StackTraceElement> list) {
        Object b2;
        if (C6562gT0.g(str, DV.b) && thread != null) {
            try {
                PT1.a aVar = PT1.Y;
                b2 = PT1.b(thread.getStackTrace());
            } catch (Throwable th) {
                PT1.a aVar2 = PT1.Y;
                b2 = PT1.b(RT1.a(th));
            }
            if (PT1.i(b2)) {
                b2 = null;
            }
            StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) b2;
            if (stackTraceElementArr != null) {
                int length = stackTraceElementArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        StackTraceElement stackTraceElement = stackTraceElementArr[i2];
                        if (C6562gT0.g(stackTraceElement.getClassName(), C2718Db2.a) && C6562gT0.g(stackTraceElement.getMethodName(), "resumeWith") && C6562gT0.g(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                C4180Rx1<Integer, Integer> q = q(i2, stackTraceElementArr, list);
                int intValue = q.a().intValue();
                int intValue2 = q.b().intValue();
                if (intValue != -1) {
                    ArrayList arrayList = new ArrayList((((list.size() + i2) - intValue) - 1) - intValue2);
                    int i3 = i2 - intValue2;
                    for (int i4 = 0; i4 < i3; i4++) {
                        arrayList.add(stackTraceElementArr[i4]);
                    }
                    int size = list.size();
                    for (int i5 = intValue + 1; i5 < size; i5++) {
                        arrayList.add(list.get(i5));
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    public final C4180Rx1<Integer, Integer> q(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i3 = 0; i3 < 3; i3++) {
            int r = a.r((i2 - 1) - i3, stackTraceElementArr, list);
            if (r != -1) {
                return C6670gv2.a(Integer.valueOf(r), Integer.valueOf(i3));
            }
        }
        return C6670gv2.a(-1, 0);
    }

    public final int r(int i2, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) C7330jf.Ye(stackTraceElementArr, i2);
        if (stackTraceElement == null) {
            return -1;
        }
        int i3 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (C6562gT0.g(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && C6562gT0.g(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && C6562gT0.g(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public final Set<a<?>> s() {
        return e.keySet();
    }

    public final String u(RU0 ru0) {
        if (ru0 instanceof C6812hV0) {
            return ((C6812hV0) ru0).H1();
        }
        return ru0.toString();
    }

    public final HA0<Boolean, C7458kA2> w() {
        Object b2;
        HA0<Boolean, C7458kA2> ha0 = null;
        try {
            PT1.a aVar = PT1.Y;
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(null);
            C6562gT0.n(newInstance, "null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
            b2 = PT1.b((HA0) C11313zv2.q(newInstance, 1));
        } catch (Throwable th) {
            PT1.a aVar2 = PT1.Y;
            b2 = PT1.b(RT1.a(th));
        }
        if (!PT1.i(b2)) {
            ha0 = b2;
        }
        return ha0;
    }

    public final boolean x() {
        return g;
    }

    public final boolean y() {
        return h;
    }

    public final boolean z() {
        return f;
    }

    public static /* synthetic */ void v(RU0 ru0) {
    }
}
