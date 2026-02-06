package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.Ts0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4360Ts0 implements Iterator {
    public Iterator X;
    public JF1 Y;
    public boolean Y0 = false;
    public Object Z;

    public C4360Ts0() {
    }

    public Iterator b() {
        return this.X;
    }

    public JF1 c() {
        return this.Y;
    }

    public void d(Iterator it) {
        this.X = it;
        this.Z = null;
        this.Y0 = false;
    }

    public final boolean e() {
        while (this.X.hasNext()) {
            Object next = this.X.next();
            if (this.Y.evaluate(next)) {
                this.Z = next;
                this.Y0 = true;
                return true;
            }
        }
        return false;
    }

    public void f(JF1 jf1) {
        this.Y = jf1;
        this.Z = null;
        this.Y0 = false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y0) {
            return true;
        }
        return e();
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.Y0 && !e()) {
            throw new NoSuchElementException();
        }
        this.Y0 = false;
        return this.Z;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.Y0) {
            this.X.remove();
            return;
        }
        throw new IllegalStateException("remove() cannot be called");
    }

    public C4360Ts0(Iterator it) {
        this.X = it;
    }

    public C4360Ts0(Iterator it, JF1 jf1) {
        this.X = it;
        this.Y = jf1;
    }
}
