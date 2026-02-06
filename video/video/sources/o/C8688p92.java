package o;

import com.facebook.internal.H;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.p92  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8688p92 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @FV(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", H.a.b, "gap", "$this$iterator", H.a.b, "$this$iterator", H.a.b}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    /* renamed from: o.p92$a */
    /* loaded from: classes3.dex */
    public static final class a<T> extends MT1 implements VA0<F02<? super List<? extends T>>, HM<? super C7458kA2>, Object> {
        public Object Y0;
        public Object Z;
        public int Z0;
        public int a1;
        public /* synthetic */ Object b1;
        public final /* synthetic */ int c1;
        public final /* synthetic */ int d1;
        public final /* synthetic */ Iterator<T> e1;
        public final /* synthetic */ boolean f1;
        public final /* synthetic */ boolean g1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, HM<? super a> hm) {
            super(2, hm);
            this.c1 = i;
            this.d1 = i2;
            this.e1 = it;
            this.f1 = z;
            this.g1 = z2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
            r10.b1 = r4;
            r10.Z = r3;
            r10.Y0 = r2;
            r10.Z0 = r1;
            r10.a1 = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
            if (r4.b(r3, r10) != r0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
            if (r4.b(r3, r10) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x0119, code lost:
            if (r6.b(r11, r10) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0147, code lost:
            if (r4.b(r11, r10) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x0162, code lost:
            if (r4.b(r1, r10) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00b8 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a2 -> B:16:0x0055). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0119 -> B:59:0x011c). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0147 -> B:72:0x014a). Please submit an issue!!! */
        @Override // o.AbstractC5644cl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object F(Object obj) {
            OU1 ou1;
            Iterator<T> it;
            F02 f02;
            F02 f022;
            int i;
            ArrayList arrayList;
            Iterator<T> it2;
            int i2;
            OU1 ou12;
            F02 f023;
            RandomAccess arrayList2;
            RandomAccess arrayList3;
            Object l = C7289jT0.l();
            int i3 = this.a1;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ou12 = (OU1) this.Z;
                                f023 = (F02) this.b1;
                                RT1.n(obj);
                                ou12.r(this.d1);
                                if (ou12.size() > this.d1) {
                                    if (this.f1) {
                                        arrayList3 = ou12;
                                    } else {
                                        arrayList3 = new ArrayList(ou12);
                                    }
                                    this.b1 = f023;
                                    this.Z = ou12;
                                    this.Y0 = null;
                                    this.a1 = 4;
                                } else {
                                    if (!ou12.isEmpty()) {
                                        this.b1 = null;
                                        this.Z = null;
                                        this.Y0 = null;
                                        this.a1 = 5;
                                    }
                                    return C7458kA2.a;
                                }
                                return l;
                            }
                        } else {
                            it = (Iterator) this.Y0;
                            ou1 = (OU1) this.Z;
                            f02 = (F02) this.b1;
                            RT1.n(obj);
                            ou1.r(this.d1);
                            while (it.hasNext()) {
                                ou1.k(it.next());
                                if (ou1.s()) {
                                    int size = ou1.size();
                                    int i4 = this.c1;
                                    if (size < i4) {
                                        ou1 = ou1.l(i4);
                                    } else {
                                        if (this.f1) {
                                            arrayList2 = ou1;
                                        } else {
                                            arrayList2 = new ArrayList(ou1);
                                        }
                                        this.b1 = f02;
                                        this.Z = ou1;
                                        this.Y0 = it;
                                        this.a1 = 3;
                                    }
                                }
                            }
                            if (this.g1) {
                                ou12 = ou1;
                                f023 = f02;
                                if (ou12.size() > this.d1) {
                                }
                                return l;
                            }
                            return C7458kA2.a;
                        }
                    }
                    RT1.n(obj);
                    return C7458kA2.a;
                }
                i2 = this.Z0;
                it2 = (Iterator) this.Y0;
                arrayList = (ArrayList) this.Z;
                f022 = (F02) this.b1;
                RT1.n(obj);
                i = i2;
                if (this.f1) {
                    arrayList.clear();
                } else {
                    arrayList = new ArrayList(this.c1);
                }
                i2 = i;
                while (true) {
                    if (!it2.hasNext()) {
                        T next = it2.next();
                        if (i > 0) {
                            i--;
                        } else {
                            arrayList.add(next);
                            if (arrayList.size() == this.c1) {
                                break;
                            }
                        }
                    } else if (!arrayList.isEmpty() && (this.g1 || arrayList.size() == this.c1)) {
                        this.b1 = null;
                        this.Z = null;
                        this.Y0 = null;
                        this.a1 = 2;
                    }
                }
                return C7458kA2.a;
            }
            RT1.n(obj);
            F02 f024 = (F02) this.b1;
            int B = C5075aO1.B(this.c1, 1024);
            int i5 = this.d1 - this.c1;
            if (i5 >= 0) {
                f022 = f024;
                i = 0;
                arrayList = new ArrayList(B);
                it2 = this.e1;
                i2 = i5;
                while (true) {
                    if (!it2.hasNext()) {
                    }
                }
                return C7458kA2.a;
            }
            ou1 = new OU1(B);
            it = this.e1;
            f02 = f024;
            while (it.hasNext()) {
            }
            if (this.g1) {
            }
            return C7458kA2.a;
        }

        @Override // o.VA0
        /* renamed from: O */
        public final Object i(F02<? super List<? extends T>> f02, HM<? super C7458kA2> hm) {
            return ((a) t(f02, hm)).F(C7458kA2.a);
        }

        @Override // o.AbstractC5644cl
        public final HM<C7458kA2> t(Object obj, HM<?> hm) {
            a aVar = new a(this.c1, this.d1, this.e1, this.f1, this.g1, hm);
            aVar.b1 = obj;
            return aVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @InterfaceC8303na2({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,22:1\n19#2:23\n*E\n"})
    /* renamed from: o.p92$b */
    /* loaded from: classes3.dex */
    public static final class b<T> implements B02<List<? extends T>> {
        public final /* synthetic */ B02 a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        public b(B02 b02, int i, int i2, boolean z, boolean z2) {
            this.a = b02;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = z2;
        }

        @Override // o.B02
        public Iterator<List<? extends T>> iterator() {
            return C8688p92.b(this.a.iterator(), this.b, this.c, this.d, this.e);
        }
    }

    public static final void a(int i, int i2) {
        String str;
        if (i > 0 && i2 > 0) {
            return;
        }
        if (i != i2) {
            str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
        } else {
            str = "size " + i + " must be greater than zero.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @NotNull
    public static final <T> Iterator<List<T>> b(@NotNull Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        C6562gT0.p(it, "iterator");
        if (!it.hasNext()) {
            return C4676Xa0.X;
        }
        return N02.a(new a(i, i2, it, z2, z, null));
    }

    @NotNull
    public static final <T> B02<List<T>> c(@NotNull B02<? extends T> b02, int i, int i2, boolean z, boolean z2) {
        C6562gT0.p(b02, "<this>");
        a(i, i2);
        return new b(b02, i, i2, z, z2);
    }
}
