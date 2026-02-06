package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLongArray;
import o.C5802dO0;
import okhttp3.HttpUrl;

@InterfaceC5601ca0
@InterfaceC11149zF0
/* renamed from: o.bg  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5382bg implements Serializable {
    private static final long serialVersionUID = 0;
    public transient AtomicLongArray X;

    public C5382bg(int i) {
        this.X = new AtomicLongArray(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        C5802dO0.c e = C5802dO0.e();
        for (int i = 0; i < readInt; i++) {
            e.a(Double.doubleToRawLongBits(objectInputStream.readDouble()));
        }
        this.X = new AtomicLongArray(e.f().z());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        int g = g();
        objectOutputStream.writeInt(g);
        for (int i = 0; i < g; i++) {
            objectOutputStream.writeDouble(c(i));
        }
    }

    @InterfaceC6181ey
    public double a(int i, double d) {
        while (true) {
            long j = this.X.get(i);
            double longBitsToDouble = Double.longBitsToDouble(j) + d;
            int i2 = i;
            if (this.X.compareAndSet(i2, j, Double.doubleToRawLongBits(longBitsToDouble))) {
                return longBitsToDouble;
            }
            i = i2;
        }
    }

    public final boolean b(int i, double d, double d2) {
        return this.X.compareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public final double c(int i) {
        return Double.longBitsToDouble(this.X.get(i));
    }

    @InterfaceC6181ey
    public final double d(int i, double d) {
        while (true) {
            long j = this.X.get(i);
            double longBitsToDouble = Double.longBitsToDouble(j);
            int i2 = i;
            if (this.X.compareAndSet(i2, j, Double.doubleToRawLongBits(longBitsToDouble + d))) {
                return longBitsToDouble;
            }
            i = i2;
        }
    }

    public final double e(int i, double d) {
        return Double.longBitsToDouble(this.X.getAndSet(i, Double.doubleToRawLongBits(d)));
    }

    public final void f(int i, double d) {
        this.X.lazySet(i, Double.doubleToRawLongBits(d));
    }

    public final int g() {
        return this.X.length();
    }

    public final void h(int i, double d) {
        this.X.set(i, Double.doubleToRawLongBits(d));
    }

    public final boolean i(int i, double d, double d2) {
        return this.X.weakCompareAndSet(i, Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public String toString() {
        int g = g();
        int i = g - 1;
        if (i == -1) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(g * 19);
        sb.append('[');
        int i2 = 0;
        while (true) {
            sb.append(Double.longBitsToDouble(this.X.get(i2)));
            if (i2 == i) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(',');
            sb.append(' ');
            i2++;
        }
    }

    public C5382bg(double[] dArr) {
        int length = dArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = Double.doubleToRawLongBits(dArr[i]);
        }
        this.X = new AtomicLongArray(jArr);
    }
}
