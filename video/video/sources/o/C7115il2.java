package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;

/* renamed from: o.il2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7115il2 extends AbstractC8244nK1 {
    public final Serializable Z;

    public C7115il2(InputStream inputStream) {
        super(inputStream);
        this.Z = UUID.randomUUID();
    }

    @Override // o.AbstractC8244nK1
    public void h(IOException iOException) throws IOException {
        throw new C6873hl2(iOException, this.Z);
    }

    public boolean k(Throwable th) {
        return C6873hl2.c(th, this.Z);
    }

    public void l(Throwable th) throws IOException {
        C6873hl2.d(th, this.Z);
    }
}
