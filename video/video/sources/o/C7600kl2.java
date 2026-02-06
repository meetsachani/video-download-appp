package o;

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.UUID;

/* renamed from: o.kl2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7600kl2 extends AbstractC10195vK1 {
    public final Serializable X;

    public C7600kl2(Reader reader) {
        super(reader);
        this.X = UUID.randomUUID();
    }

    @Override // o.AbstractC10195vK1
    public void f(IOException iOException) throws IOException {
        throw new C6873hl2(iOException, this.X);
    }

    public boolean h(Throwable th) {
        return C6873hl2.c(th, this.X);
    }

    public void i(Throwable th) throws IOException {
        C6873hl2.d(th, this.X);
    }
}
