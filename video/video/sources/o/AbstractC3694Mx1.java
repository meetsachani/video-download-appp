package o;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: o.Mx1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3694Mx1 {
    public static final int c = -1;
    public static final int d = -2;
    public final DataSetObservable a = new DataSetObservable();
    public DataSetObserver b;

    @Deprecated
    public void a(View view, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        a(viewGroup, i, obj);
    }

    public void d(ViewGroup viewGroup) {
        c(viewGroup);
    }

    public abstract int e();

    public int f(Object obj) {
        return -1;
    }

    public CharSequence g(int i) {
        return null;
    }

    public float h(int i) {
        return 1.0f;
    }

    @Deprecated
    public Object i(View view, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object j(ViewGroup viewGroup, int i) {
        return i(viewGroup, i);
    }

    public abstract boolean k(View view, Object obj);

    public void l() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.notifyChanged();
    }

    public void m(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public Parcelable o() {
        return null;
    }

    public void q(ViewGroup viewGroup, int i, Object obj) {
        p(viewGroup, i, obj);
    }

    public void r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    public void t(ViewGroup viewGroup) {
        s(viewGroup);
    }

    public void u(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }

    @Deprecated
    public void c(View view) {
    }

    @Deprecated
    public void s(View view) {
    }

    public void n(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Deprecated
    public void p(View view, int i, Object obj) {
    }
}
