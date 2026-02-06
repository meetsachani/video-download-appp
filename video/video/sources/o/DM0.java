package o;

/* loaded from: classes.dex */
public class DM0 extends Exception {
    public final int X;

    public DM0(int i, String str, Throwable th) {
        super(str, th);
        this.X = i;
    }

    public int a() {
        return this.X;
    }
}
