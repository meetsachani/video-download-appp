package o;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* renamed from: o.Dt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2787Dt implements InterfaceC11215zW0, Serializable {
    @InterfaceC6480g82(version = "1.1")
    public static final Object b1 = a.X;
    public transient InterfaceC11215zW0 X;
    @InterfaceC6480g82(version = "1.1")
    public final Object Y;
    @InterfaceC6480g82(version = "1.4")
    public final String Y0;
    @InterfaceC6480g82(version = "1.4")
    public final Class Z;
    @InterfaceC6480g82(version = "1.4")
    public final String Z0;
    @InterfaceC6480g82(version = "1.4")
    public final boolean a1;

    @InterfaceC6480g82(version = "1.2")
    /* renamed from: o.Dt$a */
    /* loaded from: classes3.dex */
    public static class a implements Serializable {
        public static final a X = new a();

        private Object readResolve() throws ObjectStreamException {
            return X;
        }
    }

    public AbstractC2787Dt() {
        this(b1);
    }

    @Override // o.InterfaceC11215zW0
    public XW0 H() {
        return p0().H();
    }

    @Override // o.InterfaceC11215zW0
    @InterfaceC6480g82(version = "1.1")
    public EnumC5592cX0 c() {
        return p0().c();
    }

    @Override // o.InterfaceC11215zW0
    @InterfaceC6480g82(version = "1.1")
    public boolean d() {
        return p0().d();
    }

    @Override // o.InterfaceC11215zW0
    @InterfaceC6480g82(version = "1.3")
    public boolean e() {
        return p0().e();
    }

    @Override // o.InterfaceC11215zW0
    @InterfaceC6480g82(version = "1.1")
    public boolean g() {
        return p0().g();
    }

    @Override // o.InterfaceC10972yW0
    public List<Annotation> getAnnotations() {
        return p0().getAnnotations();
    }

    @Override // o.InterfaceC11215zW0
    public String getName() {
        return this.Y0;
    }

    @Override // o.InterfaceC11215zW0
    public List<SW0> getParameters() {
        return p0().getParameters();
    }

    @Override // o.InterfaceC11215zW0
    @InterfaceC6480g82(version = "1.1")
    public List<ZW0> getTypeParameters() {
        return p0().getTypeParameters();
    }

    @Override // o.InterfaceC11215zW0
    @InterfaceC6480g82(version = "1.1")
    public boolean isOpen() {
        return p0().isOpen();
    }

    @Override // o.InterfaceC11215zW0
    public Object j0(Object... objArr) {
        return p0().j0(objArr);
    }

    @InterfaceC6480g82(version = "1.1")
    public InterfaceC11215zW0 l0() {
        InterfaceC11215zW0 interfaceC11215zW0 = this.X;
        if (interfaceC11215zW0 == null) {
            InterfaceC11215zW0 m0 = m0();
            this.X = m0;
            return m0;
        }
        return interfaceC11215zW0;
    }

    public abstract InterfaceC11215zW0 m0();

    @InterfaceC6480g82(version = "1.1")
    public Object n0() {
        return this.Y;
    }

    public EW0 o0() {
        Class cls = this.Z;
        if (cls == null) {
            return null;
        }
        if (this.a1) {
            return C6551gQ1.g(cls);
        }
        return C6551gQ1.d(cls);
    }

    @InterfaceC6480g82(version = "1.1")
    public InterfaceC11215zW0 p0() {
        InterfaceC11215zW0 l0 = l0();
        if (l0 != this) {
            return l0;
        }
        throw new VX0();
    }

    public String q0() {
        return this.Z0;
    }

    @Override // o.InterfaceC11215zW0
    public Object u(Map map) {
        return p0().u(map);
    }

    @InterfaceC6480g82(version = "1.1")
    public AbstractC2787Dt(Object obj) {
        this(obj, null, null, null, false);
    }

    @InterfaceC6480g82(version = "1.4")
    public AbstractC2787Dt(Object obj, Class cls, String str, String str2, boolean z) {
        this.Y = obj;
        this.Z = cls;
        this.Y0 = str;
        this.Z0 = str2;
        this.a1 = z;
    }
}
