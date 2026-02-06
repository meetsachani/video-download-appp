package o;

import java.io.IOException;
import java.io.Serializable;

/* renamed from: o.hl2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6873hl2 extends GJ0 {
    private static final long serialVersionUID = -6994123481142850163L;
    public final Serializable X;

    public C6873hl2(IOException iOException, Serializable serializable) {
        super(iOException.getMessage(), iOException);
        this.X = serializable;
    }

    public static boolean c(Throwable th, Object obj) {
        if (obj != null && (th instanceof C6873hl2) && obj.equals(((C6873hl2) th).X)) {
            return true;
        }
        return false;
    }

    public static void d(Throwable th, Object obj) throws IOException {
        if (!c(th, obj)) {
            return;
        }
        throw ((C6873hl2) th).getCause();
    }

    @Override // java.lang.Throwable
    /* renamed from: a */
    public synchronized IOException getCause() {
        return (IOException) super.getCause();
    }

    public Serializable b() {
        return this.X;
    }
}
