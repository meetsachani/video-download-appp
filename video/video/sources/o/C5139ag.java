package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

@InterfaceC5601ca0
/* renamed from: o.ag  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5139ag extends Number implements Serializable {
    private static final long serialVersionUID = 0;
    public transient AtomicLong X;

    public C5139ag(double d) {
        this.X = new AtomicLong(Double.doubleToRawLongBits(d));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = new AtomicLong();
        g(objectInputStream.readDouble());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeDouble(c());
    }

    @InterfaceC6181ey
    public final double a(double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.X.get();
            longBitsToDouble = Double.longBitsToDouble(j) + d;
        } while (!this.X.compareAndSet(j, Double.doubleToRawLongBits(longBitsToDouble)));
        return longBitsToDouble;
    }

    public final boolean b(double d, double d2) {
        return this.X.compareAndSet(Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    public final double c() {
        return Double.longBitsToDouble(this.X.get());
    }

    @InterfaceC6181ey
    public final double d(double d) {
        long j;
        double longBitsToDouble;
        do {
            j = this.X.get();
            longBitsToDouble = Double.longBitsToDouble(j);
        } while (!this.X.compareAndSet(j, Double.doubleToRawLongBits(longBitsToDouble + d)));
        return longBitsToDouble;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return c();
    }

    public final double e(double d) {
        return Double.longBitsToDouble(this.X.getAndSet(Double.doubleToRawLongBits(d)));
    }

    public final void f(double d) {
        this.X.lazySet(Double.doubleToRawLongBits(d));
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) c();
    }

    public final void g(double d) {
        this.X.set(Double.doubleToRawLongBits(d));
    }

    public final boolean h(double d, double d2) {
        return this.X.weakCompareAndSet(Double.doubleToRawLongBits(d), Double.doubleToRawLongBits(d2));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) c();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) c();
    }

    public String toString() {
        return Double.toString(c());
    }

    public C5139ag() {
        this(0.0d);
    }
}
