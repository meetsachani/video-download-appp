package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import o.Q11;

/* renamed from: o.tS  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9739tS extends AbstractC3428Kf<Cursor> {
    public final Q11<Cursor>.a r;
    public Uri s;
    public String[] t;
    public String u;
    public String[] v;
    public String w;
    public Cursor x;
    public C10593wy y;

    public C9739tS(Context context) {
        super(context);
        this.r = new Q11.a();
    }

    @Override // o.AbstractC3428Kf
    public void D() {
        super.D();
        synchronized (this) {
            try {
                C10593wy c10593wy = this.y;
                if (c10593wy != null) {
                    c10593wy.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.Q11
    /* renamed from: N */
    public void f(Cursor cursor) {
        if (l()) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        Cursor cursor2 = this.x;
        this.x = cursor;
        if (m()) {
            super.f(cursor);
        }
        if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
            cursor2.close();
        }
    }

    public String[] O() {
        return this.t;
    }

    public String P() {
        return this.u;
    }

    public String[] Q() {
        return this.v;
    }

    public String R() {
        return this.w;
    }

    public Uri S() {
        return this.s;
    }

    @Override // o.AbstractC3428Kf
    /* renamed from: T */
    public Cursor I() {
        synchronized (this) {
            if (!H()) {
                this.y = new C10593wy();
            } else {
                throw new C3590Lv1();
            }
        }
        try {
            Cursor b = C7503kM.b(i().getContentResolver(), this.s, this.t, this.u, this.v, this.w, this.y);
            if (b != null) {
                try {
                    b.getCount();
                    b.registerContentObserver(this.r);
                } catch (RuntimeException e) {
                    b.close();
                    throw e;
                }
            }
            synchronized (this) {
                this.y = null;
            }
            return b;
        } catch (Throwable th) {
            synchronized (this) {
                this.y = null;
                throw th;
            }
        }
    }

    @Override // o.AbstractC3428Kf
    /* renamed from: U */
    public void J(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public void V(String[] strArr) {
        this.t = strArr;
    }

    public void W(String str) {
        this.u = str;
    }

    public void X(String[] strArr) {
        this.v = strArr;
    }

    public void Y(String str) {
        this.w = str;
    }

    public void Z(Uri uri) {
        this.s = uri;
    }

    @Override // o.AbstractC3428Kf, o.Q11
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.s);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.t));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.v));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.x);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.h);
    }

    @Override // o.Q11
    public void r() {
        super.r();
        t();
        Cursor cursor = this.x;
        if (cursor != null && !cursor.isClosed()) {
            this.x.close();
        }
        this.x = null;
    }

    @Override // o.Q11
    public void s() {
        Cursor cursor = this.x;
        if (cursor != null) {
            f(cursor);
        }
        if (!A() && this.x != null) {
            return;
        }
        h();
    }

    @Override // o.Q11
    public void t() {
        b();
    }

    public C9739tS(Context context, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        super(context);
        this.r = new Q11.a();
        this.s = uri;
        this.t = strArr;
        this.u = str;
        this.v = strArr2;
        this.w = str2;
    }
}
