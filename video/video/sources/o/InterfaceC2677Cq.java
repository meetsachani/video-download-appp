package o;

import com.facebook.internal.H;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.Cq */
/* loaded from: classes4.dex */
public interface InterfaceC2677Cq extends InterfaceC7072ia2, ReadableByteChannel {
    @NotNull
    C5422bq B();

    int C4() throws IOException;

    boolean D2(long j, @NotNull C8859ps c8859ps, int i, int i2) throws IOException;

    @NotNull
    C8859ps G4() throws IOException;

    long H1(@NotNull C8859ps c8859ps, long j) throws IOException;

    long H5() throws IOException;

    @NotNull
    byte[] I3() throws IOException;

    int I5(@NotNull C5205aw1 c5205aw1) throws IOException;

    @InterfaceC9150r20(level = EnumC9879u20.X, message = "moved to val: use getBuffer() instead", replaceWith = @IR1(expression = H.a.b, imports = {}))
    @NotNull
    C5422bq L();

    boolean M3() throws IOException;

    long P4(@NotNull C8859ps c8859ps) throws IOException;

    void Q2(long j) throws IOException;

    int S4() throws IOException;

    long V2(byte b) throws IOException;

    @NotNull
    String Y4() throws IOException;

    boolean a1(long j, @NotNull C8859ps c8859ps) throws IOException;

    long a4() throws IOException;

    void b1(@NotNull C5422bq c5422bq, long j) throws IOException;

    long d1(@NotNull C8859ps c8859ps, long j) throws IOException;

    @NotNull
    String d5(long j, @NotNull Charset charset) throws IOException;

    boolean e2(long j) throws IOException;

    @NotNull
    String e3(long j) throws IOException;

    long i1(byte b, long j) throws IOException;

    long j1(byte b, long j, long j2) throws IOException;

    @Nullable
    String k1() throws IOException;

    @NotNull
    String k2() throws IOException;

    long k5(@NotNull J82 j82) throws IOException;

    @NotNull
    C8859ps n3(long j) throws IOException;

    @NotNull
    byte[] o2(long j) throws IOException;

    @NotNull
    String p1(long j) throws IOException;

    @NotNull
    InterfaceC2677Cq peek();

    int read(@NotNull byte[] bArr) throws IOException;

    int read(@NotNull byte[] bArr, int i, int i2) throws IOException;

    byte readByte() throws IOException;

    void readFully(@NotNull byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    @NotNull
    InputStream s0();

    void skip(long j) throws IOException;

    long w1(@NotNull C8859ps c8859ps) throws IOException;

    short w2() throws IOException;

    @NotNull
    String y4(@NotNull Charset charset) throws IOException;

    long z2() throws IOException;
}
