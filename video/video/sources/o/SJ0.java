package o;

import java.io.IOException;

/* loaded from: classes4.dex */
public class SJ0 extends IOException {
    private static final long serialVersionUID = 1;
    public final int X;

    public SJ0(int i, Throwable th) {
        super(b(i, th), th);
        this.X = i;
    }

    public static String b(int i, Throwable th) {
        String simpleName;
        String str = "Null";
        if (th == null) {
            simpleName = "Null";
        } else {
            simpleName = th.getClass().getSimpleName();
        }
        if (th != null) {
            str = th.getMessage();
        }
        return String.format("%s #%,d: %s", simpleName, Integer.valueOf(i), str);
    }

    public int a() {
        return this.X;
    }
}
