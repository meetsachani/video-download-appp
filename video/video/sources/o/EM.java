package o;

import java.util.List;
import java.util.Set;

/* loaded from: classes4.dex */
public class EM extends Exception implements InterfaceC7331jf0 {
    private static final long serialVersionUID = 20110706;
    public final InterfaceC7331jf0 X;

    public EM() {
        this.X = new SY();
    }

    @Override // o.InterfaceC7331jf0
    public Set<String> a() {
        return this.X.a();
    }

    @Override // o.InterfaceC7331jf0
    public List<AbstractC4280Sx1<String, Object>> b() {
        return this.X.b();
    }

    @Override // o.InterfaceC7331jf0
    public String c(String str) {
        return this.X.c(str);
    }

    @Override // o.InterfaceC7331jf0
    public Object d(String str) {
        return this.X.d(str);
    }

    @Override // o.InterfaceC7331jf0
    public List<Object> f(String str) {
        return this.X.f(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return c(super.getMessage());
    }

    @Override // o.InterfaceC7331jf0
    /* renamed from: h */
    public EM e(String str, Object obj) {
        this.X.e(str, obj);
        return this;
    }

    public String i() {
        return super.getMessage();
    }

    @Override // o.InterfaceC7331jf0
    /* renamed from: j */
    public EM g(String str, Object obj) {
        this.X.g(str, obj);
        return this;
    }

    public EM(String str) {
        super(str);
        this.X = new SY();
    }

    public EM(Throwable th) {
        super(th);
        this.X = new SY();
    }

    public EM(String str, Throwable th) {
        super(str, th);
        this.X = new SY();
    }

    public EM(String str, Throwable th, InterfaceC7331jf0 interfaceC7331jf0) {
        super(str, th);
        this.X = interfaceC7331jf0 == null ? new SY() : interfaceC7331jf0;
    }
}
