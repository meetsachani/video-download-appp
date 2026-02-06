package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 2 RealBufferedSink.kt\nokio/internal/-RealBufferedSink\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,142:1\n51#1:146\n51#1:152\n51#1:157\n51#1:162\n51#1:167\n51#1:172\n51#1:175\n51#1:176\n51#1:180\n51#1:185\n51#1:188\n51#1:192\n51#1:201\n51#1:210\n51#1:215\n51#1:220\n51#1:225\n51#1:230\n51#1:235\n51#1:240\n51#1:245\n51#1:250\n51#1:255\n51#1:261\n51#1:267\n51#1:279\n34#2:143\n35#2:145\n36#2,2:147\n40#2:149\n41#2:151\n42#2:153\n50#2:154\n51#2:156\n52#2:158\n56#2:159\n57#2:161\n58#2:163\n66#2:164\n67#2:166\n68#2:168\n72#2:169\n73#2:171\n74#2:173\n78#2:177\n79#2:179\n80#2:181\n88#2:182\n89#2:184\n90#2:186\n94#2,3:189\n97#2,5:193\n105#2,3:198\n108#2,5:202\n116#2:207\n117#2:209\n118#2:211\n122#2:212\n123#2:214\n124#2:216\n128#2:217\n129#2:219\n130#2:221\n134#2:222\n135#2:224\n136#2:226\n140#2:227\n141#2:229\n142#2:231\n146#2:232\n147#2:234\n148#2:236\n152#2:237\n153#2:239\n154#2:241\n158#2:242\n159#2:244\n160#2:246\n164#2:247\n165#2:249\n166#2:251\n170#2:252\n171#2:254\n172#2,2:256\n177#2:258\n178#2:260\n179#2,2:262\n184#2:264\n185#2:266\n186#2,4:268\n192#2,7:272\n199#2,16:280\n216#2:296\n218#2:297\n1#3:144\n1#3:150\n1#3:155\n1#3:160\n1#3:165\n1#3:170\n1#3:174\n1#3:178\n1#3:183\n1#3:187\n1#3:208\n1#3:213\n1#3:218\n1#3:223\n1#3:228\n1#3:233\n1#3:238\n1#3:243\n1#3:248\n1#3:253\n1#3:259\n1#3:265\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n55#1:146\n56#1:152\n58#1:157\n59#1:162\n61#1:167\n63#1:172\n67#1:175\n78#1:176\n82#1:180\n84#1:185\n88#1:188\n93#1:192\n94#1:201\n95#1:210\n96#1:215\n97#1:220\n98#1:225\n99#1:230\n100#1:235\n101#1:240\n102#1:245\n103#1:250\n104#1:255\n105#1:261\n134#1:267\n138#1:279\n55#1:143\n55#1:145\n55#1:147,2\n56#1:149\n56#1:151\n56#1:153\n58#1:154\n58#1:156\n58#1:158\n59#1:159\n59#1:161\n59#1:163\n61#1:164\n61#1:166\n61#1:168\n63#1:169\n63#1:171\n63#1:173\n82#1:177\n82#1:179\n82#1:181\n84#1:182\n84#1:184\n84#1:186\n93#1:189,3\n93#1:193,5\n94#1:198,3\n94#1:202,5\n95#1:207\n95#1:209\n95#1:211\n96#1:212\n96#1:214\n96#1:216\n97#1:217\n97#1:219\n97#1:221\n98#1:222\n98#1:224\n98#1:226\n99#1:227\n99#1:229\n99#1:231\n100#1:232\n100#1:234\n100#1:236\n101#1:237\n101#1:239\n101#1:241\n102#1:242\n102#1:244\n102#1:246\n103#1:247\n103#1:249\n103#1:251\n104#1:252\n104#1:254\n104#1:256,2\n105#1:258\n105#1:260\n105#1:262,2\n134#1:264\n134#1:266\n134#1:268,4\n138#1:272,7\n138#1:280,16\n139#1:296\n140#1:297\n55#1:144\n56#1:150\n58#1:155\n59#1:160\n61#1:165\n63#1:170\n82#1:178\n84#1:183\n95#1:208\n96#1:213\n97#1:218\n98#1:223\n99#1:228\n100#1:233\n101#1:238\n102#1:243\n103#1:248\n104#1:253\n105#1:259\n134#1:265\n*E\n"})
/* loaded from: classes4.dex */
public final class LO1 implements InterfaceC2579Bq {
    @InterfaceC7058iW0
    @NotNull
    public final J82 X;
    @InterfaceC7058iW0
    @NotNull
    public final C5422bq Y;
    @InterfaceC7058iW0
    public boolean Z;

