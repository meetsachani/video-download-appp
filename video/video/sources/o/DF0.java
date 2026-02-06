package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

@InterfaceC8303na2({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,220:1\n1#2:221\n62#3:222\n62#3:224\n62#3:226\n62#3:227\n62#3:228\n62#3:230\n62#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n89#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"})
/* loaded from: classes4.dex */
public final class DF0 implements InterfaceC7072ia2 {
    public byte X;
    @NotNull
    public final MO1 Y;
    @NotNull
    public final AP0 Y0;
    @NotNull
    public final Inflater Z;
    @NotNull
    public final CRC32 Z0;

    public DF0(@NotNull InterfaceC7072ia2 interfaceC7072ia2) {
        C6562gT0.p(interfaceC7072ia2, "source");
        MO1 mo1 = new MO1(interfaceC7072ia2);
        this.Y = mo1;
        Inflater inflater = new Inflater(true);
        this.Z = inflater;
        this.Y0 = new AP0((InterfaceC2677Cq) mo1, inflater);
        this.Z0 = new CRC32();
    }

    public final void a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        C6562gT0.o(format, "format(this, *args)");
        throw new IOException(format);
    }

    @Override // o.InterfaceC7072ia2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.Y0.close();
    }

    public final void d() throws IOException {
        boolean z;
        this.Y.Q2(10L);
        byte x = this.Y.Y.x(3L);
        if (((x >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            h(this.Y.Y, 0L, 10L);
        }
        a("ID1ID2", 8075, this.Y.readShort());
        this.Y.skip(8L);
        if (((x >> 2) & 1) == 1) {
            this.Y.Q2(2L);
            if (z) {
                h(this.Y.Y, 0L, 2L);
            }
            long w2 = this.Y.Y.w2() & Xx2.Y0;
            this.Y.Q2(w2);
            if (z) {
                h(this.Y.Y, 0L, w2);
            }
            this.Y.skip(w2);
        }
        if (((x >> 3) & 1) == 1) {
            long V2 = this.Y.V2((byte) 0);
            if (V2 != -1) {
                if (z) {
                    h(this.Y.Y, 0L, V2 + 1);
                }
                this.Y.skip(V2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((x >> 4) & 1) == 1) {
            long V22 = this.Y.V2((byte) 0);
            if (V22 != -1) {
                if (z) {
                    h(this.Y.Y, 0L, V22 + 1);
                }
                this.Y.skip(V22 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            a("FHCRC", this.Y.w2(), (short) this.Z0.getValue());
            this.Z0.reset();
        }
    }

    public final void f() throws IOException {
        a("CRC", this.Y.S4(), (int) this.Z0.getValue());
        a("ISIZE", this.Y.S4(), (int) this.Z.getBytesWritten());
    }

    public final void h(C5422bq c5422bq, long j, long j2) {
        int i;
        PZ1 pz1 = c5422bq.X;
        C6562gT0.m(pz1);
        while (true) {
            int i2 = pz1.c;
            int i3 = pz1.b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            pz1 = pz1.f;
            C6562gT0.m(pz1);
        }
        while (j2 > 0) {
            int min = (int) Math.min(pz1.c - i, j2);
            this.Z0.update(pz1.a, (int) (pz1.b + j), min);
            j2 -= min;
            pz1 = pz1.f;
            C6562gT0.m(pz1);
            j = 0;
        }
    }

    @Override // o.InterfaceC7072ia2
    public long read(@NotNull C5422bq c5422bq, long j) throws IOException {
        DF0 df0;
        C6562gT0.p(c5422bq, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            if (i == 0) {
                return 0L;
            }
            if (this.X == 0) {
                d();
                this.X = (byte) 1;
            }
            if (this.X == 1) {
                long size = c5422bq.size();
                long read = this.Y0.read(c5422bq, j);
                if (read != -1) {
                    h(c5422bq, size, read);
                    return read;
                }
                df0 = this;
                df0.X = (byte) 2;
            } else {
                df0 = this;
            }
            if (df0.X == 2) {
                f();
                df0.X = (byte) 3;
                if (!df0.Y.M3()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // o.InterfaceC7072ia2
    @NotNull
    public C8120mp2 timeout() {
        return this.Y.timeout();
    }
}
