package o;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.eU1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6069eU1 implements InterfaceC10878y80, Iterator<InterfaceC10878y80> {
    public C5342bU1 Y;
    public boolean X = false;
    public boolean Z = false;

    public C6069eU1(C5342bU1 c5342bU1) {
        this.Y = c5342bU1;
    }

    public void b() throws SQLException {
        if (!this.X && !this.Z) {
            if (this.Y.m().next()) {
                this.X = true;
                this.Z = false;
                return;
            }
            this.X = false;
            this.Z = true;
        }
    }

    @Override // o.InterfaceC10878y80
    public Object c(String str, String str2) {
        throw new UnsupportedOperationException("FIXME - mapped properties not currently supported");
    }

    @Override // o.InterfaceC10878y80
    public B80 d() {
        return this.Y;
    }

    @Override // java.util.Iterator
    /* renamed from: e */
    public InterfaceC10878y80 next() {
        try {
            b();
            if (!this.Z) {
                this.X = false;
                return this;
            }
            throw new NoSuchElementException();
        } catch (SQLException e) {
            throw new RuntimeException("next():  SQLException:  " + e);
        }
    }

    @Override // o.InterfaceC10878y80
    public void f(String str, String str2, Object obj) {
        throw new UnsupportedOperationException("FIXME - mapped properties not currently supported");
    }

    @Override // o.InterfaceC10878y80
    public void g(String str, String str2) {
        throw new UnsupportedOperationException("FIXME - mapped operations not currently supported");
    }

    @Override // o.InterfaceC10878y80
    public Object h(String str, int i) {
        throw new UnsupportedOperationException("FIXME - indexed properties not currently supported");
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        try {
            b();
            return !this.Z;
        } catch (SQLException e) {
            throw new RuntimeException("hasNext():  SQLException:  " + e);
        }
    }

    @Override // o.InterfaceC10878y80
    public void j(String str, int i, Object obj) {
        throw new UnsupportedOperationException("FIXME - indexed properties not currently supported");
    }

    @Override // o.InterfaceC10878y80
    public void k(String str, Object obj) {
        if (this.Y.p(str) != null) {
            try {
                this.Y.m().updateObject(str, obj);
                return;
            } catch (SQLException e) {
                throw new RuntimeException("set(" + str + "): SQLException: " + e);
            }
        }
        throw new IllegalArgumentException(str);
    }

    @Override // o.InterfaceC10878y80
    public Object m(String str) {
        if (this.Y.p(str) != null) {
            try {
                return this.Y.k(str);
            } catch (SQLException e) {
                throw new RuntimeException("get(" + str + "): SQLException: " + e);
            }
        }
        throw new IllegalArgumentException(str);
    }

    @Override // o.InterfaceC10878y80
    public boolean o(String str, String str2) {
        throw new UnsupportedOperationException("FIXME - mapped properties not currently supported");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove()");
    }
}
