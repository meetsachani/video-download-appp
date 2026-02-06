package o;

import java.util.Set;

/* renamed from: o.sj2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9561sj2 extends C3349Jj2 implements InterfaceC3056Gk {
    private static final long serialVersionUID = 8084674570753837109L;

    /* renamed from: o.sj2$a */
    /* loaded from: classes4.dex */
    public class a extends C4520Vj2 {
        public final /* synthetic */ C9561sj2 Z;

        public a(C9561sj2 c9561sj2, Set set, Object obj) {
            super(set, obj);
            this.Z = c9561sj2;
        }
    }

    public C9561sj2(InterfaceC3056Gk interfaceC3056Gk) {
        super(interfaceC3056Gk);
    }

    public static InterfaceC3056Gk e(InterfaceC3056Gk interfaceC3056Gk) {
        return new C9561sj2(interfaceC3056Gk);
    }

    @Override // o.InterfaceC3056Gk
    public int I(Object obj) {
        int I;
        synchronized (this.Y) {
            I = f().I(obj);
        }
        return I;
    }

    public InterfaceC3056Gk f() {
        return (InterfaceC3056Gk) this.X;
    }

    @Override // o.InterfaceC3056Gk
    public boolean v(Object obj, int i) {
        boolean v;
        synchronized (this.Y) {
            v = f().v(obj, i);
        }
        return v;
    }

    @Override // o.InterfaceC3056Gk
    public boolean x(Object obj, int i) {
        boolean x;
        synchronized (this.Y) {
            x = f().x(obj, i);
        }
        return x;
    }

    @Override // o.InterfaceC3056Gk
    public Set y() {
        a aVar;
        synchronized (this.Y) {
            aVar = new a(this, f().y(), this.Y);
        }
        return aVar;
    }

    public C9561sj2(InterfaceC3056Gk interfaceC3056Gk, Object obj) {
        super(interfaceC3056Gk, obj);
    }
}
