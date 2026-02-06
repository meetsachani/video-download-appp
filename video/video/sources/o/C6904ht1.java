package o;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: o.ht1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6904ht1<E> implements Iterator<E> {
    public final Deque<Iterator<? extends E>> X;
    public E Y;
    public boolean Y0;
    public final InterfaceC3287Is2<? super E, ? extends E> Z;
    public Iterator<? extends E> Z0;
    public E a1;
    public Iterator<? extends E> b1;

    public C6904ht1(E e, InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2) {
        this.X = new ArrayDeque(8);
        this.Y0 = false;
        if (e instanceof Iterator) {
            this.Z0 = (Iterator) e;
        } else {
            this.Y = e;
        }
        this.Z = interfaceC3287Is2;
    }

    public void b(E e) {
        if (e instanceof Iterator) {
            c((Iterator) e);
            return;
        }
        this.a1 = e;
        this.Y0 = true;
    }

    public void c(Iterator<? extends E> it) {
        Iterator<? extends E> it2 = this.Z0;
        if (it != it2) {
            if (it2 != null) {
                this.X.push(it2);
            }
            this.Z0 = it;
        }
        while (this.Z0.hasNext() && !this.Y0) {
            E next = this.Z0.next();
            InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2 = this.Z;
            if (interfaceC3287Is2 != null) {
                next = interfaceC3287Is2.a(next);
            }
            b(next);
        }
        if (!this.Y0 && !this.X.isEmpty()) {
            Iterator<? extends E> pop = this.X.pop();
            this.Z0 = pop;
            c(pop);
        }
    }

    public void d() {
        if (!this.Y0) {
            Iterator<? extends E> it = this.Z0;
            if (it == null) {
                E e = this.Y;
                if (e == null) {
                    return;
                }
                InterfaceC3287Is2<? super E, ? extends E> interfaceC3287Is2 = this.Z;
                if (interfaceC3287Is2 == null) {
                    b(e);
                } else {
                    b(interfaceC3287Is2.a(e));
                }
                this.Y = null;
                return;
            }
            c(it);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        d();
        return this.Y0;
    }

    @Override // java.util.Iterator
    public E next() {
        d();
        if (this.Y0) {
            this.b1 = this.Z0;
            E e = this.a1;
            this.a1 = null;
            this.Y0 = false;
            return e;
        }
        throw new NoSuchElementException("No more elements in the iteration");
    }

    @Override // java.util.Iterator
    public void remove() {
        Iterator<? extends E> it = this.b1;
        if (it != null) {
            it.remove();
            this.b1 = null;
            return;
        }
        throw new IllegalStateException("Iterator remove() cannot be called at this time");
    }

    public C6904ht1(Iterator<? extends E> it) {
        this.X = new ArrayDeque(8);
        this.Y0 = false;
        this.Z0 = it;
        this.Z = null;
    }
}
