package o;

import android.util.SparseArray;

@Deprecated
/* renamed from: o.ua2 */
/* loaded from: classes2.dex */
public final class C10011ua2<V> {
    public int a;
    public final SparseArray<V> b;
    public final InterfaceC10686xL<V> c;

    public C10011ua2() {
        this(new InterfaceC10686xL() { // from class: o.ta2
            @Override // o.InterfaceC10686xL
            public final void accept(Object obj) {
                C10011ua2.a(obj);
            }
        });
    }

    public static /* synthetic */ void a(Object obj) {
    }

    public void b(int i, V v) {
        boolean z;
        boolean z2 = false;
        if (this.a == -1) {
            if (this.b.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            C9542sf.i(z);
            this.a = 0;
        }
        if (this.b.size() > 0) {
            SparseArray<V> sparseArray = this.b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z2 = true;
            }
            C9542sf.a(z2);
            if (keyAt == i) {
                SparseArray<V> sparseArray2 = this.b;
                this.c.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.b.append(i, v);
    }

    public void c() {
        for (int i = 0; i < this.b.size(); i++) {
            this.c.accept(this.b.valueAt(i));
        }
        this.a = -1;
        this.b.clear();
    }

    public void d(int i) {
        int i2;
        for (int size = this.b.size() - 1; size >= 0 && i < this.b.keyAt(size); size--) {
            this.c.accept(this.b.valueAt(size));
            this.b.removeAt(size);
        }
        if (this.b.size() > 0) {
            i2 = Math.min(this.a, this.b.size() - 1);
        } else {
            i2 = -1;
        }
        this.a = i2;
    }

    public void e(int i) {
        int i2 = 0;
        while (i2 < this.b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.b.keyAt(i3)) {
                this.c.accept(this.b.valueAt(i2));
                this.b.removeAt(i2);
                int i4 = this.a;
                if (i4 > 0) {
                    this.a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public V f(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 <= 0 || i >= this.b.keyAt(i2)) {
                break;
            }
            this.a--;
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public V g() {
        SparseArray<V> sparseArray = this.b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean h() {
        if (this.b.size() == 0) {
            return true;
        }
        return false;
    }

    public C10011ua2(InterfaceC10686xL<V> interfaceC10686xL) {
        this.b = new SparseArray<>();
        this.c = interfaceC10686xL;
        this.a = -1;
    }
}
