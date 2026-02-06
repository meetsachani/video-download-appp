package o;

import com.google.firebase.crashlytics.internal.common.IdManager;
import java.io.File;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

/* renamed from: o.hN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6780hN {
    public static final Integer j = new Integer(0);
    public static final Character k = new Character(' ');
    @Deprecated
    public static Short l = new Short((short) 0);
    public final HJ2<Class<?>, InterfaceC7507kN> a;
    public final J31 b;
    @Deprecated
    public Boolean c;
    @Deprecated
    public Byte d;
    @Deprecated
    public Character e;
    @Deprecated
    public Double f;
    @Deprecated
    public Float g;
    @Deprecated
    public Integer h;
    @Deprecated
    public Long i;

    public C6780hN() {
        HJ2<Class<?>, InterfaceC7507kN> hj2 = new HJ2<>();
        this.a = hj2;
        this.b = U31.q(C6282fN.class);
        this.c = Boolean.FALSE;
        this.d = new Byte((byte) 0);
        this.e = new Character(' ');
        this.f = new Double(0.0d);
        this.g = new Float(0.0f);
        this.h = new Integer(0);
        this.i = new Long(0L);
        hj2.l(false);
        e();
        hj2.l(true);
    }

    public static C6780hN o() {
        return C3749Nm.m().i();
    }

    @Deprecated
    public void A(byte b) {
        this.d = new Byte(b);
        s(new C4947Zr(this.d), Byte.TYPE);
        s(new C4947Zr(this.d), Byte.class);
    }

    @Deprecated
    public void B(char c) {
        Character ch = new Character(c);
        this.e = ch;
        s(new C8693pB(ch), Character.TYPE);
        s(new C8693pB(this.e), Character.class);
    }

    @Deprecated
    public void C(double d) {
        this.f = new Double(d);
        s(new C4998a50(this.f), Double.TYPE);
        s(new C4998a50(this.f), Double.class);
    }

    @Deprecated
    public void D(float f) {
        this.g = new Float(f);
        s(new C6911hv0(this.g), Float.TYPE);
        s(new C6911hv0(this.g), Float.class);
    }

    @Deprecated
    public void E(int i) {
        this.h = new Integer(i);
        s(new MR0(this.h), Integer.TYPE);
        s(new MR0(this.h), Integer.class);
    }

    @Deprecated
    public void F(long j2) {
        this.i = new Long(j2);
        s(new D41(this.i), Long.TYPE);
        s(new D41(this.i), Long.class);
    }

    @Deprecated
    public void G(short s) {
        l = new Short(s);
        s(new C10378w42(l), Short.TYPE);
        s(new C10378w42(l), Short.class);
    }

    public Object a(Object obj, Class<?> cls) {
        Class<?> cls2;
        if (obj == null) {
            cls2 = null;
        } else {
            cls2 = obj.getClass();
        }
        if (this.b.c()) {
            if (obj == null) {
                J31 j31 = this.b;
                j31.a("Convert null value to type '" + cls.getName() + "'");
            } else {
                J31 j312 = this.b;
                j312.a("Convert type '" + cls2.getName() + "' value '" + obj + "' to type '" + cls.getName() + "'");
            }
        }
        InterfaceC7507kN q = q(cls2, cls);
        if (q != null) {
            if (this.b.f()) {
                J31 j313 = this.b;
                j313.r("  Using converter " + q);
            }
            obj = q.b(cls, obj);
        }
        if (String.class.equals(cls) && obj != null && !(obj instanceof String)) {
            InterfaceC7507kN p = p(String.class);
            if (p != null) {
                if (this.b.f()) {
                    J31 j314 = this.b;
                    j314.r("  Using converter " + p);
                }
                obj = p.b(String.class, obj);
            }
            if (obj != null && !(obj instanceof String)) {
                return obj.toString();
            }
            return obj;
        }
        return obj;
    }

    public Object b(String str, Class<?> cls) {
        if (this.b.c()) {
            J31 j31 = this.b;
            j31.a("Convert string '" + str + "' to class '" + cls.getName() + "'");
        }
        InterfaceC7507kN p = p(cls);
        if (p == null) {
            p = p(String.class);
        }
        if (this.b.f()) {
            J31 j312 = this.b;
            j312.r("  Using converter " + p);
        }
        return p.b(cls, str);
    }

    public Object c(String[] strArr, Class<?> cls) {
        if (cls.isArray()) {
            cls = cls.getComponentType();
        }
        if (this.b.c()) {
            J31 j31 = this.b;
            j31.a("Convert String[" + strArr.length + "] to class '" + cls.getName() + "[]'");
        }
        InterfaceC7507kN p = p(cls);
        if (p == null) {
            p = p(String.class);
        }
        if (this.b.f()) {
            J31 j312 = this.b;
            j312.r("  Using converter " + p);
        }
        Object newInstance = Array.newInstance(cls, strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            Array.set(newInstance, i, p.b(cls, strArr[i]));
        }
        return newInstance;
    }

    public String d(Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        if (obj.getClass().isArray()) {
            if (Array.getLength(obj) < 1 || (obj2 = Array.get(obj, 0)) == null) {
                return null;
            }
            return (String) p(String.class).b(String.class, obj2);
        }
        return (String) p(String.class).b(String.class, obj);
    }

    public void e() {
        this.a.clear();
        x(false);
        y(false, false);
        w(true);
        v(false, 0);
        r(BigDecimal.class, new C5410bn());
        r(BigInteger.class, new C6137en());
    }

    public void f(Class<?> cls) {
        this.a.remove(cls);
    }

    @Deprecated
    public boolean g() {
        return this.c.booleanValue();
    }

    @Deprecated
    public byte h() {
        return this.d.byteValue();
    }

    @Deprecated
    public char i() {
        return this.e.charValue();
    }

    @Deprecated
    public double j() {
        return this.f.doubleValue();
    }

    @Deprecated
    public float k() {
        return this.g.floatValue();
    }

    @Deprecated
    public int l() {
        return this.h.intValue();
    }

    @Deprecated
    public long m() {
        return this.i.longValue();
    }

    @Deprecated
    public short n() {
        return l.shortValue();
    }

    public InterfaceC7507kN p(Class<?> cls) {
        return this.a.get(cls);
    }

    public InterfaceC7507kN q(Class<?> cls, Class<?> cls2) {
        InterfaceC7507kN p;
        if (cls2 != null) {
            if (cls == null) {
                return p(cls2);
            }
            if (cls2 == String.class) {
                InterfaceC7507kN p2 = p(cls);
                if (p2 == null && (cls.isArray() || Collection.class.isAssignableFrom(cls))) {
                    p2 = p(String[].class);
                }
                if (p2 == null) {
                    return p(String.class);
                }
                return p2;
            } else if (cls2 == String[].class) {
                if (!cls.isArray() && !Collection.class.isAssignableFrom(cls)) {
                    p = null;
                } else {
                    p = p(cls);
                }
                if (p == null) {
                    return p(String[].class);
                }
                return p;
            } else {
                return p(cls2);
            }
        }
        throw new IllegalArgumentException("Target type is missing");
    }

    public final void r(Class<?> cls, InterfaceC7507kN interfaceC7507kN) {
        s(new C9484sP(interfaceC7507kN), cls);
    }

    public void s(InterfaceC7507kN interfaceC7507kN, Class<?> cls) {
        this.a.put(cls, interfaceC7507kN);
    }

    public void t(boolean z, boolean z2, int i) {
        x(z);
        y(z, z2);
        w(z);
        v(z, i);
    }

    public final void u(Class<?> cls, InterfaceC7507kN interfaceC7507kN, boolean z, int i) {
        C6599ge c6599ge;
        Class<?> cls2 = Array.newInstance(cls, 0).getClass();
        if (z) {
            c6599ge = new C6599ge(cls2, interfaceC7507kN);
        } else {
            c6599ge = new C6599ge(cls2, interfaceC7507kN, i);
        }
        r(cls2, c6599ge);
    }

    public final void v(boolean z, int i) {
        u(Boolean.TYPE, new C3562Lo(), z, i);
        u(Byte.TYPE, new C4947Zr(), z, i);
        u(Character.TYPE, new C8693pB(), z, i);
        u(Double.TYPE, new C4998a50(), z, i);
        u(Float.TYPE, new C6911hv0(), z, i);
        u(Integer.TYPE, new MR0(), z, i);
        u(Long.TYPE, new D41(), z, i);
        u(Short.TYPE, new C10378w42(), z, i);
        u(BigDecimal.class, new C5410bn(), z, i);
        u(BigInteger.class, new C6137en(), z, i);
        u(Boolean.class, new C3562Lo(), z, i);
        u(Byte.class, new C4947Zr(), z, i);
        u(Character.class, new C8693pB(), z, i);
        u(Double.class, new C4998a50(), z, i);
        u(Float.class, new C6911hv0(), z, i);
        u(Integer.class, new MR0(), z, i);
        u(Long.class, new D41(), z, i);
        u(Short.class, new C10378w42(), z, i);
        u(String.class, new C8563oe2(), z, i);
        u(Class.class, new YC(), z, i);
        u(Date.class, new C6070eV(), z, i);
        u(Calendar.class, new C6070eV(), z, i);
        u(File.class, new C4732Xo0(), z, i);
        u(java.sql.Date.class, new C6590gb2(), z, i);
        u(Time.class, new C7317jb2(), z, i);
        u(Timestamp.class, new C8064mb2(), z, i);
        u(URL.class, new Px2(), z, i);
    }

    public final void w(boolean z) {
        YC yc;
        C6070eV c6070eV;
        C10084ut c10084ut;
        C4732Xo0 c4732Xo0;
        C6590gb2 c6590gb2;
        C7317jb2 c7317jb2;
        C8064mb2 c8064mb2;
        Px2 px2;
        if (z) {
            yc = new YC();
        } else {
            yc = new YC(null);
        }
        r(Class.class, yc);
        if (z) {
            c6070eV = new C6070eV();
        } else {
            c6070eV = new C6070eV(null);
        }
        r(Date.class, c6070eV);
        if (z) {
            c10084ut = new C10084ut();
        } else {
            c10084ut = new C10084ut(null);
        }
        r(Calendar.class, c10084ut);
        if (z) {
            c4732Xo0 = new C4732Xo0();
        } else {
            c4732Xo0 = new C4732Xo0(null);
        }
        r(File.class, c4732Xo0);
        if (z) {
            c6590gb2 = new C6590gb2();
        } else {
            c6590gb2 = new C6590gb2(null);
        }
        r(java.sql.Date.class, c6590gb2);
        if (z) {
            c7317jb2 = new C7317jb2();
        } else {
            c7317jb2 = new C7317jb2(null);
        }
        r(Time.class, c7317jb2);
        if (z) {
            c8064mb2 = new C8064mb2();
        } else {
            c8064mb2 = new C8064mb2(null);
        }
        r(Timestamp.class, c8064mb2);
        if (z) {
            px2 = new Px2();
        } else {
            px2 = new Px2(null);
        }
        r(URL.class, px2);
    }

    public final void x(boolean z) {
        C3562Lo c3562Lo;
        C4947Zr c4947Zr;
        C8693pB c8693pB;
        C4998a50 c4998a50;
        C6911hv0 c6911hv0;
        MR0 mr0;
        D41 d41;
        C10378w42 c10378w42;
        if (z) {
            c3562Lo = new C3562Lo();
        } else {
            c3562Lo = new C3562Lo(Boolean.FALSE);
        }
        r(Boolean.TYPE, c3562Lo);
        if (z) {
            c4947Zr = new C4947Zr();
        } else {
            c4947Zr = new C4947Zr(j);
        }
        r(Byte.TYPE, c4947Zr);
        if (z) {
            c8693pB = new C8693pB();
        } else {
            c8693pB = new C8693pB(k);
        }
        r(Character.TYPE, c8693pB);
        if (z) {
            c4998a50 = new C4998a50();
        } else {
            c4998a50 = new C4998a50(j);
        }
        r(Double.TYPE, c4998a50);
        if (z) {
            c6911hv0 = new C6911hv0();
        } else {
            c6911hv0 = new C6911hv0(j);
        }
        r(Float.TYPE, c6911hv0);
        if (z) {
            mr0 = new MR0();
        } else {
            mr0 = new MR0(j);
        }
        r(Integer.TYPE, mr0);
        if (z) {
            d41 = new D41();
        } else {
            d41 = new D41(j);
        }
        r(Long.TYPE, d41);
        if (z) {
            c10378w42 = new C10378w42();
        } else {
            c10378w42 = new C10378w42(j);
        }
        r(Short.TYPE, c10378w42);
    }

    public final void y(boolean z, boolean z2) {
        Integer num;
        BigDecimal bigDecimal;
        BigInteger bigInteger;
        Boolean bool;
        Character ch;
        C5410bn c5410bn;
        C6137en c6137en;
        C3562Lo c3562Lo;
        C4947Zr c4947Zr;
        C8693pB c8693pB;
        C4998a50 c4998a50;
        C6911hv0 c6911hv0;
        MR0 mr0;
        D41 d41;
        C10378w42 c10378w42;
        C8563oe2 c8563oe2;
        String str = null;
        if (z2) {
            num = null;
        } else {
            num = j;
        }
        if (z2) {
            bigDecimal = null;
        } else {
            bigDecimal = new BigDecimal(IdManager.g);
        }
        if (z2) {
            bigInteger = null;
        } else {
            bigInteger = new BigInteger("0");
        }
        if (z2) {
            bool = null;
        } else {
            bool = Boolean.FALSE;
        }
        if (z2) {
            ch = null;
        } else {
            ch = k;
        }
        if (!z2) {
            str = "";
        }
        if (z) {
            c5410bn = new C5410bn();
        } else {
            c5410bn = new C5410bn(bigDecimal);
        }
        r(BigDecimal.class, c5410bn);
        if (z) {
            c6137en = new C6137en();
        } else {
            c6137en = new C6137en(bigInteger);
        }
        r(BigInteger.class, c6137en);
        if (z) {
            c3562Lo = new C3562Lo();
        } else {
            c3562Lo = new C3562Lo(bool);
        }
        r(Boolean.class, c3562Lo);
        if (z) {
            c4947Zr = new C4947Zr();
        } else {
            c4947Zr = new C4947Zr(num);
        }
        r(Byte.class, c4947Zr);
        if (z) {
            c8693pB = new C8693pB();
        } else {
            c8693pB = new C8693pB(ch);
        }
        r(Character.class, c8693pB);
        if (z) {
            c4998a50 = new C4998a50();
        } else {
            c4998a50 = new C4998a50(num);
        }
        r(Double.class, c4998a50);
        if (z) {
            c6911hv0 = new C6911hv0();
        } else {
            c6911hv0 = new C6911hv0(num);
        }
        r(Float.class, c6911hv0);
        if (z) {
            mr0 = new MR0();
        } else {
            mr0 = new MR0(num);
        }
        r(Integer.class, mr0);
        if (z) {
            d41 = new D41();
        } else {
            d41 = new D41(num);
        }
        r(Long.class, d41);
        if (z) {
            c10378w42 = new C10378w42();
        } else {
            c10378w42 = new C10378w42(num);
        }
        r(Short.class, c10378w42);
        if (z) {
            c8563oe2 = new C8563oe2();
        } else {
            c8563oe2 = new C8563oe2(str);
        }
        r(String.class, c8563oe2);
    }

    @Deprecated
    public void z(boolean z) {
        Boolean bool;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        this.c = bool;
        s(new C3562Lo(this.c), Boolean.TYPE);
        s(new C3562Lo(this.c), Boolean.class);
    }
}
