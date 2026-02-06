package o;

import android.text.TextUtils;
import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class ZL extends FilterInputStream {
    public static final int Y0 = -1;
    public static final String Z = "ContentLengthStream";
    public final long X;
    public int Y;

    public ZL(InputStream inputStream, long j) {
        super(inputStream);
        this.X = j;
    }

    public static InputStream d(InputStream inputStream, long j) {
        return new ZL(inputStream, j);
    }

    public static InputStream f(InputStream inputStream, String str) {
        return d(inputStream, h(str));
    }

    public static int h(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                if (Log.isLoggable(Z, 3)) {
                    Log.d(Z, "failed to parse content length header: " + str, e);
                    return -1;
                }
                return -1;
            }
        }
        return -1;
    }

    public final int a(int i) throws IOException {
        if (i >= 0) {
            this.Y += i;
            return i;
        } else if (this.X - this.Y <= 0) {
            return i;
        } else {
            throw new IOException("Failed to read all expected data, expected: " + this.X + ", but read: " + this.Y);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        return (int) Math.max(this.X - this.Y, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        return a(super.read(bArr, i, i2));
    }
}
