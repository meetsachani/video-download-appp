package o;

import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public class LU extends IOException {
    @Deprecated
    public static final int Y = 2008;
    public final int X;

    public LU(int i) {
        this.X = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(IOException iOException) {
        for (IOException iOException2 = iOException; iOException2 != null; iOException2 = iOException2.getCause()) {
            if ((iOException2 instanceof LU) && ((LU) iOException2).X == 2008) {
                return true;
            }
        }
        return false;
    }

    public LU(@InterfaceC11300zs1 Throwable th, int i) {
        super(th);
        this.X = i;
    }

    public LU(@InterfaceC11300zs1 String str, int i) {
        super(str);
        this.X = i;
    }

    public LU(@InterfaceC11300zs1 String str, @InterfaceC11300zs1 Throwable th, int i) {
        super(str, th);
        this.X = i;
    }
}
