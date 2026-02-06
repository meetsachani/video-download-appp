package o;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.connection.RealConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 Buffer.kt\nokio/internal/-Buffer\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,641:1\n89#2:642\n86#2:675\n86#2:677\n74#2:737\n74#2:763\n83#2:802\n77#2:813\n89#2:1003\n74#2:1018\n86#2:1122\n89#2:1615\n244#3,32:643\n279#3,10:678\n292#3,18:688\n414#3,2:706\n112#3:708\n416#3:709\n114#3,18:710\n313#3,9:728\n322#3,15:738\n340#3,10:753\n350#3,3:764\n348#3,25:767\n376#3,10:792\n386#3:803\n384#3,9:804\n393#3,7:814\n391#3,20:821\n682#3,60:841\n745#3,56:901\n803#3:957\n806#3:958\n807#3,6:960\n817#3,7:966\n827#3,6:973\n835#3,5:979\n867#3,6:984\n877#3:990\n878#3,11:992\n889#3,5:1004\n898#3,9:1009\n908#3,61:1019\n633#3:1080\n636#3:1081\n637#3,5:1083\n644#3:1088\n647#3,7:1089\n656#3,20:1096\n420#3:1116\n423#3,5:1117\n428#3,10:1123\n439#3,7:1133\n444#3,2:1140\n973#3:1142\n974#3,87:1144\n1064#3,48:1231\n603#3:1279\n610#3,21:1280\n1115#3,7:1301\n1125#3,7:1308\n1135#3,4:1315\n1142#3,8:1319\n1153#3,10:1327\n1166#3,14:1337\n449#3,91:1351\n543#3,40:1442\n586#3:1482\n588#3,13:1484\n1183#3:1497\n1234#3:1498\n1235#3,39:1500\n1276#3,2:1539\n1278#3,4:1542\n1285#3,3:1546\n1289#3,4:1550\n112#3:1554\n1293#3,22:1555\n114#3,18:1577\n1319#3,2:1595\n1321#3,3:1598\n112#3:1601\n1324#3,13:1602\n1337#3,13:1616\n114#3,18:1629\n1354#3,2:1647\n1357#3:1650\n112#3:1651\n1358#3,50:1652\n114#3,18:1702\n1417#3,14:1720\n1434#3,32:1734\n1469#3,12:1766\n1484#3,18:1778\n1506#3:1796\n1507#3:1798\n1512#3,34:1799\n1#4:676\n1#4:959\n1#4:991\n1#4:1082\n1#4:1143\n1#4:1483\n1#4:1499\n1#4:1541\n1#4:1549\n1#4:1597\n1#4:1649\n1#4:1797\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer\n*L\n167#1:642\n197#1:675\n235#1:677\n261#1:737\n264#1:763\n267#1:802\n267#1:813\n335#1:1003\n338#1:1018\n374#1:1122\n483#1:1615\n181#1:643,32\n252#1:678,10\n255#1:688,18\n258#1:706,2\n258#1:708\n258#1:709\n258#1:710,18\n261#1:728,9\n261#1:738,15\n264#1:753,10\n264#1:764,3\n264#1:767,25\n267#1:792,10\n267#1:803\n267#1:804,9\n267#1:814,7\n267#1:821,20\n279#1:841,60\n282#1:901,56\n284#1:957\n287#1:958\n287#1:960,6\n289#1:966,7\n292#1:973,6\n295#1:979,5\n329#1:984,6\n335#1:990\n335#1:992,11\n335#1:1004,5\n338#1:1009,9\n338#1:1019,61\n340#1:1080\n343#1:1081\n343#1:1083,5\n345#1:1088\n348#1:1089,7\n351#1:1096,20\n371#1:1116\n374#1:1117,5\n374#1:1123,10\n376#1:1133,7\n379#1:1140,2\n384#1:1142\n384#1:1144,87\n387#1:1231,48\n410#1:1279\n416#1:1280,21\n437#1:1301,7\n441#1:1308,7\n443#1:1315,4\n445#1:1319,8\n449#1:1327,10\n453#1:1337,14\n457#1:1351,91\n460#1:1442,40\n463#1:1482\n463#1:1484,13\n465#1:1497\n465#1:1498\n465#1:1500,39\n467#1:1539,2\n467#1:1542,4\n477#1:1546,3\n477#1:1550,4\n477#1:1554\n477#1:1555,22\n477#1:1577,18\n483#1:1595,2\n483#1:1598,3\n483#1:1601\n483#1:1602,13\n483#1:1616,13\n483#1:1629,18\n488#1:1647,2\n488#1:1650\n488#1:1651\n488#1:1652,50\n488#1:1702,18\n498#1:1720,14\n568#1:1734,32\n570#1:1766,12\n578#1:1778,18\n586#1:1796\n586#1:1798\n588#1:1799,34\n287#1:959\n335#1:991\n343#1:1082\n384#1:1143\n463#1:1483\n465#1:1499\n467#1:1541\n477#1:1549\n483#1:1597\n488#1:1649\n586#1:1797\n*E\n"})
/* renamed from: o.bq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5422bq implements InterfaceC2677Cq, InterfaceC2579Bq, Cloneable, ByteChannel {
    @InterfaceC7058iW0
    @Nullable
    public PZ1 X;
    public long Y;

    /* renamed from: o.bq$b */
    /* loaded from: classes4.dex */
    public static final class b extends OutputStream {
        public b() {
        }

        @NotNull
        public String toString() {
            return C5422bq.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            C5422bq.this.writeByte(i);
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bArr, int i, int i2) {
            C6562gT0.p(bArr, "data");
            C5422bq.this.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    @InterfaceC8303na2({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n+ 2 Buffer.kt\nokio/internal/-Buffer\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n1567#2:642\n1568#2:644\n1572#2:645\n1573#2,68:647\n1644#2:715\n1645#2,32:717\n1677#2,18:750\n1698#2:768\n1699#2,18:770\n1721#2:788\n1723#2,7:790\n1#3:643\n1#3:646\n1#3:716\n1#3:769\n1#3:789\n86#4:749\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$UnsafeCursor\n*L\n628#1:642\n628#1:644\n630#1:645\n630#1:647,68\n632#1:715\n632#1:717,32\n632#1:750,18\n634#1:768\n634#1:770,18\n637#1:788\n637#1:790,7\n628#1:643\n630#1:646\n632#1:716\n634#1:769\n637#1:789\n632#1:749\n*E\n"})
    /* renamed from: o.bq$c */
    /* loaded from: classes4.dex */
    public static final class c implements Closeable {
        @InterfaceC7058iW0
        @Nullable
        public C5422bq X;
        @InterfaceC7058iW0
        public boolean Y;
        @Nullable
        public PZ1 Z;
        @InterfaceC7058iW0
        @Nullable
        public byte[] Z0;
        @InterfaceC7058iW0
        public long Y0 = -1;
        @InterfaceC7058iW0
        public int a1 = -1;
        @InterfaceC7058iW0
        public int b1 = -1;

        public final long a(int i) {
            if (i > 0) {
                if (i <= 8192) {
                    C5422bq c5422bq = this.X;
                    if (c5422bq != null) {
                        if (this.Y) {
                            long size = c5422bq.size();
                            PZ1 Z = c5422bq.Z(i);
                            int i2 = 8192 - Z.c;
                            Z.c = 8192;
                            long j = i2;
                            c5422bq.R(size + j);
                            j(Z);
                            this.Y0 = size;
                            this.Z0 = Z.a;
                            this.a1 = 8192 - i2;
                            this.b1 = 8192;
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

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.X != null) {
                this.X = null;
                j(null);
                this.Y0 = -1L;
                this.Z0 = null;
                this.a1 = -1;
                this.b1 = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        @Nullable
        public final PZ1 d() {
            return this.Z;
        }

        public final int f() {
            long j;
            long j2 = this.Y0;
            C5422bq c5422bq = this.X;
            C6562gT0.m(c5422bq);
            if (j2 != c5422bq.size()) {
                long j3 = this.Y0;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + (this.b1 - this.a1);
                }
                return i(j);
            }
            throw new IllegalStateException("no more bytes");
        }

        public final long h(long j) {
            C5422bq c5422bq = this.X;
            if (c5422bq != null) {
                if (this.Y) {
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
                            j(null);
                            this.Y0 = j;
                            this.Z0 = null;
                            this.a1 = -1;
                            this.b1 = -1;
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
                                j(Z);
                                this.Y0 = size;
                                this.Z0 = Z.a;
                                int i3 = Z.c;
                                this.a1 = i3 - min;
                                this.b1 = i3;
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

        public final int i(long j) {
            PZ1 pz1;
            C5422bq c5422bq = this.X;
            if (c5422bq != null) {
                int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
                if (i >= 0 && j <= c5422bq.size()) {
                    if (i != 0 && j != c5422bq.size()) {
                        long size = c5422bq.size();
                        PZ1 pz12 = c5422bq.X;
                        long j2 = 0;
                        if (d() != null) {
                            long j3 = this.Y0;
                            int i2 = this.a1;
                            PZ1 d = d();
                            C6562gT0.m(d);
                            long j4 = j3 - (i2 - d.b);
                            if (j4 > j) {
                                pz1 = pz12;
                                pz12 = d();
                                size = j4;
                            } else {
                                pz1 = d();
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
                        if (this.Y) {
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
                        j(pz1);
                        this.Y0 = j;
                        C6562gT0.m(pz1);
                        this.Z0 = pz1.a;
                        int i5 = pz1.b + ((int) (j - j2));
                        this.a1 = i5;
                        int i6 = pz1.c;
                        this.b1 = i6;
                        return i6 - i5;
                    }
                    j(null);
                    this.Y0 = j;
                    this.Z0 = null;
                    this.a1 = -1;
                    this.b1 = -1;
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException("offset=" + j + " > size=" + c5422bq.size());
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        public final void j(@Nullable PZ1 pz1) {
            this.Z = pz1;
        }
    }

    public static /* synthetic */ c H(C5422bq c5422bq, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = C8648p.g();
        }
        return c5422bq.G(cVar);
    }

    public static /* synthetic */ C5422bq M0(C5422bq c5422bq, OutputStream outputStream, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = c5422bq.Y;
        }
        return c5422bq.I0(outputStream, j);
    }

    public static /* synthetic */ c Q(C5422bq c5422bq, c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = C8648p.g();
        }
        return c5422bq.P(cVar);
    }

    public static /* synthetic */ C5422bq q(C5422bq c5422bq, OutputStream outputStream, long j, long j2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = 0;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = c5422bq.Y - j3;
        }
        return c5422bq.n(outputStream, j3, j2);
    }

    public static /* synthetic */ C5422bq r(C5422bq c5422bq, C5422bq c5422bq2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return c5422bq.o(c5422bq2, j);
    }

    public static /* synthetic */ C5422bq s(C5422bq c5422bq, C5422bq c5422bq2, long j, long j2, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return c5422bq.p(c5422bq2, j, j2);
    }

    @NotNull
    public final C8859ps A(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "key");
        return y("HmacSHA256", c8859ps);
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: A0 */
    public C5422bq N2(@NotNull String str, int i, int i2, @NotNull Charset charset) {
        C6562gT0.p(str, "string");
        C6562gT0.p(charset, C4317Th1.g);
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    if (C6562gT0.g(charset, HB.b)) {
                        return Z1(str, i, i2);
                    }
                    String substring = str.substring(i, i2);
                    C6562gT0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    C6562gT0.o(bytes, "this as java.lang.String).getBytes(charset)");
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    @NotNull
    public final C8859ps C(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "key");
        return y("HmacSHA512", c8859ps);
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: C0 */
    public C5422bq H4(@NotNull String str, @NotNull Charset charset) {
        C6562gT0.p(str, "string");
        C6562gT0.p(charset, C4317Th1.g);
        return N2(str, 0, str.length(), charset);
    }

    @Override // o.InterfaceC2677Cq
    public int C4() throws EOFException {
        int i;
        int i2;
        int i3;
        if (size() != 0) {
            byte x = x(0L);
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
                skip(1L);
                return ED2.c;
            }
            long j = i2;
            if (size() >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = i4;
                    byte x2 = x(j2);
                    if ((x2 & C2638Cg0.o7) == 128) {
                        i = (i << 6) | (x2 & ED2.a);
                    } else {
                        skip(j2);
                        return ED2.c;
                    }
                }
                skip(j);
                if (i > 1114111) {
                    return ED2.c;
                }
                if ((55296 <= i && i < 57344) || i < i3) {
                    return ED2.c;
                }
                return i;
            }
            throw new EOFException("size < " + i2 + ": " + size() + " (to read code point prefixed 0x" + C8648p.u(x) + ')');
        }
        throw new EOFException();
    }

    @InterfaceC8289nW0
    @NotNull
    public final C5422bq D0(@NotNull OutputStream outputStream) throws IOException {
        C6562gT0.p(outputStream, "out");
        return M0(this, outputStream, 0L, 2, null);
    }

    @Override // o.InterfaceC2677Cq
    public boolean D2(long j, @NotNull C8859ps c8859ps, int i, int i2) {
        C6562gT0.p(c8859ps, "bytes");
        if (j < 0 || i < 0 || i2 < 0 || size() - j < i2 || c8859ps.g0() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (x(i3 + j) != c8859ps.v(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final C8859ps E() {
        return t("MD5");
    }

    @InterfaceC8289nW0
    @NotNull
    public final c F() {
        return H(this, null, 1, null);
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public OutputStream F5() {
        return new b();
    }

    @InterfaceC8289nW0
    @NotNull
    public final c G(@NotNull c cVar) {
        C6562gT0.p(cVar, "unsafeCursor");
        return C5219b.s(this, cVar);
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public C8859ps G4() {
        return n3(size());
    }

    @Override // o.InterfaceC2677Cq
    public long H1(@NotNull C8859ps c8859ps, long j) throws IOException {
        int i;
        long j2 = j;
        C6562gT0.p(c8859ps, "bytes");
        if (c8859ps.g0() > 0) {
            long j3 = 0;
            if (j2 >= 0) {
                PZ1 pz1 = this.X;
                if (pz1 == null) {
                    return -1L;
                }
                if (size() - j2 < j2) {
                    j3 = size();
                    while (j3 > j2) {
                        pz1 = pz1.g;
                        C6562gT0.m(pz1);
                        j3 -= pz1.c - pz1.b;
                    }
                    byte[] L = c8859ps.L();
                    byte b2 = L[0];
                    int g0 = c8859ps.g0();
                    long size = (size() - g0) + 1;
                    while (j3 < size) {
                        byte[] bArr = pz1.a;
                        long j4 = size;
                        int min = (int) Math.min(pz1.c, (pz1.b + size) - j3);
                        i = (int) ((pz1.b + j2) - j3);
                        while (i < min) {
                            if (bArr[i] != b2 || !C5219b.i0(pz1, i + 1, L, 1, g0)) {
                                i++;
                            }
                        }
                        j3 += pz1.c - pz1.b;
                        pz1 = pz1.f;
                        C6562gT0.m(pz1);
                        j2 = j3;
                        size = j4;
                    }
                    return -1L;
                }
                while (true) {
                    long j5 = (pz1.c - pz1.b) + j3;
                    if (j5 > j2) {
                        break;
                    }
                    pz1 = pz1.f;
                    C6562gT0.m(pz1);
                    j3 = j5;
                }
                byte[] L2 = c8859ps.L();
                byte b3 = L2[0];
                int g02 = c8859ps.g0();
                long size2 = (size() - g02) + 1;
                while (j3 < size2) {
                    byte[] bArr2 = pz1.a;
                    int min2 = (int) Math.min(pz1.c, (pz1.b + size2) - j3);
                    i = (int) ((pz1.b + j2) - j3);
                    while (i < min2) {
                        if (bArr2[i] == b3 && C5219b.i0(pz1, i + 1, L2, 1, g02)) {
                        }
                        i++;
                    }
                    j3 += pz1.c - pz1.b;
                    pz1 = pz1.f;
                    C6562gT0.m(pz1);
                    j2 = j3;
                }
                return -1L;
                return (i - pz1.b) + j3;
            }
            throw new IllegalArgumentException(("fromIndex < 0: " + j2).toString());
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[EDGE_INSN: B:42:0x00a7->B:37:0x00a7 ?: BREAK  , SYNTHETIC] */
    @Override // o.InterfaceC2677Cq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long H5() throws EOFException {
        int i;
        if (size() != 0) {
            int i2 = 0;
            boolean z = false;
            long j = 0;
            do {
                PZ1 pz1 = this.X;
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
                            this.X = pz1.b();
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
            } while (this.X != null);
            R(size() - i2);
            return j;
        }
        throw new EOFException();
    }

    @NotNull
    public final C5422bq I(@NotNull InputStream inputStream) throws IOException {
        C6562gT0.p(inputStream, "input");
        N(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @InterfaceC8289nW0
    @NotNull
    public final C5422bq I0(@NotNull OutputStream outputStream, long j) throws IOException {
        C6562gT0.p(outputStream, "out");
        C8648p.e(this.Y, 0L, j);
        PZ1 pz1 = this.X;
        long j2 = j;
        while (j2 > 0) {
            C6562gT0.m(pz1);
            int min = (int) Math.min(j2, pz1.c - pz1.b);
            outputStream.write(pz1.a, pz1.b, min);
            int i = pz1.b + min;
            pz1.b = i;
            long j3 = min;
            this.Y -= j3;
            j2 -= j3;
            if (i == pz1.c) {
                PZ1 b2 = pz1.b();
                this.X = b2;
                UZ1.d(pz1);
                pz1 = b2;
            }
        }
        return this;
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public byte[] I3() {
        return o2(size());
    }

    @Override // o.InterfaceC2677Cq
    public int I5(@NotNull C5205aw1 c5205aw1) {
        C6562gT0.p(c5205aw1, C9998uW1.m0);
        int m0 = C5219b.m0(this, c5205aw1, false, 2, null);
        if (m0 == -1) {
            return -1;
        }
        skip(c5205aw1.j()[m0].g0());
        return m0;
    }

    @NotNull
    public final C5422bq M(@NotNull InputStream inputStream, long j) throws IOException {
        C6562gT0.p(inputStream, "input");
        if (j >= 0) {
            N(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // o.InterfaceC2677Cq
    public boolean M3() {
        if (this.Y == 0) {
            return true;
        }
        return false;
    }

    public final void N(InputStream inputStream, long j, boolean z) throws IOException {
        while (true) {
            if (j > 0 || z) {
                PZ1 Z = Z(1);
                int read = inputStream.read(Z.a, Z.c, (int) Math.min(j, 8192 - Z.c));
                if (read == -1) {
                    if (Z.b == Z.c) {
                        this.X = Z.b();
                        UZ1.d(Z);
                    }
                    if (z) {
                        return;
                    }
                    throw new EOFException();
                }
                Z.c += read;
                long j2 = read;
                this.Y += j2;
                j -= j2;
            } else {
                return;
            }
        }
    }

    @InterfaceC8289nW0
    @NotNull
    public final c O() {
        return Q(this, null, 1, null);
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: O0 */
    public C5422bq K1(@NotNull String str) {
        C6562gT0.p(str, "string");
        return Z1(str, 0, str.length());
    }

    @InterfaceC8289nW0
    @NotNull
    public final c P(@NotNull c cVar) {
        C6562gT0.p(cVar, "unsafeCursor");
        return C5219b.F(this, cVar);
    }

    @Override // o.InterfaceC2677Cq
    public long P4(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "targetBytes");
        return d1(c8859ps, 0L);
    }

    @Override // o.InterfaceC2579Bq
    public long Q1(@NotNull InterfaceC7072ia2 interfaceC7072ia2) throws IOException {
        C6562gT0.p(interfaceC7072ia2, "source");
        long j = 0;
        while (true) {
            long read = interfaceC7072ia2.read(this, 8192L);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    @Override // o.InterfaceC2677Cq
    public void Q2(long j) throws EOFException {
        if (this.Y >= j) {
            return;
        }
        throw new EOFException();
    }

    public final void R(long j) {
        this.Y = j;
    }

    @NotNull
    public final C8859ps S() {
        return t("SHA-1");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: S0 */
    public C5422bq Z1(@NotNull String str, int i, int i2) {
        char charAt;
        char c2;
        C6562gT0.p(str, "string");
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            PZ1 Z = Z(1);
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
                            R(size() + i6);
                        } else {
                            if (charAt2 < 2048) {
                                PZ1 Z2 = Z(2);
                                byte[] bArr2 = Z2.a;
                                int i7 = Z2.c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | CK1.x);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                Z2.c = i7 + 2;
                                R(size() + 2);
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c2 = str.charAt(i8);
                                } else {
                                    c2 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c2 && c2 < 57344) {
                                    int i9 = (((charAt2 & 1023) << 10) | (c2 & 1023)) + 65536;
                                    PZ1 Z3 = Z(4);
                                    byte[] bArr3 = Z3.a;
                                    int i10 = Z3.c;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                    Z3.c = i10 + 4;
                                    R(size() + 4);
                                    i += 2;
                                } else {
                                    writeByte(63);
                                    i = i8;
                                }
                            } else {
                                PZ1 Z4 = Z(3);
                                byte[] bArr4 = Z4.a;
                                int i11 = Z4.c;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                Z4.c = i11 + 3;
                                R(size() + 3);
                            }
                            i++;
                        }
                    }
                    return this;
                }
                throw new IllegalArgumentException(("endIndex > string.length: " + i2 + " > " + str.length()).toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(("beginIndex < 0: " + i).toString());
    }

    @Override // o.InterfaceC2677Cq
    public int S4() throws EOFException {
        return C8648p.o(readInt());
    }

    @NotNull
    public final C8859ps T() {
        return t(com.facebook.internal.l0.e);
    }

    @NotNull
    public final C8859ps U() {
        return t("SHA-512");
    }

    @NotNull
    public final C8859ps V() {
        if (size() <= 2147483647L) {
            return W((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: V0 */
    public C5422bq R0(int i) {
        if (i < 128) {
            writeByte(i);
            return this;
        } else if (i < 2048) {
            PZ1 Z = Z(2);
            byte[] bArr = Z.a;
            int i2 = Z.c;
            bArr[i2] = (byte) ((i >> 6) | CK1.x);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            Z.c = i2 + 2;
            R(size() + 2);
            return this;
        } else if (55296 <= i && i < 57344) {
            writeByte(63);
            return this;
        } else if (i < 65536) {
            PZ1 Z2 = Z(3);
            byte[] bArr2 = Z2.a;
            int i3 = Z2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
            bArr2[i3 + 2] = (byte) ((i & 63) | 128);
            Z2.c = i3 + 3;
            R(size() + 3);
            return this;
        } else if (i <= 1114111) {
            PZ1 Z3 = Z(4);
            byte[] bArr3 = Z3.a;
            int i4 = Z3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            Z3.c = i4 + 4;
            R(size() + 4);
            return this;
        } else {
            throw new IllegalArgumentException("Unexpected code point: 0x" + C8648p.v(i));
        }
    }

    @Override // o.InterfaceC2677Cq
    public long V2(byte b2) {
        return j1(b2, 0L, Long.MAX_VALUE);
    }

    @NotNull
    public final C8859ps W(int i) {
        if (i == 0) {
            return C8859ps.Z0;
        }
        C8648p.e(size(), 0L, i);
        PZ1 pz1 = this.X;
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
        PZ1 pz12 = this.X;
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

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String Y4() {
        return d5(this.Y, HB.b);
    }

    @NotNull
    public final PZ1 Z(int i) {
        if (i >= 1 && i <= 8192) {
            PZ1 pz1 = this.X;
            if (pz1 == null) {
                PZ1 e = UZ1.e();
                this.X = e;
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

    @Override // o.InterfaceC2677Cq
    public boolean a1(long j, @NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "bytes");
        return D2(j, c8859ps, 0, c8859ps.g0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
        R(size() - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (r2 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ad, code lost:
        r14 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
        r14 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
        if (r1 >= r14) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
        if (size() == r17) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ba, code lost:
        if (r2 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bc, code lost:
        r1 = "Expected a digit";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bf, code lost:
        r1 = "Expected a digit or '-'";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
        throw new java.lang.NumberFormatException(r1 + " but was 0x" + o.C8648p.u(x(r17)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ea, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00eb, code lost:
        if (r2 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ed, code lost:
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ef, code lost:
        return -r8;
     */
    @Override // o.InterfaceC2677Cq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long a4() throws EOFException {
        long j;
        byte b2;
        long j2 = 0;
        if (size() != 0) {
            int i = 0;
            boolean z = false;
            long j3 = 0;
            long j4 = -7;
            boolean z2 = false;
            loop0: while (true) {
                PZ1 pz1 = this.X;
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
                    this.X = pz1.b();
                    UZ1.d(pz1);
                } else {
                    pz1.b = i2;
                }
                if (z2 || this.X == null) {
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

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: b0 */
    public C5422bq K4(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "byteString");
        c8859ps.u0(this, 0, c8859ps.g0());
        return this;
    }

    @Override // o.InterfaceC2677Cq
    public void b1(@NotNull C5422bq c5422bq, long j) throws EOFException {
        C6562gT0.p(c5422bq, "sink");
        if (size() >= j) {
            c5422bq.write(this, j);
        } else {
            c5422bq.write(this, size());
            throw new EOFException();
        }
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: c0 */
    public C5422bq O2(@NotNull C8859ps c8859ps, int i, int i2) {
        C6562gT0.p(c8859ps, "byteString");
        c8859ps.u0(this, i, i2);
        return this;
    }

    @InterfaceC8046mW0(name = "-deprecated_getByte")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to operator function", replaceWith = @IR1(expression = "this[index]", imports = {}))
    public final byte d(long j) {
        return x(j);
    }

    @Override // o.InterfaceC2677Cq
    public long d1(@NotNull C8859ps c8859ps, long j) {
        int i;
        int i2;
        C6562gT0.p(c8859ps, "targetBytes");
        long j2 = 0;
        if (j >= 0) {
            PZ1 pz1 = this.X;
            if (pz1 == null) {
                return -1L;
            }
            if (size() - j < j) {
                j2 = size();
                while (j2 > j) {
                    pz1 = pz1.g;
                    C6562gT0.m(pz1);
                    j2 -= pz1.c - pz1.b;
                }
                if (c8859ps.g0() == 2) {
                    byte v = c8859ps.v(0);
                    byte v2 = c8859ps.v(1);
                    while (j2 < size()) {
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
                    while (j2 < size()) {
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
                while (j2 < size()) {
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
                while (j2 < size()) {
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

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String d5(long j, @NotNull Charset charset) throws EOFException {
        C6562gT0.p(charset, C4317Th1.g);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            if (this.Y >= j) {
                if (i == 0) {
                    return "";
                }
                PZ1 pz1 = this.X;
                C6562gT0.m(pz1);
                int i2 = pz1.b;
                if (i2 + j > pz1.c) {
                    return new String(o2(j), charset);
                }
                int i3 = (int) j;
                String str = new String(pz1.a, i2, i3, charset);
                int i4 = pz1.b + i3;
                pz1.b = i4;
                this.Y -= j;
                if (i4 == pz1.c) {
                    this.X = pz1.b();
                    UZ1.d(pz1);
                }
                return str;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @Override // o.InterfaceC2677Cq
    public boolean e2(long j) {
        if (this.Y >= j) {
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String e3(long j) throws EOFException {
        return d5(j, HB.b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5422bq)) {
            return false;
        }
        C5422bq c5422bq = (C5422bq) obj;
        if (size() != c5422bq.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        PZ1 pz1 = this.X;
        C6562gT0.m(pz1);
        PZ1 pz12 = c5422bq.X;
        C6562gT0.m(pz12);
        int i = pz1.b;
        int i2 = pz12.b;
        long j = 0;
        while (j < size()) {
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

    @InterfaceC8046mW0(name = "-deprecated_size")
    @InterfaceC9150r20(level = EnumC9879u20.Y, message = "moved to val", replaceWith = @IR1(expression = "size", imports = {}))
    public final long f() {
        return this.Y;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: g0 */
    public C5422bq Y2(@NotNull InterfaceC7072ia2 interfaceC7072ia2, long j) throws IOException {
        C6562gT0.p(interfaceC7072ia2, "source");
        while (j > 0) {
            long read = interfaceC7072ia2.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public final void h() {
        skip(size());
    }

    public int hashCode() {
        PZ1 pz1 = this.X;
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
        } while (pz1 != this.X);
        return i;
    }

    @NotNull
    /* renamed from: i */
    public C5422bq clone() {
        return k();
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: i0 */
    public C5422bq write(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    @Override // o.InterfaceC2677Cq
    public long i1(byte b2, long j) {
        return j1(b2, j, Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final long j() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        PZ1 pz1 = this.X;
        C6562gT0.m(pz1);
        PZ1 pz12 = pz1.g;
        C6562gT0.m(pz12);
        int i = pz12.c;
        if (i < 8192 && pz12.e) {
            return size - (i - pz12.b);
        }
        return size;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: j0 */
    public C5422bq write(@NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "source");
        long j = i2;
        C8648p.e(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            PZ1 Z = Z(1);
            int min = Math.min(i3 - i, 8192 - Z.c);
            int i4 = i + min;
            C4788Ye.v0(bArr, Z.a, Z.c, i, i4);
            Z.c += min;
            i = i4;
        }
        R(size() + j);
        return this;
    }

    @Override // o.InterfaceC2677Cq
    public long j1(byte b2, long j, long j2) {
        PZ1 pz1;
        int i;
        long j3 = 0;
        if (0 <= j && j <= j2) {
            if (j2 > size()) {
                j2 = size();
            }
            if (j == j2 || (pz1 = this.X) == null) {
                return -1L;
            }
            if (size() - j < j) {
                j3 = size();
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
        throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    @NotNull
    public final C5422bq k() {
        C5422bq c5422bq = new C5422bq();
        if (size() == 0) {
            return c5422bq;
        }
        PZ1 pz1 = this.X;
        C6562gT0.m(pz1);
        PZ1 d = pz1.d();
        c5422bq.X = d;
        d.g = d;
        d.f = d;
        for (PZ1 pz12 = pz1.f; pz12 != pz1; pz12 = pz12.f) {
            PZ1 pz13 = d.g;
            C6562gT0.m(pz13);
            C6562gT0.m(pz12);
            pz13.c(pz12.d());
        }
        c5422bq.R(size());
        return c5422bq;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: k0 */
    public C5422bq writeByte(int i) {
        PZ1 Z = Z(1);
        byte[] bArr = Z.a;
        int i2 = Z.c;
        Z.c = i2 + 1;
        bArr[i2] = (byte) i;
        R(size() + 1);
        return this;
    }

    @Override // o.InterfaceC2677Cq
    @Nullable
    public String k1() throws EOFException {
        long V2 = V2((byte) 10);
        if (V2 != -1) {
            return C5219b.j0(this, V2);
        }
        if (size() != 0) {
            return e3(size());
        }
        return null;
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String k2() throws EOFException {
        return p1(Long.MAX_VALUE);
    }

    @Override // o.InterfaceC2677Cq
    public long k5(@NotNull J82 j82) throws IOException {
        C6562gT0.p(j82, "sink");
        long size = size();
        if (size > 0) {
            j82.write(this, size);
        }
        return size;
    }

    @InterfaceC8289nW0
    @NotNull
    public final C5422bq l(@NotNull OutputStream outputStream) throws IOException {
        C6562gT0.p(outputStream, "out");
        return q(this, outputStream, 0L, 0L, 6, null);
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: l0 */
    public C5422bq S2(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return writeByte(48);
        }
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return K1("-9223372036854775808");
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
        PZ1 Z = Z(i2);
        byte[] bArr = Z.a;
        int i3 = Z.c + i2;
        while (j != 0) {
            long j2 = 10;
            i3--;
            bArr[i3] = C5219b.g0()[(int) (j % j2)];
            j /= j2;
        }
        if (z) {
            bArr[i3 - 1] = C3307Iz.e0;
        }
        Z.c += i2;
        R(size() + i2);
        return this;
    }

    @InterfaceC8289nW0
    @NotNull
    public final C5422bq m(@NotNull OutputStream outputStream, long j) throws IOException {
        C6562gT0.p(outputStream, "out");
        return q(this, outputStream, j, 0L, 4, null);
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: m0 */
    public C5422bq F4(long j) {
        if (j == 0) {
            return writeByte(48);
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
        PZ1 Z = Z(i);
        byte[] bArr = Z.a;
        int i2 = Z.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = C5219b.g0()[(int) (15 & j)];
            j >>>= 4;
        }
        Z.c += i;
        R(size() + i);
        return this;
    }

    @InterfaceC8289nW0
    @NotNull
    public final C5422bq n(@NotNull OutputStream outputStream, long j, long j2) throws IOException {
        int i;
        C6562gT0.p(outputStream, "out");
        long j3 = j;
        C8648p.e(this.Y, j3, j2);
        if (j2 != 0) {
            PZ1 pz1 = this.X;
            while (true) {
                C6562gT0.m(pz1);
                int i2 = pz1.c;
                int i3 = pz1.b;
                if (j3 < i2 - i3) {
                    break;
                }
                j3 -= i2 - i3;
                pz1 = pz1.f;
            }
            PZ1 pz12 = pz1;
            long j4 = j2;
            while (j4 > 0) {
                C6562gT0.m(pz12);
                int min = (int) Math.min(pz12.c - i, j4);
                outputStream.write(pz12.a, (int) (pz12.b + j3), min);
                j4 -= min;
                pz12 = pz12.f;
                j3 = 0;
            }
        }
        return this;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: n0 */
    public C5422bq writeInt(int i) {
        PZ1 Z = Z(4);
        byte[] bArr = Z.a;
        int i2 = Z.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        Z.c = i2 + 4;
        R(size() + 4);
        return this;
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public C8859ps n3(long j) throws EOFException {
        if (j >= 0 && j <= 2147483647L) {
            if (size() >= j) {
                if (j >= PlaybackStateCompat.t1) {
                    C8859ps W = W((int) j);
                    skip(j);
                    return W;
                }
                return new C8859ps(o2(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @NotNull
    public final C5422bq o(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "out");
        return p(c5422bq, j, this.Y - j);
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public byte[] o2(long j) throws EOFException {
        if (j >= 0 && j <= 2147483647L) {
            if (size() >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @NotNull
    public final C5422bq p(@NotNull C5422bq c5422bq, long j, long j2) {
        C6562gT0.p(c5422bq, "out");
        long j3 = j;
        C8648p.e(size(), j3, j2);
        if (j2 != 0) {
            c5422bq.R(c5422bq.size() + j2);
            PZ1 pz1 = this.X;
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
                PZ1 d = pz12.d();
                int i3 = d.b + ((int) j3);
                d.b = i3;
                d.c = Math.min(i3 + ((int) j4), d.c);
                PZ1 pz13 = c5422bq.X;
                if (pz13 == null) {
                    d.g = d;
                    d.f = d;
                    c5422bq.X = d;
                } else {
                    C6562gT0.m(pz13);
                    PZ1 pz14 = pz13.g;
                    C6562gT0.m(pz14);
                    pz14.c(d);
                }
                j4 -= d.c - d.b;
                pz12 = pz12.f;
                j3 = 0;
            }
        }
        return this;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: p0 */
    public C5422bq K3(int i) {
        return writeInt(C8648p.o(i));
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String p1(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long j3 = j2;
            long j1 = j1((byte) 10, 0L, j3);
            if (j1 != -1) {
                return C5219b.j0(this, j1);
            }
            if (j3 < size() && x(j3 - 1) == 13 && x(j3) == 10) {
                return C5219b.j0(this, j3);
            }
            C5422bq c5422bq = new C5422bq();
            p(c5422bq, 0L, Math.min(32, size()));
            throw new EOFException("\\n not found: limit=" + Math.min(size(), j) + " content=" + c5422bq.G4().A() + Hw2.F);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public InterfaceC2677Cq peek() {
        return C9604su1.e(new C7969mC1(this));
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: q0 */
    public C5422bq writeLong(long j) {
        PZ1 Z = Z(8);
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
        R(size() + 8);
        return this;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: r0 */
    public C5422bq X0(long j) {
        return writeLong(C8648p.p(j));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) throws IOException {
        C6562gT0.p(byteBuffer, "sink");
        PZ1 pz1 = this.X;
        if (pz1 == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), pz1.c - pz1.b);
        byteBuffer.put(pz1.a, pz1.b, min);
        int i = pz1.b + min;
        pz1.b = i;
        this.Y -= min;
        if (i == pz1.c) {
            this.X = pz1.b();
            UZ1.d(pz1);
        }
        return min;
    }

    @Override // o.InterfaceC2677Cq
    public byte readByte() throws EOFException {
        if (size() != 0) {
            PZ1 pz1 = this.X;
            C6562gT0.m(pz1);
            int i = pz1.b;
            int i2 = pz1.c;
            int i3 = i + 1;
            byte b2 = pz1.a[i];
            R(size() - 1);
            if (i3 == i2) {
                this.X = pz1.b();
                UZ1.d(pz1);
                return b2;
            }
            pz1.b = i3;
            return b2;
        }
        throw new EOFException();
    }

    @Override // o.InterfaceC2677Cq
    public void readFully(@NotNull byte[] bArr) throws EOFException {
        C6562gT0.p(bArr, "sink");
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // o.InterfaceC2677Cq
    public int readInt() throws EOFException {
        if (size() >= 4) {
            PZ1 pz1 = this.X;
            C6562gT0.m(pz1);
            int i = pz1.b;
            int i2 = pz1.c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = pz1.a;
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = i + 4;
            int i6 = (bArr[i4] & 255) | i3 | ((bArr[i + 2] & 255) << 8);
            R(size() - 4);
            if (i5 == i2) {
                this.X = pz1.b();
                UZ1.d(pz1);
                return i6;
            }
            pz1.b = i5;
            return i6;
        }
        throw new EOFException();
    }

    @Override // o.InterfaceC2677Cq
    public long readLong() throws EOFException {
        if (size() >= 8) {
            PZ1 pz1 = this.X;
            C6562gT0.m(pz1);
            int i = pz1.b;
            int i2 = pz1.c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = pz1.a;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40);
            int i3 = i + 7;
            int i4 = i + 8;
            long j2 = j | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i3] & 255);
            R(size() - 8);
            if (i4 == i2) {
                this.X = pz1.b();
                UZ1.d(pz1);
                return j2;
            }
            pz1.b = i4;
            return j2;
        }
        throw new EOFException();
    }

    @Override // o.InterfaceC2677Cq
    public short readShort() throws EOFException {
        if (size() >= 2) {
            PZ1 pz1 = this.X;
            C6562gT0.m(pz1);
            int i = pz1.b;
            int i2 = pz1.c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = pz1.a;
            int i3 = i + 1;
            int i4 = i + 2;
            int i5 = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            R(size() - 2);
            if (i4 == i2) {
                this.X = pz1.b();
                UZ1.d(pz1);
            } else {
                pz1.b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public InputStream s0() {
        return new a();
    }

    @InterfaceC8046mW0(name = "size")
    public final long size() {
        return this.Y;
    }

    @Override // o.InterfaceC2677Cq
    public void skip(long j) throws EOFException {
        while (j > 0) {
            PZ1 pz1 = this.X;
            if (pz1 != null) {
                int min = (int) Math.min(j, pz1.c - pz1.b);
                long j2 = min;
                R(size() - j2);
                j -= j2;
                int i = pz1.b + min;
                pz1.b = i;
                if (i == pz1.c) {
                    this.X = pz1.b();
                    UZ1.d(pz1);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final C8859ps t(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        PZ1 pz1 = this.X;
        if (pz1 != null) {
            byte[] bArr = pz1.a;
            int i = pz1.b;
            messageDigest.update(bArr, i, pz1.c - i);
            PZ1 pz12 = pz1.f;
            C6562gT0.m(pz12);
            while (pz12 != pz1) {
                byte[] bArr2 = pz12.a;
                int i2 = pz12.b;
                messageDigest.update(bArr2, i2, pz12.c - i2);
                pz12 = pz12.f;
                C6562gT0.m(pz12);
            }
        }
        byte[] digest = messageDigest.digest();
        C6562gT0.o(digest, "digest(...)");
        return new C8859ps(digest);
    }

    @Override // o.InterfaceC7072ia2
    @NotNull
    public C8120mp2 timeout() {
        return C8120mp2.NONE;
    }

    @NotNull
    public String toString() {
        return V().toString();
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: u0 */
    public C5422bq writeShort(int i) {
        PZ1 Z = Z(2);
        byte[] bArr = Z.a;
        int i2 = Z.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        Z.c = i2 + 2;
        R(size() + 2);
        return this;
    }

    @Override // o.InterfaceC2677Cq
    public long w1(@NotNull C8859ps c8859ps) throws IOException {
        C6562gT0.p(c8859ps, "bytes");
        return H1(c8859ps, 0L);
    }

    @Override // o.InterfaceC2677Cq
    public short w2() throws EOFException {
        return C8648p.q(readShort());
    }

    @InterfaceC8046mW0(name = "getByte")
    public final byte x(long j) {
        C8648p.e(size(), j, 1L);
        PZ1 pz1 = this.X;
        if (pz1 != null) {
            if (size() - j < j) {
                long size = size();
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

    public final C8859ps y(String str, C8859ps c8859ps) {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(c8859ps.L(), str));
            PZ1 pz1 = this.X;
            if (pz1 != null) {
                byte[] bArr = pz1.a;
                int i = pz1.b;
                mac.update(bArr, i, pz1.c - i);
                PZ1 pz12 = pz1.f;
                C6562gT0.m(pz12);
                while (pz12 != pz1) {
                    byte[] bArr2 = pz12.a;
                    int i2 = pz12.b;
                    mac.update(bArr2, i2, pz12.c - i2);
                    pz12 = pz12.f;
                    C6562gT0.m(pz12);
                }
            }
            byte[] doFinal = mac.doFinal();
            C6562gT0.o(doFinal, "doFinal(...)");
            return new C8859ps(doFinal);
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: y0 */
    public C5422bq m4(int i) {
        return writeShort(C8648p.q((short) i));
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String y4(@NotNull Charset charset) {
        C6562gT0.p(charset, C4317Th1.g);
        return d5(this.Y, charset);
    }

    @NotNull
    public final C8859ps z(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "key");
        return y("HmacSHA1", c8859ps);
    }

    @Override // o.InterfaceC2677Cq
    public long z2() throws EOFException {
        return C8648p.p(readLong());
    }

    @InterfaceC8303na2({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,641:1\n74#2:642\n86#2:643\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/Buffer$inputStream$1\n*L\n126#1:642\n136#1:643\n*E\n"})
    /* renamed from: o.bq$a */
    /* loaded from: classes4.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C5422bq.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C5422bq.this.size() > 0) {
                return C5422bq.this.readByte() & 255;
            }
            return -1;
        }

        @NotNull
        public String toString() {
            return C5422bq.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] bArr, int i, int i2) {
            C6562gT0.p(bArr, "sink");
            return C5422bq.this.read(bArr, i, i2);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) throws IOException {
        C6562gT0.p(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            PZ1 Z = Z(1);
            int min = Math.min(i, 8192 - Z.c);
            byteBuffer.get(Z.a, Z.c, min);
            i -= min;
            Z.c += min;
        }
        this.Y += remaining;
        return remaining;
    }

    @Override // o.InterfaceC2677Cq
    public int read(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    @Override // o.J82
    public void write(@NotNull C5422bq c5422bq, long j) {
        PZ1 pz1;
        PZ1 pz12;
        C6562gT0.p(c5422bq, "source");
        if (c5422bq != this) {
            C8648p.e(c5422bq.size(), 0L, j);
            while (j > 0) {
                PZ1 pz13 = c5422bq.X;
                C6562gT0.m(pz13);
                int i = pz13.c;
                C6562gT0.m(c5422bq.X);
                if (j < i - pz1.b) {
                    PZ1 pz14 = this.X;
                    if (pz14 != null) {
                        C6562gT0.m(pz14);
                        pz12 = pz14.g;
                    } else {
                        pz12 = null;
                    }
                    if (pz12 != null && pz12.e) {
                        if ((pz12.c + j) - (pz12.d ? 0 : pz12.b) <= 8192) {
                            PZ1 pz15 = c5422bq.X;
                            C6562gT0.m(pz15);
                            pz15.g(pz12, (int) j);
                            c5422bq.R(c5422bq.size() - j);
                            R(size() + j);
                            return;
                        }
                    }
                    PZ1 pz16 = c5422bq.X;
                    C6562gT0.m(pz16);
                    c5422bq.X = pz16.e((int) j);
                }
                PZ1 pz17 = c5422bq.X;
                C6562gT0.m(pz17);
                long j2 = pz17.c - pz17.b;
                c5422bq.X = pz17.b();
                PZ1 pz18 = this.X;
                if (pz18 == null) {
                    this.X = pz17;
                    pz17.g = pz17;
                    pz17.f = pz17;
                } else {
                    C6562gT0.m(pz18);
                    PZ1 pz19 = pz18.g;
                    C6562gT0.m(pz19);
                    pz19.c(pz17).a();
                }
                c5422bq.R(c5422bq.size() - j2);
                R(size() + j2);
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // o.InterfaceC2677Cq
    public int read(@NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "sink");
        C8648p.e(bArr.length, i, i2);
        PZ1 pz1 = this.X;
        if (pz1 == null) {
            return -1;
        }
        int min = Math.min(i2, pz1.c - pz1.b);
        byte[] bArr2 = pz1.a;
        int i3 = pz1.b;
        C4788Ye.v0(bArr2, bArr, i, i3, i3 + min);
        pz1.b += min;
        R(size() - min);
        if (pz1.b == pz1.c) {
            this.X = pz1.b();
            UZ1.d(pz1);
        }
        return min;
    }

    @Override // o.InterfaceC7072ia2
    public long read(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "sink");
        if (j >= 0) {
            if (size() == 0) {
                return -1L;
            }
            if (j > size()) {
                j = size();
            }
            c5422bq.write(this, j);
            return j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public C5422bq B() {
        return this;
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public C5422bq L() {
        return this;
    }

    @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o.InterfaceC2579Bq, o.J82, java.io.Flushable
    public void flush() {
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: u */
    public C5422bq N0() {
        return this;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    /* renamed from: v */
    public C5422bq l1() {
        return this;
    }
}