    public LO1(@NotNull J82 j82) {
        C6562gT0.p(j82, "sink");
        this.X = j82;
        this.Y = new C5422bq();
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public C5422bq B() {
        return this.Y;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq F4(long j) {
        if (!this.Z) {
            this.Y.F4(j);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public OutputStream F5() {
        return new a();
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq H4(@NotNull String str, @NotNull Charset charset) {
        C6562gT0.p(str, "string");
        C6562gT0.p(charset, C4317Th1.g);
        if (!this.Z) {
            this.Y.H4(str, charset);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq K1(@NotNull String str) {
        C6562gT0.p(str, "string");
        if (!this.Z) {
            this.Y.K1(str);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq K3(int i) {
        if (!this.Z) {
            this.Y.K3(i);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq K4(@NotNull C8859ps c8859ps) {
        C6562gT0.p(c8859ps, "byteString");
        if (!this.Z) {
            this.Y.K4(c8859ps);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public C5422bq L() {
        return this.Y;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq N0() {
        if (!this.Z) {
            long size = this.Y.size();
            if (size > 0) {
                this.X.write(this.Y, size);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq N2(@NotNull String str, int i, int i2, @NotNull Charset charset) {
        C6562gT0.p(str, "string");
        C6562gT0.p(charset, C4317Th1.g);
        if (!this.Z) {
            this.Y.N2(str, i, i2, charset);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq O2(@NotNull C8859ps c8859ps, int i, int i2) {
        C6562gT0.p(c8859ps, "byteString");
        if (!this.Z) {
            this.Y.O2(c8859ps, i, i2);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    public long Q1(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        C6562gT0.p(interfaceC7072ia2, "source");
        long j = 0;
        while (true) {
            long read = interfaceC7072ia2.read(this.Y, 8192L);
            if (read != -1) {
                j += read;
                l1();
            } else {
                return j;
            }
        }
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq R0(int i) {
        if (!this.Z) {
            this.Y.R0(i);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq S2(long j) {
        if (!this.Z) {
            this.Y.S2(j);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq X0(long j) {
        if (!this.Z) {
            this.Y.X0(j);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq Y2(@NotNull InterfaceC7072ia2 interfaceC7072ia2, long j) {
        C6562gT0.p(interfaceC7072ia2, "source");
        while (j > 0) {
            long read = interfaceC7072ia2.read(this.Y, j);
            if (read != -1) {
                j -= read;
                l1();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq Z1(@NotNull String str, int i, int i2) {
        C6562gT0.p(str, "string");
        if (!this.Z) {
            this.Y.Z1(str, i, i2);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.J82, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.Z) {
            try {
                if (this.Y.size() > 0) {
                    J82 j82 = this.X;
                    C5422bq c5422bq = this.Y;
                    j82.write(c5422bq, c5422bq.size());
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.X.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.Z = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2579Bq, o.J82, java.io.Flushable
    public void flush() {
        if (!this.Z) {
            if (this.Y.size() > 0) {
                J82 j82 = this.X;
                C5422bq c5422bq = this.Y;
                j82.write(c5422bq, c5422bq.size());
            }
            this.X.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.Z;
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq l1() {
        if (!this.Z) {
            long j = this.Y.j();
            if (j > 0) {
                this.X.write(this.Y, j);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq m4(int i) {
        if (!this.Z) {
            this.Y.m4(i);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.J82
    @NotNull
    public C8120mp2 timeout() {
        return this.X.timeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.X + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer byteBuffer) {
        C6562gT0.p(byteBuffer, "source");
        if (!this.Z) {
            int write = this.Y.write(byteBuffer);
            l1();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq writeByte(int i) {
        if (!this.Z) {
            this.Y.writeByte(i);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq writeInt(int i) {
        if (!this.Z) {
            this.Y.writeInt(i);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq writeLong(long j) {
        if (!this.Z) {
            this.Y.writeLong(j);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq writeShort(int i) {
        if (!this.Z) {
            this.Y.writeShort(i);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @InterfaceC8303na2({"SMAP\nRealBufferedSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n+ 2 RealBufferedSink.kt\nokio/RealBufferedSink\n*L\n1#1,142:1\n51#2:143\n51#2:144\n*S KotlinDebug\n*F\n+ 1 RealBufferedSink.kt\nokio/RealBufferedSink$outputStream$1\n*L\n111#1:143\n117#1:144\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            LO1.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            LO1 lo1 = LO1.this;
            if (!lo1.Z) {
                lo1.flush();
            }
        }

        @NotNull
        public String toString() {
            return LO1.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            LO1 lo1 = LO1.this;
            if (!lo1.Z) {
                lo1.Y.writeByte((byte) i);
                LO1.this.l1();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(@NotNull byte[] bArr, int i, int i2) {
            C6562gT0.p(bArr, "data");
            LO1 lo1 = LO1.this;
            if (!lo1.Z) {
                lo1.Y.write(bArr, i, i2);
                LO1.this.l1();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // o.J82
    public void write(@NotNull C5422bq c5422bq, long j) {
        C6562gT0.p(c5422bq, "source");
        if (!this.Z) {
            this.Y.write(c5422bq, j);
            l1();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq write(@NotNull byte[] bArr) {
        C6562gT0.p(bArr, "source");
        if (!this.Z) {
            this.Y.write(bArr);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    @Override // o.InterfaceC2579Bq
    @NotNull
    public InterfaceC2579Bq write(@NotNull byte[] bArr, int i, int i2) {
        C6562gT0.p(bArr, "source");
        if (!this.Z) {
            this.Y.write(bArr, i, i2);
            return l1();
        }
        throw new IllegalStateException("closed");
    }

    public static /* synthetic */ void a() {
    }
}
