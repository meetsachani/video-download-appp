package o;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* renamed from: o.n82  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8197n82 extends Q40 {
    public Context c;
    public Uri d;

    public C8197n82(Q40 q40, Context context, Uri uri) {
        super(q40);
        this.c = context;
        this.d = uri;
    }

    @Override // o.Q40
    public boolean a() {
        return R40.a(this.c, this.d);
    }

    @Override // o.Q40
    public boolean b() {
        return R40.b(this.c, this.d);
    }

    @Override // o.Q40
    public Q40 c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // o.Q40
    public Q40 d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // o.Q40
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.c.getContentResolver(), this.d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // o.Q40
    public boolean f() {
        return R40.d(this.c, this.d);
    }

    @Override // o.Q40
    public String k() {
        return R40.f(this.c, this.d);
    }

    @Override // o.Q40
    public String m() {
        return R40.h(this.c, this.d);
    }

    @Override // o.Q40
    public Uri n() {
        return this.d;
    }

    @Override // o.Q40
    public boolean o() {
        return R40.i(this.c, this.d);
    }

    @Override // o.Q40
    public boolean q() {
        return R40.j(this.c, this.d);
    }

    @Override // o.Q40
    public boolean r() {
        return R40.k(this.c, this.d);
    }

    @Override // o.Q40
    public long s() {
        return R40.l(this.c, this.d);
    }

    @Override // o.Q40
    public long t() {
        return R40.m(this.c, this.d);
    }

    @Override // o.Q40
    public Q40[] u() {
        throw new UnsupportedOperationException();
    }

    @Override // o.Q40
    public boolean v(String str) {
        throw new UnsupportedOperationException();
    }
}
