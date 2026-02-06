package o;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class Q11<D> {
    public int a;
    public c<D> b;
    public b<D> c;
    public Context d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = true;
    public boolean h = false;
    public boolean i = false;

    /* loaded from: classes.dex */
    public final class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Q11.this.p();
        }
    }

    /* loaded from: classes.dex */
    public interface b<D> {
        void a(Q11<D> q11);
    }

    /* loaded from: classes.dex */
    public interface c<D> {
        void a(Q11<D> q11, D d);
    }

    public Q11(Context context) {
        this.d = context.getApplicationContext();
    }

    public boolean A() {
        boolean z = this.h;
        this.h = false;
        this.i |= z;
        return z;
    }

    public void B(c<D> cVar) {
        c<D> cVar2 = this.b;
        if (cVar2 != null) {
            if (cVar2 == cVar) {
                this.b = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public void C(b<D> bVar) {
        b<D> bVar2 = this.c;
        if (bVar2 != null) {
            if (bVar2 == bVar) {
                this.c = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public void a() {
        this.f = true;
        n();
    }

    public boolean b() {
        return o();
    }

    public void c() {
        this.i = false;
    }

    public String d(D d) {
        StringBuilder sb = new StringBuilder(64);
        PV.a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    public void e() {
        b<D> bVar = this.c;
        if (bVar != null) {
            bVar.a(this);
        }
    }

    public void f(D d) {
        c<D> cVar = this.b;
        if (cVar != null) {
            cVar.a(this, d);
        }
    }

    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.e || this.h || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.i);
        }
        if (!this.f && !this.g) {
            return;
        }
        printWriter.print(str);
        printWriter.print("mAbandoned=");
        printWriter.print(this.f);
        printWriter.print(" mReset=");
        printWriter.println(this.g);
    }

    public void h() {
        q();
    }

    public Context i() {
        return this.d;
    }

    public int j() {
        return this.a;
    }

    public boolean k() {
        return this.f;
    }

    public boolean l() {
        return this.g;
    }

    public boolean m() {
        return this.e;
    }

    public boolean o() {
        return false;
    }

    public void p() {
        if (this.e) {
            h();
        } else {
            this.h = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        PV.a(this, sb);
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public void u(int i, c<D> cVar) {
        if (this.b == null) {
            this.b = cVar;
            this.a = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void v(b<D> bVar) {
        if (this.c == null) {
            this.c = bVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void w() {
        r();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public void x() {
        if (this.i) {
            p();
        }
    }

    public final void y() {
        this.e = true;
        this.g = false;
        this.f = false;
        s();
    }

    public void z() {
        this.e = false;
        t();
    }

    public void n() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }
}
