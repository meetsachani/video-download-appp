package o;

import com.facebook.internal.H;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Bq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2579Bq extends J82, WritableByteChannel {
    @NotNull
    C5422bq B();

    @NotNull
    InterfaceC2579Bq F4(long j) throws IOException;

    @NotNull
    OutputStream F5();

    @NotNull
    InterfaceC2579Bq H4(@NotNull String str, @NotNull Charset charset) throws IOException;

    @NotNull
    InterfaceC2579Bq K1(@NotNull String str) throws IOException;

    @NotNull
    InterfaceC2579Bq K3(int i) throws IOException;

    @NotNull
    InterfaceC2579Bq K4(@NotNull C8859ps c8859ps) throws IOException;

    @InterfaceC9150r20(level = EnumC9879u20.X, message = "moved to val: use getBuffer() instead", replaceWith = @IR1(expression = H.a.b, imports = {}))
    @NotNull
    C5422bq L();

    @NotNull
    InterfaceC2579Bq N0() throws IOException;

    @NotNull
    InterfaceC2579Bq N2(@NotNull String str, int i, int i2, @NotNull Charset charset) throws IOException;

    @NotNull
    InterfaceC2579Bq O2(@NotNull C8859ps c8859ps, int i, int i2) throws IOException;

    long Q1(@NotNull InterfaceC7072ia2 interfaceC7072ia2) throws IOException;

    @NotNull
    InterfaceC2579Bq R0(int i) throws IOException;

    @NotNull
    InterfaceC2579Bq S2(long j) throws IOException;

    @NotNull
    InterfaceC2579Bq X0(long j) throws IOException;

    @NotNull
    InterfaceC2579Bq Y2(@NotNull InterfaceC7072ia2 interfaceC7072ia2, long j) throws IOException;

    @NotNull
    InterfaceC2579Bq Z1(@NotNull String str, int i, int i2) throws IOException;

    @Override // o.J82, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    InterfaceC2579Bq l1() throws IOException;

    @NotNull
    InterfaceC2579Bq m4(int i) throws IOException;

    @NotNull
    InterfaceC2579Bq write(@NotNull byte[] bArr) throws IOException;

    @NotNull
    InterfaceC2579Bq write(@NotNull byte[] bArr, int i, int i2) throws IOException;

    @NotNull
    InterfaceC2579Bq writeByte(int i) throws IOException;

    @NotNull
    InterfaceC2579Bq writeInt(int i) throws IOException;

    @NotNull
    InterfaceC2579Bq writeLong(long j) throws IOException;

    @NotNull
    InterfaceC2579Bq writeShort(int i) throws IOException;
}
