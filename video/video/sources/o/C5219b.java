package o;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import o.C5422bq;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8046mW0(name = "-Buffer")
@InterfaceC8303na2({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1730:1\n112#1,20:1753\n112#1,20:1786\n112#1:1806\n114#1,18:1808\n112#1,20:1826\n74#2:1731\n74#2:1732\n74#2:1733\n74#2:1734\n74#2:1735\n74#2:1736\n74#2:1737\n74#2:1738\n74#2:1739\n74#2:1740\n74#2:1741\n74#2:1742\n83#2:1743\n83#2:1744\n77#2:1745\n77#2:1746\n77#2:1747\n77#2:1748\n77#2:1749\n77#2:1750\n77#2:1751\n77#2:1752\n86#2:1773\n89#2:1775\n74#2:1776\n74#2:1777\n74#2:1778\n74#2:1779\n74#2:1780\n74#2:1781\n74#2:1782\n74#2:1783\n74#2:1784\n74#2:1785\n89#2:1807\n86#2:1846\n1#3:1774\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n415#1:1753,20\n1292#1:1786,20\n1323#1:1806\n1323#1:1808,18\n1357#1:1826,20\n178#1:1731\n202#1:1732\n321#1:1733\n326#1:1734\n349#1:1735\n350#1:1736\n351#1:1737\n352#1:1738\n358#1:1739\n359#1:1740\n360#1:1741\n361#1:1742\n385#1:1743\n386#1:1744\n392#1:1745\n393#1:1746\n394#1:1747\n395#1:1748\n396#1:1749\n397#1:1750\n398#1:1751\n399#1:1752\n427#1:1773\n888#1:1775\n906#1:1776\n908#1:1777\n912#1:1778\n914#1:1779\n918#1:1780\n920#1:1781\n924#1:1782\n926#1:1783\n946#1:1784\n949#1:1785\n1336#1:1807\n1676#1:1846\n*E\n"})
/* renamed from: o.b */
/* loaded from: classes4.dex */
public final class C5219b {
    @NotNull
    public static final byte[] a = GO2.a(C10671xH0.a);
    public static final int b = 4096;
    public static final long c = -922337203685477580L;
    public static final long d = -7;

    public static final void A(@NotNull C5422bq c5422bq, @NotNull byte[] bArr) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = c5422bq.read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ac A[EDGE_INSN: B:90:0x00ac->B:85:0x00ac ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long B(@NotNull C5422bq c5422bq) {
        int i;
        C6562gT0.p(c5422bq, "<this>");
        if (c5422bq.size() != 0) {
            int i2 = 0;
            boolean z = false;
            long j = 0;
            do {
                PZ1 pz1 = c5422bq.X;
                C6562gT0.m(pz1);
                byte[] bArr = pz1.a;
                int i3 = pz1.b;
                int i4 = pz1.c;
                while (i3 < i4) {
                    byte b2 = bArr[i3];
                    if (b2 >= 48 && b2 <= 57) {
                        i = b2 - 48;
                    } else if (b2 >= 97 && b2 <= 102) {
                        i = b2 - 87;
                    } else if (b2 >= 65 && b2 <= 70) {
                        i = b2 + C2638Cg0.v7;
                    } else if (i2 != 0) {
                        z = true;
                        if (i3 != i4) {
                            c5422bq.X = pz1.b();
                            UZ1.d(pz1);
                        } else {
                            pz1.b = i3;
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + C8648p.u(b2));
                    }
                    if (((-1152921504606846976L) & j) == 0) {
                        j = (j << 4) | i;
                        i3++;
                        i2++;
                    } else {
                        C5422bq writeByte = new C5422bq().F4(j).writeByte(b2);
                        throw new NumberFormatException("Number too large: " + writeByte.Y4());
                    }
                }
                if (i3 != i4) {
                }
                if (!z) {
                }
            } while (c5422bq.X != null);
            c5422bq.R(c5422bq.size() - i2);
            return j;
        }
        throw new EOFException();
    }

    public static final int C(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        if (c5422bq.size() >= 4) {
            PZ1 pz1 = c5422bq.X;
            C6562gT0.m(pz1);
            int i = pz1.b;
            int i2 = pz1.c;
            if (i2 - i < 4) {
                return (c5422bq.readByte() & 255) | ((c5422bq.readByte() & 255) << 24) | ((c5422bq.readByte() & 255) << 16) | ((c5422bq.readByte() & 255) << 8);
            }
            byte[] bArr = pz1.a;
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = i + 4;
            int i6 = (bArr[i4] & 255) | i3 | ((bArr[i + 2] & 255) << 8);
            c5422bq.R(c5422bq.size() - 4);
            if (i5 == i2) {
                c5422bq.X = pz1.b();
                UZ1.d(pz1);
                return i6;
            }
            pz1.b = i5;
            return i6;
        }
        throw new EOFException();
    }

    public static final long D(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        if (c5422bq.size() >= 8) {
            PZ1 pz1 = c5422bq.X;
            C6562gT0.m(pz1);
            int i = pz1.b;
            int i2 = pz1.c;
            if (i2 - i < 8) {
                return ((c5422bq.readInt() & 4294967295L) << 32) | (4294967295L & c5422bq.readInt());
            }
            byte[] bArr = pz1.a;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40);
            int i3 = i + 7;
            int i4 = i + 8;
            long j2 = j | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i3] & 255);
            c5422bq.R(c5422bq.size() - 8);
            if (i4 == i2) {
                c5422bq.X = pz1.b();
                UZ1.d(pz1);
                return j2;
            }
            pz1.b = i4;
            return j2;
        }
        throw new EOFException();
    }

    public static final short E(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        if (c5422bq.size() >= 2) {
            PZ1 pz1 = c5422bq.X;
            C6562gT0.m(pz1);
            int i = pz1.b;
            int i2 = pz1.c;
            if (i2 - i < 2) {
                return (short) ((c5422bq.readByte() & 255) | ((c5422bq.readByte() & 255) << 8));
            }
            byte[] bArr = pz1.a;
            int i3 = i + 1;
            int i4 = i + 2;
            int i5 = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            c5422bq.R(c5422bq.size() - 2);
            if (i4 == i2) {
                c5422bq.X = pz1.b();
                UZ1.d(pz1);
            } else {
                pz1.b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @NotNull
    public static final C5422bq.c F(@NotNull C5422bq c5422bq, @NotNull C5422bq.c cVar) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(cVar, "unsafeCursor");
        C5422bq.c n = C8648p.n(cVar);
        if (n.X == null) {
            n.X = c5422bq;
            n.Y = false;
            return n;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @NotNull
    public static final String G(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "<this>");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            if (c5422bq.size() >= j) {
                if (i == 0) {
                    return "";
                }
                PZ1 pz1 = c5422bq.X;
                C6562gT0.m(pz1);
                int i2 = pz1.b;
                if (i2 + j > pz1.c) {
                    return IO2.c(c5422bq.o2(j), 0, 0, 3, null);
                }
                int i3 = (int) j;
                String b2 = IO2.b(pz1.a, i2, i2 + i3);
                pz1.b += i3;
                c5422bq.R(c5422bq.size() - j);
                if (pz1.b == pz1.c) {
                    c5422bq.X = pz1.b();
                    UZ1.d(pz1);
                }
                return b2;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    public static final int H(@NotNull C5422bq c5422bq) {
        int i;
        int i2;
        int i3;
        C6562gT0.p(c5422bq, "<this>");
        if (c5422bq.size() != 0) {
            byte x = c5422bq.x(0L);
            if ((x & 128) == 0) {
                i = x & Byte.MAX_VALUE;
                i3 = 0;
                i2 = 1;
            } else if ((x & 224) == 192) {
                i = x & 31;
                i2 = 2;
                i3 = 128;
            } else if ((x & 240) == 224) {
                i = x & C8077mf.q;
                i2 = 3;
                i3 = 2048;
            } else if ((x & 248) == 240) {
                i = x & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                c5422bq.skip(1L);
                return ED2.c;
            }
            long j = i2;
            if (c5422bq.size() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte x2 = c5422bq.x(j2);
                    if ((x2 & C2638Cg0.o7) == 128) {
                        i = (i << 6) | (x2 & ED2.a);
                    } else {
                        c5422bq.skip(j2);
                        return ED2.c;
                    }
                }
                c5422bq.skip(j);
                if (i > 1114111) {
                    return ED2.c;
                }
                if ((55296 <= i && i < 57344) || i < i3) {
                    return ED2.c;
                }
                return i;
            }
            throw new EOFException("size < " + i2 + ": " + c5422bq.size() + " (to read code point prefixed 0x" + C8648p.u(x) + ')');
        }
        throw new EOFException();
    }

    @Nullable
    public static final String I(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        long V2 = c5422bq.V2((byte) 10);
        if (V2 != -1) {
            return j0(c5422bq, V2);
        }
        if (c5422bq.size() != 0) {
            return c5422bq.e3(c5422bq.size());
        }
        return null;
    }

    @NotNull
    public static final String J(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "<this>");
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long j3 = j2;
            long j1 = c5422bq.j1((byte) 10, 0L, j3);
            if (j1 != -1) {
                return j0(c5422bq, j1);
            }
            if (j3 < c5422bq.size() && c5422bq.x(j3 - 1) == 13 && c5422bq.x(j3) == 10) {
                return j0(c5422bq, j3);
            }
            C5422bq c5422bq2 = new C5422bq();
            c5422bq.p(c5422bq2, 0L, Math.min(32, c5422bq.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(c5422bq.size(), j) + " content=" + c5422bq2.G4().A() + Hw2.F);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    public static final long K(@NotNull C5422bq.c cVar, long j) {
        C6562gT0.p(cVar, "<this>");
        C5422bq c5422bq = cVar.X;
        if (c5422bq != null) {
            if (cVar.Y) {
                long size = c5422bq.size();
                int i = (j > size ? 1 : (j == size ? 0 : -1));
                if (i <= 0) {
                    if (j >= 0) {
                        long j2 = size - j;
                        while (true) {
                            if (j2 <= 0) {
                                break;
                            }
                            PZ1 pz1 = c5422bq.X;
                            C6562gT0.m(pz1);
                            PZ1 pz12 = pz1.g;
                            C6562gT0.m(pz12);
                            int i2 = pz12.c;
                            long j3 = i2 - pz12.b;
                            if (j3 <= j2) {
                                c5422bq.X = pz12.b();
                                UZ1.d(pz12);
                                j2 -= j3;
                            } else {
                                pz12.c = i2 - ((int) j2);
                                break;
                            }
                        }
                        cVar.j(null);
                        cVar.Y0 = j;
                        cVar.Z0 = null;
                        cVar.a1 = -1;
                        cVar.b1 = -1;
                    } else {
                        throw new IllegalArgumentException(("newSize < 0: " + j).toString());
                    }
                } else if (i > 0) {
                    long j4 = j - size;
                    boolean z = true;
                    while (j4 > 0) {
                        PZ1 Z = c5422bq.Z(1);
                        int min = (int) Math.min(j4, 8192 - Z.c);
                        Z.c += min;
                        j4 -= min;
                        if (z) {
                            cVar.j(Z);
                            cVar.Y0 = size;
                            cVar.Z0 = Z.a;
                            int i3 = Z.c;
                            cVar.a1 = i3 - min;
                            cVar.b1 = i3;
                            z = false;
                        }
                    }
                }
                c5422bq.R(j);
                return size;
            }
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        throw new IllegalStateException("not attached to a buffer");
    }

    public static final int L(@NotNull C5422bq.c cVar, long j) {
        PZ1 pz1;
        C6562gT0.p(cVar, "<this>");
        C5422bq c5422bq = cVar.X;
        if (c5422bq != null) {
            int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if (i >= 0 && j <= c5422bq.size()) {
                if (i != 0 && j != c5422bq.size()) {
                    long size = c5422bq.size();
                    PZ1 pz12 = c5422bq.X;
                    long j2 = 0;
                    if (cVar.d() != null) {
                        long j3 = cVar.Y0;
                        int i2 = cVar.a1;
                        PZ1 d2 = cVar.d();
                        C6562gT0.m(d2);
                        long j4 = j3 - (i2 - d2.b);
                        if (j4 > j) {
                            pz1 = pz12;
                            pz12 = cVar.d();
                            size = j4;
                        } else {
                            pz1 = cVar.d();
                            j2 = j4;
                        }
                    } else {
                        pz1 = pz12;
                    }
                    if (size - j > j - j2) {
                        while (true) {
                            C6562gT0.m(pz1);
                            int i3 = pz1.c;
                            int i4 = pz1.b;
                            if (j < (i3 - i4) + j2) {
                                break;
                            }
                            j2 += i3 - i4;
                            pz1 = pz1.f;
                        }
                    } else {
                        while (size > j) {
                            C6562gT0.m(pz12);
                            pz12 = pz12.g;
                            C6562gT0.m(pz12);
                            size -= pz12.c - pz12.b;
                        }
                        j2 = size;
                        pz1 = pz12;
                    }
                    if (cVar.Y) {
                        C6562gT0.m(pz1);
                        if (pz1.d) {
                            PZ1 f = pz1.f();
                            if (c5422bq.X == pz1) {
                                c5422bq.X = f;
                            }
                            pz1 = pz1.c(f);
                            PZ1 pz13 = pz1.g;
                            C6562gT0.m(pz13);
                            pz13.b();
                        }
                    }
                    cVar.j(pz1);
                    cVar.Y0 = j;
                    C6562gT0.m(pz1);
                    cVar.Z0 = pz1.a;
                    int i5 = pz1.b + ((int) (j - j2));
                    cVar.a1 = i5;
                    int i6 = pz1.c;
                    cVar.b1 = i6;
                    return i6 - i5;
                }
                cVar.j(null);
                cVar.Y0 = j;
                cVar.Z0 = null;
                cVar.a1 = -1;
                cVar.b1 = -1;
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c5422bq.size());
        }
        throw new IllegalStateException("not attached to a buffer");
    }

    public static final int M(@NotNull C5422bq c5422bq, @NotNull C5205aw1 c5205aw1) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c5205aw1, C9998uW1.m0);
        int m0 = m0(c5422bq, c5205aw1, false, 2, null);
        if (m0 == -1) {
            return -1;
        }
        c5422bq.skip(c5205aw1.j()[m0].g0());
        return m0;
    }

    public static final void N(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "<this>");
        while (j > 0) {
            PZ1 pz1 = c5422bq.X;
            if (pz1 != null) {
                int min = (int) Math.min(j, pz1.c - pz1.b);
                long j2 = min;
                c5422bq.R(c5422bq.size() - j2);
                j -= j2;
                int i = pz1.b + min;
                pz1.b = i;
                if (i == pz1.c) {
                    c5422bq.X = pz1.b();
                    UZ1.d(pz1);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @NotNull
    public static final C8859ps O(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        if (c5422bq.size() <= 2147483647L) {
            return c5422bq.W((int) c5422bq.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + c5422bq.size()).toString());
    }

    @NotNull
    public static final C8859ps P(@NotNull C5422bq c5422bq, int i) {
        C6562gT0.p(c5422bq, "<this>");
        if (i == 0) {
            return C8859ps.Z0;
        }
        C8648p.e(c5422bq.size(), 0L, i);
        PZ1 pz1 = c5422bq.X;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            C6562gT0.m(pz1);
            int i5 = pz1.c;
            int i6 = pz1.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                pz1 = pz1.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        PZ1 pz12 = c5422bq.X;
        int i7 = 0;
        while (i2 < i) {
            C6562gT0.m(pz12);
            bArr[i7] = pz12.a;
            i2 += pz12.c - pz12.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = pz12.b;
            pz12.d = true;
            i7++;
            pz12 = pz12.f;
        }
        return new VZ1(bArr, iArr);
    }

    @NotNull
    public static final PZ1 Q(@NotNull C5422bq c5422bq, int i) {
        C6562gT0.p(c5422bq, "<this>");
        if (i >= 1 && i <= 8192) {
            PZ1 pz1 = c5422bq.X;
            if (pz1 == null) {
                PZ1 e = UZ1.e();
                c5422bq.X = e;
                e.g = e;
                e.f = e;
                return e;
            }
            C6562gT0.m(pz1);
            PZ1 pz12 = pz1.g;
            C6562gT0.m(pz12);
            if (pz12.c + i <= 8192 && pz12.e) {
                return pz12;
            }
            return pz12.c(UZ1.e());
        }
        throw new IllegalArgumentException("unexpected capacity");
    }

    @NotNull
    public static final C5422bq R(@NotNull C5422bq c5422bq, @NotNull C8859ps c8859ps, int i, int i2) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c8859ps, "byteString");
        c8859ps.u0(c5422bq, i, i2);
        return c5422bq;
    }

    @NotNull
    public static final C5422bq S(@NotNull C5422bq c5422bq, @NotNull InterfaceC7072ia2 interfaceC7072ia2, long j) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(interfaceC7072ia2, "source");
        while (j > 0) {
            long read = interfaceC7072ia2.read(c5422bq, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return c5422bq;
    }

    @NotNull
    public static final C5422bq T(@NotNull C5422bq c5422bq, @NotNull byte[] bArr) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(bArr, "source");
        return c5422bq.write(bArr, 0, bArr.length);
    }

    @NotNull
    public static final C5422bq U(@NotNull C5422bq c5422bq, @NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(bArr, "source");
        long j = i2;
        C8648p.e(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            PZ1 Z = c5422bq.Z(1);
            int min = Math.min(i3 - i, 8192 - Z.c);
            int i4 = i + min;
            C4788Ye.v0(bArr, Z.a, Z.c, i, i4);
            Z.c += min;
            i = i4;
        }
        c5422bq.R(c5422bq.size() + j);
        return c5422bq;
    }

    public static final void V(@NotNull C5422bq c5422bq, @NotNull C5422bq c5422bq2, long j) {
        PZ1 pz1;
        PZ1 pz12;
        int i;
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c5422bq2, "source");
        if (c5422bq2 != c5422bq) {
            C8648p.e(c5422bq2.size(), 0L, j);
            while (j > 0) {
                PZ1 pz13 = c5422bq2.X;
                C6562gT0.m(pz13);
                int i2 = pz13.c;
                C6562gT0.m(c5422bq2.X);
                if (j < i2 - pz1.b) {
                    PZ1 pz14 = c5422bq.X;
                    if (pz14 != null) {
                        C6562gT0.m(pz14);
                        pz12 = pz14.g;
                    } else {
                        pz12 = null;
                    }
                    if (pz12 != null && pz12.e) {
                        long j2 = pz12.c + j;
                        if (pz12.d) {
                            i = 0;
                        } else {
                            i = pz12.b;
                        }
                        if (j2 - i <= 8192) {
                            PZ1 pz15 = c5422bq2.X;
                            C6562gT0.m(pz15);
                            pz15.g(pz12, (int) j);
                            c5422bq2.R(c5422bq2.size() - j);
                            c5422bq.R(c5422bq.size() + j);
                            return;
                        }
                    }
                    PZ1 pz16 = c5422bq2.X;
                    C6562gT0.m(pz16);
                    c5422bq2.X = pz16.e((int) j);
                }
                PZ1 pz17 = c5422bq2.X;
                C6562gT0.m(pz17);
                long j3 = pz17.c - pz17.b;
                c5422bq2.X = pz17.b();
                PZ1 pz18 = c5422bq.X;
                if (pz18 == null) {
                    c5422bq.X = pz17;
                    pz17.g = pz17;
                    pz17.f = pz17;
                } else {
                    C6562gT0.m(pz18);
                    PZ1 pz19 = pz18.g;
                    C6562gT0.m(pz19);
                    pz19.c(pz17).a();
                }
                c5422bq2.R(c5422bq2.size() - j3);
                c5422bq.R(c5422bq.size() + j3);
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static /* synthetic */ C5422bq W(C5422bq c5422bq, C8859ps c8859ps, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = c8859ps.g0();
        }
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c8859ps, "byteString");
        c8859ps.u0(c5422bq, i, i2);
        return c5422bq;
    }

    public static final long X(@NotNull C5422bq c5422bq, @NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(interfaceC7072ia2, "source");
        long j = 0;
        while (true) {
            long read = interfaceC7072ia2.read(c5422bq, 8192L);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    @NotNull
    public static final C5422bq Y(@NotNull C5422bq c5422bq, int i) {
        C6562gT0.p(c5422bq, "<this>");
        PZ1 Z = c5422bq.Z(1);
        byte[] bArr = Z.a;
        int i2 = Z.c;
        Z.c = i2 + 1;
        bArr[i2] = (byte) i;
        c5422bq.R(c5422bq.size() + 1);
        return c5422bq;
    }

    @NotNull
    public static final C5422bq Z(@NotNull C5422bq c5422bq, long j) {
        boolean z;
        C6562gT0.p(c5422bq, "<this>");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return c5422bq.writeByte(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return c5422bq.K1("-9223372036854775808");
            }
            z = true;
        } else {
            z = false;
        }
        if (j < 100000000) {
            if (j < 10000) {
                if (j < 100) {
                    if (j >= 10) {
                        i2 = 2;
                    }
                } else if (j < 1000) {
                    i2 = 3;
                } else {
                    i2 = 4;
                }
            } else if (j < 1000000) {
                if (j < 100000) {
                    i2 = 5;
                } else {
                    i2 = 6;
                }
            } else if (j < 10000000) {
                i2 = 7;
            } else {
                i2 = 8;
            }
        } else if (j < 1000000000000L) {
            if (j < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                if (j < C10323vs.k) {
                    i2 = 9;
                } else {
                    i2 = 10;
                }
            } else if (j < 100000000000L) {
                i2 = 11;
            } else {
                i2 = 12;
            }
        } else if (j < 1000000000000000L) {
            if (j < 10000000000000L) {
                i2 = 13;
            } else if (j < 100000000000000L) {
                i2 = 14;
            } else {
                i2 = 15;
            }
        } else if (j < 100000000000000000L) {
            if (j < 10000000000000000L) {
                i2 = 16;
            } else {
                i2 = 17;
            }
        } else if (j < 1000000000000000000L) {
            i2 = 18;
        } else {
            i2 = 19;
        }
        if (z) {
            i2++;
        }
        PZ1 Z = c5422bq.Z(i2);
        byte[] bArr = Z.a;
        int i3 = Z.c + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = g0()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = C3307Iz.e0;
        }
        Z.c += i2;
        c5422bq.R(c5422bq.size() + i2);
        return c5422bq;
    }

    public static final void a(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        c5422bq.skip(c5422bq.size());
    }

    @NotNull
    public static final C5422bq a0(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "<this>");
        if (j == 0) {
            return c5422bq.writeByte(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        PZ1 Z = c5422bq.Z(i);
        byte[] bArr = Z.a;
        int i2 = Z.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = g0()[(int) (15 & j)];
            j >>>= 4;
        }
        Z.c += i;
        c5422bq.R(c5422bq.size() + i);
        return c5422bq;
    }

    public static final void b(@NotNull C5422bq.c cVar) {
        C6562gT0.p(cVar, "<this>");
        if (cVar.X != null) {
            cVar.X = null;
            cVar.j(null);
            cVar.Y0 = -1L;
            cVar.Z0 = null;
            cVar.a1 = -1;
            cVar.b1 = -1;
            return;
        }
        throw new IllegalStateException("not attached to a buffer");
    }

    @NotNull
    public static final C5422bq b0(@NotNull C5422bq c5422bq, int i) {
        C6562gT0.p(c5422bq, "<this>");
        PZ1 Z = c5422bq.Z(4);
        byte[] bArr = Z.a;
        int i2 = Z.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        Z.c = i2 + 4;
        c5422bq.R(c5422bq.size() + 4);
        return c5422bq;
    }

    public static final long c(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        long size = c5422bq.size();
        if (size == 0) {
            return 0L;
        }
        PZ1 pz1 = c5422bq.X;
        C6562gT0.m(pz1);
        PZ1 pz12 = pz1.g;
        C6562gT0.m(pz12);
        int i = pz12.c;
        if (i < 8192 && pz12.e) {
            return size - (i - pz12.b);
        }
        return size;
    }

    @NotNull
    public static final C5422bq c0(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "<this>");
        PZ1 Z = c5422bq.Z(8);
        byte[] bArr = Z.a;
        int i = Z.c;
        bArr[i] = (byte) ((j >>> 56) & 255);
        bArr[i + 1] = (byte) ((j >>> 48) & 255);
        bArr[i + 2] = (byte) ((j >>> 40) & 255);
        bArr[i + 3] = (byte) ((j >>> 32) & 255);
        bArr[i + 4] = (byte) ((j >>> 24) & 255);
        bArr[i + 5] = (byte) ((j >>> 16) & 255);
        bArr[i + 6] = (byte) ((j >>> 8) & 255);
        bArr[i + 7] = (byte) (j & 255);
        Z.c = i + 8;
        c5422bq.R(c5422bq.size() + 8);
        return c5422bq;
    }

    @NotNull
    public static final C5422bq d(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        C5422bq c5422bq2 = new C5422bq();
        if (c5422bq.size() == 0) {
            return c5422bq2;
        }
        PZ1 pz1 = c5422bq.X;
        C6562gT0.m(pz1);
        PZ1 d2 = pz1.d();
        c5422bq2.X = d2;
        d2.g = d2;
        d2.f = d2;
        for (PZ1 pz12 = pz1.f; pz12 != pz1; pz12 = pz12.f) {
            PZ1 pz13 = d2.g;
            C6562gT0.m(pz13);
            C6562gT0.m(pz12);
            pz13.c(pz12.d());
        }
        c5422bq2.R(c5422bq.size());
        return c5422bq2;
    }

    @NotNull
    public static final C5422bq d0(@NotNull C5422bq c5422bq, int i) {
        C6562gT0.p(c5422bq, "<this>");
        PZ1 Z = c5422bq.Z(2);
        byte[] bArr = Z.a;
        int i2 = Z.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        Z.c = i2 + 2;
        c5422bq.R(c5422bq.size() + 2);
        return c5422bq;
    }

    @NotNull
    public static final C5422bq e(@NotNull C5422bq c5422bq, @NotNull C5422bq c5422bq2, long j, long j2) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c5422bq2, "out");
        long j3 = j;
        C8648p.e(c5422bq.size(), j3, j2);
        if (j2 != 0) {
            c5422bq2.R(c5422bq2.size() + j2);
            PZ1 pz1 = c5422bq.X;
            while (true) {
                C6562gT0.m(pz1);
                int i = pz1.c;
                int i2 = pz1.b;
                if (j3 < i - i2) {
                    break;
                }
                j3 -= i - i2;
                pz1 = pz1.f;
            }
            PZ1 pz12 = pz1;
            long j4 = j2;
            while (j4 > 0) {
                C6562gT0.m(pz12);
                PZ1 d2 = pz12.d();
                int i3 = d2.b + ((int) j3);
                d2.b = i3;
                d2.c = Math.min(i3 + ((int) j4), d2.c);
                PZ1 pz13 = c5422bq2.X;
                if (pz13 == null) {
                    d2.g = d2;
                    d2.f = d2;
                    c5422bq2.X = d2;
                } else {
                    C6562gT0.m(pz13);
                    PZ1 pz14 = pz13.g;
                    C6562gT0.m(pz14);
                    pz14.c(d2);
                }
                j4 -= d2.c - d2.b;
                pz12 = pz12.f;
                j3 = 0;
            }
        }
        return c5422bq;
    }

    @NotNull
    public static final C5422bq e0(@NotNull C5422bq c5422bq, @NotNull String str, int i, int i2) {
        char charAt;
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(str, "string");
        if (i < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
        } else if (i2 >= i) {
            if (i2 > str.length()) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            while (i < i2) {
                char charAt2 = str.charAt(i);
                if (charAt2 < 128) {
                    PZ1 Z = c5422bq.Z(1);
                    byte[] bArr = Z.a;
                    int i3 = Z.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt2;
                    while (true) {
                        i = i4;
                        if (i >= min || (charAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        i4 = i + 1;
                        bArr[i + i3] = (byte) charAt;
                    }
                    int i5 = Z.c;
                    int i6 = (i3 + i) - i5;
                    Z.c = i5 + i6;
                    c5422bq.R(c5422bq.size() + i6);
                } else {
                    if (charAt2 < 2048) {
                        PZ1 Z2 = c5422bq.Z(2);
                        byte[] bArr2 = Z2.a;
                        int i7 = Z2.c;
                        bArr2[i7] = (byte) ((charAt2 >> 6) | CK1.x);
                        bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                        Z2.c = i7 + 2;
                        c5422bq.R(c5422bq.size() + 2);
                    } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                        int i8 = i + 1;
                        char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                        if (charAt2 <= 56319 && 56320 <= charAt3 && charAt3 < 57344) {
                            int i9 = (((charAt2 & 1023) << 10) | (charAt3 & 1023)) + 65536;
                            PZ1 Z3 = c5422bq.Z(4);
                            byte[] bArr3 = Z3.a;
                            int i10 = Z3.c;
                            bArr3[i10] = (byte) ((i9 >> 18) | 240);
                            bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                            bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                            bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                            Z3.c = i10 + 4;
                            c5422bq.R(c5422bq.size() + 4);
                            i += 2;
                        } else {
                            c5422bq.writeByte(63);
                            i = i8;
                        }
                    } else {
                        PZ1 Z4 = c5422bq.Z(3);
                        byte[] bArr4 = Z4.a;
                        int i11 = Z4.c;
                        bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                        bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                        bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                        Z4.c = i11 + 3;
                        c5422bq.R(c5422bq.size() + 3);
                    }
                    i++;
                }
            }
            return c5422bq;
        } else {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
    }

    public static final boolean f(@NotNull C5422bq c5422bq, @Nullable Object obj) {
        C6562gT0.p(c5422bq, "<this>");
        if (c5422bq == obj) {
            return true;
        }
        if (!(obj instanceof C5422bq)) {
            return false;
        }
        C5422bq c5422bq2 = (C5422bq) obj;
        if (c5422bq.size() != c5422bq2.size()) {
            return false;
        }
        if (c5422bq.size() == 0) {
            return true;
        }
        PZ1 pz1 = c5422bq.X;
        C6562gT0.m(pz1);
        PZ1 pz12 = c5422bq2.X;
        C6562gT0.m(pz12);
        int i = pz1.b;
        int i2 = pz12.b;
        long j = 0;
        while (j < c5422bq.size()) {
            long min = Math.min(pz1.c - i, pz12.c - i2);
            long j2 = 0;
            while (j2 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (pz1.a[i] != pz12.a[i2]) {
                    return false;
                }
                j2++;
                i = i3;
                i2 = i4;
            }
            if (i == pz1.c) {
                pz1 = pz1.f;
                C6562gT0.m(pz1);
                i = pz1.b;
            }
            if (i2 == pz12.c) {
                pz12 = pz12.f;
                C6562gT0.m(pz12);
                i2 = pz12.b;
            }
            j += min;
        }
        return true;
    }

    @NotNull
    public static final C5422bq f0(@NotNull C5422bq c5422bq, int i) {
        C6562gT0.p(c5422bq, "<this>");
        if (i < 128) {
            c5422bq.writeByte(i);
            return c5422bq;
        } else if (i < 2048) {
            PZ1 Z = c5422bq.Z(2);
            byte[] bArr = Z.a;
            int i2 = Z.c;
            bArr[i2] = (byte) ((i >> 6) | CK1.x);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            Z.c = i2 + 2;
            c5422bq.R(c5422bq.size() + 2);
            return c5422bq;
        } else if (55296 <= i && i < 57344) {
            c5422bq.writeByte(63);
            return c5422bq;
        } else if (i < 65536) {
            PZ1 Z2 = c5422bq.Z(3);
            byte[] bArr2 = Z2.a;
            int i3 = Z2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            Z2.c = i3 + 3;
            c5422bq.R(c5422bq.size() + 3);
            return c5422bq;
        } else if (i <= 1114111) {
            PZ1 Z3 = c5422bq.Z(4);
            byte[] bArr3 = Z3.a;
            int i4 = Z3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            Z3.c = i4 + 4;
            c5422bq.R(c5422bq.size() + 4);
            return c5422bq;
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C8648p.v(i));
        }
    }

    public static final long g(@NotNull C5422bq.c cVar, int i) {
        C6562gT0.p(cVar, "<this>");
        if (i > 0) {
            if (i <= 8192) {
                C5422bq c5422bq = cVar.X;
                if (c5422bq != null) {
                    if (cVar.Y) {
                        long size = c5422bq.size();
                        PZ1 Z = c5422bq.Z(i);
                        int i2 = 8192 - Z.c;
                        Z.c = 8192;
                        long j = i2;
                        c5422bq.R(size + j);
                        cVar.j(Z);
                        cVar.Y0 = size;
                        cVar.Z0 = Z.a;
                        cVar.a1 = 8192 - i2;
                        cVar.b1 = 8192;
                        return j;
                    }
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                }
                throw new IllegalStateException("not attached to a buffer");
            }
            throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i).toString());
        }
        throw new IllegalArgumentException(("minByteCount <= 0: " + i).toString());
    }

    @NotNull
    public static final byte[] g0() {
        return a;
    }

    public static final byte h(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "<this>");
        C8648p.e(c5422bq.size(), j, 1L);
        PZ1 pz1 = c5422bq.X;
        if (pz1 != null) {
            if (c5422bq.size() - j < j) {
                long size = c5422bq.size();
                while (size > j) {
                    pz1 = pz1.g;
                    C6562gT0.m(pz1);
                    size -= pz1.c - pz1.b;
                }
                C6562gT0.m(pz1);
                return pz1.a[(int) ((pz1.b + j) - size)];
            }
            long j2 = 0;
            while (true) {
                long j3 = (pz1.c - pz1.b) + j2;
                if (j3 <= j) {
                    pz1 = pz1.f;
                    C6562gT0.m(pz1);
                    j2 = j3;
                } else {
                    C6562gT0.m(pz1);
                    return pz1.a[(int) ((pz1.b + j) - j2)];
                }
            }
        } else {
            C6562gT0.m(null);
            throw null;
        }
    }

    public static final int i(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        PZ1 pz1 = c5422bq.X;
        if (pz1 == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = pz1.c;
            for (int i3 = pz1.b; i3 < i2; i3++) {
                i = (i * 31) + pz1.a[i3];
            }
            pz1 = pz1.f;
            C6562gT0.m(pz1);
        } while (pz1 != c5422bq.X);
        return i;
    }

    public static final boolean i0(@NotNull PZ1 pz1, int i, @NotNull byte[] bArr, int i2, int i3) {
        C6562gT0.p(pz1, "segment");
        C6562gT0.p(bArr, "bytes");
        int i4 = pz1.c;
        byte[] bArr2 = pz1.a;
        while (i2 < i3) {
            if (i == i4) {
                pz1 = pz1.f;
                C6562gT0.m(pz1);
                byte[] bArr3 = pz1.a;
                bArr2 = bArr3;
                i = pz1.b;
                i4 = pz1.c;
            }
            if (bArr2[i] != bArr[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static final long j(@NotNull C5422bq c5422bq, byte b2, long j, long j2) {
        PZ1 pz1;
        int i;
        C6562gT0.p(c5422bq, "<this>");
        long j3 = 0;
        if (0 <= j && j <= j2) {
            if (j2 > c5422bq.size()) {
                j2 = c5422bq.size();
            }
            if (j == j2 || (pz1 = c5422bq.X) == null) {
                return -1L;
            }
            if (c5422bq.size() - j < j) {
                j3 = c5422bq.size();
                while (j3 > j) {
                    pz1 = pz1.g;
                    C6562gT0.m(pz1);
                    j3 -= pz1.c - pz1.b;
                }
                while (j3 < j2) {
                    byte[] bArr = pz1.a;
                    int min = (int) Math.min(pz1.c, (pz1.b + j2) - j3);
                    i = (int) ((pz1.b + j) - j3);
                    while (i < min) {
                        if (bArr[i] != b2) {
                            i++;
                        }
                    }
                    j3 += pz1.c - pz1.b;
                    pz1 = pz1.f;
                    C6562gT0.m(pz1);
                    j = j3;
                }
                return -1L;
            }
            while (true) {
                long j4 = (pz1.c - pz1.b) + j3;
                if (j4 > j) {
                    break;
                }
                pz1 = pz1.f;
                C6562gT0.m(pz1);
                j3 = j4;
            }
            while (j3 < j2) {
                byte[] bArr2 = pz1.a;
                int min2 = (int) Math.min(pz1.c, (pz1.b + j2) - j3);
                i = (int) ((pz1.b + j) - j3);
                while (i < min2) {
                    if (bArr2[i] != b2) {
                        i++;
                    }
                }
                j3 += pz1.c - pz1.b;
                pz1 = pz1.f;
                C6562gT0.m(pz1);
                j = j3;
            }
            return -1L;
            return (i - pz1.b) + j3;
        }
        throw new IllegalArgumentException(("size=" + c5422bq.size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    @NotNull
    public static final String j0(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (c5422bq.x(j2) == 13) {
                String e3 = c5422bq.e3(j2);
                c5422bq.skip(2L);
                return e3;
            }
        }
        String e32 = c5422bq.e3(j);
        c5422bq.skip(1L);
        return e32;
    }

    public static final long k(@NotNull C5422bq c5422bq, @NotNull C8859ps c8859ps, long j) {
        int i;
        long j2 = j;
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c8859ps, "bytes");
        if (c8859ps.g0() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                PZ1 pz1 = c5422bq.X;
                if (pz1 == null) {
                    return -1L;
                }
                if (c5422bq.size() - j2 < j2) {
                    j3 = c5422bq.size();
                    while (j3 > j2) {
                        pz1 = pz1.g;
                        C6562gT0.m(pz1);
                        j3 -= pz1.c - pz1.b;
                    }
                    byte[] L = c8859ps.L();
                    byte b2 = L[0];
                    int g0 = c8859ps.g0();
                    long size = (c5422bq.size() - g0) + 1;
                    while (j3 < size) {
                        byte[] bArr = pz1.a;
                        int min = (int) Math.min(pz1.c, (pz1.b + size) - j3);
                        i = (int) ((pz1.b + j2) - j3);
                        while (i < min) {
                            if (bArr[i] != b2 || !i0(pz1, i + 1, L, 1, g0)) {
                                i++;
                            }
                        }
                        j3 += pz1.c - pz1.b;
                        pz1 = pz1.f;
                        C6562gT0.m(pz1);
                        j2 = j3;
                    }
                    return -1L;
                }
                while (true) {
                    long j4 = (pz1.c - pz1.b) + j3;
                    if (j4 > j2) {
                        break;
                    }
                    pz1 = pz1.f;
                    C6562gT0.m(pz1);
                    j3 = j4;
                }
                byte[] L2 = c8859ps.L();
                byte b3 = L2[0];
                int g02 = c8859ps.g0();
                long size2 = (c5422bq.size() - g02) + 1;
                while (j3 < size2) {
                    byte[] bArr2 = pz1.a;
                    long j5 = size2;
                    int min2 = (int) Math.min(pz1.c, (pz1.b + size2) - j3);
                    i = (int) ((pz1.b + j2) - j3);
                    while (i < min2) {
                        if (bArr2[i] == b3 && i0(pz1, i + 1, L2, 1, g02)) {
                        }
                        i++;
                    }
                    j3 += pz1.c - pz1.b;
                    pz1 = pz1.f;
                    C6562gT0.m(pz1);
                    size2 = j5;
                    j2 = j3;
                }
                return -1L;
                return (i - pz1.b) + j3;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    public static final <T> T k0(@NotNull C5422bq c5422bq, long j, @NotNull VA0<? super PZ1, ? super Long, ? extends T> va0) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(va0, "lambda");
        PZ1 pz1 = c5422bq.X;
        if (pz1 == null) {
            return va0.i(null, -1L);
        }
        if (c5422bq.size() - j < j) {
            long size = c5422bq.size();
            while (size > j) {
                pz1 = pz1.g;
                C6562gT0.m(pz1);
                size -= pz1.c - pz1.b;
            }
            return va0.i(pz1, Long.valueOf(size));
        }
        long j2 = 0;
        while (true) {
            long j3 = (pz1.c - pz1.b) + j2;
            if (j3 <= j) {
                pz1 = pz1.f;
                C6562gT0.m(pz1);
                j2 = j3;
            } else {
                return va0.i(pz1, Long.valueOf(j2));
            }
        }
    }

    public static final long l(@NotNull C5422bq c5422bq, @NotNull C8859ps c8859ps, long j) {
        int i;
        int i2;
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c8859ps, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            PZ1 pz1 = c5422bq.X;
            if (pz1 == null) {
                return -1L;
            }
            if (c5422bq.size() - j < j) {
                j2 = c5422bq.size();
                while (j2 > j) {
                    pz1 = pz1.g;
                    C6562gT0.m(pz1);
                    j2 -= pz1.c - pz1.b;
                }
                if (c8859ps.g0() == 2) {
                    byte v = c8859ps.v(0);
                    byte v2 = c8859ps.v(1);
                    while (j2 < c5422bq.size()) {
                        byte[] bArr = pz1.a;
                        i = (int) ((pz1.b + j) - j2);
                        int i3 = pz1.c;
                        while (i < i3) {
                            byte b2 = bArr[i];
                            if (b2 != v && b2 != v2) {
                                i++;
                            }
                            i2 = pz1.b;
                        }
                        j2 += pz1.c - pz1.b;
                        pz1 = pz1.f;
                        C6562gT0.m(pz1);
                        j = j2;
                    }
                } else {
                    byte[] L = c8859ps.L();
                    while (j2 < c5422bq.size()) {
                        byte[] bArr2 = pz1.a;
                        i = (int) ((pz1.b + j) - j2);
                        int i4 = pz1.c;
                        while (i < i4) {
                            byte b3 = bArr2[i];
                            for (byte b4 : L) {
                                if (b3 == b4) {
                                    i2 = pz1.b;
                                }
                            }
                            i++;
                        }
                        j2 += pz1.c - pz1.b;
                        pz1 = pz1.f;
                        C6562gT0.m(pz1);
                        j = j2;
                    }
                }
                return -1L;
            }
            while (true) {
                long j3 = (pz1.c - pz1.b) + j2;
                if (j3 > j) {
                    break;
                }
                pz1 = pz1.f;
                C6562gT0.m(pz1);
                j2 = j3;
            }
            if (c8859ps.g0() == 2) {
                byte v3 = c8859ps.v(0);
                byte v4 = c8859ps.v(1);
                while (j2 < c5422bq.size()) {
                    byte[] bArr3 = pz1.a;
                    i = (int) ((pz1.b + j) - j2);
                    int i5 = pz1.c;
                    while (i < i5) {
                        byte b5 = bArr3[i];
                        if (b5 != v3 && b5 != v4) {
                            i++;
                        }
                        i2 = pz1.b;
                    }
                    j2 += pz1.c - pz1.b;
                    pz1 = pz1.f;
                    C6562gT0.m(pz1);
                    j = j2;
                }
            } else {
                byte[] L2 = c8859ps.L();
                while (j2 < c5422bq.size()) {
                    byte[] bArr4 = pz1.a;
                    i = (int) ((pz1.b + j) - j2);
                    int i6 = pz1.c;
                    while (i < i6) {
                        byte b6 = bArr4[i];
                        for (byte b7 : L2) {
                            if (b6 == b7) {
                                i2 = pz1.b;
                            }
                        }
                        i++;
                    }
                    j2 += pz1.c - pz1.b;
                    pz1 = pz1.f;
                    C6562gT0.m(pz1);
                    j = j2;
                }
            }
            return -1L;
            return (i - i2) + j2;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j).toString());
    }

    public static final int l0(@NotNull C5422bq c5422bq, @NotNull C5205aw1 c5205aw1, boolean z) {
        int i;
        int i2;
        boolean z2;
        PZ1 pz1;
        int i3;
        int i4;
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c5205aw1, C9998uW1.m0);
        PZ1 pz12 = c5422bq.X;
        if (pz12 == null) {
            if (z) {
                return -2;
            }
            return -1;
        }
        byte[] bArr = pz12.a;
        int i5 = pz12.b;
        int i6 = pz12.c;
        int[] k = c5205aw1.k();
        PZ1 pz13 = pz12;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = k[i8];
            int i11 = i8 + 2;
            int i12 = k[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (pz13 == null) {
                break;
            } else if (i10 < 0) {
                int i13 = i11 + (i10 * (-1));
                while (true) {
                    int i14 = i5 + 1;
                    int i15 = i11 + 1;
                    if ((bArr[i5] & 255) != k[i11]) {
                        break loop0;
                    }
                    if (i15 == i13) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i14 == i6) {
                        C6562gT0.m(pz13);
                        PZ1 pz14 = pz13.f;
                        C6562gT0.m(pz14);
                        i4 = pz14.b;
                        byte[] bArr2 = pz14.a;
                        i3 = pz14.c;
                        if (pz14 == pz12) {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr2;
                            pz1 = null;
                        } else {
                            pz1 = pz14;
                            bArr = bArr2;
                        }
                    } else {
                        pz1 = pz13;
                        i3 = i6;
                        i4 = i14;
                    }
                    if (z2) {
                        i2 = k[i15];
                        i = i4;
                        i6 = i3;
                        pz13 = pz1;
                        break;
                    }
                    i5 = i4;
                    i6 = i3;
                    pz13 = pz1;
                    i11 = i15;
                }
            } else {
                i = i5 + 1;
                int i16 = bArr[i5] & 255;
                int i17 = i11 + i10;
                while (i11 != i17) {
                    if (i16 == k[i11]) {
                        i2 = k[i11 + i10];
                        if (i == i6) {
                            pz13 = pz13.f;
                            C6562gT0.m(pz13);
                            i = pz13.b;
                            bArr = pz13.a;
                            i6 = pz13.c;
                            if (pz13 == pz12) {
                                pz13 = null;
                            }
                        }
                        if (i2 >= 0) {
                            return i2;
                        }
                        i8 = -i2;
                        i5 = i;
                    } else {
                        i11++;
                    }
                }
                break loop0;
            }
        }
        if (z) {
            return -2;
        }
        return i7;
    }

    public static final int m(@NotNull C5422bq.c cVar) {
        long j;
        C6562gT0.p(cVar, "<this>");
        long j2 = cVar.Y0;
        C5422bq c5422bq = cVar.X;
        C6562gT0.m(c5422bq);
        if (j2 != c5422bq.size()) {
            long j3 = cVar.Y0;
            if (j3 == -1) {
                j = 0;
            } else {
                j = j3 + (cVar.b1 - cVar.a1);
            }
            return cVar.i(j);
        }
        throw new IllegalStateException("no more bytes");
    }

    public static /* synthetic */ int m0(C5422bq c5422bq, C5205aw1 c5205aw1, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return l0(c5422bq, c5205aw1, z);
    }

    public static final boolean n(@NotNull C5422bq c5422bq, long j, @NotNull C8859ps c8859ps, int i, int i2) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c8859ps, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || c5422bq.size() - j < i2 || c8859ps.g0() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (c5422bq.x(i3 + j) != c8859ps.v(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public static final int o(@NotNull C5422bq c5422bq, @NotNull byte[] bArr) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(bArr, "sink");
        return c5422bq.read(bArr, 0, bArr.length);
    }

    public static final int p(@NotNull C5422bq c5422bq, @NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(bArr, "sink");
        C8648p.e(bArr.length, i, i2);
        PZ1 pz1 = c5422bq.X;
        if (pz1 == null) {
            return -1;
        }
        int min = Math.min(i2, pz1.c - pz1.b);
        byte[] bArr2 = pz1.a;
        int i3 = pz1.b;
        C4788Ye.v0(bArr2, bArr, i, i3, i3 + min);
        pz1.b += min;
        c5422bq.R(c5422bq.size() - min);
        if (pz1.b == pz1.c) {
            c5422bq.X = pz1.b();
            UZ1.d(pz1);
        }
        return min;
    }

    public static final long q(@NotNull C5422bq c5422bq, @NotNull C5422bq c5422bq2, long j) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c5422bq2, "sink");
        if (j >= 0) {
            if (c5422bq.size() == 0) {
                return -1L;
            }
            if (j > c5422bq.size()) {
                j = c5422bq.size();
            }
            c5422bq2.write(c5422bq, j);
            return j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    public static final long r(@NotNull C5422bq c5422bq, @NotNull J82 j82) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(j82, "sink");
        long size = c5422bq.size();
        if (size > 0) {
            j82.write(c5422bq, size);
        }
        return size;
    }

    @NotNull
    public static final C5422bq.c s(@NotNull C5422bq c5422bq, @NotNull C5422bq.c cVar) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(cVar, "unsafeCursor");
        C5422bq.c n = C8648p.n(cVar);
        if (n.X == null) {
            n.X = c5422bq;
            n.Y = true;
            return n;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public static final byte t(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        if (c5422bq.size() != 0) {
            PZ1 pz1 = c5422bq.X;
            C6562gT0.m(pz1);
            int i = pz1.b;
            int i2 = pz1.c;
            int i3 = i + 1;
            byte b2 = pz1.a[i];
            c5422bq.R(c5422bq.size() - 1);
            if (i3 == i2) {
                c5422bq.X = pz1.b();
                UZ1.d(pz1);
                return b2;
            }
            pz1.b = i3;
            return b2;
        }
        throw new EOFException();
    }

    @NotNull
    public static final byte[] u(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        return c5422bq.o2(c5422bq.size());
    }

    @NotNull
    public static final byte[] v(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "<this>");
        if (j >= 0 && j <= 2147483647L) {
            if (c5422bq.size() >= j) {
                byte[] bArr = new byte[(int) j];
                c5422bq.readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @NotNull
    public static final C8859ps w(@NotNull C5422bq c5422bq) {
        C6562gT0.p(c5422bq, "<this>");
        return c5422bq.n3(c5422bq.size());
    }

    @NotNull
    public static final C8859ps x(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "<this>");
        if (j >= 0 && j <= 2147483647L) {
            if (c5422bq.size() >= j) {
                if (j >= PlaybackStateCompat.t1) {
                    C8859ps W = c5422bq.W((int) j);
                    c5422bq.skip(j);
                    return W;
                }
                return new C8859ps(c5422bq.o2(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x00a7, code lost:
        r19.R(r19.size() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x00b0, code lost:
        if (r2 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x00b2, code lost:
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x00b4, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00b5, code lost:
        if (r1 >= r14) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00bd, code lost:
        if (r19.size() == r17) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x00bf, code lost:
        if (r2 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x00c1, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x00c4, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x00e9, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + o.C8648p.u(r19.x(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00ef, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00f0, code lost:
        if (r2 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00f2, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00f4, code lost:
        return -r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long y(@NotNull C5422bq c5422bq) {
        long j;
        byte b2;
        C6562gT0.p(c5422bq, "<this>");
        long j2 = 0;
        if (c5422bq.size() != 0) {
            int i = 0;
            boolean z = false;
            long j3 = 0;
            long j4 = -7;
            boolean z2 = false;
            loop0: while (true) {
                PZ1 pz1 = c5422bq.X;
                C6562gT0.m(pz1);
                byte[] bArr = pz1.a;
                int i2 = pz1.b;
                int i3 = pz1.c;
                while (i2 < i3) {
                    b2 = bArr[i2];
                    if (b2 >= 48 && b2 <= 57) {
                        int i4 = 48 - b2;
                        int i5 = (j3 > (-922337203685477580L) ? 1 : (j3 == (-922337203685477580L) ? 0 : -1));
                        if (i5 < 0) {
                            break loop0;
                        }
                        j = j2;
                        if (i5 == 0 && i4 < j4) {
                            break loop0;
                        }
                        j3 = (j3 * 10) + i4;
                    } else {
                        j = j2;
                        if (b2 == 45 && i == 0) {
                            j4--;
                            z = true;
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    i2++;
                    i++;
                    j2 = j;
                }
                j = j2;
                if (i2 == i3) {
                    c5422bq.X = pz1.b();
                    UZ1.d(pz1);
                } else {
                    pz1.b = i2;
                }
                if (z2 || c5422bq.X == null) {
                    break;
                }
                j2 = j;
            }
            C5422bq writeByte = new C5422bq().S2(j3).writeByte(b2);
            if (!z) {
                writeByte.readByte();
            }
            throw new NumberFormatException("Number too large: " + writeByte.Y4());
        }
        throw new EOFException();
    }

    public static final void z(@NotNull C5422bq c5422bq, @NotNull C5422bq c5422bq2, long j) {
        C6562gT0.p(c5422bq, "<this>");
        C6562gT0.p(c5422bq2, "sink");
        if (c5422bq.size() >= j) {
            c5422bq2.write(c5422bq, j);
        } else {
            c5422bq2.write(c5422bq, c5422bq.size());
            throw new EOFException();
        }
    }

    public static /* synthetic */ void h0() {
    }
}
