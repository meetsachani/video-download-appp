package o;

import java.io.EOFException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "-RealBufferedSource")
@InterfaceC8303na2({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,402:1\n1#2:403\n62#3:404\n62#3:405\n62#3:406\n62#3:407\n62#3:408\n62#3:409\n62#3:410\n62#3:411\n62#3:412\n62#3:413\n62#3:414\n62#3:415\n62#3:416\n62#3:417\n62#3:418\n62#3:419\n62#3:420\n62#3:421\n62#3:422\n62#3:423\n62#3:424\n62#3:425\n62#3:426\n62#3:428\n62#3:429\n62#3:430\n62#3:431\n62#3:432\n62#3:433\n62#3:434\n62#3:435\n62#3:436\n62#3:437\n62#3:438\n62#3:439\n62#3:440\n62#3:441\n62#3:442\n62#3:443\n62#3:444\n62#3:445\n62#3:446\n62#3:447\n62#3:449\n62#3:450\n62#3:451\n62#3:452\n62#3:453\n62#3:454\n62#3:455\n62#3:456\n62#3:457\n62#3:458\n62#3:459\n62#3:460\n62#3:461\n62#3:462\n62#3:463\n62#3:464\n62#3:465\n62#3:466\n62#3:467\n62#3:468\n62#3:469\n62#3:470\n62#3:471\n62#3:472\n62#3:473\n62#3:474\n62#3:475\n89#4:427\n89#4:448\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n41#1:404\n42#1:405\n46#1:406\n47#1:407\n52#1:408\n62#1:409\n63#1:410\n70#1:411\n74#1:412\n75#1:413\n80#1:414\n87#1:415\n94#1:416\n99#1:417\n107#1:418\n108#1:419\n113#1:420\n122#1:421\n123#1:422\n130#1:423\n136#1:424\n137#1:425\n141#1:426\n142#1:428\n150#1:429\n154#1:430\n159#1:431\n160#1:432\n163#1:433\n166#1:434\n167#1:435\n168#1:436\n174#1:437\n175#1:438\n180#1:439\n187#1:440\n188#1:441\n193#1:442\n201#1:443\n203#1:444\n204#1:445\n206#1:446\n209#1:447\n211#1:449\n219#1:450\n226#1:451\n231#1:452\n236#1:453\n241#1:454\n246#1:455\n251#1:456\n256#1:457\n264#1:458\n275#1:459\n283#1:460\n297#1:461\n304#1:462\n307#1:463\n308#1:464\n319#1:465\n324#1:466\n325#1:467\n338#1:468\n341#1:469\n342#1:470\n354#1:471\n357#1:472\n358#1:473\n383#1:474\n396#1:475\n141#1:427\n209#1:448\n*E\n"})
/* renamed from: o.n  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8161n {
    @NotNull
    public static final String A(@NotNull MO1 mo1, long j) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(j);
        return mo1.Y.e3(j);
    }

    public static final int B(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(1L);
        byte x = mo1.Y.x(0L);
        if ((x & 224) == 192) {
            mo1.Q2(2L);
        } else if ((x & 240) == 224) {
            mo1.Q2(3L);
        } else if ((x & 248) == 240) {
            mo1.Q2(4L);
        }
        return mo1.Y.C4();
    }

    @Nullable
    public static final String C(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        long V2 = mo1.V2((byte) 10);
        if (V2 == -1) {
            if (mo1.Y.size() != 0) {
                return mo1.e3(mo1.Y.size());
            }
            return null;
        }
        return C5219b.j0(mo1.Y, V2);
    }

    @NotNull
    public static final String D(@NotNull MO1 mo1, long j) {
        long j2;
        C6562gT0.p(mo1, "<this>");
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long j1 = mo1.j1((byte) 10, 0L, j2);
            if (j1 != -1) {
                return C5219b.j0(mo1.Y, j1);
            }
            if (j2 < Long.MAX_VALUE && mo1.e2(j2) && mo1.Y.x(j2 - 1) == 13 && mo1.e2(j2 + 1) && mo1.Y.x(j2) == 10) {
                return C5219b.j0(mo1.Y, j2);
            }
            C5422bq c5422bq = new C5422bq();
            C5422bq c5422bq2 = mo1.Y;
            c5422bq2.p(c5422bq, 0L, Math.min(32, c5422bq2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(mo1.Y.size(), j) + " content=" + c5422bq.G4().A() + Hw2.F);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    public static final boolean E(@NotNull MO1 mo1, long j) {
        C6562gT0.p(mo1, "<this>");
        if (j >= 0) {
            if (!mo1.Z) {
                while (mo1.Y.size() < j) {
                    if (mo1.X.read(mo1.Y, 8192L) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    public static final void F(@NotNull MO1 mo1, long j) {
        C6562gT0.p(mo1, "<this>");
        if (mo1.e2(j)) {
            return;
        }
        throw new EOFException();
    }

    public static final int G(@NotNull MO1 mo1, @NotNull C5205aw1 c5205aw1) {
        C6562gT0.p(mo1, "<this>");
        C6562gT0.p(c5205aw1, C9998uW1.m0);
        if (!mo1.Z) {
            do {
                int l0 = C5219b.l0(mo1.Y, c5205aw1, true);
                if (l0 != -2) {
                    if (l0 == -1) {
                        return -1;
                    }
                    mo1.Y.skip(c5205aw1.j()[l0].g0());
                    return l0;
                }
            } while (mo1.X.read(mo1.Y, 8192L) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public static final void H(@NotNull MO1 mo1, long j) {
        C6562gT0.p(mo1, "<this>");
        if (!mo1.Z) {
            while (j > 0) {
                if (mo1.Y.size() == 0 && mo1.X.read(mo1.Y, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, mo1.Y.size());
                mo1.Y.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @NotNull
    public static final C8120mp2 I(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        return mo1.X.timeout();
    }

    @NotNull
    public static final String J(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        return "buffer(" + mo1.X + ')';
    }

    public static final void a(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        if (mo1.Z) {
            return;
        }
        mo1.Z = true;
        mo1.X.close();
        mo1.Y.h();
    }

    public static final boolean b(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        if (!mo1.Z) {
            if (mo1.Y.M3() && mo1.X.read(mo1.Y, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    public static final long c(@NotNull MO1 mo1, byte b, long j, long j2) {
        C6562gT0.p(mo1, "<this>");
        if (!mo1.Z) {
            if (0 <= j && j <= j2) {
                long j3 = j;
                while (j3 < j2) {
                    byte b2 = b;
                    long j4 = j2;
                    long j1 = mo1.Y.j1(b2, j3, j4);
                    if (j1 != -1) {
                        return j1;
                    }
                    long size = mo1.Y.size();
                    if (size >= j4 || mo1.X.read(mo1.Y, 8192L) == -1) {
                        break;
                    }
                    j3 = Math.max(j3, size);
                    b = b2;
                    j2 = j4;
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed");
    }

    public static final long d(@NotNull MO1 mo1, @NotNull C8859ps c8859ps, long j) {
        C6562gT0.p(mo1, "<this>");
        C6562gT0.p(c8859ps, "bytes");
        if (mo1.Z) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long H1 = mo1.Y.H1(c8859ps, j);
            if (H1 != -1) {
                return H1;
            }
            long size = mo1.Y.size();
            if (mo1.X.read(mo1.Y, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - c8859ps.g0()) + 1);
        }
    }

    public static final long e(@NotNull MO1 mo1, @NotNull C8859ps c8859ps, long j) {
        C6562gT0.p(mo1, "<this>");
        C6562gT0.p(c8859ps, "targetBytes");
        if (mo1.Z) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long d1 = mo1.Y.d1(c8859ps, j);
            if (d1 != -1) {
                return d1;
            }
            long size = mo1.Y.size();
            if (mo1.X.read(mo1.Y, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    @NotNull
    public static final InterfaceC2677Cq f(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        return C9604su1.e(new C7969mC1(mo1));
    }

    public static final boolean g(@NotNull MO1 mo1, long j, @NotNull C8859ps c8859ps, int i, int i2) {
        C6562gT0.p(mo1, "<this>");
        C6562gT0.p(c8859ps, "bytes");
        if (!mo1.Z) {
            if (j < 0 || i < 0 || i2 < 0 || c8859ps.g0() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!mo1.e2(1 + j2) || mo1.Y.x(j2) != c8859ps.v(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    public static final int h(@NotNull MO1 mo1, @NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(mo1, "<this>");
        C6562gT0.p(bArr, "sink");
        long j = i2;
        C8648p.e(bArr.length, i, j);
        if (mo1.Y.size() == 0 && mo1.X.read(mo1.Y, 8192L) == -1) {
            return -1;
        }
        return mo1.Y.read(bArr, i, (int) Math.min(j, mo1.Y.size()));
    }

    public static final long i(@NotNull MO1 mo1, @NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(mo1, "<this>");
        C6562gT0.p(c5422bq, "sink");
        if (j >= 0) {
            if (!mo1.Z) {
                if (mo1.Y.size() == 0 && mo1.X.read(mo1.Y, 8192L) == -1) {
                    return -1L;
                }
                return mo1.Y.read(c5422bq, Math.min(j, mo1.Y.size()));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    public static final long j(@NotNull MO1 mo1, @NotNull J82 j82) {
        C6562gT0.p(mo1, "<this>");
        C6562gT0.p(j82, "sink");
        long j = 0;
        while (mo1.X.read(mo1.Y, 8192L) != -1) {
            long j2 = mo1.Y.j();
            if (j2 > 0) {
                j += j2;
                j82.write(mo1.Y, j2);
            }
        }
        if (mo1.Y.size() > 0) {
            long size = j + mo1.Y.size();
            C5422bq c5422bq = mo1.Y;
            j82.write(c5422bq, c5422bq.size());
            return size;
        }
        return j;
    }

    public static final byte k(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(1L);
        return mo1.Y.readByte();
    }

    @NotNull
    public static final byte[] l(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Y.Q1(mo1.X);
        return mo1.Y.I3();
    }

    @NotNull
    public static final byte[] m(@NotNull MO1 mo1, long j) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(j);
        return mo1.Y.o2(j);
    }

    @NotNull
    public static final C8859ps n(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Y.Q1(mo1.X);
        return mo1.Y.G4();
    }

    @NotNull
    public static final C8859ps o(@NotNull MO1 mo1, long j) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(j);
        return mo1.Y.n3(j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Expected a digit or '-' but was 0x");
        r1 = java.lang.Integer.toString(r8, o.BB.a(o.BB.a(16)));
        o.C6562gT0.o(r1, "toString(this, checkRadix(radix))");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long p(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo1.e2(j2)) {
                break;
            }
            byte x = mo1.Y.x(j);
            if ((x < 48 || x > 57) && !(j == 0 && x == 45)) {
                break;
            }
            j = j2;
        }
        return mo1.Y.a4();
    }

    public static final void q(@NotNull MO1 mo1, @NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(mo1, "<this>");
        C6562gT0.p(c5422bq, "sink");
        try {
            mo1.Q2(j);
            mo1.Y.b1(c5422bq, j);
        } catch (EOFException e) {
            c5422bq.Q1(mo1.Y);
            throw e;
        }
    }

    public static final void r(@NotNull MO1 mo1, @NotNull byte[] bArr) {
        C6562gT0.p(mo1, "<this>");
        C6562gT0.p(bArr, "sink");
        try {
            mo1.Q2(bArr.length);
            mo1.Y.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (mo1.Y.size() > 0) {
                C5422bq c5422bq = mo1.Y;
                int read = c5422bq.read(bArr, i, (int) c5422bq.size());
                if (read != -1) {
                    i += read;
                } else {
                    throw new AssertionError();
                }
            }
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("Expected leading [0-9a-fA-F] character but was 0x");
        r1 = java.lang.Integer.toString(r2, o.BB.a(o.BB.a(16)));
        o.C6562gT0.o(r1, "toString(this, checkRadix(radix))");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        throw new java.lang.NumberFormatException(r0.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long s(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!mo1.e2(i2)) {
                break;
            }
            byte x = mo1.Y.x(i);
            if ((x < 48 || x > 57) && ((x < 97 || x > 102) && (x < 65 || x > 70))) {
                break;
            }
            i = i2;
        }
        return mo1.Y.H5();
    }

    public static final int t(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(4L);
        return mo1.Y.readInt();
    }

    public static final int u(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(4L);
        return mo1.Y.S4();
    }

    public static final long v(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(8L);
        return mo1.Y.readLong();
    }

    public static final long w(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(8L);
        return mo1.Y.z2();
    }

    public static final short x(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(2L);
        return mo1.Y.readShort();
    }

    public static final short y(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Q2(2L);
        return mo1.Y.w2();
    }

    @NotNull
    public static final String z(@NotNull MO1 mo1) {
        C6562gT0.p(mo1, "<this>");
        mo1.Y.Q1(mo1.X);
        return mo1.Y.Y4();
    }
}
