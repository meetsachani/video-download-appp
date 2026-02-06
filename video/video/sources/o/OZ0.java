package o;

import android.database.Cursor;
import androidx.paging.PositionalDataSource;
import androidx.room.c;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class OZ0<T> extends PositionalDataSource<T> {
    public final YU1 a;
    public final String b;
    public final String c;
    public final VU1 d;
    public final c.AbstractC0048c e;
    public final boolean f;

    /* loaded from: classes.dex */
    public class a extends c.AbstractC0048c {
        public a(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0048c
        public void b(Set<String> set) {
            OZ0.this.invalidate();
        }
    }

    public OZ0(VU1 vu1, InterfaceC11257zh2 interfaceC11257zh2, boolean z, String... strArr) {
        this(vu1, YU1.j(interfaceC11257zh2), z, strArr);
    }

    public abstract List<T> a(Cursor cursor);

    public int b() {
        YU1 h = YU1.h(this.b, this.a.a());
        h.i(this.a);
        Cursor w = this.d.w(h);
        try {
            if (!w.moveToFirst()) {
                return 0;
            }
            return w.getInt(0);
        } finally {
            w.close();
            h.g();
        }
    }

    public final YU1 c(int i, int i2) {
        YU1 h = YU1.h(this.c, this.a.a() + 2);
        h.i(this.a);
        h.g4(h.a() - 1, i2);
        h.g4(h.a(), i);
        return h;
    }

    public boolean d() {
        this.d.l().j();
        return super.isInvalid();
    }

    public void e(PositionalDataSource.LoadInitialParams loadInitialParams, PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) {
        YU1 yu1;
        int i;
        YU1 yu12;
        List<T> list = Collections.EMPTY_LIST;
        this.d.c();
        Cursor cursor = null;
        try {
            int b = b();
            if (b != 0) {
                int computeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, b);
                yu1 = c(computeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, computeInitialLoadPosition, b));
                try {
                    cursor = this.d.w(yu1);
                    List<T> a2 = a(cursor);
                    this.d.A();
                    yu12 = yu1;
                    i = computeInitialLoadPosition;
                    list = a2;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.d.i();
                    if (yu1 != null) {
                        yu1.g();
                    }
                    throw th;
                }
            } else {
                i = 0;
                yu12 = null;
            }
            if (cursor != null) {
                cursor.close();
            }
            this.d.i();
            if (yu12 != null) {
                yu12.g();
            }
            loadInitialCallback.onResult(list, i, b);
        } catch (Throwable th2) {
            th = th2;
            yu1 = null;
        }
    }

    public List<T> f(int i, int i2) {
        YU1 c = c(i, i2);
        if (this.f) {
            this.d.c();
            Cursor cursor = null;
            try {
                cursor = this.d.w(c);
                List<T> a2 = a(cursor);
                this.d.A();
                return a2;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
                this.d.i();
                c.g();
            }
        }
        Cursor w = this.d.w(c);
        try {
            return a(w);
        } finally {
            w.close();
            c.g();
        }
    }

    public void g(PositionalDataSource.LoadRangeParams loadRangeParams, PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(f(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    public OZ0(VU1 vu1, YU1 yu1, boolean z, String... strArr) {
        this.d = vu1;
        this.a = yu1;
        this.f = z;
        this.b = "SELECT COUNT(*) FROM ( " + yu1.d() + " )";
        this.c = "SELECT * FROM ( " + yu1.d() + " ) LIMIT ? OFFSET ?";
        a aVar = new a(strArr);
        this.e = aVar;
        vu1.l().b(aVar);
    }
}
