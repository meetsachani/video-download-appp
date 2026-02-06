package o;

/* renamed from: o.tr1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9835tr1 extends UnsupportedOperationException {
    private static final long serialVersionUID = 20131021;
    public final String X;

    public C9835tr1() {
        this.X = null;
    }

    public String a() {
        return this.X;
    }

    public C9835tr1(String str) {
        this(str, (String) null);
    }

    public C9835tr1(Throwable th) {
        this(th, (String) null);
    }

    public C9835tr1(String str, Throwable th) {
        this(str, th, null);
    }

    public C9835tr1(String str, String str2) {
        super(str);
        this.X = str2;
    }

    public C9835tr1(Throwable th, String str) {
        super(th);
        this.X = str;
    }

    public C9835tr1(String str, Throwable th, String str2) {
        super(str, th);
        this.X = str2;
    }
}
