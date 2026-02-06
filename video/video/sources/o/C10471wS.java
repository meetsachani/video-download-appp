package o;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: o.wS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10471wS implements List, Serializable {
    private static final long serialVersionUID = 8836393098519411393L;
    public transient int X = 0;
    public transient c Y = new c(null, null, null);
    public transient int Z = 0;
    public transient List Y0 = new ArrayList();

    /* renamed from: o.wS$a */
    /* loaded from: classes4.dex */
    public class a extends b implements ListIterator {
        public boolean a1;
        public final /* synthetic */ C10471wS b1;

        public a(C10471wS c10471wS, int i) {
            super(i);
            this.b1 = c10471wS;
            this.a1 = true;
            c10471wS.w(this);
        }

        @Override // o.C10471wS.b, java.util.ListIterator
        public void add(Object obj) {
            b();
            c p = this.b1.p(this.X.b(), this.X.a(), obj);
            this.X.d(p);
            this.X.c(p.a());
            this.Y = null;
            this.Y0++;
            this.Z++;
        }

        @Override // o.C10471wS.b
        public void b() {
            if (this.a1) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public void c() {
            if (this.a1) {
                this.a1 = false;
                this.b1.D(this);
            }
        }

        public void d() {
            this.a1 = false;
        }

        public void e(c cVar) {
            if (this.Y == cVar) {
                this.Y = null;
            }
        }

        public void f(c cVar) {
            if (this.X.a() == null && this.X.b() == null) {
                this.X.c(cVar);
            } else if (this.X.b() == cVar.b()) {
                this.X.c(cVar);
            }
            if (this.X.a() == cVar.a()) {
                this.X.d(cVar);
            }
            if (this.Y == cVar) {
                this.Y = null;
            }
        }

        public void g(c cVar) {
            if (this.b1.Y.b() == null) {
                this.X.c(null);
            } else if (this.X.a() == cVar) {
                this.X.c(cVar.a());
            }
            if (this.b1.Y.a() == null) {
                this.X.d(null);
            } else if (this.X.b() == cVar) {
                this.X.d(cVar.b());
            }
            if (this.Y == cVar) {
                this.Y = null;
            }
        }

        @Override // o.C10471wS.b, java.util.ListIterator
        public int nextIndex() {
            throw new UnsupportedOperationException();
        }

        @Override // o.C10471wS.b, java.util.ListIterator
        public int previousIndex() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: o.wS$b */
    /* loaded from: classes4.dex */
    public class b implements ListIterator {
        public c X;
        public c Y = null;
        public int Y0;
        public int Z;

        public b(int i) {
            this.X = null;
            this.Z = C10471wS.this.Z;
            this.Y0 = 0;
            if (i == 0) {
                this.X = new c(null, C10471wS.this.Y.a(), null);
                this.Y0 = 0;
            } else if (i == C10471wS.this.X) {
                this.X = new c(C10471wS.this.Y.b(), null, null);
                this.Y0 = C10471wS.this.X;
            } else {
                c l = C10471wS.this.l(i);
                this.X = new c(l.b(), l, null);
                this.Y0 = i;
            }
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            b();
            c cVar = this.X;
            cVar.d(C10471wS.this.p(cVar.b(), this.X.a(), obj));
            this.Y = null;
            this.Y0++;
            this.Z++;
        }

        public void b() {
            if (this.Z == C10471wS.this.Z) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            b();
            if (this.X.a() != null && this.X.b() != C10471wS.this.Y.b()) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            b();
            if (this.X.b() != null && this.X.a() != C10471wS.this.Y.a()) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            b();
            if (hasNext()) {
                Object f = this.X.a().f();
                this.Y = this.X.a();
                c cVar = this.X;
                cVar.d(cVar.a());
                c cVar2 = this.X;
                cVar2.c(cVar2.a().a());
                this.Y0++;
                return f;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            b();
            if (!hasNext()) {
                return C10471wS.this.size();
            }
            return this.Y0;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            b();
            if (hasPrevious()) {
                Object f = this.X.b().f();
                this.Y = this.X.b();
                c cVar = this.X;
                cVar.c(cVar.b());
                c cVar2 = this.X;
                cVar2.d(cVar2.b().b());
                this.Y0--;
                return f;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            b();
            if (!hasPrevious()) {
                return -1;
            }
            return this.Y0 - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            c a;
            c b;
            b();
            c cVar = this.Y;
            if (cVar != null) {
                c cVar2 = this.X;
                if (cVar == C10471wS.this.Y.b()) {
                    a = null;
                } else {
                    a = this.Y.a();
                }
                cVar2.c(a);
                c cVar3 = this.X;
                if (this.Y == C10471wS.this.Y.a()) {
                    b = null;
                } else {
                    b = this.Y.b();
                }
                cVar3.d(b);
                C10471wS.this.B(this.Y);
                this.Y = null;
                this.Y0--;
                this.Z++;
                return;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            b();
            try {
                this.Y.e(obj);
            } catch (NullPointerException unused) {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: o.wS$c */
    /* loaded from: classes4.dex */
    public static class c implements Serializable {
        public c X;
        public c Y;
        public Object Z;

        public c(c cVar, c cVar2, Object obj) {
            this.X = cVar;
            this.Y = cVar2;
            this.Z = obj;
        }

        public c a() {
            return this.Y;
        }

        public c b() {
            return this.X;
        }

        public void c(c cVar) {
            this.Y = cVar;
        }

        public void d(c cVar) {
            this.X = cVar;
        }

        public Object e(Object obj) {
            Object obj2 = this.Z;
            this.Z = obj;
            return obj2;
        }

        public Object f() {
            return this.Z;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.X = 0;
        this.Z = 0;
        this.Y0 = new ArrayList();
        this.Y = new c(null, null, null);
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.X);
        for (c a2 = this.Y.a(); a2 != null; a2 = a2.a()) {
            objectOutputStream.writeObject(a2.f());
        }
    }

    public void B(c cVar) {
        this.Z++;
        this.X--;
        if (this.Y.a() == cVar) {
            this.Y.c(cVar.a());
        }
        if (cVar.a() != null) {
            cVar.a().d(cVar.b());
        }
        if (this.Y.b() == cVar) {
            this.Y.d(cVar.b());
        }
        if (cVar.b() != null) {
            cVar.b().c(cVar.a());
        }
        i(cVar);
    }

    public void D(a aVar) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a aVar2 = (a) weakReference.get();
            if (aVar2 == null) {
                it.remove();
            } else if (aVar2 == aVar) {
                weakReference.clear();
                it.remove();
                return;
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        p(this.Y.b(), null, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        for (Object obj : collection) {
            p(this.Y.b(), null, obj);
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Iterator it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        c cVar = null;
        for (c a2 = this.Y.a(); a2 != null && cVar != this.Y.b(); a2 = a2.a()) {
            if (obj != null || a2.f() != null) {
                if (obj != null && obj.equals(a2.f())) {
                    return true;
                }
                cVar = a2;
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    public boolean d(Object obj) {
        p(null, this.Y.a(), obj);
        return true;
    }

    public boolean e(Object obj) {
        p(this.Y.b(), null, obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        ListIterator listIterator = ((List) obj).listIterator();
        c cVar = null;
        for (c a2 = this.Y.a(); a2 != null && cVar != this.Y.b(); a2 = a2.a()) {
            if (listIterator.hasNext()) {
                if (a2.f() == null) {
                    if (listIterator.next() == null) {
                        cVar = a2;
                    }
                } else if (a2.f().equals(listIterator.next())) {
                    cVar = a2;
                }
            }
            return false;
        }
        return !listIterator.hasNext();
    }

    public void f(c cVar) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.e(cVar);
            }
        }
    }

    @Override // java.util.List
    public Object get(int i) {
        return l(i).f();
    }

    public Object getFirst() {
        try {
            return this.Y.a().f();
        } catch (NullPointerException unused) {
            throw new NoSuchElementException();
        }
    }

    public Object getLast() {
        try {
            return this.Y.b().f();
        } catch (NullPointerException unused) {
            throw new NoSuchElementException();
        }
    }

    public void h(c cVar) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.f(cVar);
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        int hashCode;
        int i = 1;
        c cVar = null;
        for (c a2 = this.Y.a(); a2 != null && cVar != this.Y.b(); a2 = a2.a()) {
            int i2 = i * 31;
            if (a2.f() == null) {
                hashCode = 0;
            } else {
                hashCode = a2.f().hashCode();
            }
            i = i2 + hashCode;
            cVar = a2;
        }
        return i;
    }

    public void i(c cVar) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar == null) {
                it.remove();
            } else {
                aVar.g(cVar);
            }
        }
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        c cVar = null;
        int i = 0;
        if (obj == null) {
            c a2 = this.Y.a();
            while (true) {
                c cVar2 = cVar;
                cVar = a2;
                if (cVar != null && cVar2 != this.Y.b()) {
                    if (cVar.f() == null) {
                        return i;
                    }
                    i++;
                    a2 = cVar.a();
                } else {
                    return -1;
                }
            }
        } else {
            c cVar3 = null;
            int i2 = 0;
            for (c a3 = this.Y.a(); a3 != null && cVar3 != this.Y.b(); a3 = a3.a()) {
                if (obj.equals(a3.f())) {
                    return i2;
                }
                i2++;
                cVar3 = a3;
            }
            return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        if (this.X == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public a j() {
        return new a(this, 0);
    }

    public a k(int i) {
        return new a(this, i);
    }

    public c l(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.X)) {
            if (i <= i2 / 2) {
                c a2 = this.Y.a();
                for (int i3 = 0; i3 < i; i3++) {
                    a2 = a2.a();
                }
                return a2;
            }
            c b2 = this.Y.b();
            for (int i4 = this.X - 1; i4 > i; i4--) {
                b2 = b2.b();
            }
            return b2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.valueOf(i));
        stringBuffer.append(" < 0 or ");
        stringBuffer.append(String.valueOf(i));
        stringBuffer.append(" >= ");
        stringBuffer.append(this.X);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int i = this.X - 1;
        c cVar = null;
        if (obj == null) {
            c b2 = this.Y.b();
            while (true) {
                c cVar2 = cVar;
                cVar = b2;
                if (cVar != null && cVar2 != this.Y.a()) {
                    if (cVar.f() == null) {
                        return i;
                    }
                    i--;
                    b2 = cVar.b();
                } else {
                    return -1;
                }
            }
        } else {
            c b3 = this.Y.b();
            while (true) {
                c cVar3 = b3;
                c cVar4 = cVar;
                cVar = cVar3;
                if (cVar != null && cVar4 != this.Y.a()) {
                    if (obj.equals(cVar.f())) {
                        return i;
                    }
                    i--;
                    b3 = cVar.b();
                } else {
                    return -1;
                }
            }
        }
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    public c p(c cVar, c cVar2, Object obj) {
        this.Z++;
        this.X++;
        c cVar3 = new c(cVar, cVar2, obj);
        if (cVar != null) {
            cVar.c(cVar3);
        } else {
            this.Y.c(cVar3);
        }
        if (cVar2 != null) {
            cVar2.d(cVar3);
        } else {
            this.Y.d(cVar3);
        }
        h(cVar3);
        return cVar3;
    }

    public void r() {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                aVar.d();
                weakReference.clear();
            }
            it.remove();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        c cVar = null;
        for (c a2 = this.Y.a(); a2 != null && cVar != this.Y.b(); a2 = a2.a()) {
            if (obj == null && a2.f() == null) {
                B(a2);
                return true;
            } else if (obj != null && obj.equals(a2.f())) {
                B(a2);
                return true;
            } else {
                cVar = a2;
            }
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean z = false;
        if (collection.size() != 0 && this.X != 0) {
            Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    public Object removeFirst() {
        if (this.Y.a() != null) {
            Object f = this.Y.a().f();
            B(this.Y.a());
            return f;
        }
        throw new NoSuchElementException();
    }

    public Object removeLast() {
        if (this.Y.b() != null) {
            Object f = this.Y.b().f();
            B(this.Y.b());
            return f;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        c l = l(i);
        Object e = l.e(obj);
        f(l);
        return e;
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.X;
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        int i3;
        if (i >= 0 && i2 <= (i3 = this.X) && i <= i2) {
            if (i == 0 && i2 == i3) {
                return this;
            }
            return new C11200zS(this, i, i2);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[this.X];
        c a2 = this.Y.a();
        int i = 0;
        c cVar = null;
        while (a2 != null && cVar != this.Y.b()) {
            objArr[i] = a2.f();
            cVar = a2;
            a2 = a2.a();
            i++;
        }
        return objArr;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(C6566gU0.f);
        c cVar = null;
        for (c a2 = this.Y.a(); a2 != null && cVar != this.Y.b(); a2 = a2.a()) {
            if (this.Y.a() != a2) {
                stringBuffer.append(C6566gU0.h);
            }
            stringBuffer.append(a2.f());
            cVar = a2;
        }
        stringBuffer.append(C6566gU0.g);
        return stringBuffer.toString();
    }

    public void w(a aVar) {
        Iterator it = this.Y0.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == null) {
                it.remove();
            }
        }
        this.Y0.add(new WeakReference(aVar));
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        int i2 = this.X;
        if (i == i2) {
            add(obj);
        } else if (i >= 0 && i <= i2) {
            c l = isEmpty() ? null : l(i);
            p(l != null ? l.b() : null, l, obj);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.valueOf(i));
            stringBuffer.append(" < 0 or ");
            stringBuffer.append(String.valueOf(i));
            stringBuffer.append(" > ");
            stringBuffer.append(this.X);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        if (i >= 0 && i <= this.X) {
            return new b(i);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(i);
        stringBuffer.append(" < 0 or > ");
        stringBuffer.append(this.X);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i2 = this.X;
        if (i2 != i && i2 != 0) {
            c l = l(i);
            c b2 = l == null ? null : l.b();
            for (Object obj : collection) {
                b2 = p(b2, l, obj);
            }
            return true;
        }
        return addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.X) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.X);
        }
        c a2 = this.Y.a();
        int i = 0;
        c cVar = null;
        while (a2 != null && cVar != this.Y.b()) {
            objArr[i] = a2.f();
            cVar = a2;
            a2 = a2.a();
            i++;
        }
        int length = objArr.length;
        int i2 = this.X;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.List
    public Object remove(int i) {
        c l = l(i);
        Object f = l.f();
        B(l);
        return f;
    }
}
