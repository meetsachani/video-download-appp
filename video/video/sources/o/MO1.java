package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#1:191\n62#1:201\n62#1:208\n62#1:214\n62#1:216\n62#1:220\n62#1:225\n62#1:240\n62#1:244\n62#1:251\n62#1:264\n62#1:272\n62#1:273\n62#1:274\n62#1:280\n62#1:288\n62#1:301\n62#1:305\n62#1:306\n62#1:307\n62#1:308\n62#1:313\n62#1:325\n62#1:341\n62#1:351\n62#1:354\n62#1:357\n62#1:360\n62#1:363\n62#1:366\n62#1:372\n62#1:389\n62#1:409\n62#1:424\n62#1:441\n62#1:454\n62#1:475\n62#1:482\n38#2:186\n39#2,3:188\n42#2,6:192\n51#2:198\n52#2:200\n56#2,2:202\n60#2:204\n61#2,2:206\n63#2,3:209\n69#2,2:212\n74#2:215\n75#2:217\n79#2,2:218\n84#2:221\n86#2,2:223\n88#2,13:226\n107#2:239\n108#2:241\n112#2,2:242\n117#2,6:245\n123#2,9:252\n134#2,3:261\n137#2,5:265\n142#2:271\n146#2,5:275\n151#2,5:281\n158#2,2:286\n160#2,11:289\n174#2:300\n175#2:302\n179#2,2:303\n184#2,4:309\n188#2,6:314\n198#2:320\n199#2,3:322\n202#2,8:326\n210#2,3:335\n217#2,3:338\n220#2,7:342\n230#2,2:349\n235#2,2:352\n240#2,2:355\n245#2,2:358\n250#2,2:361\n255#2,2:364\n260#2,5:367\n265#2,11:373\n279#2,5:384\n284#2,14:390\n301#2,2:404\n303#2,2:407\n305#2,7:410\n314#2,2:417\n316#2,4:420\n320#2,11:425\n334#2,2:436\n337#2,2:439\n339#2,7:442\n350#2,2:449\n353#2,2:452\n355#2,7:455\n371#2:462\n373#2,11:464\n385#2:476\n389#2:477\n393#2,4:478\n397#2:483\n399#2:484\n401#2:485\n1#3:187\n1#3:199\n1#3:205\n1#3:222\n1#3:321\n1#3:406\n1#3:419\n1#3:438\n1#3:451\n1#3:463\n89#4:270\n89#4:334\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n66#1:191\n67#1:201\n69#1:208\n70#1:214\n71#1:216\n72#1:220\n73#1:225\n74#1:240\n75#1:244\n77#1:251\n79#1:264\n82#1:272\n83#1:273\n87#1:274\n90#1:280\n91#1:288\n92#1:301\n93#1:305\n96#1:306\n97#1:307\n102#1:308\n105#1:313\n107#1:325\n108#1:341\n109#1:351\n110#1:354\n111#1:357\n112#1:360\n113#1:363\n114#1:366\n115#1:372\n116#1:389\n117#1:409\n121#1:424\n124#1:441\n127#1:454\n141#1:475\n181#1:482\n66#1:186\n66#1:188,3\n66#1:192,6\n67#1:198\n67#1:200\n68#1:202,2\n69#1:204\n69#1:206,2\n69#1:209,3\n70#1:212,2\n71#1:215\n71#1:217\n72#1:218,2\n73#1:221\n73#1:223,2\n73#1:226,13\n74#1:239\n74#1:241\n75#1:242,2\n77#1:245,6\n77#1:252,9\n79#1:261,3\n79#1:265,5\n79#1:271\n90#1:275,5\n90#1:281,5\n91#1:286,2\n91#1:289,11\n92#1:300\n92#1:302\n93#1:303,2\n105#1:309,4\n105#1:314,6\n107#1:320\n107#1:322,3\n107#1:326,8\n107#1:335,3\n108#1:338,3\n108#1:342,7\n109#1:349,2\n110#1:352,2\n111#1:355,2\n112#1:358,2\n113#1:361,2\n114#1:364,2\n115#1:367,5\n115#1:373,11\n116#1:384,5\n116#1:390,14\n117#1:404,2\n117#1:407,2\n117#1:410,7\n121#1:417,2\n121#1:420,4\n121#1:425,11\n124#1:436,2\n124#1:439,2\n124#1:442,7\n127#1:449,2\n127#1:452,2\n127#1:455,7\n141#1:462\n141#1:464,11\n141#1:476\n143#1:477\n181#1:478,4\n181#1:483\n182#1:484\n183#1:485\n66#1:187\n67#1:199\n69#1:205\n73#1:222\n107#1:321\n117#1:406\n121#1:419\n124#1:438\n127#1:451\n141#1:463\n79#1:270\n107#1:334\n*E\n"})
/* loaded from: classes4.dex */
public final class MO1 implements InterfaceC2677Cq {
    @InterfaceC7058iW0
    @NotNull
    public final InterfaceC7072ia2 X;
    @InterfaceC7058iW0
    @NotNull
    public final C5422bq Y;
    @InterfaceC7058iW0
    public boolean Z;

