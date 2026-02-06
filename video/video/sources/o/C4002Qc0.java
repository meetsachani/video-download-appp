package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.Qc0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4002Qc0 {
    public static void A(byte[] bArr, int i, int i2) {
        u(bArr, i, 4);
        bArr[i] = (byte) (i2 & 255);
        bArr[i + 1] = (byte) ((i2 >> 8) & 255);
        bArr[i + 2] = (byte) ((i2 >> 16) & 255);
        bArr[i + 3] = (byte) ((i2 >> 24) & 255);
    }

    public static void B(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) (j & 255));
        outputStream.write((byte) ((j >> 8) & 255));
        outputStream.write((byte) ((j >> 16) & 255));
        outputStream.write((byte) ((j >> 24) & 255));
        outputStream.write((byte) ((j >> 32) & 255));
        outputStream.write((byte) ((j >> 40) & 255));
        outputStream.write((byte) ((j >> 48) & 255));
        outputStream.write((byte) ((j >> 56) & 255));
    }

    public static void C(byte[] bArr, int i, long j) {
        u(bArr, i, 8);
        bArr[i] = (byte) (j & 255);
        bArr[i + 1] = (byte) ((j >> 8) & 255);
        bArr[i + 2] = (byte) ((j >> 16) & 255);
        bArr[i + 3] = (byte) ((j >> 24) & 255);
        bArr[i + 4] = (byte) ((j >> 32) & 255);
        bArr[i + 5] = (byte) ((j >> 40) & 255);
        bArr[i + 6] = (byte) ((j >> 48) & 255);
        bArr[i + 7] = (byte) ((j >> 56) & 255);
    }

    public static void D(OutputStream outputStream, short s) throws IOException {
        outputStream.write((byte) (s & 255));
        outputStream.write((byte) ((s >> 8) & 255));
    }

    public static void E(byte[] bArr, int i, short s) {
        u(bArr, i, 2);
        bArr[i] = (byte) (s & 255);
        bArr[i + 1] = (byte) ((s >> 8) & 255);
    }

    public static int a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (-1 != read) {
            return read;
        }
        throw new EOFException("Unexpected EOF reached");
    }

    public static double b(InputStream inputStream) throws IOException {
        return Double.longBitsToDouble(h(inputStream));
    }

    public static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(i(bArr, i));
    }

    public static float d(InputStream inputStream) throws IOException {
        return Float.intBitsToFloat(f(inputStream));
    }

    public static float e(byte[] bArr, int i) {
        return Float.intBitsToFloat(g(bArr, i));
    }

    public static int f(InputStream inputStream) throws IOException {
        return (a(inputStream) & 255) + ((a(inputStream) & 255) << 8) + ((a(inputStream) & 255) << 16) + ((a(inputStream) & 255) << 24);
    }

    public static int g(byte[] bArr, int i) {
        u(bArr, i, 4);
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << 16) + ((bArr[i + 3] & 255) << 24);
    }

    public static long h(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) a(inputStream);
        }
        return i(bArr, 0);
    }

    public static long i(byte[] bArr, int i) {
        u(bArr, i, 8);
        return (g(bArr, i + 4) << 32) + (g(bArr, i) & 4294967295L);
    }

    public static short j(InputStream inputStream) throws IOException {
        return (short) ((a(inputStream) & 255) + ((a(inputStream) & 255) << 8));
    }

    public static short k(byte[] bArr, int i) {
        u(bArr, i, 2);
        return (short) ((bArr[i] & 255) + ((bArr[i + 1] & 255) << 8));
    }

    public static long l(InputStream inputStream) throws IOException {
        return ((a(inputStream) & 255) << 24) + (((a(inputStream) & 255) + ((a(inputStream) & 255) << 8) + ((a(inputStream) & 255) << 16)) & 4294967295L);
    }

    public static long m(byte[] bArr, int i) {
        u(bArr, i, 4);
        return ((bArr[i + 3] & 255) << 24) + (((bArr[i] & 255) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << 16)) & 4294967295L);
    }

    public static int n(InputStream inputStream) throws IOException {
        return (a(inputStream) & 255) + ((a(inputStream) & 255) << 8);
    }

    public static int o(byte[] bArr, int i) {
        u(bArr, i, 2);
        return (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8);
    }

    public static double p(double d) {
        return Double.longBitsToDouble(s(Double.doubleToLongBits(d)));
    }

    public static float q(float f) {
        return Float.intBitsToFloat(r(Float.floatToIntBits(f)));
    }

    public static int r(int i) {
        return ((i & 255) << 24) + (((i >> 8) & 255) << 16) + (((i >> 16) & 255) << 8) + ((i >> 24) & 255);
    }

    public static long s(long j) {
        return ((j & 255) << 56) + (((j >> 8) & 255) << 48) + (((j >> 16) & 255) << 40) + (((j >> 24) & 255) << 32) + (((j >> 32) & 255) << 24) + (((j >> 40) & 255) << 16) + (((j >> 48) & 255) << 8) + ((j >> 56) & 255);
    }

    public static short t(short s) {
        return (short) (((s & 255) << 8) + ((s >> 8) & 255));
    }

    public static void u(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        if (bArr.length >= i3) {
            return;
        }
        throw new IllegalArgumentException("Data only has " + bArr.length + "bytes, needed " + i3 + "bytes.");
    }

    public static void v(OutputStream outputStream, double d) throws IOException {
        B(outputStream, Double.doubleToLongBits(d));
    }

    public static void w(byte[] bArr, int i, double d) {
        C(bArr, i, Double.doubleToLongBits(d));
    }

    public static void x(OutputStream outputStream, float f) throws IOException {
        z(outputStream, Float.floatToIntBits(f));
    }

    public static void y(byte[] bArr, int i, float f) {
        A(bArr, i, Float.floatToIntBits(f));
    }

    public static void z(OutputStream outputStream, int i) throws IOException {
        outputStream.write((byte) (i & 255));
        outputStream.write((byte) ((i >> 8) & 255));
        outputStream.write((byte) ((i >> 16) & 255));
        outputStream.write((byte) ((i >> 24) & 255));
    }
}
