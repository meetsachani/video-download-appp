package o;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* renamed from: o.g41  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6463g41 extends Writer {
    public final String X;
    public StringBuilder Y = new StringBuilder(128);

    public C6463g41(String str) {
        this.X = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        if (this.Y.length() > 0) {
            Log.d(this.X, this.Y.toString());
            StringBuilder sb = this.Y;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                d();
            } else {
                this.Y.append(c);
            }
        }
    }
}