    public MO1(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        C6562gT0.p(interfaceC7072ia2, "source");
        this.X = interfaceC7072ia2;
        this.Y = new C5422bq();
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public C5422bq B() {
        return this.Y;
    }

    @Override // o.InterfaceC2677Cq
    public int C4() {
        Q2(1L);
        byte x = this.Y.x(0L);
        if ((x & 224) == 192) {
            Q2(2L);
        } else if ((x & 240) == 224) {
            Q2(3L);
        } else if ((x & 248) == 240) {
            Q2(4L);
        }
        return this.Y.C4();
    }

    @Override // o.InterfaceC2677Cq
    public boolean D2(long j, @NotNull C8859ps c8859ps, int i, int i2) {
        C6562gT0.p(c8859ps, "bytes");
        if (!this.Z) {
            if (j < 0 || i < 0 || i2 < 0 || c8859ps.g0() - i < i2) {
                return false;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = i3 + j;
                if (!e2(1 + j2) || this.Y.x(j2) != c8859ps.v(i + i3)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public C8859ps G4() {
        this.Y.Q1(this.X);
        return this.Y.G4();
    }

    @Override // o.InterfaceC2677Cq
    public long H1(@NotNull C8859ps c8859ps, long j) {
        C6562gT0.p(c8859ps, "bytes");
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long H1 = this.Y.H1(c8859ps, j);
            if (H1 != -1) {
                return H1;
            }
            long size = this.Y.size();
            if (this.X.read(this.Y, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, (size - c8859ps.g0()) + 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, o.BB.a(o.BB.a(16)));
        o.C6562gT0.o(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // o.InterfaceC2677Cq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long H5() {
        Q2(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!e2(i2)) {
                break;
            }
            byte x = this.Y.x(i);
            if ((x < 48 || x > 57) && ((x < 97 || x > 102) && (x < 65 || x > 70))) {
                break;
            }
            i = i2;
        }
        return this.Y.H5();
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public byte[] I3() {
        this.Y.Q1(this.X);
        return this.Y.I3();
    }

    @Override // o.InterfaceC2677Cq
    public int I5(@NotNull C5205aw1 c5205aw1) {
        C6562gT0.p(c5205aw1, C9998uW1.m0);
        if (!this.Z) {
            do {
                int l0 = C5219b.l0(this.Y, c5205aw1, true);
                if (l0 != -2) {
                    if (l0 == -1) {
                        return -1;
                    }
                    this.Y.skip(c5205aw1.j()[l0].g0());
                    return l0;
                }
            } while (this.X.read(this.Y, 8192L) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public C5422bq L() {
        return this.Y;
    }

    @Override // o.InterfaceC2677Cq
    public boolean M3() {
        if (!this.Z) {
            if (this.Y.M3() && this.X.read(this.Y, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2677Cq
    public long P4(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "targetBytes");
        return d1(c8859ps, 0L);
    }

    @Override // o.InterfaceC2677Cq
    public void Q2(long j) {
        if (e2(j)) {
            return;
        }
        throw new EOFException();
    }

    @Override // o.InterfaceC2677Cq
    public int S4() {
        Q2(4L);
        return this.Y.S4();
    }

    @Override // o.InterfaceC2677Cq
    public long V2(byte b) {
        return j1(b, 0L, Long.MAX_VALUE);
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String Y4() {
        this.Y.Q1(this.X);
        return this.Y.Y4();
    }

    @Override // o.InterfaceC2677Cq
    public boolean a1(long j, @NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "bytes");
        return D2(j, c8859ps, 0, c8859ps.g0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r4 == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, o.BB.a(o.BB.a(16)));
        o.C6562gT0.o(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // o.InterfaceC2677Cq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long a4() {
        Q2(1L);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!e2(j2)) {
                break;
            }
            byte x = this.Y.x(j);
            if ((x < 48 || x > 57) && !(j == 0 && x == 45)) {
                break;
            }
            j = j2;
        }
        return this.Y.a4();
    }

    @Override // o.InterfaceC2677Cq
    public void b1(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "sink");
        try {
            Q2(j);
            this.Y.b1(c5422bq, j);
        } catch (EOFException e) {
            c5422bq.Q1(this.Y);
            throw e;
        }
    }

    @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.Z) {
            this.Z = true;
            this.X.close();
            this.Y.h();
        }
    }

    @Override // o.InterfaceC2677Cq
    public long d1(@NotNull C8859ps c8859ps, long j) {
        C6562gT0.p(c8859ps, "targetBytes");
        if (this.Z) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long d1 = this.Y.d1(c8859ps, j);
            if (d1 != -1) {
                return d1;
            }
            long size = this.Y.size();
            if (this.X.read(this.Y, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, size);
        }
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String d5(long j, @NotNull Charset charset) {
        C6562gT0.p(charset, C4317Th1.g);
        Q2(j);
        return this.Y.d5(j, charset);
    }

    @Override // o.InterfaceC2677Cq
    public boolean e2(long j) {
        if (j >= 0) {
            if (!this.Z) {
                while (this.Y.size() < j) {
                    if (this.X.read(this.Y, 8192L) == -1) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String e3(long j) {
        Q2(j);
        return this.Y.e3(j);
    }

    @Override // o.InterfaceC2677Cq
    public long i1(byte b, long j) {
        return j1(b, j, Long.MAX_VALUE);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.Z;
    }

    @Override // o.InterfaceC2677Cq
    public long j1(byte b, long j, long j2) {
        if (!this.Z) {
            if (0 <= j && j <= j2) {
                long j3 = j;
                while (j3 < j2) {
                    byte b2 = b;
                    long j4 = j2;
                    long j1 = this.Y.j1(b2, j3, j4);
                    if (j1 != -1) {
                        return j1;
                    }
                    long size = this.Y.size();
                    if (size >= j4 || this.X.read(this.Y, 8192L) == -1) {
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

    @Override // o.InterfaceC2677Cq
    @Nullable
    public String k1() {
        long V2 = V2((byte) 10);
        if (V2 == -1) {
            if (this.Y.size() != 0) {
                return e3(this.Y.size());
            }
            return null;
        }
        return C5219b.j0(this.Y, V2);
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String k2() {
        return p1(Long.MAX_VALUE);
    }

    @Override // o.InterfaceC2677Cq
    public long k5(@NotNull J82 j82) {
        C6562gT0.p(j82, "sink");
        long j = 0;
        while (this.X.read(this.Y, 8192L) != -1) {
            long j2 = this.Y.j();
            if (j2 > 0) {
                j += j2;
                j82.write(this.Y, j2);
            }
        }
        if (this.Y.size() > 0) {
            long size = j + this.Y.size();
            C5422bq c5422bq = this.Y;
            j82.write(c5422bq, c5422bq.size());
            return size;
        }
        return j;
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public C8859ps n3(long j) {
        Q2(j);
        return this.Y.n3(j);
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public byte[] o2(long j) {
        Q2(j);
        return this.Y.o2(j);
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String p1(long j) {
        long j2;
        if (j >= 0) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long j1 = j1((byte) 10, 0L, j2);
            if (j1 != -1) {
                return C5219b.j0(this.Y, j1);
            }
            if (j2 < Long.MAX_VALUE && e2(j2) && this.Y.x(j2 - 1) == 13 && e2(j2 + 1) && this.Y.x(j2) == 10) {
                return C5219b.j0(this.Y, j2);
            }
            C5422bq c5422bq = new C5422bq();
            C5422bq c5422bq2 = this.Y;
            c5422bq2.p(c5422bq, 0L, Math.min(32, c5422bq2.size()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.Y.size(), j) + " content=" + c5422bq.G4().A() + Hw2.F);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public InterfaceC2677Cq peek() {
        return C9604su1.e(new C7969mC1(this));
    }

    @Override // o.InterfaceC2677Cq
    public int read(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    @Override // o.InterfaceC2677Cq
    public byte readByte() {
        Q2(1L);
        return this.Y.readByte();
    }

    @Override // o.InterfaceC2677Cq
    public void readFully(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "sink");
        try {
            Q2(bArr.length);
            this.Y.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.Y.size() > 0) {
                C5422bq c5422bq = this.Y;
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

    @Override // o.InterfaceC2677Cq
    public int readInt() {
        Q2(4L);
        return this.Y.readInt();
    }

    @Override // o.InterfaceC2677Cq
    public long readLong() {
        Q2(8L);
        return this.Y.readLong();
    }

    @Override // o.InterfaceC2677Cq
    public short readShort() {
        Q2(2L);
        return this.Y.readShort();
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public InputStream s0() {
        return new a();
    }

    @Override // o.InterfaceC2677Cq
    public void skip(long j) {
        if (!this.Z) {
            while (j > 0) {
                if (this.Y.size() == 0 && this.X.read(this.Y, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.Y.size());
                this.Y.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC7072ia2
    @NotNull
    public C8120mp2 timeout() {
        return this.X.timeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.X + ')';
    }

    @Override // o.InterfaceC2677Cq
    public long w1(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "bytes");
        return H1(c8859ps, 0L);
    }

    @Override // o.InterfaceC2677Cq
    public short w2() {
        Q2(2L);
        return this.Y.w2();
    }

    @Override // o.InterfaceC2677Cq
    @NotNull
    public String y4(@NotNull Charset charset) {
        C6562gT0.p(charset, C4317Th1.g);
        this.Y.Q1(this.X);
        return this.Y.y4(charset);
    }

    @Override // o.InterfaceC2677Cq
    public long z2() {
        Q2(8L);
        return this.Y.z2();
    }

    @Override // o.InterfaceC7072ia2
    public long read(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "sink");
        if (j >= 0) {
            if (!this.Z) {
                if (this.Y.size() == 0 && this.X.read(this.Y, 8192L) == -1) {
                    return -1L;
                }
                return this.Y.read(c5422bq, Math.min(j, this.Y.size()));
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @InterfaceC8303na2({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n+ 2 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n62#2:186\n62#2:187\n62#2:188\n62#2:190\n62#2:191\n62#2:192\n62#2:193\n74#3:189\n86#3:194\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource$inputStream$1\n*L\n149#1:186\n150#1:187\n153#1:188\n160#1:190\n161#1:191\n165#1:192\n170#1:193\n153#1:189\n170#1:194\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            MO1 mo1 = MO1.this;
            if (!mo1.Z) {
                return (int) Math.min(mo1.Y.size(), Integer.MAX_VALUE);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            MO1.this.close();
        }

        @Override // java.io.InputStream
        public int read() {
            MO1 mo1 = MO1.this;
            if (!mo1.Z) {
                if (mo1.Y.size() == 0) {
                    MO1 mo12 = MO1.this;
                    if (mo12.X.read(mo12.Y, 8192L) == -1) {
                        return -1;
                    }
                }
                return MO1.this.Y.readByte() & 255;
            }
            throw new IOException("closed");
        }

        @NotNull
        public String toString() {
            return MO1.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(@NotNull byte[] bArr, int i, int i2) {
            C6562gT0.p(bArr, "data");
            if (!MO1.this.Z) {
                C8648p.e(bArr.length, i, i2);
                if (MO1.this.Y.size() == 0) {
                    MO1 mo1 = MO1.this;
                    if (mo1.X.read(mo1.Y, 8192L) == -1) {
                        return -1;
                    }
                }
                return MO1.this.Y.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // o.InterfaceC2677Cq
    public int read(@NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "sink");
        long j = i2;
        C8648p.e(bArr.length, i, j);
        if (this.Y.size() == 0 && this.X.read(this.Y, 8192L) == -1) {
            return -1;
        }
        return this.Y.read(bArr, i, (int) Math.min(j, this.Y.size()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer byteBuffer) {
        C6562gT0.p(byteBuffer, "sink");
        if (this.Y.size() == 0 && this.X.read(this.Y, 8192L) == -1) {
            return -1;
        }
        return this.Y.read(byteBuffer);
    }

    public static /* synthetic */ void a() {
    }
}
