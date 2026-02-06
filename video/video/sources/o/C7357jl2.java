package o;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.UUID;

/* renamed from: o.jl2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7357jl2 extends C9952uK1 {
    public final Serializable X;

    public C7357jl2(OutputStream outputStream) {
        super(outputStream);
        this.X = UUID.randomUUID();
    }

    @Override // o.C9952uK1
    public void f(IOException iOException) throws IOException {
        throw new C6873hl2(iOException, this.X);
    }

    public boolean m(Exception exc) {
        return C6873hl2.c(exc, this.X);
    }

    public void n(Exception exc) throws IOException {
        C6873hl2.d(exc, this.X);
    }
}
