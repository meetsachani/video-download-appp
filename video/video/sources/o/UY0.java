package o;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class UY0<E> implements Iterator<E> {
    public int X = 0;
    public boolean Y = false;
    public Iterator<? extends E> Z = null;
    public Iterator<? extends E> Y0 = null;

    public abstract Iterator<? extends E> b(int i);

    public final void c() {
        int i = this.X;
        if (i == 0) {
            int i2 = i + 1;
            this.X = i2;
            Iterator<? extends E> b = b(i2);
            this.Z = b;
            if (b == null) {
                this.Z = C4579Wa0.b();
                this.Y = true;
            }
            this.Y0 = this.Z;
        }
        while (!this.Z.hasNext() && !this.Y) {
            int i3 = this.X + 1;
            this.X = i3;
            Iterator<? extends E> b2 = b(i3);
            if (b2 != null) {
                this.Z = b2;
            } else {
                this.Y = true;
            }
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        c();
        Iterator<? extends E> it = this.Z;
        this.Y0 = it;
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        c();
        Iterator<? extends E> it = this.Z;
        this.Y0 = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.Z == null) {
            c();
        }
        this.Y0.remove();
    }
}
