package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.aw1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5205aw1 extends AbstractC8896q1<C8859ps> implements RandomAccess {
    @NotNull
    public static final a Z0 = new a(null);
    @NotNull
    public final int[] Y0;
    @NotNull
    public final C8859ps[] Z;

    @InterfaceC8303na2({"SMAP\nOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Options.kt\nokio/Options$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,236:1\n11065#2:237\n11400#2,3:238\n13374#2,3:243\n37#3,2:241\n1#4:246\n74#5:247\n74#5:248\n*S KotlinDebug\n*F\n+ 1 Options.kt\nokio/Options$Companion\n*L\n43#1:237\n43#1:238,3\n44#1:243,3\n43#1:241,2\n151#1:247\n208#1:248\n*E\n"})
    /* renamed from: o.aw1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public static /* synthetic */ void b(a aVar, long j, C5422bq c5422bq, int i, List list, int i2, int i3, List list2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                j = 0;
            }
            aVar.a(j, c5422bq, (i4 & 4) != 0 ? 0 : i, list, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? list.size() : i3, list2);
        }

        public final void a(long j, C5422bq c5422bq, int i, List<? extends C8859ps> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            long j2;
            int i7 = i;
            if (i2 < i3) {
                for (int i8 = i2; i8 < i3; i8++) {
                    if (list.get(i8).g0() < i7) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                C8859ps c8859ps = list.get(i2);
                C8859ps c8859ps2 = list.get(i3 - 1);
                if (i7 == c8859ps.g0()) {
                    int i9 = i2 + 1;
                    i4 = i9;
                    i5 = list2.get(i2).intValue();
                    c8859ps = list.get(i9);
                } else {
                    i4 = i2;
                    i5 = -1;
                }
                if (c8859ps.v(i7) != c8859ps2.v(i7)) {
                    int i10 = 1;
                    for (int i11 = i4 + 1; i11 < i3; i11++) {
                        if (list.get(i11 - 1).v(i7) != list.get(i11).v(i7)) {
                            i10++;
                        }
                    }
                    long c = j + c(c5422bq) + 2 + (i10 * 2);
                    c5422bq.writeInt(i10);
                    c5422bq.writeInt(i5);
                    for (int i12 = i4; i12 < i3; i12++) {
                        byte v = list.get(i12).v(i7);
                        if (i12 == i4 || v != list.get(i12 - 1).v(i7)) {
                            c5422bq.writeInt(v & 255);
                        }
                    }
                    C5422bq c5422bq2 = new C5422bq();
                    while (i4 < i3) {
                        byte v2 = list.get(i4).v(i7);
                        int i13 = i4 + 1;
                        int i14 = i13;
                        while (true) {
                            if (i14 < i3) {
                                if (v2 != list.get(i14).v(i7)) {
                                    i6 = i14;
                                    break;
                                }
                                i14++;
                            } else {
                                i6 = i3;
                                break;
                            }
                        }
                        if (i13 == i6 && i7 + 1 == list.get(i4).g0()) {
                            c5422bq.writeInt(list2.get(i4).intValue());
                            j2 = c;
                        } else {
                            c5422bq.writeInt(((int) (c(c5422bq2) + c)) * (-1));
                            j2 = c;
                            a(j2, c5422bq2, i7 + 1, list, i4, i6, list2);
                        }
                        c = j2;
                        i4 = i6;
                    }
                    c5422bq.Q1(c5422bq2);
                    return;
                }
                int min = Math.min(c8859ps.g0(), c8859ps2.g0());
                int i15 = 0;
                for (int i16 = i7; i16 < min && c8859ps.v(i16) == c8859ps2.v(i16); i16++) {
                    i15++;
                }
                long c2 = j + c(c5422bq) + 2 + i15 + 1;
                c5422bq.writeInt(-i15);
                c5422bq.writeInt(i5);
                int i17 = i7 + i15;
                while (i7 < i17) {
                    c5422bq.writeInt(c8859ps.v(i7) & 255);
                    i7++;
                }
                if (i4 + 1 == i3) {
                    if (i17 == list.get(i4).g0()) {
                        c5422bq.writeInt(list2.get(i4).intValue());
                        return;
                    }
                    throw new IllegalStateException("Check failed.");
                }
                C5422bq c5422bq3 = new C5422bq();
                c5422bq.writeInt(((int) (c(c5422bq3) + c2)) * (-1));
                a(c2, c5422bq3, i17, list, i4, i3, list2);
                c5422bq.Q1(c5422bq3);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.");
        }

        public final long c(C5422bq c5422bq) {
            return c5422bq.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
            continue;
         */
        @InterfaceC9511sW0
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C5205aw1 d(@NotNull C8859ps... c8859psArr) {
            C6562gT0.p(c8859psArr, "byteStrings");
            int i = 0;
            if (c8859psArr.length == 0) {
                return new C5205aw1(new C8859ps[0], new int[]{0, -1}, null);
            }
            List ez = C7330jf.ez(c8859psArr);
            C9201rF.m0(ez);
            ArrayList arrayList = new ArrayList(c8859psArr.length);
            for (C8859ps c8859ps : c8859psArr) {
                arrayList.add(-1);
            }
            Integer[] numArr = (Integer[]) arrayList.toArray(new Integer[0]);
            List S = C8222nF.S(Arrays.copyOf(numArr, numArr.length));
            int length = c8859psArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                S.set(C8222nF.y(ez, c8859psArr[i2], 0, 0, 6, null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (((C8859ps) ez.get(0)).g0() > 0) {
                int i4 = 0;
                while (i4 < ez.size()) {
                    C8859ps c8859ps2 = (C8859ps) ez.get(i4);
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < ez.size()) {
                        C8859ps c8859ps3 = (C8859ps) ez.get(i6);
                        if (c8859ps3.h0(c8859ps2)) {
                            if (c8859ps3.g0() != c8859ps2.g0()) {
                                if (((Number) S.get(i6)).intValue() > ((Number) S.get(i4)).intValue()) {
                                    ez.remove(i6);
                                    S.remove(i6);
                                } else {
                                    i6++;
                                }
                            } else {
                                throw new IllegalArgumentException(("duplicate option: " + c8859ps3).toString());
                            }
                        }
                    }
                    i4 = i5;
                }
                C5422bq c5422bq = new C5422bq();
                b(this, 0L, c5422bq, 0, ez, 0, 0, S, 53, null);
                int[] iArr = new int[(int) c(c5422bq)];
                while (!c5422bq.M3()) {
                    iArr[i] = c5422bq.readInt();
                    i++;
                }
                Object[] copyOf = Arrays.copyOf(c8859psArr, c8859psArr.length);
                C6562gT0.o(copyOf, "copyOf(this, size)");
                return new C5205aw1((C8859ps[]) copyOf, iArr, null);
            }
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }

        public a() {
        }
    }

    public /* synthetic */ C5205aw1(C8859ps[] c8859psArr, int[] iArr, C9516sY c9516sY) {
        this(c8859psArr, iArr);
    }

    @InterfaceC9511sW0
    @NotNull
    public static final C5205aw1 r(@NotNull C8859ps... c8859psArr) {
        return Z0.d(c8859psArr);
    }

    @Override // o.AbstractC7901m0, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C8859ps)) {
            return false;
        }
        return h((C8859ps) obj);
    }

    @Override // o.AbstractC8896q1, o.AbstractC7901m0
    public int e() {
        return this.Z.length;
    }

    public /* bridge */ boolean h(C8859ps c8859ps) {
        return super.contains(c8859ps);
    }

    @Override // o.AbstractC8896q1, java.util.List
    @NotNull
    /* renamed from: i */
    public C8859ps get(int i) {
        return this.Z[i];
    }

    @Override // o.AbstractC8896q1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C8859ps)) {
            return -1;
        }
        return l((C8859ps) obj);
    }

    @NotNull
    public final C8859ps[] j() {
        return this.Z;
    }

    @NotNull
    public final int[] k() {
        return this.Y0;
    }

    public /* bridge */ int l(C8859ps c8859ps) {
        return super.indexOf(c8859ps);
    }

    @Override // o.AbstractC8896q1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C8859ps)) {
            return -1;
        }
        return p((C8859ps) obj);
    }

    public /* bridge */ int p(C8859ps c8859ps) {
        return super.lastIndexOf(c8859ps);
    }

    public C5205aw1(C8859ps[] c8859psArr, int[] iArr) {
        this.Z = c8859psArr;
        this.Y0 = iArr;
    }
}
