package o;

/* loaded from: classes3.dex */
public class JR extends PR {
    private static final long serialVersionUID = 1;
    public final Class<?> Y0;
    public final transient Object Z;

    public JR() {
        this.Z = null;
        this.Y0 = null;
    }

    public Class<?> e() {
        return this.Y0;
    }

    public Object f() {
        return this.Z;
    }

    public JR(Object obj, Class<?> cls) {
        this.Z = obj;
        this.Y0 = cls;
    }

    public JR(String str) {
        super(str);
        this.Z = null;
        this.Y0 = null;
    }

    public JR(Object obj, Class<?> cls, String str) {
        super(str);
        this.Z = obj;
        this.Y0 = cls;
    }
}
