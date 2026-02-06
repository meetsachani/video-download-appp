package o;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class VV0 implements Iterator<DV0> {
    public final OV0 X;
    public final Object Y;

    public VV0(String str) {
        this(new StringReader(str));
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public DV0 next() throws KV0 {
        if (hasNext()) {
            try {
                return C4690Xd2.a(this.X);
            } catch (OutOfMemoryError | StackOverflowError e) {
                throw new KV0("Failed parsing JSON source to Json", e);
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean z;
        synchronized (this.Y) {
            try {
                try {
                    try {
                        if (this.X.I() != XV0.END_DOCUMENT) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (A71 e) {
                        throw new WV0(e);
                    }
                } catch (IOException e2) {
                    throw new GV0(e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public VV0(Reader reader) {
        OV0 ov0 = new OV0(reader);
        this.X = ov0;
        ov0.S(EnumC7572ke2.LENIENT);
        this.Y = new Object();
    }
}
