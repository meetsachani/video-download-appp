package o;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public class AN2 implements InterfaceC10878y80, Serializable {
    public transient BN2 X;
    public Object Y;

    public AN2(Object obj) {
        this(obj, null);
    }

    public C80 a(String str) {
        C80 p = d().p(str);
        if (p != null) {
            return p;
        }
        throw new IllegalArgumentException("Invalid property name '" + str + "'");
    }

    public Object b() {
        return this.Y;
    }

    @Override // o.InterfaceC10878y80
    public Object c(String str, String str2) {
        try {
            return e().k(this.Y, str, str2);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            throw new IllegalArgumentException("Error reading mapped property '" + str + "' nested exception - " + targetException);
        } catch (Throwable th) {
            throw new IllegalArgumentException("Error reading mapped property '" + str + "', exception - " + th);
        }
    }

    @Override // o.InterfaceC10878y80
    public B80 d() {
        if (this.X == null) {
            this.X = BN2.g(this.Y.getClass());
        }
        return this.X;
    }

    public final NJ1 e() {
        NJ1 nj1;
        BN2 bn2 = this.X;
        if (bn2 != null) {
            nj1 = bn2.q();
        } else {
            nj1 = null;
        }
        if (nj1 != null) {
            return nj1;
        }
        return NJ1.h();
    }

    @Override // o.InterfaceC10878y80
    public void f(String str, String str2, Object obj) {
        try {
            e().J(this.Y, str, str2, obj);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            throw new IllegalArgumentException("Error setting mapped property '" + str + "' nested exception - " + targetException);
        } catch (Throwable th) {
            throw new IllegalArgumentException("Error setting mapped property '" + str + "', exception - " + th);
        }
    }

    @Override // o.InterfaceC10878y80
    public void g(String str, String str2) {
        throw new UnsupportedOperationException("WrapDynaBean does not support remove()");
    }

    @Override // o.InterfaceC10878y80
    public Object h(String str, int i) {
        try {
            return e().g(this.Y, str, i);
        } catch (IndexOutOfBoundsException e) {
            throw e;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            throw new IllegalArgumentException("Error reading indexed property '" + str + "' nested exception - " + targetException);
        } catch (Throwable th) {
            throw new IllegalArgumentException("Error reading indexed property '" + str + "', exception - " + th);
        }
    }

    @Override // o.InterfaceC10878y80
    public void j(String str, int i, Object obj) {
        try {
            e().G(this.Y, str, i, obj);
        } catch (IndexOutOfBoundsException e) {
            throw e;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            throw new IllegalArgumentException("Error setting indexed property '" + str + "' nested exception - " + targetException);
        } catch (Throwable th) {
            throw new IllegalArgumentException("Error setting indexed property '" + str + "', exception - " + th);
        }
    }

    @Override // o.InterfaceC10878y80
    public void k(String str, Object obj) {
        try {
            e().O(this.Y, str, obj);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            throw new IllegalArgumentException("Error setting property '" + str + "' nested exception -" + targetException);
        } catch (Throwable th) {
            throw new IllegalArgumentException("Error setting property '" + str + "', exception - " + th);
        }
    }

    @Override // o.InterfaceC10878y80
    public Object m(String str) {
        try {
            return e().y(this.Y, str);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            throw new IllegalArgumentException("Error reading property '" + str + "' nested exception - " + targetException);
        } catch (Throwable th) {
            throw new IllegalArgumentException("Error reading property '" + str + "', exception - " + th);
        }
    }

    @Override // o.InterfaceC10878y80
    public boolean o(String str, String str2) {
        throw new UnsupportedOperationException("WrapDynaBean does not support contains()");
    }

    public AN2(Object obj, BN2 bn2) {
        this.X = null;
        this.Y = obj;
        this.X = bn2 == null ? (BN2) d() : bn2;
    }
}
