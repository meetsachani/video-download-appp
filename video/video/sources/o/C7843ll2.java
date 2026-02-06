package o;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.UUID;

/* renamed from: o.ll2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7843ll2 extends C10684xK1 {
    public final Serializable X;

    public C7843ll2(Writer writer) {
        super(writer);
        this.X = UUID.randomUUID();
    }

    @Override // o.C10684xK1
    public void h(IOException iOException) throws IOException {
        throw new C6873hl2(iOException, this.X);
    }

    public boolean i(Exception exc) {
        return C6873hl2.c(exc, this.X);
    }

    public void j(Exception exc) throws IOException {
        C6873hl2.d(exc, this.X);
    }
}
