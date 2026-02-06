package o;

import java.io.IOException;
import java.io.InputStream;
import o.AbstractC8244nK1;

@Deprecated
/* loaded from: classes4.dex */
public class JQ extends AbstractC8244nK1 {
    public long Z;

    public JQ(InputStream inputStream) {
        super(inputStream);
    }

    @Override // o.AbstractC8244nK1
    public synchronized void a(int i) throws IOException {
        if (i != -1) {
            try {
                this.Z += i;
            } catch (Throwable th) {
                throw th;
            }
        }
        super.a(i);
    }

    @Deprecated
    public int getCount() {
        long k = k();
        if (k <= 2147483647L) {
            return (int) k;
        }
        throw new ArithmeticException("The byte count " + k + " is too large to be converted to an int");
    }

    public synchronized long k() {
        return this.Z;
    }

    public synchronized long l() {
        long j;
        j = this.Z;
        this.Z = 0L;
        return j;
    }

    @Deprecated
    public int m() {
        long l = l();
        if (l <= 2147483647L) {
            return (int) l;
        }
        throw new ArithmeticException("The byte count " + l + " is too large to be converted to an int");
    }

    @Override // o.AbstractC8244nK1, java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j) throws IOException {
        long skip;
        skip = super.skip(j);
        this.Z += skip;
        return skip;
    }

    public JQ(InputStream inputStream, AbstractC8244nK1.a<?, ?> aVar) {
        super(inputStream, aVar);
    }

    public JQ(AbstractC8244nK1.a<?, ?> aVar) throws IOException {
        super(aVar);
    }
}
