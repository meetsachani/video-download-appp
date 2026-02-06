package o;

import java.io.OutputStream;

/* loaded from: classes4.dex */
public class LQ extends C9952uK1 {
    public long X;

    public LQ(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // o.C9952uK1
    public synchronized void d(int i) {
        this.X += i;
    }

    public int getCount() {
        long m = m();
        if (m <= 2147483647L) {
            return (int) m;
        }
        throw new ArithmeticException("The byte count " + m + " is too large to be converted to an int");
    }

    public synchronized long m() {
        return this.X;
    }

    public synchronized long n() {
        long j;
        j = this.X;
        this.X = 0L;
        return j;
    }

    public int o() {
        long n = n();
        if (n <= 2147483647L) {
            return (int) n;
        }
        throw new ArithmeticException("The byte count " + n + " is too large to be converted to an int");
    }
}
