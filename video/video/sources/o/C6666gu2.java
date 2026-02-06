package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: o.gu2 */
/* loaded from: classes.dex */
public class C6666gu2 extends Q40 {
    public Context c;
    public Uri d;

    public C6666gu2(Q40 q40, Context context, Uri uri) {
        super(q40);
        this.c = context;
        this.d = uri;
    }

    public static void w(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                C2597Bu1.a(autoCloseable);
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
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
        Uri x = x(this.c, this.d, "vnd.android.document/directory", str);
        if (x != null) {
            return new C6666gu2(this, this.c, x);
        }
        return null;
    }

    @Override // o.Q40
    public Q40 d(String str, String str2) {
        Uri x = x(this.c, this.d, str, str2);
        if (x != null) {
            return new C6666gu2(this, this.c, x);
        }
        return null;
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
        ContentResolver contentResolver = this.c.getContentResolver();
        Uri uri = this.d;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursor.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.d, cursor.getString(0)));
                }
            } catch (Exception e) {
                Log.w("DocumentFile", "Failed query: " + e);
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
            Q40[] q40Arr = new Q40[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                q40Arr[i] = new C6666gu2(this, this.c, uriArr[i]);
            }
            return q40Arr;
        } finally {
            w(cursor);
        }
    }

    @Override // o.Q40
    public boolean v(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.c.getContentResolver(), this.d, str);
            if (renameDocument != null) {
                this.d = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
