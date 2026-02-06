package o;

/* renamed from: o.Is  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3284Is extends Exception {
    public final String X;
    public final int Y;
    public final String Z;

    public C3284Is(String str, C2783Ds c2783Ds) {
        super(str);
        this.X = str;
        if (c2783Ds != null) {
            this.Z = c2783Ds.w();
            this.Y = c2783Ds.p();
            return;
        }
        this.Z = "unknown";
        this.Y = 0;
    }

    public String a() {
        return this.X + " (" + this.Z + " at line " + this.Y + C9811tl1.d;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}
