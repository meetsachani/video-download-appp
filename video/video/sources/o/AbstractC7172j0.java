package o;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.util.function.IntPredicate;

/* renamed from: o.j0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7172j0 extends FilterReader {
    public static final IntPredicate Y = new IntPredicate() { // from class: o.i0
        @Override // java.util.function.IntPredicate
        public final boolean test(int i) {
            return AbstractC7172j0.a(i);
        }
    };
    public final IntPredicate X;

    public AbstractC7172j0(Reader reader) {
        this(reader, Y);
    }

    public static /* synthetic */ boolean a(int i) {
        return false;
    }

    public boolean d(int i) {
        return this.X.test(i);
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int read;
        do {
            read = ((FilterReader) this).in.read();
            if (read == -1) {
                break;
            }
        } while (d(read));
        return read;
    }

    public AbstractC7172j0(Reader reader, IntPredicate intPredicate) {
        super(reader);
        this.X = intPredicate == null ? Y : intPredicate;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int read = super.read(cArr, i, i2);
        if (read == -1) {
            return -1;
        }
        int i3 = i - 1;
        for (int i4 = i; i4 < i + read; i4++) {
            if (!d(cArr[i4]) && (i3 = i3 + 1) < i4) {
                cArr[i3] = cArr[i4];
            }
        }
        return (i3 - i) + 1;
    }
}
